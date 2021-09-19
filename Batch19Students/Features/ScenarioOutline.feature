Feature: Users can login the application with valid credential and verify the page title

Description: User can login only valid only valid credential, 
user can not login without valid credential, and invalid password


Scenario Outline: Users can login with the valid credential and can not
                  login without valid credential

Given User can open any browser
And Users can enter the URL <url>
When Users click on the Sign in button
And Users can enter the username <userName> and password <pwd>
And Users can click the Sign In button
Then Users can verify the page title

Examples:

|userName|pwd|url|
|alammohammed79@gmail.com|SAYEDawan2008@|https://www.zoopla.co.uk/|
|alammohammed79@invalidgmail.com|SAYEDawan2008@|https://www.zoopla.co.uk/|
|alammohammed79@gmail.com|InvalidpwdSAYEDawan2008@|https://www.zoopla.co.uk/|


