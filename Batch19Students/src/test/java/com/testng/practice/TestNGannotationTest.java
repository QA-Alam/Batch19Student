package com.testng.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGannotationTest {
	
	@BeforeSuite
	public void getFirstAction() {
		System.out.println("I am the before suite");
	}
	
	@AfterSuite
	public void getLastAction() {
		System.out.println("I am after suite");
	}
	@BeforeClass
	public void getBeforeClass() {
		System.out.println("I am running BEFORE class");
	}
	@AfterClass
	public void getAfterClass() {
		System.out.println("I am running AFTER class");
	}
	@BeforeTest
	public void getBeforeTest() {
		System.out.println("I am running before test");
	}
	@AfterTest
	public void getAfterTest() {
		System.out.println("I am running after test");
	}
	
	@Test
	public void getAction() {
		
		System.out.println("I can execute without main method using testNG annotation");
		
	}
	
	@AfterMethod
	public void getClosedBrowser() {
		System.out.println("I am running after the method");
		
	}
	
	@BeforeMethod
	public void getPrerequisites() {
		System.out.println("I am running before method");
		
	}
}
