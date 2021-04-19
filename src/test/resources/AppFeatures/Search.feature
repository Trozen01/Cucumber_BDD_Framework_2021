Feature: Amazon search feature

  @Smoke
  Scenario: Search product
    Given I have search field in amazon page
    When I search for "Dell laptop" and price is 30000
    Then product with name "Dell laptop" should be displayed

  # we can have multipal scenario following is the example.
  Scenario: Add product
    Given I have search field in amazon page
    When I search for "Dell laptop" and price is 30000
    Then product with name "Dell laptop" should be displayed
#Scenario: Delete product
#Given I have search field in amazon page
#When I search for "Dell laptop" and price is 30000
#Then product with name "Dell laptop" should be displayed
