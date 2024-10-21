package org.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class Basetest {
   public WebDriver driver;
   public WebDriverWait wait;
    public Page page;

   @BeforeMethod
    public void init()
   {
       WebDriverManager.chromedriver();
       driver=new ChromeDriver();
       wait=new WebDriverWait(driver, Duration.ofSeconds(15));
       driver.manage().window().maximize();
       driver.get("");
       page=new Page(driver,wait);

   }

   @AfterMethod
    public void closure(){

       driver.quit();
    }
}
