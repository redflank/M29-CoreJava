package org.tnsif.junit;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedTestDemo {

	//to perform parameterized test
	@ParameterizedTest
	@ValueSource(strings= {"Pratik","Riddhi"})
	@DisplayName("Parameterized Test")
	void test() {
		System.out.println("Demonstration on parameterized" + "Test");
	}
	
	@ParameterizedTest
	@ValueSource(strings= {"Prathamesh","Max"})
	@DisplayName("Parameterized Test")
	void accept(String str) {
		assertNotNull(str);
	}

}
