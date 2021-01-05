Feature: Evaluate percentage
  @First
  Scenario: Verify 10% offer
    Given Percent calc service
    When I will enter amount 6000
    Then Offer is ten percent
  @Second
  Scenario: Verify 15% offer
    Given Percent calc service
    When I will enter amount 11000
    Then Offer is fifteen percent

  @Third
  Scenario: Verify NA
    Given Percent calc service
    When I will enter amount 4000
    Then Offer is NA