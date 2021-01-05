Feature: verify login credential

  Scenario: login succssful
    Given user is on login page
    When user enter username as "rsm" and password as "shm"
    Then user get "welcome" response

  Scenario: login failed
    Given user is on login page
    When user enter username as "shm" and password as "rsm"
    Then user get "home" response