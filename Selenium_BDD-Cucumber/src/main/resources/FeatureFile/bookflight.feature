@book 
Feature: Booking

  Scenario: Book a flight
    Given the user navigates to cleartrip homepage
    When user selects a flight from "Chennai" to "Bangalore"
    And user selects no of adults as "2"
    And user searches for flight
    Then flight details should be displayed