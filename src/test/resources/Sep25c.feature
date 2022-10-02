Feature: verify Adactin Login Functionality
Scenario Outline: verify username and password for multiple users

Given user is on Adactin login page
When user enters "<username>" and "<password>"
And user clicks on login button
Then search hotel page appears

Examples: 
|username|password|
|user1|test123|
|user2|test456|
|Deepthik|Achyutha@12|