@Functional
Feature:
Background: Browser and URL
Given Browser
And User enter into new tours login page

@Smoke
Scenario: login page for New Tours

When User on New Tours login Page
Then User Enter the name
And User Enter the Password
Then User Click on Sign in button

@Regression
Scenario: login for unvalid
When User on New Tours login Page
Then User Enter the name
And User Enter the Password
Then User Click on Sign in button

@Regression
Scenario Outline: login for validwithpara
When User on New Tours login Page
Then User Enter the name as "<name>"
And User Enter the Password as "<value>"
Then User Click on Sign in button

	Examples: 
      | name  | value | 
      | sundar|     5 |
      | ganesh|     7 |
      |	prem	|			8	|

