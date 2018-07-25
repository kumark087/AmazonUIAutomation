package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibraries.HomePage;


public class AmCheckout extends HomePage {


    @Given("^I am on the amazon home page$")
    public void i_am_on_the_amazon_home_page() throws Exception {

        navigateToHomePage();
    }

    @When("^I sign in with valid credentials$")
    public void i_sign_in_with_valid_credentials() throws Exception {

        userLogin();

    }

    @When("^I search for product$")
    public void i_search_for_product() {
        searchProduct();
    }


    @When("^I add the product into the basket$")
    public void i_add_the_product_into_the_basket() {
        addToBasket();
    }


    @When("^I remove added product from the basket$")
    public void i_remove_added_product_from_the_basket() {
        removeProduct();
    }


    @When("^I add another product into the basket$")
    public void i_add_another_product_into_the_basket() {
        addOtherProduct();
    }

    @Then("^I should be able to proceed to the checkout$")
    public void i_should_be_able_to_proceed_to_the_checkout() {
        proceedToCheckout();
        checkoutPageVerification();
    }
}
