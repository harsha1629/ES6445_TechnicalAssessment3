package com.register;
 
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(tags="",plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
features = "src/test/resources/Register/Login.feature",glue ="com.register")
public class RunnerLogin extends AbstractTestNGCucumberTests {	
}
 