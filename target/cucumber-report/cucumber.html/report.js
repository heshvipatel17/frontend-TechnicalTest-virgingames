$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/virgingames/resouces/featurefile/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login page navigate functionality",
  "description": "\r\nAs a user\r\nI want to visit virgingames website",
  "id": "login-page-navigate-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9179895100,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User should verify login button is displayed",
  "description": "",
  "id": "login-page-navigate-functionality;user-should-verify-login-button-is-displayed",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I should see \"Login\" displayed in one of the button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 147450900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 14
    }
  ],
  "location": "LoginSteps.iShouldSeeDisplayedInOneOfTheButton(String)"
});
formatter.result({
  "duration": 224202400,
  "status": "passed"
});
formatter.after({
  "duration": 114100,
  "status": "passed"
});
});