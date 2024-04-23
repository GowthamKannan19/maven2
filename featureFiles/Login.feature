Feature: open facebook.com featurre

  Scenario: open facebook and verify loginPage
    Given when user is entering the facebook.com
    When user wants to send Invalid Username
    And user wants to send invalid passsword
    And when user is clicking the Login button
    Then the user should see the Error message
