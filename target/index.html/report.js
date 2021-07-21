$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login feature",
  "description": "  As an authenticated user\n  I want to login to the application\n  So that I can access application features",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check valid login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on a login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.userIsOnALoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has provided valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.userHasProvidedValidCredentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.userShouldBeAbleToLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});