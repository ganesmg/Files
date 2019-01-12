Feature: Title of your feature
  I want to use this template for my feature file

  Scenario Outline: Title of your scenario outline
    Given I want to write a step
    When I enter the username "<name>" and password "<value>" in user field
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | sundar|     5 | success |
      | ganesh|     7 | Fail    |
      |	prem	|			8	| partial	|
