package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.SearchPage;
import utils.CommonMethods;

public class SearchCapitalSteps extends CommonMethods {


    @Given("user is navigated to Google webpage")
    public void user_is_navigated_to_google_webpage() {
        openBrowser();
        navigateToGoogle();
    }

    @When("user enters search parameters in Search box")
    public void user_enters_search_parameters_in_search_box() {

        SearchPage searchPage=new SearchPage();
        searchPage.searchBox.sendKeys("Capital of New Jersey");

    }
    @When("clicks on Google Search Button")
    public void clicks_on_google_search_button() {

        SearchPage searchPage1=new SearchPage();
        searchPage1.searchButton.click();

    }

    @Then("results are displayed")
    public void results_are_displayed() {

        SearchPage searchPage2=new SearchPage();
        String actualResult= searchPage2.searchResult.getText();

        String expectedResult="Trenton";

       Assert.assertEquals("text did not matched so i came here",actualResult,expectedResult);





    }


}


