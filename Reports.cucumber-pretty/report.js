$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "sign in feature",
  "description": "",
  "id": "sign-in-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11347619800,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "the user is on \"https://admin-demo.nopcommerce.com/admin/\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://admin-demo.nopcommerce.com/admin/",
      "offset": 16
    }
  ],
  "location": "login.the_user_is_on(String)"
});
formatter.result({
  "duration": 1606430200,
  "status": "passed"
});
formatter.scenario({
  "comments": [
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
  "name": "the user click on sign in link",
  "keyword": "Given "
});
formatter.match({
  "location": "login.the_user_click_on_sign_in_link()"
});
formatter.result({
  "duration": 3456976200,
  "status": "passed"
});
formatter.after({
  "duration": 25200,
  "status": "passed"
});
});