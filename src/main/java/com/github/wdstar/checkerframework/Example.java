package com.github.wdstar.checkerframework;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.checkerframework.checker.nullness.qual.PolyNull;

/**
 * Example
 */
public class Example {

	// Default: a method with implicit @NonNull args returns implicit @NonNull
	public String toString(Object obj) {
		return obj.toString();
	}

	// This method equals the above method.
	@NonNull
	public String toStringWithNonNull(@NonNull Object obj) {
		return obj.toString();
	}

	public String toStringWithNullable(@Nullable Object obj) {
		if (obj == null) {
			return "null";
		}

		return obj.toString();
	}

	@Nullable
	public String toStringWithNullableReturnsNullable(@Nullable Object obj) {
		if (obj == null) {
			return null;
		}

		return obj.toString();
	}

	@PolyNull
	// @Nullable passes too.
	public String toStringWithPolyNull(@PolyNull Object obj) {
		if (obj == null) {
			return null;
		}

		return obj.toString();
	}

}
