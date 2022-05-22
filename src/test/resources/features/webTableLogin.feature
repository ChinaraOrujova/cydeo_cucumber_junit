Feature: User should be able to login using correct credentials

  Background: user is on the login page of web table app

  Scenario: Positive login scenario
    When user enters username "Test"
    And user enter password "Tester"
    And user click on login button
    Then user should see url contains orders


  Scenario: Positive login scenario
    When user enters username "Test" password "Tester" and logins
    Then user should see url contains orders

    #1- implement this new step
    #2- create login method in WebTableLoginPage
    # this login method should have multiple different overloaded


  Scenario: User should see be able to see all 12 months in months dropdown
    When user enters below credentials
    |Username |Test|
    |Password |Tester|
    Then user should see url contains orders

