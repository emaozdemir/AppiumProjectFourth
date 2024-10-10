@FirstHomeFeature
Feature: Home Page Feature

  Background: Home Page'e kadar gel
    Given user is on Gender Page
    And should see close button on Gender Page

  @HomePageSyntax
  Scenario: Home Page Syntax
    Given should see HomePage
    Then should see homeSembolButton on Home Page
    And should see alarmButton on Home Page
    And should see trendyolLogo on Home Page



