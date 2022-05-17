package com.tedaneblake;

public class GreetingAction {
	
	public String execute() {
		System.out.println("Value of first name is " + firstName);
		return "fail";
	}
	private String firstName;
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstName() {
		return firstName;
	}
}
