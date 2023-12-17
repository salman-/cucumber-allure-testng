package org.example.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
    features = "src/test/resources/features/sequential-run",
    glue = "org.example.stepDefinitions",
    plugin = {
        "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
        "pretty",
        "html:target/cucumber-reports.html"
    }
)
public class CucumberSequentialRunnerTests extends AbstractTestNGCucumberTests {

}