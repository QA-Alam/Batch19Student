package com.testng.practice;

import org.testng.annotations.Test;

public class TestNGEnableDisable {
	
	@Test(enabled=false)
	public void methodEnabled() {
		
		System.out.println("I am enabled method");
		
	}
	
	@Test
	public void methodDisabled() {
		
		System.out.println("I am disabled method");
		
	}

}
