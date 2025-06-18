package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.utility.DriverManager;
import org.openqa.selenium.WebDriver;

public class LoginTest {

    WebDriver driver;


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("method");
        driver = DriverManager.getDriver();
        driver.get("https://www.saucedemo.com/");

    }

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {

    }

    @When("clicks the login button")
    public void clicks_the_login_button() {

    }

    @Then("the user should be redirected to the dashboard")
    public void the_user_should_be_redirected_to_the_dashboard() {

    }

    @Then("should see a welcome message")
    public void should_see_a_welcome_message() {

    }

}
