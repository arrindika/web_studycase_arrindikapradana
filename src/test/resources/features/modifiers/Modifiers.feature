@Web @Modifiers
Feature: Modifiers

  Background:
    Given User open moka backoffice login page
    When User input email "arrindika.pradana@gmail.com" on backoffice login page
    And User input password "07011999dika" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    And User go to menu modifiers on backoffice

  Scenario: User create modifier with 1 option
    Given User is on moka modifier create page on backoffice
    When User input name "Toping" on name modifier field
    And User click add manage option
    And User click add option
    And User input "name" on name option
    And User input "1000" on price option
    And User click save option
    And User click save modifier
    Then Moodifier is created

  Scenario: User edit modifier
    Given User is on moca modifier edit page on backoffice
    When User change name "Sugar" on name modifier field
    And User click save modifier
    Then Modifier is updated


