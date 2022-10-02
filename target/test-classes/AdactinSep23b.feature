Feature: verify the Adactin Login functionality
Scenario: Verify login functionality for valid Username and valid password

Given User is on Adactin login page
When User enters  valid Username as "Deepthik" and password as "Achyutha@12"
When User clicks the login button
Then Search hotel page is displayed