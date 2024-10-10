@FirstHomeFeature
Feature: Home Page Feature

  Background: Home Page'e kadar gel
    Given user is on Gender Page
    And click Close Button on Gender Page

  @HomePageSyntax
  Scenario: Home Page Syntax
    Given user is on Home Page
    Then should see homeSembolButton on Home Page
    And should see alarmButton on Home Page
    And should see trendyolLogo on Home Page



