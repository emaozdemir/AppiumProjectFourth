@FirstFeature
Feature: Gender Page Feature

  @GenderPageSyntax
  Scenario: Gender Page Syntax
    Given user is on Gender Page
    Then should see image on Gender Page
    Then should see close button on Gender Page
    Then should see men button "Men" on Gender Page
    Then should see women button "Women" on Gender Page
    Then should see text button "What categories are you interested in?" on Gender Page

  @MenButtonFunction
  Scenario: check erkek button
    Given user is on Gender Page
    When click Men Button on Gender Page
    Then should see HomePage

  @WomenButtonFunction
  Scenario: check women button
    Given user is on Gender Page
    When click Women Button on Gender Page
    Then should see HomePage

  @WomenButtonFunction
  Scenario: check cloce button
    Given user is on Gender Page
    When click Close Button on Gender Page
    Then should see HomePage

