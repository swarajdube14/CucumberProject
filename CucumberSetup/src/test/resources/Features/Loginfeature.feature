Feature: Test the login functionality of OrangeHRm

Scenario: Test the valid login

Given user is on login page
When user enters username and passoward
And click on login button
Then user should land on homepage

Scenario: Test the valid login1

Given user is on login page
When user enters username and passoward
And click on login button
Then user should land on homepage