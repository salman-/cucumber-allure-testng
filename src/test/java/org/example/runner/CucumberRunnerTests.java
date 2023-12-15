package org.example.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = "org.example.stepDefinitions",
    plugin = {"pretty", "html:target/cucumber-reports.html"})
public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

}