package com.testng.practice;

import org.testng.annotations.Test;

public class TestNGPrioritize {

	
	@Test(priority = 4)

	public void getStudents() {
		
		System.out.println("I am running action method 5");
		
	}
	
	@Test(priority =3)

	public void getSmarttech() {
		
		System.out.println("I am running action method 4");
		
	}
	
	@Test(priority = 1)
	public void getSalary() {
		
		System.out.println("I am running 1");
		
	}
	
	@Test(priority = 2)
	public void getName() {
		
		System.out.println("I am running 3");
		
	}
	
	@Test(priority = 5)
	public void getBatchNine() {
		
		System.out.println("I am running action method 6");
		
	}
	@Test(priority = 5)
	public void getBatch() {
		
		System.out.println("I am running action method 5");
		
	}

	
}
