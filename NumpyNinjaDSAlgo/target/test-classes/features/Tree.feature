Feature: Test Tree Functionality

  Background: Verify the Tree page
    Given user on the login page
    When user enters username and password
    And user click on sign in button
    Then user in th home page

  Scenario: verify Tree Page
    Given user on the Tree DataStructure page after logged in
    When user clicks Overview of Trees link
    Then user should be redirected to Tree page
    When user click on Try Here button
    Then user shoud be redirected to tryEditor page with Run button
    ############Terminologies in tree############
    And user clicks Terminologies link
    Then user should be redirected to Tree page
    When user click on Try Here button
    Then user shoud be redirected to tryEditor page with Run button
    ########Types of Trees#########
    And user clicks Types of Trees link
    Then user should be redirected to Tree page
    When user click on Try Here button
    Then user shoud be redirected to tryEditor page with Run button
    ########Tree Traversals#########
    And user clicks Tree Traversals link
    Then user should be redirected to Tree page
    When user click on Try Here button
    Then user shoud be redirected to tryEditor page with Run button
    ########Traversals-Illustration#########
    And user clicks Traversals-Illustration link
    Then user should be redirected to Tree page
    When user click on Try Here button
    Then user shoud be redirected to tryEditor page with Run button
    ########Binary Trees#########
    And user clicks Binary Trees
    Then user should be redirected to Tree page
    When user click on Try Here button
    Then user shoud be redirected to tryEditor page with Run button
    ########Implementation in Python########
    And user clicks Implementation in Python link
    Then user should be redirected to Tree page
    When user click on Try Here button
    Then user shoud be redirected to tryEditor page with Run button
    ########Binary Tree Traversals########
    And user clicks Binary Tree Traversals link
    Then user should be redirected to Tree page
    When user click on Try Here button
    Then user shoud be redirected to tryEditor page with Run button
    ########Implementation of Binary Trees########
    And user clicks Implementation of Binary Trees link
    Then user should be redirected to Tree page
    When user click on Try Here button
    Then user shoud be redirected to tryEditor page with Run button
    ########Appliations of Binary Trees########
    And user clicks Appliations of Binary Trees link
    Then user should be redirected to Tree page
    When user click on Try Here button
    Then user shoud be redirected to tryEditor page with Run button
    ########Binary Search Trees########
    And user clicks Binary Search Trees link
    Then user should be redirected to Tree page
    When user click on Try Here button
    Then user shoud be redirected to tryEditor page with Run button
    ########Implimentation of BST########
    And user clicks Implementation Of BST link
    Then user should be redirected to Tree page
    When user click on Try Here button
    Then user shoud be redirected to tryEditor page with Run button
