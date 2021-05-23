Feature:As a Producer I want to create phone number

  @producer @phone
  Scenario: Check if phone number is correct
    Given Producer generate phone number
    Then check how many numbers include in phone number
    And Producer see results if phone number is correct

