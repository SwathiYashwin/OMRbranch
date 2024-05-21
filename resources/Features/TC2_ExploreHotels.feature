Feature: Explore Hotels Modules

  Scenario Outline: Enter all field and verify select hotel (including options)
    Given user is on the Greentech page
    When user enter "<userName>" and "<passWord>"
    Then user should verify after login sucess massage "Welcome Swathi"
    When user should search hotels "<stateName>","<roomtype>","<checkInDate>","<checkOutDate>","<noOfRooms>","<noOfAdult>" and "<noOfChilderns>"
    Then user should verify after search hotel success massage "Select Hotels"

    Examples: 
      | userName                   | passWord  | stateName  | roomtype | checkInDate | checkOutDate | noOfRooms | noOfAdult | noOfChilderns |
      | swathithulukanam@gmail.com | Yash@0109 | Tamil Nadu | Standard | 2024-05-22  | 2024-05-25   |         1 |         1 |             1 |
