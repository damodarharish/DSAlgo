Feature: Test Tree Functionality

  Scenario: Verify the Tree page
    Given user on the login page
    When user enters username and password
    And user click on sign in button
    Then user in th home page
    Given user on the Tree DataStructure page after logged in
    When user clicks Overview of Trees link
    Then user should be redirected to Tree page
    When user click on Try Here button
    Then user shoud be redirected to tryEditor page with Run button
    ############Terminologies in tree############
    And user clicks Terminologies link
    Then user should be redirected to Tree Page
    When user click on Try Here button
    Then user shoud be redirected to tryEditor page with Run button
