package com.testng.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDependsOnMethod {
	
	@Test
	public void method() {
		Assert.assertTrue(true);
		System.out.println("I am first method");
		
		
	}
	
	@Test(dependsOnMethods="method")
	public void methodTwo() {		
		System.out.println("I am second method");
		
	}

}
