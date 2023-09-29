
package api.utilities;
import java.time.LocalDate;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

 
public class extentreportmanager extends TestListenerAdapter  {
    public ExtentReports extent;
    public ExtentSparkReporter spark;
    public ExtentTest test;
    public void onStart (ITestContext testContext) {

    System.out.println("Test Started");
    LocalDate idt = LocalDate.now();
    System.out.println(idt);
    spark = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/"+idt+"   1092398273.html");
    extent = new ExtentReports();
    extent.attachReporter(spark);
    spark.config().setTheme(Theme.DARK);

    }

    public void onTestSuccess(ITestResult tr) {
    System.out.println("Test passed");
    test= extent.createTest(tr.getName());
    test.pass("The test is passed");

    }


    public void onTestFailure(ITestResult tr) {
    System.out.println("Test failed");
    test.warning("The test is about to fail");
    test= extent.createTest(tr.getName());
    test.fail("failed");
    String ssPath = System.getProperty("user.dir")+"/screenshots/"+tr.getName()+".png";
    test.fail("test failed "+test.addScreenCaptureFromPath(ssPath));


    }

    public void onSkipped(ITestResult tr) {
    System.out.println("Test skipped");
    test= extent.createTest(tr.getName());
    test.skip("skipped");

    }

    public void onFinish(ITestContext testContext) {
    extent.flush();
    }

}