Feature: Providing required data for register using data Table
  
  @ValidCredentials
  Scenario: Register using valid credentials
    Given User launch demo web Shop
    When User trying to click register button
    And User entering gender,firstname,Lastname,email,password and also confirm password
  | Gender | FirstName      | LastName     |            Email              | Password   | Confirm Password |
  | Female | HarshaVardhiniV | Viswanathan |    harshahk099@gmail.com      | Harsha@16  |  Harsha@16       |
      
    And User click register button
		Then User get successfully registerd message and log out
    


 
      
      
