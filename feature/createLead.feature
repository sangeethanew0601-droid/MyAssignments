Feature: CreateLead functionality for LeafTaps Application
Scenario: createLead with single data
Background:
Given Launch the browser and load the URL

When Enter the username as 'democsr2'
When Enter the password as 'crmsfa'
And Click on login button
And click on CRMSFA link
And click on Leads link
And Click on Create Lead link
And Enter the companyName as 'Testleaf'
And Enter the firstName as 'Sangeetha'
And Enter the lastName as 'A'
And click on Create Lead button