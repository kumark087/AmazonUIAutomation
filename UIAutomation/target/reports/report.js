$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/features/checkout.feature");
formatter.feature({
  "line": 1,
  "name": "As a user",
  "description": "       I should be able to add and delete an item and checkout",
  "id": "as-a-user",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Adding and deleting items in basket and checkout",
  "description": "",
  "id": "as-a-user;adding-and-deleting-items-in-basket-and-checkout",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@checkout"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on the amazon home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I sign in with valid credentials",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I search for product",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I add the product into the basket",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I remove added product from the basket",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I add another product into the basket",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should be able to proceed to the checkout",
  "keyword": "Then "
});
formatter.match({
  "location": "AmCheckout.i_am_on_the_amazon_home_page()"
});
formatter.result({
  "duration": 12098632902,
  "status": "passed"
});
formatter.match({
  "location": "AmCheckout.i_sign_in_with_valid_credentials()"
});
formatter.result({
  "duration": 5987527669,
  "status": "passed"
});
formatter.match({
  "location": "AmCheckout.i_search_for_product()"
});
formatter.result({
  "duration": 14254315168,
  "status": "passed"
});
formatter.match({
  "location": "AmCheckout.i_add_the_product_into_the_basket()"
});
formatter.result({
  "duration": 1950894607,
  "status": "passed"
});
formatter.match({
  "location": "AmCheckout.i_remove_added_product_from_the_basket()"
});
formatter.result({
  "duration": 2127480144,
  "status": "passed"
});
formatter.match({
  "location": "AmCheckout.i_add_another_product_into_the_basket()"
});
formatter.result({
  "duration": 12632430904,
  "status": "passed"
});
formatter.match({
  "location": "AmCheckout.i_should_be_able_to_proceed_to_the_checkout()"
});
formatter.result({
  "duration": 3219046302,
  "status": "passed"
});
});