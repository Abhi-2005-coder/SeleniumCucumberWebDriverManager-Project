package stepDefinition;

import io.cucumber.java.en.Then;

public class LoggedInPage {

    @Then("User should be able to view the product category page")
    public void user_should_be_able_to_view_the_product_category_page() throws InterruptedException {
        pages.LoggedInPage.visibility_productcategory_formalshoes();
        pages.LoggedInPage.visibility_productcategory_sportsshoes();
        pages.LoggedInPage.visibility_productcategory_sneakershoes();
    }
}
