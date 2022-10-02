Feature: verify Adactin hotel app login functionality
Scenario: verify login functionality with username and password

Given user is on Adactin hotel login page
When user enters username as "Deepthik" and password as "Achyutha@12"
And clicks on login button
Then it displays search hotel page
