Feature: Users can login the application, search the property, and verify the price.

#Optional
Description: Zoopla website any users can login, select, buy and sell the property

Scenario: User can login to zoopla application and verify the page title

Given User can open any browser
And Users can enter the URL "https://www.zoopla.co.uk/"
When Users click on the Sign in button
And Users can enter the username "alammohammed79@gmail.com" and password "SAYEDawan2008@"
And Users can click the Sign In button
Then Users can verify the page title



