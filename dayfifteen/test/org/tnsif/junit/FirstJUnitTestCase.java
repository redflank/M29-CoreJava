package org.tnsif.junit;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FirstJUnitTestCase {

	/*
	 * @test annotation is used to perform the testing on the given method
	 */

	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	@DisplayName("SimpleTesting")
	void display() {
		System.out.println("First JUnit Test case");
	}

}
