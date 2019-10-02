Feature: Adding concerts
  
  As a concert organiser
  I want to be able to add concerts
  So people interested in my concerts can see them

  Scenario: Adding a concert
    Given a concert organizer
    When the organizer adds a concert named "Metallica goes Cucumber"
    Then the organizer will see "Metallica goes Cucumber" listed
    
    Scenario: DI explained
    Given a concert organizer named "DI"
    And he adds a concert named "Dependency and the injections" to the list of concerts
    When I look at the list of concerts
    Then I will see "Dependency and the injections" 
    