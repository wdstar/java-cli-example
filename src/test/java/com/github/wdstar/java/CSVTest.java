package com.github.wdstar.java;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.junit.jupiter.api.Test;

/**
 * CSVTest
 */
class CSVTest {

	@Test
	void testCSV() throws IOException {
		Path csvFile = Paths.get("./testdata/test.csv");
		try (BufferedReader br = Files.newBufferedReader(csvFile); CSVParser parser = CSVFormat.DEFAULT.parse(br);) {
			assertThat(parser.getCurrentLineNumber()).isEqualTo(0);
			// Note: CSVParser's method call changes the parser's state.
			List<CSVRecord> records = parser.getRecords();
			assertThat(parser.getCurrentLineNumber()).isEqualTo(1);

			List<String> seconds = records.stream().map(record -> record.get(1)).collect(Collectors.toList());
			assertThat(seconds.size()).isEqualTo(2);
			assertThat(seconds).containsExactly("b", "B");
			seconds.forEach(System.out::println);
			// print nothing!
			parser.forEach(record -> System.out.println(record.get(1)));
		}
	}

}
