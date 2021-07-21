Feature: Login feature
  As an authenticated user
  I want to login to the application
  So that I can access application features

  @Smoke
  Scenario: Check valid login
    Given user is on a login page
    When user has provided valid credentials
    Then user should be able to login

