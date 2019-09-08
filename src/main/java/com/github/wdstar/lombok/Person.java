package com.github.wdstar.lombok;

//import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Person
 */
// @Data
@ToString
public class Person {

	@Getter
	@Setter
	private String name;

	@Getter
	@Setter
	private int age;

}
