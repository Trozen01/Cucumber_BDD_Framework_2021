@All
Feature: Ubar booking feature

@EndToEnd
Scenario: Booking cab EndToEnd
Given User wants use book "Sidan" car for journey from uber
When  User select "Sidan" car and pick up point is "Mumbai" and drop location is "Pune"
Then Driver start the journey
Then Driver reach the "Pune"
Then User pay 3000 Rupess  


@SmokeTest @RegressionTest  @US300
Scenario: Booking cab SmokeTest
Given User wants use book "Sidan" car for journey from uber
When  User select "Sidan" car and pick up point is "Mumbai" and drop location is "Kokan"
Then Driver start the journey
Then Driver reach the "Kokan"
Then User pay 4000 Rupess  


@RegressionTest
Scenario: Booking cab RegressionTest
Given User wants use book "Sidan" car for journey from uber
When  User select "Sidan" car and pick up point is "Mumbai" and drop location is "Malad"
Then Driver start the journey
Then Driver reach the "Malad"
Then User pay 5000 Rupess   
