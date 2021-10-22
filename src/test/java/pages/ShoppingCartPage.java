package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.WeakHashMap;

public class ShoppingCartPage {

    public ShoppingCartPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "checkOutButton")
    public WebElement checkOutButton;








}
