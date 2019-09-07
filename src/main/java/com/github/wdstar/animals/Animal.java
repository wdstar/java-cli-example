package com.github.wdstar.animals;

/**
 * Animal
 */
public interface Animal {

	public static final String DEFAULT_CRY = "default cry";

	public static String getInfo() {
		return String.format("Animal: default cry: %s", DEFAULT_CRY);
	}

	public default String cry() {
		return DEFAULT_CRY;
	}

}
