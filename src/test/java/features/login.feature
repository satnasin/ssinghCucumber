Feature: This is test feature file

  Scenario Outline:Login to the app
    Given user navigate to homepage
    When user enters <uname> and <password>
    And clicks login
    Then user navigate to logged in home
    Examples:
    |uname||password|
    |a1||password|
    |a2||password|
