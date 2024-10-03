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

Feature: orange Intigration functionality

  Background: login page functionality
    Given user launch browser
    And user enter valid username and password
    When user click on login button
    Then user navigate to dashboard
  
    Scenario: admin element functionality
    Given user click on Admin Element
    And user click on add button
    Then user should navigate to admin page
    
    Scenario: admin page functinality
    Given user click on Admin Element
    And user click on add button
    Given click on user role dropdown
    When  select dropdown list for role
    And enter employe name
    And click on status dropdown
    When select dropdown list for status
    And enter user name 
    And enter newpassword and confirmpassword
    Then click on save button
