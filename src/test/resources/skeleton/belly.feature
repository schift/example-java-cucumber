@Belly
Feature: Belly

  Scenario: a few cukes
    Given I have 82 cukes in my belly
    When I wait 1 hour
    Then my belly should growl
