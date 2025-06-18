package org.example.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/resources/features/parallel-run",
        glue = {"org.example.stepDefinitions", "org.example.utility"},
        plugin = {
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "pretty",
                "html:target/cucumber-reports.html"
        }
)
public class CucumberParallelRunnerTests extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}