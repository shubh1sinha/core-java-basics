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
@tag
Feature: Test the functionality of Calculator
  I want to test the methods of calculator

  @tag1
  Scenario: Test to add method of calculator
    Given Create the object of calculator
    When someone input 8 and 4
    Then add of calculator return 12

  @tag2
  Scenario: Test to add method of calculator
    Given Create the object of calculator
    When someone input 8 and 4
    Then divide of calculator return 2

#    Examples: 
#      | name  | value | status  |
#      | name1 |     5 | success |
#      | name2 |     7 | Fail    |
