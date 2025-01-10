package com.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/feature/regestrationForm.feature"},
        glue = {"com.cucumber.stepDafinition"}
)
public class Runner extends AbstractTestNGCucumberTests {

}
