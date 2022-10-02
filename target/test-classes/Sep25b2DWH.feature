Feature: verify the Adactin hotel login page
Scenario: verify the username and password for multiple users

Given user is on Adactin login page
When user enters username and password
|username|password|
|Deepthik|Achyutha@12|
|user1|test@123|
|user2|test@456|
And user clicks the login button
Then search hotel page appears
