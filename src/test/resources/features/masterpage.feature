Feature: Test cases for master page

  @positive
  Scenario: User try to login to the SRK Best homepage by entering valid username and password
    Given User is on the SRK Best home page
    When User enters username and password
      | positive_test_case_01 |
    And User click the login button
    Then User should successfully login

#  @masterpage
#  Scenario: User is try to  add master page
#    When User is on SRK BEST  home page
    When User add to the cabin master
    When User add to the cabin form
      | cabin_data_01 |
    And User click on the save button
    When User click on cabin allotment page
    When User search the cabin allotment
    And User click on delete button
    Then User showing the confirmation message
    Then User showing successfully delete




