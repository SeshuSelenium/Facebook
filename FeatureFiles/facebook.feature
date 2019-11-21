Feature: validate facebook app
  
  @tag2
  Scenario Outline: Title of your scenario outline
    Given I launch "chrome" browser
    When I enter facebook username <userId> and password <userPassword> click n login
    Then validate home page
    And I logout facebook account


    Examples: 
      | userId | userPassword | 
      | 9515599998|darling143 | 
      | 9490072254 | darling143 | 
