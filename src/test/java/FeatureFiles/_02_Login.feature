
  Feature: Login Functionality

    Background:
      Given Navigate to parabank

    Scenario Outline: Login Positive and Negative
      When Enter username and password and click button name as "<USERNAME>" password as "<PASSWORD>"
      Then Login message should be displayed
      Examples:
      | USERNAME | PASSWORD |
      | safak | safakk123 |
      | safakk | safakk12345 |
