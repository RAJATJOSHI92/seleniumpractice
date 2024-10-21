import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestNg
{
    WebDriver driver;

    @BeforeMethod(enabled = false)
    public void test1()
    {
        System.out.println("I am opening the chrome driver ");
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

    }

    @Test(priority = 1,invocationCount = 3)
    public void test2()
    {
        System.out.println("My first test");

    }
    @AfterMethod()
    public void closure() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();

    }
}
