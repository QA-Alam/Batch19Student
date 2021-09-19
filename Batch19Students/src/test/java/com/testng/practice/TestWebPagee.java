package com.testng.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestWebPagee {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.out.println("I am running before test");
		// This is for mac
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		driver = new ChromeDriver(); // Up casting the driver

		// WebDriver driver = new FirefoxDriver(); // Selenium version 2.53.1 & default
		// browser is Firefox
		// Firefox driver version supports 46.1 or below 47
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		// Driver . get url
		driver.get("https://www.ups.com/us/en/Home.page");

	}

	@Test(priority =1)
	public void getActionsOne() {
		System.out.println("I am running the action");

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='ups-analytics'])[7]"))).click();

		// This is one way of do the testing
		// driver.findElement(By.xpath("(//*[@class='ups-analytics'])[7]")).click();

		// Thread.sleep(5000);

		driver.findElement(By.id("email")).sendKeys("alammohammed79@gmail.com");
		// Thread.sleep(5000);

		// 2nd way
		WebElement password = driver.findElement(By.id("pwd"));
		password.sendKeys("SAYEDawan2008");

		// password.submit();

		// //*[contains(@id,'submitBtn')]
		// (//*[contains(text(),'Log In')])[2]
		// *[starts-with(@id,'subm')]
		// *[text()='Log In']
		// Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@id,'submitBtn')]"))).click();
		// driver.findElement(By.xpath("//*[contains(@id,'submitBtn')]")).click();

		// driver.findElement(By.id("submitBtn")).click();

		System.out.println(driver.getTitle());
	}
	
	
	@Test(priority =2)
	public void getActionsTwo() {
		System.out.println("I am running the action");

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='ups-analytics'])[7]"))).click();

		// This is one way of do the testing
		// driver.findElement(By.xpath("(//*[@class='ups-analytics'])[7]")).click();

		// Thread.sleep(5000);

		driver.findElement(By.id("email")).sendKeys("alammohammed79@gmail.com");
		// Thread.sleep(5000);

		// 2nd way
		WebElement password = driver.findElement(By.id("pwd"));
		password.sendKeys("SAYEDawan2008");

		// password.submit();

		// //*[contains(@id,'submitBtn')]
		// (//*[contains(text(),'Log In')])[2]
		// *[starts-with(@id,'subm')]
		// *[text()='Log In']
		// Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@id,'submitBtn')]"))).click();
		// driver.findElement(By.xpath("//*[contains(@id,'submitBtn')]")).click();

		// driver.findElement(By.id("submitBtn")).click();

		System.out.println(driver.getTitle());
	}
  @AfterMethod
	public void tearDown() {
	  System.out.println("I am close the driver");
		driver.quit();
	}

}
