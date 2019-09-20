package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.NoSuchElementException;

public class BasePage {

    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static Wait fluentWait;


    public BasePage(WebDriver newDriver, int waitTimeout, int pollingCadence) {

        driver = newDriver;
        wait = new WebDriverWait(driver, waitTimeout);
        fluentWait = new FluentWait<>(driver)
            .withTimeout(Duration.ofSeconds(waitTimeout))
            .pollingEvery(Duration.ofMillis(pollingCadence))
            .ignoring(NoSuchElementException.class);

    }

    protected boolean elementVisible(By elementBy) throws Exception{

        Boolean visible;
        try {
            WebElement element = driver.findElement(elementBy);
            wait.until(ExpectedConditions.visibilityOf(element));

            visible = true;
        }
        catch(Throwable throwable){
            System.out.println("Element not visible");
            visible = false;
        }

        return visible;
    }

    protected void insertText(By elementBy, String text){

        try {
            WebElement element = driver.findElement(elementBy);
            element.clear();
            element.sendKeys(text);
        }
        catch(Throwable throwable){
            System.out.println("Element" + elementBy + " not found");
        }
    }

    protected void enter(By elementBy) {
        try {
            WebElement element = driver.findElement(elementBy);
            element.sendKeys(Keys.ENTER);
        }
        catch(Throwable throwable){
            System.out.println("Element" + elementBy + " not found");
        }

    }


    protected void clearText(WebElement element) throws Exception{

        try {
            element.clear();
        }  catch(Throwable throwable){
            System.out.println("Element" + element + " not clickable");
        }
    }

    protected void click(By elementBy) throws Exception{

        try {
            WebElement element = driver.findElement(elementBy);
            wait.until(ExpectedConditions.elementToBeClickable(element)).click();
        }  catch(Throwable throwable){
            System.out.println("Element" + elementBy + " not clickable");
        }

    }
}
