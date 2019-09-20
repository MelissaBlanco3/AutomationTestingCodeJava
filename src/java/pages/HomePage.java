package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    //locators
   // @FindBy(input[name="q"])
    //WebElement searchField;

    By searchField = By.cssSelector("input[name=\"q\"]"); //CONSOLE/DEV TOOLS CHROME $$("input[name=q]") in chrome for css,, for xpath: $x("//input[@name='q']") or $x("//*[@name='q']")
   // get username() { return $('#username'); }

    public HomePage(WebDriver driver, int waitTimeout, int pollingCadence) {
        super(driver, waitTimeout, pollingCadence);
    }

//actions
    public ResultsPage search (String text) throws Exception {
        insertText(searchField,text);
        enter(searchField);
        return new ResultsPage(driver,10,10);
    }



}


