@test
Feature: Google Flooid results

  Scenario Outline: Search into google and assert results : <entry>
    Given i navigate to following homepage "www.google.com"
    And  I enter the following <entry> into the search bar and click search
    Then I should see results relevant to my search

    Examples:
      | entry               |
      | Flooid              |
#      | Flooid market share |






    
    #Scenario: List 10 top  website that contains the phone number of flooid coventry and validate any website has details other than flooid
      
      