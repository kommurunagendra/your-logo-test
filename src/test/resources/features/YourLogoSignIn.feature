@test
Feature: User sign in and sign out

  Scenario: sign in into automation practice site and logout.
    Given user is on automation practice home page
    When  i click on sign in link
    Then i should be in authentication page
    When i enter emailId reddyk@gmail.com and password Test@1234 and click on sign in button
    Then i should be in my account page
    When i click on sign out link
    Then i should be in authentication page
