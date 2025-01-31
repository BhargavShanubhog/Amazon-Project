
Feature: Home Page

Background: Common Steps
Given open url
When Verify page title
Then Create wish list

  
  Scenario: Amazon Pay
    Given click on Amazon pay 


  Scenario: New Releases
    Given click on New Releases 

  Scenario: Search new item and verify some details
  Given search a new item
  When verify price of a product
  When verify ratings of a product
  When verify default location
  When verify Add To Cart button
  Then verify Technical details