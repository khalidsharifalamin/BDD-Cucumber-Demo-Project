Feature: OSA form fillup Feature
Scenario: OSA form fillup test Scenario

Given User is already home page
When tilte of page is OSA  home
Then User fill "<firstname>" , "<lastname>" and "<phone>"
Then User 