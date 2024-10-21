package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basepage extends Page {

    public Basepage(WebDriver driver, WebDriverWait wait)
    {
        super(driver, wait);
    }

    public void doclick(By locator)
    {
        driver.findElement(locator).click();
    }
    public void dosendkeys(By locator,String text)
    {
        driver.findElement(locator).sendKeys(text);
    }
    public String ddogettext(By locator)
    {
          return driver.findElement(locator).getText();
    }
}
