Feature: Leaftaps Login

Background:
Given Open the Chrome Browser
And Maximise the Browser
And Set the Implicit Timeouts
And Load the Leaftaps URL
@Smoke
Scenario Outline: TC001 Positive Login Flow
And Enter the Username as <username>
And Enter the Password as <password>
When Click on the Login Button
Then Verify Login Successful

Examples:
|username|password|
|DemoSalesManager|crmsfa|
|DemoCSR|crmsfa|
@Reg @Smoke
Scenario: TC002 Negetive Login Flow
And Enter the Username as Demosfa
And Enter the Password as crmsfa
When Click on the Login Button
But Verify the Error Message








