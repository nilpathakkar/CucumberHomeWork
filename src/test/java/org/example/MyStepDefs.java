package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {

    HomePage homePage=new HomePage();
    RegisterPage registerPage=new RegisterPage();
    RegisterSuccess registerSuccess=new RegisterSuccess();

    @Given("User on registration page")
    public void user_on_registration_page() {
        // Write code here that turns the phrase above into concrete actions
        homePage.clickOnRegisterButton();
    }
    @When("User enter needed registration details")
    public void user_enter_needed_registration_details() {
        // Write code here that turns the phrase above into concrete actions
        registerPage.userShouldEnterDetailsOnRegisterPageSuccessfully();
    }
    @When("User click on register submit button")
    public void user_click_on_register_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        registerPage.clickOnRegister();
    }
    @Then("User should able to registered successfully")
    public void user_should_able_to_registered_successfully() {
        // Write code here that turns the phrase above into concrete actions
        registerSuccess.verifyThatUserRegisteredSuccessfully();
    }
    @Given("user is on home page")
    public void user_is_on_home_page() {
        // Write code here that turns the phrase above into concrete actions
        Utils.verifyCurrentUrl("https://demo.nopcommerce.com/");
    }
    @When("user click on {string} link from top menu header")
    public void user_click_on_link_from_top_menu_header(String category_name) {
        // Write code here that turns the phrase above into concrete actions
        homePage.clickOnCategoryName(category_name);

    }
    @Then("user should able tonavigated successfully to related {string} category page successfully")
    public void user_should_able_tonavigated_successfully_to_related_category_page_successfully(String category_url) {
        // Write code here that turns the phrase above into concrete actions
        Utils.verifyCurrentUrl(category_url);
    }
}
