package com.stepdefinations;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.ny.basepage.SupperClass;
import com.pagefactory.ZooplaElementsPage;
import com.utility.CommonUtility;
import com.utility.WaitHelper;

import cucumber.api.java.en.*;

public class LoginStepDef extends SupperClass {

	ZooplaElementsPage pf;

	@Given("^User can open any browser$")
	public void user_can_open_any_browser() {
		initialization();
		pf = PageFactory.initElements(driver, ZooplaElementsPage.class);
		// pf = new ZooplaElementsPage(driver);
	}

	@Given("^User able to enter \"([^\"]*)\" url$")
	public void user_able_to_enter_url(String url) {
		driver.navigate().to(url);
	}

	@When("^User able to click on the login button$")
	public void user_able_to_click_on_the_login_button() throws InterruptedException {
		WaitHelper.waitForElement(pf.getClickSingButton(), 10);
		CommonUtility.highLighterMethod(driver, pf.getClickSingButton());
		pf.getClickSingButton().click();

	}

	@When("^User enter the userName \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enter_the_userName_and_password(String userName, String Pwd) throws Exception {
		WaitHelper.waitForElement(pf.getEnterUserName(), 20);
		CommonUtility.highLighterMethod(driver, pf.getEnterUserName());
		pf.getEnterUserName().sendKeys(userName);
		WaitHelper.waitForElement(pf.getEnterPassword(), 20);
		CommonUtility.highLighterMethod(driver, pf.getEnterPassword());
		pf.getEnterPassword().sendKeys(Pwd);
		
	}

	@When("^User click on the signing button$")
	public void user_click_on_the_signing_button() {
		WaitHelper.waitForElement(pf.getClickLogginButton(), 10);
		CommonUtility.highLighterMethod(driver, pf.getClickLogginButton());
		pf.getClickLogginButton().click();

	}

	@Then("^User able to verify successfully login & verify the homepage title$")
	public void user_able_to_verify_successfully_login_verify_the_homepage_title() throws InterruptedException {
		String actual = "MyZoopla - Zoopla";
		if (driver.getPageSource().contains("Incorrect email or password. Please check and try again")) {
			driver.close();
			Assert.assertTrue(false);
		} else {
			Thread.sleep(2000);
			Assert.assertEquals(actual, driver.getTitle());

			Assert.assertTrue(true);
			System.out.println("My Expected result is : " + driver.getTitle());
			driver.quit();
		}

	}

}