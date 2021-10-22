package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegisterPage {

    public RegisterPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "usernameRegisterPage")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='emailRegisterPage']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='passwordRegisterPage']")
    public WebElement password;

    @FindBy(xpath = "//input[@name='confirm_passwordRegisterPage']")
    public WebElement confirmPassword;

    @FindBy(xpath ="//select[@name='countryListboxRegisterPage']")
    public WebElement country_dropdown;

    @FindBy(name = "cityRegisterPage")
    public WebElement city;

    @FindBy(name = "i_agree")
    public WebElement agreement;

    @FindBy(id="register_btnundefined")
    public WebElement registerButton;



}
