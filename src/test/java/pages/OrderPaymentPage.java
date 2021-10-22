package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.WeakHashMap;

public class OrderPaymentPage {
    public OrderPaymentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "next_btn")
    public WebElement nextButton;

    @FindBy(xpath = "//input[@type='radio']")
    public WebElement safePayRadioButton;

    @FindBy(xpath = "(//input[@type='radio'])[2]")
    public WebElement masterCreditRadioButton;

    @FindBy(xpath = "//input[@name='safepay_username']")
    public WebElement safePayUserNameBox;

    @FindBy(xpath = "//input[@name='safepay_password']")
    public WebElement safePayPasswordBox;

    @FindBy(xpath = "//input[@name='save_safepay']")
    public WebElement saveCheckBox;

    @FindBy(id = "pay_now_btn_SAFEPAY")
    public WebElement payNowButton;

    @FindBy(xpath = "(//a[@class='floater ng-binding'])[2]")
    public WebElement richtigePrice;

    @FindBy(xpath = "(//a[@class='floater ng-binding'])[4]")
    public WebElement gesamtePrice;
}
