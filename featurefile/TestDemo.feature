@Functional
Feature:

Background: Browser Name and user enter into Registration page
Given Enter Demo Automation URL
Then User Clicks Navigation button

@Smoke @Sanity
Scenario: select hobbies
Given User select checkbox 

@Regression
Scenario: User click on Radio button in registration page
Given User click on Gender Option

@Regression
Scenario: User enter password and confirm password
Given Enter the password
