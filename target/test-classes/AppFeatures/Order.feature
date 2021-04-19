Feature: Order details
  In order to check my order details 
  As a register user 
  I want to specify the specify the features of order details page

  Background: 
    Given a registered user exists
    Given user is on Amazon login page
    When user enters user name
    And user enters password
    And user click on login button
    Then user navigate to order page

  Scenario: Check previous order details
    When User click on order link
    Then user check previous order details

  Scenario: Check open order details
    When User click on open order link
    Then user check open order details

  Scenario: Check Cancelled order details
    When User click on Cancelled order link
    Then user check Cancelled order details
