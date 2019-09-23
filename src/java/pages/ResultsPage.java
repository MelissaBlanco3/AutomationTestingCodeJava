package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultsPage extends BasePage{

    //By googleLogo = By.cssSelector("div.logo.doodle > a > img");
    By googleLogo = By.cssSelector("a#logo > img");
    public ResultsPage(WebDriver driver, int waitTimeout, int pollingCadence) {
        super(driver, waitTimeout, pollingCadence);
    }

    public Boolean getLogo() throws Exception {

         return elementVisible(googleLogo);

    }
}
