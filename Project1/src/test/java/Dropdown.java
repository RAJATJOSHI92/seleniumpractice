import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class Dropdown {
    WebDriver driver;

    @Test
    public void Alertfunction() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://omayo.blogspot.com/");
        Thread.sleep(3000);
        WebElement select = driver.findElement(By.id("drop1"));
        Select select1=new Select(select);
        select1.selectByVisibleText("doc 2");
        //select1.selectByIndex(0);
    }
    @AfterMethod
    public void closure()
    {
        driver.quit();
    }

}

