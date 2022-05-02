package steps;

import base.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class StepDefinitions {
    String homePageActTitle;
    String homePageExpTitle = "nopCommerce demo store";
    String regPageActTitle;
    String regPageExpTitle = "nopCommerce demo store. Register";
    String ActResult;
    String ExpResult = "Your registration completed";
    String loginPageActTitle;
    String loginPageExpTitle = "nopCommerce demo store. Login";




    @Given("I navigated to url {string}")
    public void i_navigated_to_url(String url) {
BasePage.driverUtils.navigateToUrl(url);
    }

    @Then("I should be navigated to the homepage")
    public void i_should_be_navigated_to_the_homepage() {
        homePageActTitle= BasePage.driverUtils.getTitle();
        Assertions.assertEquals(homePageActTitle,homePageExpTitle);
    }

    @When("i click on the register link from nav bar")
    public void i_click_on_the_register_link_from_nav_bar() {
        BasePage.homePage.clickRegLink();
    }

    @When("I click on gender as male")
    public void i_click_on_gender_as_male() {
BasePage.regPage.maleRadioBtn.click();
    }

    @When("I enter firstName lastName email password confirmPassword")
    public void i_enter_first_name_last_name_email_password_confirm_password(io.cucumber.datatable.DataTable dataTable) {
BasePage.regPage.enterFirstName(dataTable.cell(1,0));
BasePage.regPage.enterLastName(dataTable.cell(1,1));
BasePage.regPage.enterEmailReg(dataTable.cell(1,2));
BasePage.regPage.enterPassword(dataTable.cell(1,3));
BasePage.regPage.enterConfirmPassword(dataTable.cell(1,4));
    }

    @When("I click on register button")
    public void i_click_on_register_button() {
BasePage.regPage.clickRegButton();
    }

    @Then("I should be registered successfully")
    public void i_should_be_registered_successfully()
    {
        ActResult= BasePage.regPage.getConfirmText();
        Assertions.assertEquals( ActResult,ExpResult);

    }


   /* @When("I enter my product {string} to search text box in the second navigation bar")
    public void i_enter_my_product_to_search_text_box_in_the_second_navigation_bar(String string) {
BasePage.homePage.enterSearchItem();
    }
    @When("I click on the search button")
    public void i_click_on_the_search_button() {
       BasePage.homePage.clickSearchButton();
    }
    @Then("I should be navigated to the product page")
    public void i_should_be_navigated_to_the_product_page() {

    }
    @When("I click add to cart button of the first laptop listed")
    public void i_click_add_to_cart_button_of_the_first_laptop_listed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the product is added successfully to the cart")
    public void the_product_is_added_successfully_to_the_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }*/



}

