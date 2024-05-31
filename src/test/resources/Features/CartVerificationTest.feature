Feature: Cart Verification

  Scenario: Adding a "monitor" item in cart and verify subtotal:
    Given I launch Amazon.com successfully
    And Amazon Home page is displayed
    When In searchbox enter "monitor"
    Then List of monitors are displayed
    When Add item to cart "1"
    Then Item is added to cart
    Given Open cart from top left
    And Cart should open
    Then Check price is same as product page
    And Verify that subtotal is same as Product page price

  Scenario: Adding a "Laptop" item in cart and verify subtotal:
    Given I launch Amazon.com successfully
    And Amazon Home page is displayed
    When In searchbox enter "laptop"
    Then List of monitors are displayed
    When Add item to cart "2"
    Then Item is added to cart
    Given Open cart from top left
    And Cart should open
    Then Check price is same as product page
    And Verify that subtotal is same as Product page price

  Scenario: Adding two items in cart and verify subtotal:
    Given I launch Amazon.com successfully
    And Amazon Home page is displayed
    When In searchbox enter "Headphones"
    Then List of monitors are displayed
    When Add item to cart "1"
    Then Item is added to cart
    When In searchbox enter "Keyboard"
    Then List of monitors are displayed
    When Add item to cart "1"
    Then Item is added to cart
    Given Open cart from top left
    And Cart should open
    Then Check price is same as product page for each item
    And Verify that subtotal is same as Product page price of both the products
