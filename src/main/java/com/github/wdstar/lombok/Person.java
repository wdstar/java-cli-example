package com.github.wdstar.lombok;

import lombok.AllArgsConstructor;
// @Data = @Getter + @Setter + @ToString + @EqualsAndHashCode + @RequiredArgsConstructor
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Person
 */
// @Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Person {

	@Getter
	@Setter
	private String name;

	@Getter
	@Setter
	private int age;

}
