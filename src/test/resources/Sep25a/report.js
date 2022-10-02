$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Sep25a1D.feature");
formatter.feature({
  "name": "verify the Adactin hotel app login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "verify the login functionality for multiple username and password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on Adactin login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Step25a1DStepDefinition.user_is_on_Adactin_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "Deepthik",
        "Achyutha@12"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Step25a1DStepDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "Step25a1DStepDefinition.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search hotel page appears",
  "keyword": "Then "
});
formatter.match({
  "location": "Step25a1DStepDefinition.search_hotel_page_appears()"
});
formatter.result({
  "status": "passed"
});
});