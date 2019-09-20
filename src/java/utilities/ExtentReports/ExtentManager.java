package utilities.ExtentReports;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {

    private static ExtentReports report;

    public synchronized static ExtentReports getReporter() {
        if (report == null) {
            //Set HTML reporting file location
            report = new ExtentReports(System.getProperty("user.dir")+"\\src\\java\\utilities\\ExtentReports\\TestReports\\ExtentReportResults.html");
    }
        return report;
    }

}
