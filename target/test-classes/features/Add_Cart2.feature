#Author: Baskar Balan

@tag
Feature: PIM Page verifications
  I want to use this template for my feature file

  @P1
  Scenario: Verify the PIM home page
    Given user landed on the homepage
    When user clicked PIM menu
    Then user should see the search options
    And user should see add user button


 
