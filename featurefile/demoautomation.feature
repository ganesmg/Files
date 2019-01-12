@Functional 
Feature:

Scenario: Login to Demo Automation Testing Page
Given Browser Name
Then User login to DemoAutomation Testing page
And User click on Navigation button

@Smoke
Scenario: Registration page
Given Browser Name
Then User login to DemoAutomation Testing page
And User click on Navigation button
Then User enter into Registration page

@Regression
Scenario: Select Checkbox
Given Browser Name
Then User login to DemoAutomation Testing page
And User click on Navigation button
Then User enter into Registration page
And User select Cricket and Hockey checkbox

@Sanity
Scenario: select Skils
Given Browser Name
Then User login to DemoAutomation Testing page
And User click on Navigation button
Then User enter into Registration page
And User select Cricket and Hockey checkbox
Then User select Skills dropdown option
 
