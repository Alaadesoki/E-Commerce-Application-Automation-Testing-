@Regression
Feature: User should be able to login with valid username and password

  #Test Senario 1
  Scenario: User login with valid data
    Given user open the website
    When user enter valid data and click on login button
    Then User Could login successfully & go to home page


