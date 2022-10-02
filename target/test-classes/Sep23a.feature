Feature: Verify Facebook Login Functionality

Scenario: Verify login functionality for valid Username and valid password
Given User is on Facebook page
When User enters username as "deepthi@gmail.com" and password as "test@123"
And clicks the login button
Then error page is displayed


	