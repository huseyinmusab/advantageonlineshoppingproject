package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "hrefUserIcon")
    public WebElement loginIcon;

    @FindBy(linkText = "CREATE NEW ACCOUNT")
    public WebElement createNewAccountButton;

    @FindBy(name ="username")
    public  WebElement login_user_name;

    @FindBy(name = "password")
    public WebElement login_password;

    @FindBy(id="sign_in_btnundefined")
    public WebElement login_sign_in_button;

    @FindBy(id = "headphonesImg")
    public WebElement headphonesImage;





}
