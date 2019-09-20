package utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {


  /*  public static enum Browser{
        CHROME, IE
    }
*/

    public static WebDriver getDriver(String url, String browser) throws Exception{

        WebDriver driver = null;

        switch(browser) {
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();

                break;

            default:
            throw new Exception("browser: "+ browser + " is not available");
        }

        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }
}
