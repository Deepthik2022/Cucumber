Feature: verify the Adactin hotel app login functionality
Scenario: verify the login functionality for multiple username and password

Given user is on Adactin login page
When user enters username and password
|Deepthik|Achyutha@12|
And clicks on login button
Then search hotel page appears