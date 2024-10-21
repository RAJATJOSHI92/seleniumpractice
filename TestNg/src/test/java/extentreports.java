import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class extentreports
{
public ExtentSparkReporter spark;
public ExtentReports extent;
public ExtentTest test;
WebDriver driver;
    @BeforeClass
    public void Beforeclass()
    {
     spark=new ExtentSparkReporter("./reporter/extent.html");
     spark.config().setTheme(Theme.DARK);
     spark.config().setDocumentTitle("extent report");
     extent=new ExtentReports();
     extent.setSystemInfo("operating system","chrome");
     extent.setSystemInfo("name","rajat");
     extent.attachReporter(spark);
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
    }

    @Test
    public void TestSuccess()
    {
        System.out.println("test success started");
          test=extent.createTest("test successfull started");
          test.log(Status.PASS,"test passed");

    }
    @Test
    public void TestFailure()
    {
        System.out.println("test failure started");
        test=extent.createTest("test failed ");
        test.log(Status.FAIL,"test failed");
        Assert.fail();
    }
    @Test
    public void TestSkipped()
    {
        System.out.println("test skipped started");
        test=extent.createTest("test skipped");
        test.log(Status.SKIP,"test failed");
        throw new SkipException("test case skipped ");
    }
    @AfterClass
    public void Afterclass()
    {
  driver.close();
  extent.flush();
    }
}
