package com.jeongsik.person;

public class Person {

	private String firstName;
	private String lastName;

	public Person() {
		this.firstName = "";
		this.lastName = "";
	}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// Command + Alt + s
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
