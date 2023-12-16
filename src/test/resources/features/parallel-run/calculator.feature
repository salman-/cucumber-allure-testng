Feature: Calculator Operations

  Scenario: Add two numbers
    Given the calculator is turned on
    When I enter the number 5
    And I press the addition button
    And I enter the number 3
    And I press the equals button
    Then the result should be 8 on the screen
