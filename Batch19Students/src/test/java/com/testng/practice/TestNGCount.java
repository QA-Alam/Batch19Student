package com.testng.practice;

import org.testng.annotations.Test;

public class TestNGCount {
	//How to run same test case multiple times?
	@Test(invocationCount=15)
	public void methodCount() {
		
		System.out.println("Tracking number: XYZ00012345");
		
	}
	@Test
	public void methodCount1() {
		
		System.out.println("I am running once");
		
	}

}
