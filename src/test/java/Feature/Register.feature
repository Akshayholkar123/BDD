Feature:Register
@Smoke  @Regression
Scenario:User should be able to register using valid credentials

Given Browser is open 
And url is navigated to register page 
When user enters valid credentials
| M | Test | ManualTest | qs_manualTest108@gmail.com | Password@123 | 
And clicks on register button
Then a new account should be created
And browser must be closed