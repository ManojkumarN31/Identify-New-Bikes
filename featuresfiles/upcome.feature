Feature: print the bike values

  @tag1
  Scenario: print the upcoming bikes
    When mouse event for newbikes
    And click the honda
    Then click the more bikes