Feature: verify Adactin hotel app functionality
Scenario: verify hotel app functionality
Given user is on Adactin hotel app login page
When user enters username as "Deepthik"  and password as "Achyutha@12" 
And click the login button
Then Search hotel page is displayed
When user selects the location
And clicks search button
Then select hotel page is displayed
When user selects hotel
And clicks on continue
Then Book a hotel page is displayed
When user enters firstname as "Deepthi",lastname as "K",billingaddress as "Hyderabad",creditcardnum as "1234567812345678",creditcardtype ,expirymonth ,expyear as ,cvvnum as "123"
And click on booknow button
Then booking confirmation page is displayed

#Examples:
#|Deepthik|Achyutha@12|location|Deepthi|K|Hyderabad|1234567812345678|creditcardtype|expirymonth|expyear|123|




















