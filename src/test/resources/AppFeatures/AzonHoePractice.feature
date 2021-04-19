Feature: Amazon Home Page
  In order to test Many Scenario 
  
  Scenario: Home page Top panel Selection
   Given user is on amazon page
   Then user get amazon search 
   And username is displayed next to search field
   And amazon logo is also dispalyed
   And Card link is also dispalyed
   
   Scenario: Amazon Todays Deal section 
    Given user is on amazon page
    When user scrolls down to todays deal section
    Then user get the list of multipal product
    And user get product name and price details
    And user get more information for product after click on productlink 
    
    Scenario: Amazon Footer links section
    Given user is on amazon home page
    When user is scroll down to footer of the page 
    Then user get all country list 
    | Australia | 
    |   Brazil  |
    |   China   |
    And user gets all amazon service links 
    |Amazon Business|
    |Amazon Web Services|
    And user gets all privacy policy links
    
 


