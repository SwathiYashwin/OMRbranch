Feature: Verifying OMR Branch Login Automation

  Scenario Outline: Verifying  login with valid credentials
    Given user is on the Greentech page
    When user enter "<userName>" and "<passWord>"
    Then user should verify after login sucess massage "Welcome Swathi"

    Examples: 
      | userName                   | passWord   |
      | swathithulukanam@gmail.com | Yash@0109  |