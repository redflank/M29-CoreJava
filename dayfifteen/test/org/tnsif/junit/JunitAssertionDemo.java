package org.tnsif.junit;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class JunitAssertionDemo {

	@Test
	void test() {
		// Fails if expression is not true
		assertTrue(10 > 5);
	}

	@Test
	void display() {
		// Fails if expression is not false
		assertFalse(10 > 5);
	}

	@Test
	void accept() {
		// Fails when actual is not null
		assertNull(null);

	}

}
