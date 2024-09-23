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

Feature: Rubix Company project
  I want to use this template for my Rubix  feature file
  Background:
   Given the application is launched
  

  @test-1
  Scenario: Verify that the application launches on different platforms (IE, Edge, Chrome, and Mac)
    Given the application is installed on the desired platform (Chrome)
	  When the user launches the application
	  Then the application should open successfully on the respective platform
	  
	  
	  @test-2
	    Scenario: Navigation on clicking any module
           
           When the user clicks on a module (Home, Services, Products, AI INTERNSHIP, Career, Blog)
           Then the user should be navigated to the respective page displaying its content

  
