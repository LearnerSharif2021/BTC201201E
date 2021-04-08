Feature: validate login credantial

Background:
Given open blank browser
And nevigate to url
Scenario: as a user using valid credantial should be login

@smoke
When user type userid in userText box
And user type password in passText box
And user click on login button
Then user should see his profile page

Scenario Outline: as a user using valid credantial should not be login

@reg
When user type <"userid"> in userText box
And user type <"password">password in passText box
And user click on login button
Then user should not see his profile page

Examples:
|userid|password|
|user1|s345|
|user2|s657|