Feature: Login Action

  Scenario: 
    Given User is on adacitin webpage
    When user used to enter username and password
    Then user enter select location,hotel type,no of rooms,adult rooms and child rooms
    Then user should select hotel and continue to booking
    And User should enter firstname, lastname, address,ccno,cctype,expydate,expymnth and ccv
    Then user should verify order no.
