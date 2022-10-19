Feature: Test Array Functionality

  Background: Verify the user login
    Given user on the login page
    When user enters username and password
    And user click on sign in button
    Then user in th home page

  
  Scenario: Verify the Array in Python page
    Given user on the Array DataStructure page after logged in
    When user clicks Arrays in Python link
    Then user should be redirected to Arrays in Python page
    When user click on Try Here button
    Then user shoud be redirected to tryEditor page with Run button
    ######## Verify the Array using list page#######
   
    When user clicks Array using list link
    Then user should be redirected to Arrays using list link
    When user click on Try Here button on Array list link page
    Then user should be redirected to tryEditor page with Run button
    ######### Verify the Basic operation in lists page #########
   
    When user clicks Basic operation inlists page
    Then user should be redirected to  Basic operation in lists page
    When user click on Try Here button on Basic operation in lists page
    Then user should be redirected to tryEditor page with Run button
    ######## Verify the Applictaions of Array page##########

    When user clicks Applictaions of Array page link
    Then user should be redirected to  Applictaions of Array page
    When user click on Try Here>>>
    Then user should be redirected to tryEditor page with Run button
    
