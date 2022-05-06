#Author: Bhargav Chirumamilla
#Keywords Summary :
#Feature: To Do List Task
#Scenario: To Do List Task with checkboxes.

@SmokeTest @SanityTest @RegressionTest
Feature: TO DO List Task
  
  Scenario: Verify To-Do List Tasks
    Given User navigated TO DO Tab
    When Verify ALL Tab with list tasks without checkboxes
    
  Scenario: Verify DONE List Tasks
    And  Verify TO DO, after change from DONE Tab
    