package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.RegisterPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.nio.file.WatchEvent;

public class CreateAccountStepDefs {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    Faker faker = new Faker();



    @Given("user goes to the url")
    public void user_goes_to_the_url() {

        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    }

    @Given("user clicks on the login icon")
    public void user_clicks_on_the_login_icon() throws InterruptedException {
        homePage.loginIcon.click();
        Thread.sleep(3000);//*************************BURAYI SOR DAHA UYGUN REUSABLE KULLAN*******************************
    }

    @Given("user click on CreateNewAccount button")
    public void user_click_on_create_new_account_button() throws InterruptedException {
        homePage.createNewAccountButton.click();
        Thread.sleep(3000);
    }


    @Given("user enters Username")
    public void user_enters_username() throws InterruptedException {
        registerPage.userName.sendKeys(faker.name().firstName());
        Thread.sleep(3000);

    }

    @Given("user enters Email")
    public void user_enters_email() throws InterruptedException {
        registerPage.email.sendKeys(faker.internet().emailAddress());
        Thread.sleep(3000);

    }


    @Given("user enters Password")
    public void user_enters_password() throws InterruptedException {
        registerPage.password.sendKeys("Abc.1");
        Thread.sleep(3000);

    }


    @Given("user confirms Confirm Password")
    public void user_confirms_confirm_password() throws InterruptedException {
        registerPage.confirmPassword.sendKeys("Abc.1");
        Thread.sleep(3000);


    }
    @Given("user enters Country")
    public void user_enters_country() throws InterruptedException {
        //there is dropdown here!! we use select object from Select() class

        Select select = new Select(registerPage.country_dropdown);
        Thread.sleep(3000);
        select.selectByVisibleText("Germany");
        Thread.sleep(3000);
    }

    @Given("user enters City")
    public void user_enters_city() {
        registerPage.city.sendKeys("Berlin");
    }


    @Given("user clicks agreement checkbox")
    public void user_clicks_agreement_checkbox() {
        registerPage.agreement.click();

    }


    @Given("user clicks Register button")
    public void user_clicks_register_button() {
        registerPage.registerButton.click();


    }





}
