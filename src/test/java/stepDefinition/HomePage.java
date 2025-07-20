package stepDefinition;

import static pages.HomePage.*;

import io.cucumber.java.en.Given;

public class HomePage {
    @Given("^User navigates to the Login page$")
    public void user_navigates_to_the_Login_page() throws InterruptedException {
        click_hamburger_menu();
        click_signIn_link();
    }
}

//package stepDefinition;
//
//
//import io.cucumber.java.en.Given;
//import io.qameta.allure.Allure;
//
//import static pages.HomePage.*;
//
//public class HomePage {
//
//    @Given("User navigates to the Login page")
//    public void user_navigates_to_the_login_page() throws InterruptedException {
//        Allure.feature("Given");
//        Allure.addAttachment("HTML Snapshot","text/html", driver.getPageSource(), "html");
//        click_hamburger_menu();
//        click_signIn_link();
//
//    }
//
//    @Given("User navigates to the Online products page")
//    public void user_navigates_to_the_Online_product_page() throws InterruptedException {
//        Allure.getLifecycle().getCurrentTestCase();
//        click_hamburger_menu();
//        click_OnlineProducts_link();
//
//    }
//
//}



















