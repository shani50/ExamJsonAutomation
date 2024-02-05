Feature: Login scenarios of SRK Best Website

  @positive
  Scenario: User try to login to the SRK Best homepage by entering valid username and password
    Given User is on the SRK Best home page
    When User enters username and password
      | positive_test_case |
    And User click the login button
    Then User should successfully login
