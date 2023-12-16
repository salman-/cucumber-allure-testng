Feature: User Authentication
  This is a simple feature file to test.

  @login
  Scenario: Successful Login
    Given the user is on the login page
    When the user enters valid credentials
    And clicks the login button
    Then the user should be redirected to the dashboard
    And should see a welcome message