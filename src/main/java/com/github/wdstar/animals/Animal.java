package com.github.wdstar.animals;

/**
 * Animal
 */
public interface Animal {

	// @formatter:off
	public static final String DEFAULT_CRY = "...";
	public static final String DEFAULT_SLEEP = "zzz";
	// @formatter:on

	public static String getInfo() {
		return String.format("Animal: default cry: %s", DEFAULT_CRY);
	}

	public default String cryAndSleep() {
		return cry() + ", " + sleep();
	}

	public default String cry() {
		return DEFAULT_CRY;
	}

	public default String sleep() {
		return DEFAULT_SLEEP;
	}

}
