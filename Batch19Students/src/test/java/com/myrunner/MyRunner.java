package com.myrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)

@CucumberOptions( 
//plugin= {"pretty","json:target/cucumber-reports/cucumber.json"},

features = "com.myrunner.MyRunner",
  glue=""
 
)


//public class MyRunner  {

public class MyRunner extends AbstractTestNGCucumberTests {

}
