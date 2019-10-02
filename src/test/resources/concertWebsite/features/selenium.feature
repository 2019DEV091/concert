#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
Feature: Selenium exercise

  @Selenium
  Scenario: Adding concert Selenium
    Given I am on the "addConcert" page
    When I add a concert with the following information
      | concertName | artistName | venueName | concertDate | concertTime |
      | test        | Muse       | Het Depot | 08/12/2019  | 21:00       |
    Then that concert is present in the concert overview
    
    @Google
   Scenario: Search something in Google
   Given I am on the Google page
   When I search for "cucumber"
   Then the url of result 1 is "https://cucumber.io/"