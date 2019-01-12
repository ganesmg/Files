Feature: New Tours Demo user login 

Scenario Outline: Demo User login

Given Go to New Tours login page
When Enter User Name "<name>" and Password "<value>"
Then Click on login button

Examples: 
					|name|value|
					|123 |123	 |
					|123 |123  |
					

