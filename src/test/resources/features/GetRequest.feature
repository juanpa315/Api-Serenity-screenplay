Feature: Validate status code when the user makes GET request with different input data

  @Case1
  Scenario: As a user Juan wants to makes a GET request successfully on the rick and morty API
    When The user makes a GET request
    Then Get the expected status code