Feature:Search

Scenario Outline:valiate when user enters text in text field then the search result must be displayed

Given Welcome page is dispalyed
When user enters "<Search text>" in search text field
Then Search result must be dispalyed 

Examples:
     | Search text |
     | Computer    | 
     | Books       |
     | 10          |