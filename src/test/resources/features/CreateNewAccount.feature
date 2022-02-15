
Feature: Create new Amazon account and provide invalid credentials

  Scenario: create and provide invalid Credentials

    Given user go to the login page
    And user click the sign in button
    Given click create your Amazon account
    And provide <"invalid data"> to your name
    And provide <998901234541> invalid phone number
    When provide invalid password <"Hello World">
    And re-enter invalid password<"Hello World">
    Then click continue button and confirm <"There was a problem"> message