package com.github.wdstar.animals;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * AnimalTest
 */
class AnimalTest {

	@Test
	void testCry() {
		Animal thing = new Thing();
		assertThat(thing.cry()).isEqualTo("...");
		assertThat(thing.cryAndSleep()).isEqualTo("..., zzz");

		Animal cat = new Cat();
		assertThat(cat.cry()).isEqualTo("mew");
		assertThat(cat.cryAndSleep()).isEqualTo("mew, zzz");
	}

}
