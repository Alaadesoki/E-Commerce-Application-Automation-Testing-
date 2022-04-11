@Regression
Feature: User should be able to login with valid username and password

  #Test Senario 1
  Scenario: User should be able to login with valid username and password
    Given user open the website & loged with valid data
    When user search for laptop
    And User landing to the laptops page
    Then User Found the result


