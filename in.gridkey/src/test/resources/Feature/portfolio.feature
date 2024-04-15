Feature: Portfolio Creation

  As a user,
  I want to log in to the Gridkey application and create a new portfolio,
  So that I can verify and validate its portfolio creation functionality.

  @Smoke
  Scenario Outline: Verify the portfolio creation functionality of Gridkey Application with valid data
    Given the user navigates to the Browser Window Page at "https://stage.gridkey.in/login"
    When the user enters the Phone Number as "<Phone Number>"
    And the user enters the password as "<Password>"
    And the user clicks on the login button
    And the user should log in successfully into the portal.
    And the user clicks on "Create Portfolio"
    And the user enters Portfolio Name as "<Portfolio Name>"
    And the user enters Portfolio Code as "<Portfolio Code>"
    And the user clicks on "Test Client - C000001"
    And the user clicks on "Create Portfolio" button
    Then the portfolio is successfully created.

    Examples:
      | Phone Number | Password   | Portfolio Name   | Portfolio Code |
      | 1111155555   | Abcd@1234  | ExamplePortfolio | ABC123         |
     