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
		assertThat(Vertebrate.MAMMAL.getKey()).isEqualTo("mammal");
		assertThat(Vertebrate.valueOf("MAMMAL")).isEqualTo(Vertebrate.MAMMAL);
		assertThat(Vertebrate.valueByKey("mammal")).isEqualTo(Vertebrate.MAMMAL);
		assertThatThrownBy(() -> {
			Vertebrate.valueByKey("invalidKey");
		}).isInstanceOf(IllegalArgumentException.class);

		for (Vertebrate vertebrate : Vertebrate.values()) {
			String toStr = vertebrate.toString();
			String key = vertebrate.getKey();
			logger.info(toStr);
			logger.info(key);
		}
		Arrays.stream(Vertebrate.values()).forEach(vertebrate -> {
			String toStr = vertebrate.toString();
			String key = vertebrate.getKey();
			logger.info(toStr);
			logger.info(key);
		});
	}

}