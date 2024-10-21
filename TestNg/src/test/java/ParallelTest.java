import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
    public class ParallelTest
    {
        WebDriver driver;
        @Test
        public void test1() throws InterruptedException {
            System.out.println("I am opening the chrome driver ");
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.get("https://www.facebook.com/");

        }

        @Test
        public void test2() throws InterruptedException {
            System.out.println("I am opening the chrome driver ");
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.get("https://www.google.com/");


        }
        @AfterMethod
        public void closure() throws InterruptedException {
            driver.close();
        }

    }

