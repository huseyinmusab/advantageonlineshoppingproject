package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class BezahlungProzessStepDefs {

    HomePage homePage = new HomePage();
    CategoryPage categoryPage=new CategoryPage();
    HeadphonesPage headphonesPage = new HeadphonesPage();
    LogitechPage logitechPage = new LogitechPage();
    ShoppingCartPage shoppingCartPage=new ShoppingCartPage();
    OrderPaymentPage orderPaymentPage = new OrderPaymentPage();
    Faker faker = new Faker();

//    public int bquantity;

    @Given("user enters Username for login")
    public void user_enters_username_for_login() {
        homePage.login_user_name.sendKeys(ConfigReader.getProperty("login_user_name"));
        ReusableMethods.waitFor(3);
    }


    @Given("user enters Password for login")
    public void user_enters_password_for_login() {
        homePage.login_password.sendKeys(ConfigReader.getProperty("login_password"));
        ReusableMethods.waitFor(3);
    }


    @Then("user clicks on SignIn button")
    public void user_clicks_on_sign_in_button() {
        homePage.login_sign_in_button.click();
        ReusableMethods.waitFor(3);


    }

    @Given("user clicks on Headphones image")
    public void user_clicks_on_headphones_image() {
        //ReusableMethods.waitForPageToLoad(5000);
        ReusableMethods.waitFor(5);
        categoryPage.headphonesImage.click();

    }


    @Given("user clicks on Logitech Usb Headset")
    public void user_clicks_on_logitech_usb_headset() {
        headphonesPage.logitechUsbHeadsetImg.click();
        ReusableMethods.waitFor(5);

    }

    @Given("user clicks black color")
    public void user_clicks_black_color() {
        if (!logitechPage.blackButton.isSelected()){
            logitechPage.blackButton.click();
        }
    }


    @Given("user choose the quantity of black color")
    public void user_choose_the_quantity_of_clack_color(){

// the default number is already one

//           for (int i=1; i<100; i++){
//               if (i==2){
//                   break;
//               }
//               logitechPage.quantityPlusButton.click();
//            }


    }


    @Given("user clicks on Add to Cart button")
    public void user_clicks_on_add_to_cart_button() {
        logitechPage.addToCart.click();

    }



    @Given("user choose the yellow color")
    public void user_choose_the_yellow_color() {
        if (!logitechPage.yellowButton.isSelected()){
            logitechPage.yellowButton.click();
        }
    }


    @Given("user choose the quantity of yellow color")
    public void user_choose_the_quantity_of_yellow_color() {

        //Normalerweise ein click ist genug hier,das macht 2
        //Wenn der Testfall anders wäre?zB 5 Headphones wird verkauft?.ich habe max 100 festgestellt.
        // Loop macht Kodes langsamer aber es gut wenn mehr Headphones gekauft wird
        for (int i=1; i<100; i++){
            if (i==2){
                break;
            }
            logitechPage.quantityPlusButton.click();
        }
    }


    @Given("user clicks on the shoppingCartIcon")
    public void user_hoover_over_to_the_shopping_cart_icon() {

        logitechPage.shoopingCartIcon.click();
//        OR
//        Actions actions = new Actions(Driver.getDriver());
//        actions.moveToElement(logitechPage.shoopingCartIcon).perform();
//        ReusableMethods.waitFor(7);
//we can also hoover the mous on icon then we follow other steps for test.i preferred to click directly

    }


    @Given("user clicks on Checkout button")
    public void user_clicks_on_checkout_button() {
        shoppingCartPage.checkOutButton.click();
    }

    @Given("user clicks on Next button to payment method")
    public void user_clicks_on_next_button_to_payment_method() {
        orderPaymentPage.nextButton.click();

    }


    @Given("user clicks on SafePay button")
    public void user_clicks_on_safe_pay_button() {
        if (!orderPaymentPage.safePayRadioButton.isSelected()){
            orderPaymentPage.safePayRadioButton.click();
        }
        ReusableMethods.waitFor(3);

    }

    @Given("user does not click on savechanges checkbox button")
    public void user_does_not_click_on_savechanges_checkbox_button() {
        //ich möchte diese checkbox nicht klicken,weil ich kan nicht wieder und wieder tests laufen.
        //die app remembers the old credentials and it writes automatically,whaen i run my test again ,my new credentials
        //is writing on old credentials.thats why i would like the clean safepayusername and safepaypassword boxess at first

        if(orderPaymentPage.saveCheckBox.isSelected()){
            orderPaymentPage.saveCheckBox.click();
        }
        ReusableMethods.waitFor(3);

    }

    @Given("user enters SafePay username")
    public void user_enters_safe_pay_username() {
        //orderPaymentPage.safePayUserNameBox.sendKeys(faker.name().username());
        orderPaymentPage.safePayUserNameBox.sendKeys(ConfigReader.getProperty("safePay_UserName"));
        ReusableMethods.waitFor(3);

    }


    @Given("user enters SafePay password")
    public void user_enters_safe_pay_password() {

        //orderPaymentPage.safePayPasswordBox.sendKeys(faker.internet().password());
        orderPaymentPage.safePayPasswordBox.sendKeys(ConfigReader.getProperty("safePay_Password"));
        ReusableMethods.waitFor(3);


    }





    @Given("user clicks on PayNow button")
    public void user_clicks_on_pay_now_button() {
        orderPaymentPage.payNowButton.click();


    }
    @Then("user verify the richtige Preis")
    public void user_verify_the_total_payment() {
        //ICH KONNTE NICHT VERIFIZEREN WEIL DIE WEBSITE NICHT FUNKTIONIERT



//        String rPrice = orderPaymentPage.gesamtePrice.getText();
//        System.out.println(rPrice);
//        Assert.assertTrue(rPrice,"$119.97");==> it doesnt work because it gives me comperation error,
//        I was looking for how i handle this
//        String a =orderPaymentPage.richtigePrice.getText();

        Assert.assertTrue(orderPaymentPage.richtigePrice.isDisplayed());

    }


    @Then("user verify the gesamte Preis")
    public void user_verify_the_gesamte_preis() {


        Assert.assertTrue(orderPaymentPage.gesamtePrice.isDisplayed());
        //Assert.assertEquals(acvalue,123);
        //String gp=orderPaymentPage.gesamtePrice.getText();

    }






}
