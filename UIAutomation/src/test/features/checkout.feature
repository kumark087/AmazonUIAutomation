Feature: As a user
         I should be able to add and delete an item and checkout
@checkout
Scenario: Adding and deleting items in basket and checkout

Given I am on the amazon home page
And I sign in with valid credentials
And I search for product
When I add the product into the basket
And I remove added product from the basket
And I add another product into the basket
Then I should be able to proceed to the checkout
