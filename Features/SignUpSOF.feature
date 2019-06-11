Feature: SignUp StackOverFlow application 
	Feature allows to signup stackoverflow application so that user can ask questions

Background: Initiate Session
	Given I am on StackOverFlow page 
	#Simple Cucumber execution
#Scenario Tagged as SmokeTest
@SmokeTest@Regression
Scenario: To provide Display name, email and password 
	Will provide valid input details in this scenarios
	#Given I am on StackOverFlow page 
	When I navigate to SignUp 
	And I provide signUp 
	Then I should get some message 
	
	#Passing value through Feature file as step inputs
#Scenario Tagged as Regression

@Regression
Scenario: To provide Display name, email and password 
	Will provide valid input details in this scenarios
	And I am in Regression
	When I navigate to SignUp 
	And I provide signUp details as "GauravLad" and "gaurav@email.com" and "Gaurav@123" 
	Then I should get some message 
	
	#DataDriven using Examples
#Scenario Tagged as End-to-end
@End-to-end
Scenario Outline: To provide Display name, email and password 
	Will provide valid input details in this scenarios
	Given I am on StackOverFlow page 
	When I navigate to SignUp 
	And I provide signUp details as "<DisplayName>" and "<email>" and "<password>" 
	Then I should get some message 
	Examples: 
		|DisplayName | email			| password  |
		|Gaurav		 | gaurav@email.com | Gaurav@123|
		|Lad		 | lad@email.com	| Lad@123	|
		