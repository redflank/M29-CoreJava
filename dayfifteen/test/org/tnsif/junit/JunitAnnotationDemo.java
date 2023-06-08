//Program to demonstrate on different annotation which is used in Junit 5
package org.tnsif.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class JunitAnnotationDemo {

	@Test
	void display() {
		System.out.println("First JUnit Test case");
	}

	// @Test
	/*
	 * below annotation should be executed before all test method
	 */
	@BeforeAll
	void print() {
		System.out.println("Performing BeforeAll annotation Test case");
	}

	@Test
	@AfterEach
	@Disabled
	void accept() {
		System.out.println("AfterEach method is executing..");
	}
}
