package com.register;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "",features = "src/test/resources/Register/Register.feature",plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},glue = "com.register")
public class RunnerJunit {

}
