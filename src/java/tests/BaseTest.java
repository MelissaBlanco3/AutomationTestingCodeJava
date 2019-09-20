package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import jdk.management.resource.internal.inst.ServerSocketChannelImplRMHooks;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utilities.DriverManager;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class BaseTest {

    public WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    @Parameters({"url","browser"})
    public void setup(String url, String browser) throws Exception {

       driver = DriverManager.getDriver(url,browser);
    }




    @AfterClass
    public void teardown() {

        try {
            driver.quit();
            driver.close();
        }
        catch(Exception e){
            System.out.println("it didn´t close the browser");
        }
    }
}

