package com.github.wdstar.lombok;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

/**
 * PersonTest
 */
public class PersonTest {

	@Test
	public void testAccessor() {
		Person alice = new Person();
		alice.setName("alice");
		alice.setAge(7);
		assertThat(alice.getName()).isEqualTo("alice");
		assertThat(alice.getAge()).isEqualTo(7);
		assertThat(alice.toString()).isEqualTo("Person(name=alice, age=7)");
	}

}
