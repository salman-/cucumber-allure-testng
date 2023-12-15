package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;

public class CalculatorSteps {

  @Step("the calculator is turned on")
  @Given("the calculator is turned on")
  public void the_calculator_is_turned_on() {

  }

  @Step("I enter the number {int}")
  @When("I enter the number {int}")
  public void i_enter_the_number(Integer int1) {

  }

  @Step("I press the addition button")
  @When("I press the addition button")
  public void i_press_the_addition_button() {

  }

  @Step("I press the equals button")
  @When("I press the equals button")
  public void i_press_the_equals_button() {

  }
  @Step("the result should be {int} on the screen")
  @Then("the result should be {int} on the screen")
  public void the_result_should_be_on_the_screen(Integer int1) {

  }

}
