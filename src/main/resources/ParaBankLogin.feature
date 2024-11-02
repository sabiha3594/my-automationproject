
	@Smoke @Regression
	Feature: login function test
	 Background:
		Given open browser
    And Go to para bank application
 
  @positive
  Scenario: as a para bank user login should success with valid credential
    
    When put valid user name
    And put valid password
    And click login button
    Then login should pass and logout button should visible
  
    @negative
 		Scenario: as a para bank user login should fail with invalid credential
    
    When put invalid user name
    And put invalid password
    And click login button
    Then login should fail and an error message contains An internal error has occurred and has been logged.
    