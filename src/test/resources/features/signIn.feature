@smoke
  Feature: User should provide provide all information to sign in;

    Scenario: User provide unvalid information to Sign in

      Given user go to the login page
      And user click the sign in button
      When user provide invalid "<email or username>" click continue
      Then confirm box with a problem