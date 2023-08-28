Feature: Login Feature

  @smoke
  Scenario Outline: Verify user is able to login to SQMS with valid cretentials
    Given User is in login page
    When User enters <username> and <password>
    And click on login
    Then User navigated to home page

    @valid
    Examples: 
      | username        | password                 |
      | skill@gmail.com | iFGeFYmXIrUhQZHvW7P22w== |

    @invalid
    Examples: 
      | username        | password                 |
      | skill@gmail.com | eFGeFYmXIrUhQZHvW7P22w== |
