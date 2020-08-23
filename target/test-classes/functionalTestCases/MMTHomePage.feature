Feature: Validations for MMT HomePage

Scenario: Verify the title of homepage
Given Launch the HomePage
Then Verify the title of homepage


Scenario: Verify basic componenets of HomePage
Given Launch the HomePage
Then Verify below basic attributes of the homepage:
  |		 makemytriplogo  			|
  |		 searchButton				|
  |		 loginAccountButton			|
  
