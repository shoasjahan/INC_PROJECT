Feature: Example - user story 


@Sprint92
Scenario: Verify user login in profile

Given Launch dell "<URL>"
Then click sign and click signin button
Then Enter User and password and click login
Then Verify user login in profile


@Sprint92
Scenario: Verify search result
Given Launch dell "<URL>"
Then Enter XPS in search field
Then click search 
Then Verify search results






