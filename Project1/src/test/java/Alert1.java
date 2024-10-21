import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Alert1 {
    WebDriver driver;

    @Test
    public void Alertfunction() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://omayo.blogspot.com/");
       driver.findElement(By.id("alert1")).click();
     Alert alert= driver.switchTo().alert();
        String disp = alert.getText();
        System.out.println(disp);
        alert.accept();
    }


    @AfterMethod
    public void closure()
    {
        driver.quit();
    }
}
