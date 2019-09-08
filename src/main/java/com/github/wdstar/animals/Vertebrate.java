package com.github.wdstar.animals;

public enum Vertebrate {

	// @formatter:off
	MAMMAL("mammal"),
	BIRD("bird"),
	REPTILE("reptile"),
	AMPHIBIAN("amphibian"),
	FISH("fish");
	// @formatter:on

	private String name;

	private Vertebrate(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
