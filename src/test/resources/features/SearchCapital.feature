Feature:Searching capital of New Jersey in Google search engine
  @test1
  Scenario: Search information by passing sentence "capital of New Jersey"
    Given user is navigated to Google webpage
    When user enters search parameters in Search box
    And clicks on Google Search Button
    Then results are displayed
