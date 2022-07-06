Feature: Nopcommerce Register

  Background:
    Given User able to open the browser
    And Enter the URL

    Scenario: Nopcommerce Register page Test
      Then User Click on Register link
      When User Enter first name and last name
      When User Enter the date of birth
      When User Enter the email
      When User enter the password
      When User Enter the Confirm password
      When Click on Register



