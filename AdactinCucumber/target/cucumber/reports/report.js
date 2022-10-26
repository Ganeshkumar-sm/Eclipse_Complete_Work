$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Featurefile/orangehrm.login.feature");
formatter.feature({
  "line": 1,
  "name": "Test the registration and login functionality of orangeHRM",
  "description": "",
  "id": "test-the-registration-and-login-functionality-of-orangehrm",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "check the login functionality",
  "description": "",
  "id": "test-the-registration-and-login-functionality-of-orangehrm;check-the-login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user enter the valid url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter the username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user click the login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user verifies the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "HrmStepDefinition.user_enter_the_valid_url()"
});
formatter.result({
  "duration": 11900101600,
  "status": "passed"
});
formatter.match({
  "location": "HrmStepDefinition.user_enter_the_username_and_password()"
});
formatter.result({
  "duration": 224428900,
  "status": "passed"
});
formatter.match({
  "location": "HrmStepDefinition.user_click_the_login_button()"
});
formatter.result({
  "duration": 6508507100,
  "status": "passed"
});
formatter.match({
  "location": "HrmStepDefinition.user_verifies_the_homepage()"
});
formatter.result({
  "duration": 48886700,
  "status": "passed"
});
});