Feature:Books

Background:
Given browser is open to welcome page
When user is logged in
|qs_testuser123@gmail.com|password@123|
And user clicks on Book page 
And Books page is displayed 

Scenario:Validate user can sort the page alphabetically
And user chooses A-Z in sort by drop down
Then page should be sorted alphabetically

Scenario: validate user can add computing and Internet book to cart
And user clicks on add to cart button for Computting and Internet book
Then Book should be added to cart

Scenario: Valiadte user can Health book to cart
And user clicks on add to cart button for Health book
Then Book should be added to cart
