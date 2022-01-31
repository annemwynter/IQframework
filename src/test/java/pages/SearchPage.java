package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class SearchPage extends CommonMethods {

    @FindBy (xpath = "//input[@class='gLFyf gsfi']")
   public WebElement searchBox;

    @FindBy (name = "btnK")
    public WebElement searchButton;

    @FindBy (xpath = "//div[@role='heading']//*[text()='New Jersey']//following::a[text()='Trenton'][1]")
    public WebElement searchResult;



    public SearchPage(){
        PageFactory.initElements(driver, this);
    }

}
