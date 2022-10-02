$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Sep23a.feature");
formatter.feature({
  "name": "Verify Facebook Login Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify login functionality for valid Username and valid password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on Facebook page",
  "keyword": "Given "
});
formatter.match({
  "location": "Sep23aStepDefinition.user_is_on_Facebook_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username as \"deepthi@gmail.com\" and password as \"test@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "Sep23aStepDefinition.user_enters_username_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Sep23aStepDefinition.clicks_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "error page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Sep23aStepDefinition.error_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
});