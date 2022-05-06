#Author: Bhargav Chirumamilla
#Keywords Summary :
#Feature: Delete List Of Task
#Scenario: Delete List Of Task 

@SmokeTest @SanityTest @RegressionTest
Feature: Delete List Of Task 
  
  Scenario: Verify Delete List Of Task 
    Given User Click on Delete Button
    When Verify user have Delete All Tasks Button with Red colour
    Then Select to delete only one Task from list
    And Verify deleted task should be remove from the list of TO DO and ALL tabs
    
    
    Scenario: Verify Delete ALL button, user able to close the tasks
     When Again click on delete button
     And  User able to close the Delete All Tasks from the list
     Then Once again click on on Delete button
     And Verify user have Delete All Tasks button with Red colour
    
     Scenario: Verify Delete ALL List Of Task 
     Then Click on Delete All Tasks
     And verify All tasks deleted