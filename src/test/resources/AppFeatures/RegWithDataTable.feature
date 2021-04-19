Feature: User Registration

  Scenario: User should be Registered with different data
  
    Given User should be redirect to Registration URL
    Then User should be enter following data
      | Jitu  | Sawant  | j@gmail.com  | 9869868877 | Mumbai  |
      | Jitu1 | Sawant1 | j1@gmail.com | 9869865566 | Mumbai1 |
      | Jitu2 | Sawant2 | j2@gmail.com | 9869864545 | Mumbai2 |
      | Jitu3 | Sawant3 | j3@gmail.com | 9869861212 | Mumbai3 |
    Then Sure should be registered successfully

  Scenario: User should be Registered with different data column
  
    Given User should be redirect to Registration URL
    Then User should be enter following data with column name
      | Name  | Sname   |    Emailid   |  Mobile no |   City  | 
      | Jitu  | Sawant  | j@gmail.com  | 9869868877 | Mumbai  |
      | Jitu1 | Sawant1 | j1@gmail.com | 9869865566 | Mumbai1 |
      | Jitu2 | Sawant2 | j2@gmail.com | 9869864545 | Mumbai2 |
      | Jitu3 | Sawant3 | j3@gmail.com | 9869861212 | Mumbai3 |
    Then Sure should be registered successfully
    
    