Feature: Verify Facebook Login Functionality

Scenario: Verify login functionality for valid Username and invalid password

Given User is on Facebook login page
When User enters  valid Username and invalid password
When User clicks the login button
Then Error page is displayed
