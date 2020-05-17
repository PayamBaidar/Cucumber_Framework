$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "sign in feature",
  "description": "",
  "id": "sign-in-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11482210700,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "comments": [
    {
      "line": 5,
      "value": "#Given the user is on \"https://admin-demo.nopcommerce.com/admin/\""
    },
    {
      "line": 7,
      "value": "#@smoke"
    }
  ],
  "line": 8,
  "name": "Create New Account verification",
  "description": "",
  "id": "sign-in-feature;create-new-account-verification",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "the user is on \"https://admin-demo.nopcommerce.com/admin/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "the user enter valid username",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "the user enter valid password",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "the user clicks on sigin button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "The user is successfully loged in and Dashboard is displays",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://admin-demo.nopcommerce.com/admin/",
      "offset": 16
    }
  ],
  "location": "loginSteps.the_user_is_on(String)"
});
formatter.result({
  "duration": 1688049200,
  "status": "passed"
});
formatter.match({
  "location": "loginSteps.the_user_enter_valid_username()"
});
formatter.result({
  "duration": 3177241000,
  "status": "passed"
});
formatter.match({
  "location": "loginSteps.the_user_enter_valid_password()"
});
formatter.result({
  "duration": 120866200,
  "status": "passed"
});
formatter.match({
  "location": "loginSteps.the_user_clicks_on_sigin_button()"
});
formatter.result({
  "duration": 2789692000,
  "status": "passed"
});
formatter.match({
  "location": "loginSteps.the_user_is_successfully_loged_in_and_Dashboard_is_displays()"
});
formatter.result({
  "duration": 73703900,
  "status": "passed"
});
formatter.after({
  "duration": 746265100,
  "status": "passed"
});
});