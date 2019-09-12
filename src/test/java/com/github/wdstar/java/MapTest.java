package com.github.wdstar.java;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.Test;

/**
 * MapTest
 */
public class MapTest {

	@Test
	public void testSortedKeyMap() {
		Map<String, String> actualMap = new HashMap<String, String>();

		// put randomly
		actualMap.put("bob", "Bob");
		actualMap.put("alice", "Alice");
		actualMap.put("d", "D");
		actualMap.put("c", "C");
		// Indefinite order, e.g. "C", "Bob", "D", "Alice"
		actualMap.values().forEach(System.out::println);

		// sorted keys
		List<String> keys = Arrays.asList("alice", "bob", "c", "d");
		// key-sorted values
		List<String> values = keys.stream().map(actualMap::get).collect(Collectors.toList());
		assertThat(values).containsExactly("Alice", "Bob", "C", "D");
	}

}
