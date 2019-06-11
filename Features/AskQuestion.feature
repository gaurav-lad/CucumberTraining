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
	Then I should get some message in AskQuestions