
Feature: login

  @positive
  Scenario Outline: Enter username and password click on login Home page should display
    Given Login page 
    When user Enter username  "<username>"
    And user enter password "<password>"
    And click on login button
    Then Home page should display
   
   Examples:
             | username | password|
             | admin    | admin123|
             | xyz      | xyz123  |