package com.stepDefinitions;

import com.factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.pages.ProductPage;


public class CartVerificationStepdef  {

    private ProductPage productPage = new ProductPage(DriverFactory.getDriver());

    @Given("I launch Amazon.com successfully")
    public void i_launch_amazon_com_successfully() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        productPage.checkHomeLogoExist();

    }
    @Given("Amazon Home page is displayed")
    public void amazon_home_page_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
    }
    @When("In searchbox enter {string}")
    public void in_searchbox_enter(String string) {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("List of monitors are displayed")
    public void list_of_monitors_are_displayed() {
        // Write code here that turns the phrase above into concrete actions
    }
    @When("Add item to cart {string}")
    public void addItemToCart(String arg0) {
    }

    @Then("Item is added to cart")
    public void item_is_added_to_cart() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Given("Open cart from top left")
    public void open_cart_from_top_left() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Given("Cart should open")
    public void cart_should_open() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("Check price is same as product page")
    public void check_price_is_same_as_product_page() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("Verify that subtotal is same as Product page price")
    public void verify_that_subtotal_is_same_as_product_page_price() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("Check price is same as product page for each item")
    public void check_price_is_same_as_product_page_for_each_item() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("Verify that subtotal is same as Product page price of both the products")
    public void verify_that_subtotal_is_same_as_product_page_price_of_both_the_products() {
        // Write code here that turns the phrase above into concrete actions

    }
}