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
		assertThat(thing.cry()).hasToString("...");
		assertThat(thing.cryAndSleep()).hasToString("..., zzz");

		Animal cat = new Cat();
		assertThat(cat.cry()).hasToString("mew");
		assertThat(cat.cryAndSleep()).hasToString("mew, zzz");
	}

}
