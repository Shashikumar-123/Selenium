
Feature: logint
@negative

Scenario Outline: Facebook account should successfully logout

Given  login page
When  ender valid "<username>"
And  enter valid "<password>"
And click login button
Then account should successfully login

Examples:

|username|password|
|Shashikumar|12344|