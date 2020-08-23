Feature: This is google home page testcases

@Smoke
Scenario: Verify Title of Google HomePage
Given Launch Google Home Page
Then Verify title of google homepage

@Regression
Scenario: Verify textbox functionlity
Given Launch Google Home Page
When I enter "testing" in textbox
And I click on search button
Then It shows "10" results




