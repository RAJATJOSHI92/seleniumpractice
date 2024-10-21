import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestNg2
{
    WebDriver driver;

    @BeforeMethod
    public void test1()
    {
        System.out.println("I am opening the chrome driver ");
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.google.com/");
    }

    @Test(priority = 1)
    public void test2()
    {
        System.out.println("My first test");

    }
    @AfterMethod
    public void closure() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();

    }
}
