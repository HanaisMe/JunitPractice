package com.jeongsik.person;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class TestPerson {
	private final Person personOne = new Person("Hana", "Lee");
	private final Person personTwo = new Person("Jeongsik", "Lee");

	@Test
	void testPerson() {
		assertNotNull(personOne);
		assertNotNull(personTwo);
	}

	@Test
	void testGetFirstName() {
		assertAll("first names",
				() -> assertEquals("Hana", personOne.getFirstName()),
				() -> assertEquals("Jeongsik", personTwo.getFirstName()));
	}

	@Test
	void testGetLastName() {
		assertAll("last names",
				() -> assertEquals("Lee", personOne.getLastName()),
				() -> assertEquals("Lee", personTwo.getLastName()));
	}
	
}
