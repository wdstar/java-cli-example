package com.github.wdstar.checkerframework;

/**
 * Person
 */
// 1st step: un-suppress nullness and suppress uninitialized warning.
// 2nd step: un-suppress uninitialized warning.
@SuppressWarnings({ /* "nullness", */"uninitialized" })
public class Person {

	// uninitialized warning
	// error: [initialization.fields.uninitialized] the constructor does not initialize
	// fields: name

	private String name;

	public String getName() {
		return this.name;
	}

}
