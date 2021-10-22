package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CategoryPage {
    public CategoryPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "headphonesImg")
    public WebElement headphonesImage;


}
