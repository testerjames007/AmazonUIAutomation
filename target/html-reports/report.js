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
formatter.write("Launched the chrome browser");
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
formatter.write("User has started the application");
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
formatter.write("Closed the browser");
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/features/Search.feature");
formatter.feature({
  "name": "Search feature",
  "description": "  As an authenticated user\n  I want to use search functionality\n  So that I should be able search a product",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "SearchProduct",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.write("Launched the chrome browser");
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
formatter.write("User has started the application");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has provided valid credentials",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.userHasProvidedValidCredentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search for the product \"Blouse\"",
  "keyword": "When "
});
formatter.match({
  "location": "SearchPageSteps.userSearchForTheProduct(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see the products for \"Blouse\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchPageSteps.userShouldSeeTheProductsFor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.write("Closed the browser");
formatter.after({
  "status": "passed"
});
});