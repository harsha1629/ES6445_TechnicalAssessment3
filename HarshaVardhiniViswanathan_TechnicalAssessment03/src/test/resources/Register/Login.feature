Feature: User trying to login into democart webpage
 
 Background:
   Given  User trying to launch webpage
    

  @ValidCredentials
  Scenario: User trying to login using valid credentials
  When User trying to click Login
   When User trying to enter valid email and password
   And User trying to click login button
   Then User confirms whether logged in successfully

  @InvalidCredentials
  Scenario Outline: User trying to login using Invalid credentials
  When User trying to click Login
     When User trying to enter invalid email and password
     And User trying to click login button
     Then User confirms whether invalid message occurred

   