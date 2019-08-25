Feature: Account Login
@test
  Scenario: Home page with jin user
    Given User is on landing page
    When User login with username and password with "jin" and "1234"
    Then Home page is displayed
    And Cart displayed are "true"
@aftertest
  Scenario: Home page with john user
    Given User is on landing page
    When User login with username and password with "john" and "1234"
    Then Home page is displayed
    And Cart displayed are "false"
  @regtest
  Scenario: Home page with datatable
    Given User is on landing page
    When User login with below details
      |jenny | abcd | john@test.com | austarlia | 12345|
    Then Home page is displayed
    And Cart displayed are "false"
  @regtest
  Scenario Outline: Home page with datatable
    Given User is on landing page
    When User login with username and password with "<Username>" and "<Password>"
    Then Home page is displayed
    And Cart displayed are "true"

    Examples:
      |Username | Password |
      |User1    | pass1|
      |User2    | pass2|
      |User3    | pass3|
      |User4    | pass4|
