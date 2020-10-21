package PageObjects;

import Base.Baseutil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleHome extends Baseutil {

    // We use to initialise elements on google search page
    public GoogleHome(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


}
