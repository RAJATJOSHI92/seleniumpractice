import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.sql.DriverManager;

public class parrameters {
    WebDriver driver;

    @Test()
    @Parameters({"browser", "url"})
    public void init(String browser, String url) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.get(url);
        } else {
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
            driver.get(url);
        }
    }
}
