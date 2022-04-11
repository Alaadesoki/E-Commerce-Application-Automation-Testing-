@Regression
Feature: User could reset his/her password successfully

  #Test Senario 1
  Scenario: User registered with valid data
    Given user enter valid data and click on login button
    When user enter old and new password and click to change password button
    Then User Could change password succesfuly


