Feature:ShoppersStackLogin

Scenario:validate shopper can login using valid credentials

Given browser is open URL is navigated
And login page is displayed
And shopper login is displayed
When user enters "qa_testmerchantdell@gmail.com" and "Password@123"
And clicks on login button 
Then Shopper should be successfully logged in
And browser should closed

Scenario:Validate Merchant can login using valid credentials

Given browser is open URL is navigated
And login page is displayed
And merchant login is displayed
When user enters "qa_merchantlogin@gmail.com" and "Password@123"
And clicks on login button 
Then Merchant should be successfully logged in
And browser should closed

Scenario:Validate admin can login using valid credentials

Given browser is open URL is navigated
And login page is displayed
And Admin login is displayed
When user enters "qa_testadmindell@gmail.com" and "Password@123"
And clicks on login button 
Then Admin must be successfully logged in
And browser should closed

