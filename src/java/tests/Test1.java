package tests;
import org.testng.Assert;
import pages.HomePage;

import org.testng.annotations.Test;
import pages.ResultsPage;
import utilities.ExtentReports.ExtentTestManager;

import java.lang.reflect.Method;

public class Test1 extends BaseTest {


/*
    @Test(priority = 1, description = "Searching words in google")
    public void googleSearch(Method method) throws Exception {

        ExtentTestManager.startTest(method.getName(), "Searching words in google");

        HomePage homePage = new HomePage(driver,5,5);
        ResultsPage resultPage = new ResultsPage(driver,5,5);

       resultPage = homePage.search("Naruto shippuden");

        Assert.assertTrue(resultPage.getLogo());
	

    }

    @Test(priority = 2, description = "Test intended to fail", groups={"beer"})
    public void passTest(Method method) throws Exception {

        ExtentTestManager.startTest(method.getName(), "Test intended to fail");

        HomePage homePage = new HomePage(driver,5,5);
        ResultsPage resultPage = new ResultsPage(driver,5,5);

        resultPage = homePage.search("picachu");

        //Assert.assertFalse(resultPage.getLogo());
        Assert.assertEquals("vegeta","vegeta");


    }
*/
    @Test(priority = 3, description = "Test intended to fail 2", groups={"beer"})
    public void failTest3(Method method) throws Exception {

        ExtentTestManager.startTest(method.getName(), "Test to fail 2");

        Assert.assertEquals("vegeta","picoro");

//fail status + screenshot
    }


}
