
Feature: Bill Pay Functionality

  Background:
    Given Navigate to parabank
    When Enter username and password and click button name as "safak" password as "safakk123"

  Scenario Outline: Bill payment with form information
    When Enter utility and bill and click payment button name as "<payeeName>" password as "<BILL>"
    Then Payment message should be displayed
    Examples:
      | payeeName | BILL |
      | Electricity | 85 |
      | Water | 45 |
      | Gas | 120 |