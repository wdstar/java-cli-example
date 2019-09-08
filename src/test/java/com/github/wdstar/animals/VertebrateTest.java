package com.github.wdstar.animals;

import static org.assertj.core.api.Assertions.*;

import java.lang.invoke.MethodHandles;
import java.util.Arrays;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * VertebrateTest
 */
public class VertebrateTest {

	private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	@Test
	public void testVertebrate() {
		assertThat(Vertebrate.MAMMAL.toString()).isEqualTo("MAMMAL");
		assertThat(Vertebrate.MAMMAL.getName()).isEqualTo("mammal");
		assertThat(Vertebrate.valueOf("MAMMAL")).isEqualTo(Vertebrate.MAMMAL);

		for (Vertebrate vertebrate : Vertebrate.values()) {
			String toStr = vertebrate.toString();
			String name = vertebrate.getName();
			logger.info(toStr);
			logger.info(name);
		}
		Arrays.stream(Vertebrate.values()).forEach(vertebrate -> {
			String toStr = vertebrate.toString();
			String name = vertebrate.getName();
			logger.info(toStr);
			logger.info(name);
		});
	}

}
