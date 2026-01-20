Feature: Create an account in Salesforce Application
Scenario: Create a valid account from App Launcher
Given Launch the browser and load the URL of Salesforce
When Enter the username in login page
When Enter the password in login page
When check the Remember me checkbox
When click on login button in Salesforce
And click on toggle menu button from the left corner
And click on view All
And Search for Sales and press ENTER
And click on Sales
And click on Accounts tab
And stay on Accounts page
And click on New button
And enter the account name
And select the ownership as public
And click on Save
Then verify the toast message that Account is created
