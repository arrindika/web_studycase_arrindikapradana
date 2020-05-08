@Web @ItemLibrary
Feature: Item Library

  Background:
    Given User open moka backoffice login page
    And User input email "arrindika.pradana@gmail.com" on backoffice login page
    And User input password "07011999dika" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    When User go to menu item library on backoffice

  Scenario: User Create Item
    Given User is on create Item page on backoffice
    When User input name on create item page
    And User input price "10000" on create item page
    And User input SKU on create item page
    And User click save item
    Then Item saved

    @Edit
  Scenario: User Edit Item Name
    Given User is on edit Item page on backoffice
    When User input name on create item page
    And User click save item
    Then Item saved