#Author: Bhargav Chirumamilla
#Keywords Summary :
#Feature: Create To Do List Task
#Scenario: Create To Do List Task with arguments.

@SmokeTest @SanityTest @RegressionTest
Feature: Create To Do List Task
  
  Scenario: Verify To-Do List screen
    Given User navigated to React-to-do-list URI
    Then Verify To-Do List Header
    When Verify Add Task Tool Tip,when user dont have to do list
    And Verify some other action To Do,Done,All Tab bar
   
  Scenario Outline: Create To Do List Task and verify To Do List is present 
	  When Add Multiple tasks "<taskSearches>"
	 
	  
Examples:
|taskSearches|
|Expo|
|Platform|
|React|

     Scenario: Verify To Do List count
     And Verify To Do List count is 3