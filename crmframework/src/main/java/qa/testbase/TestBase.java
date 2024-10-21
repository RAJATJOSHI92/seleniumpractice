package qa.testbase;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import qa.util.TestUtil;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static  Properties prop;

    public  ExtentSparkReporter spark;
    public ExtentTest test;
    public  ExtentReports extent;
    public TestBase() {
        try {
            prop = new Properties();
            extent=new ExtentReports();
            spark=new ExtentSparkReporter("/Users/macbookpro/Desktop/crmframework/src/main/java/qa/report/Report/report"+ Random.class +".html");
            spark.config().setDocumentTitle("Automation Report");
            spark.config().setTheme(Theme.DARK);
            extent.setSystemInfo("operating system","chrome");
            extent.setSystemInfo("tester","rajat");
            extent.attachReporter(spark);
            FileInputStream file = new FileInputStream("/Users/macbookpro/Desktop/crmframework/src/main/java/qa/config/config.properties");
            prop.load(file);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static void initialize() {
        if (prop.getProperty("browser").equals("chrome")) {
            WebDriverManager.chromedriver().clearDriverCache().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wait, TimeUnit.SECONDS);
            driver.get(prop.getProperty("url"));

        } else {
            if (prop.getProperty("browser").equals("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();

            }

        }


    }
}
