Feature: sign in feature

Background: 

#Given the user is on "https://admin-demo.nopcommerce.com/admin/"

#@smoke
  Scenario: Create New Account verification
    Given the user is on "https://admin-demo.nopcommerce.com/admin/"
    When the user enter valid username
    And the user enter valid password
    And the user clicks on sigin button
    Then The user is successfully loged in and Dashboard is displays



