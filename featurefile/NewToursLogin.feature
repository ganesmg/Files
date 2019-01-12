Feature: New Tours Login

Scenario Outline: New Tours Login page

Given User enter into new tours login page 
When Enter "<username>" and "<password>" on login page
And user click on signin button
And Select how many "<passenger>" in drop down list
And User select "<departingfrom>" drop down list
And User select "<month>" and "<date>" values from drop down list
And User Select "<ArrivingIn>" option from drop down list
And User select Returning "<month>" and "<date>" from drop down list	

Examples:

|username|password|passenger|departingfrom|month|date|ArrivingIn|month  |date|
|123		 |123		  |2        |Paris        |May  |5   |London	 |June   |6   |
|123     |123     |4        |Portland     |June |6   |Sydney   |July   |7   |
|123     |123     |2        |New York     |July |7   |Seattle  |October|10  | 


