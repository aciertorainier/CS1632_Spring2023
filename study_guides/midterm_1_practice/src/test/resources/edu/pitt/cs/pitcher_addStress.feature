Feature: Add stress to pitcher

Background:
    Given a Pitcher

Rule: On first call to addStress(int), getStress() returns the amount of stress added.

Scenario: After adding 10 stress to pitcher, getStress returns 10.
    When I add 10 stress
    Then the stress is: 10

Rule: On subsequent calls to addStress(int), stress is accumulated.

Scenario: After adding 20 stress and then 30 stress to pitcher, getStress returns 50.
    When I add 20 stress
    When I add 30 stress
    Then the stress is: 50