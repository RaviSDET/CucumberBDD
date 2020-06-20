$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/Features/DoLogin.feature");
formatter.feature({
  "name": "Login into nopcommerce application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Do login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "i open the chrome broswer",
  "keyword": "Given "
});
formatter.step({
  "name": "enter the url as \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.step({
  "name": "enter the username as \"\u003cusername\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "Click on login button",
  "keyword": "And "
});
formatter.step({
  "name": "Click on logout button and close the browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Do login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "i open the chrome broswer",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.LoginStepDefinitions.i_open_the_chrome_broswer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the url as \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.LoginStepDefinitions.enter_the_url_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the username as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.LoginStepDefinitions.enter_the_username_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LoginStepDefinitions.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on logout button and close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LoginStepDefinitions.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});