package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LogitechPage {
    public LogitechPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@title='BLACK']")    //(//span)[20] you can also use this one to locate black box
    public WebElement blackButton;

    @FindBy(xpath = "//span[@title='YELLOW']")
    public WebElement yellowButton;

    @FindBy(name = "quantity")
    public WebElement quantity;

    @FindBy(name = "save_to_cart")
    public WebElement addToCart;

    @FindBy(xpath = "//div[@class='plus']")
    public WebElement quantityPlusButton;

    @FindBy(id = "shoppingCartLink")
    public  WebElement shoopingCartIcon;








}
