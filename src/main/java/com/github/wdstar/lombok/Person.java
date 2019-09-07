package com.github.wdstar.lombok;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Person
 */
@Data
public class Person {

	@Getter
	@Setter
	private String name;

	@Accessors
	private int age;

}
