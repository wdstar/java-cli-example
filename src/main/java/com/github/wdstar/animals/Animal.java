package com.github.wdstar.animals;

/**
 * Animal
 */
public interface Animal {

	public default String cry() {
		return "default cry";
	}

}
