
  Feature: Register Functionality

    Scenario: Register account with valid data

      Given Navigate to parabank
      When Enter the valid data and create account
      Then Account should be created successfully