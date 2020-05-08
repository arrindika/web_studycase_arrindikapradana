@Android @Checkout
Feature: Checkout
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

  Scenario: User checkout 1 item
    Given User is on moka start page android
    When User click sign in button on moka start page android
    And User input email "arrindika.pradana@gmail.com" on sign in page
    And User input password "07011999dika" on sign in page
    And User click sign in button on sign in page
    Given User is on moka homepage
    When User order "Cappuccino" on favorites page
    And User click charge payment on homepage
    And User choose low payment
    And User click charge on payment page
    Then User see receipt page