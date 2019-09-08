package com.github.wdstar.animals;

public enum Vertebrate {

	// @formatter:off
	MAMMAL("mammal"),
	BIRD("bird"),
	REPTILE("reptile"),
	AMPHIBIAN("amphibian"),
	FISH("fish");
	// @formatter:on

	private String key;

	private Vertebrate(String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public static Vertebrate valueByKey(String key) {
		for (Vertebrate val : Vertebrate.values()) {
			if (val.getKey().equals(key)) {
				return val;
			}
		}

		throw new IllegalArgumentException("Invalid key: " + key);
	}

}
