package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HeadphonesPage {

    public HeadphonesPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "14")
    public WebElement logitechUsbHeadsetImg;

}
