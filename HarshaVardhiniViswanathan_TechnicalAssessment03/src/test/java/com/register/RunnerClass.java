package com.register;
 
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
features = "src/test/resources/Register/Register.feature",glue ="com.register")
public class RunnerClass extends AbstractTestNGCucumberTests {	
}
 