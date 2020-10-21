package stepdefinitions;

import Base.Baseutil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;

import static utils.BrowserFactory.driver;

public class test extends Baseutil {

    private Baseutil base;

    public test(Baseutil Base) {
        this.base = Base;
    }

    @Given("i navigate to following homepage (.*)")
    public void iAmOnTheGoogleHomepage(String url) throws Exception {
        base.Driver.navigate().to("http://"+ url);
        Thread.sleep(60000);
    }

    @Then("I should see results relevant to my search")
    public void iShouldSeeResultsRelevantToMySearch() throws Exception {
        System.out.println("test");

    }

    @And("I enter the following (.*) into the search bar and click search")
    public void iEnterAndIEnterTheFollowingEntryIntoTheSearchBar() throws Exception {
        System.out.println("test");

    }
}



