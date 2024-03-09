Feature: Verify Bored API response

  Scenario: Verify API response code and schema

    Given the Bored API endpoint is available
    When I make a GET request to the API
    Then response should be with status code 200
    And the response should follow the expected schema