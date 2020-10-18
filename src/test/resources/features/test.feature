@test
Feature: Google Flooid results

  Scenario Outline: Testing that you can enter a search into google and Google will return results
    Given i am on the google homepage
    And I enter and I enter the following <input>
    Then I should see results relevant to my search

    Examples:
      | input                |
      | Flooid's competitors |
      | Flooid market share |






    
    #Scenario: List 10 top  website that contains the phone number of flooid coventry and validate any website has details other than flooid
      
      