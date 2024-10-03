#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: OrangeHrm Feature Functionality

  Scenario: Login Page functions
    Given user launch browser
    And user enter username "Admin" and password "admin123"
    Then user click on login button

 ## Scenario: Functionl work on dashboard
  ##  Given user click on admin
   ## Then user navigate to dashboard

  Scenario: system user search functionality
    Given user click admin element
    When enter system username
    And click userrole dropdown
    Then select the role from dropdwon
    And enter employe name
    And click status dropdown
    Then select status from dropdown
    Then click on search button
