@Regression
Feature: Login Page Feature
  I want to use this template for my loginPage feature file
  

  @test-1
  Scenario: To validate valid login scenario
  Given user launched browser
   When User enter valid username
   And User enter valid password
   	And teer click on login button
	Then User should be able to login successfully

  @test-2
  Scenario: To validate invalid login scenario
    Given user launched browser
  When User enter invalid username
	And User enter invalid password 
	And User click on login hutton
	Then User should not be able to login successfullyp
