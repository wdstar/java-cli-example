package com.github.wdstar.animals;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

/**
 * AnimalTest
 */
public class AnimalTest {

	@Test
	public void testCry() {
		Animal thing = new Thing();
		assertThat(thing.cry()).isEqualTo("default cry");

		Animal cat = new Cat();
		assertThat(cat.cry()).isEqualTo("mew");
	}

}