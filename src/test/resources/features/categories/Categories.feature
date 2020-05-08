@Web @Categories
Feature: Categories

  Background:
    Given User open moka backoffice login page
    And User input email "arrindika.pradana@gmail.com" on backoffice login page
    And User input password "07011999dika" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    And User go to menu categories on backoffice

  Scenario: User Create Category
    Given User is on create category page on backoffice
    When User input name on create category page
    And User click save category
    Then Category saved


