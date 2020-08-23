Feature: Gmail Login

Background:
Given Launch Gmail

@loginScenario
Scenario Outline: Login correct credentials
When I enter username "<UserName>"
And I click next button
And I enter password "<Password>"
Then Then I verify appropriate profile of gmail

Examples:
|	UserName	|	Password	|
|	sarthak.mzn	|	abc			|
|	karan		|	abbb		|



#if we want to run 1 step multiple times

@Smoke @Regression 
Scenario: Check the components on gmail page
When Login with appropriate credentials 
Then I verify following components: 
|ComposeButton|
|Emails|
|Logout|
|Hangout|



