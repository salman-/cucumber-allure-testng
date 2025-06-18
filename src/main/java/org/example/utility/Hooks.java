package org.example.utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @Before
    public void setUp() {
        System.out.println("Hooks setUp is called");
        WebDriver driver = DriverFactory.createDriver();
        DriverManager.setDriver(driver);
    }

    @After
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
