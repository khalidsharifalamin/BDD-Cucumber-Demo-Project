$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/alami/Desktop/learning/Cucumber/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Free OSA Login Feature",
  "description": "",
  "id": "free-osa-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free OSA Login Test Scenario",
  "description": "",
  "id": "free-osa-login-feature;free-osa-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is already on osa login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Title of login page is osa login",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "#~~parameterized~~#"
    },
    {
      "line": 8,
      "value": "#Then User enter \"moutushislam@gmail.com\" and \"Asad1234\""
    },
    {
      "line": 10,
      "value": "#~~Testdata method~~#"
    },
    {
      "line": 11,
      "value": "#Then User enter username and passord"
    },
    {
      "line": 12,
      "value": "#| moutushislam@gmail.com | Asad1234 |"
    },
    {
      "line": 14,
      "value": "#~~map object~~#"
    }
  ],
  "line": 15,
  "name": "User enter username and passord",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 16
    },
    {
      "cells": [
        "moutushislam@gmail.com",
        "Asad1234"
      ],
      "line": 17
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 18,
      "value": "#|         alamin         |   a123   |"
    }
  ],
  "line": 20,
  "name": "User clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "User is on Student page",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepdefination.User_is_already_on_osa_login_page()"
});
formatter.result({
  "duration": 11552631900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.title_of_login_page_is_osa_login()"
});
formatter.result({
  "duration": 11226300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.user_enter_username_and_passord(DataTable)"
});
formatter.result({
  "duration": 644055800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 137626800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.user_is_on_Student_page()"
});
formatter.result({
  "duration": 6815800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepdefination.close_browser()"
});
formatter.result({
  "duration": 5756195900,
  "status": "passed"
});
});