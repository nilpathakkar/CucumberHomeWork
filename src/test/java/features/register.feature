@test
Feature: Registration
  Scenario: User able to register successfully
  so that,who can use all the user features on demonopecommerce website
    Given User on registration page
    When User enter needed registration details
    And User click on register submit button
    Then User should able to registered successfully
