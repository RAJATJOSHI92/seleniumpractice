package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage extends Basepage{

    public Loginpage(WebDriver driver, WebDriverWait wait)
    {
        super(driver, wait);
    }

    By emailid=By.id("");
    By passward=By.id("");
    By loginbutton=By.id("");

    public String getloginpageTitle()
    {
          return driver.getTitle();
    }

    public void dologin(String username,String passward)
    {
          dosendkeys(emailid,username);
          dosendkeys(this.passward,passward);
          doclick(loginbutton);
    }
}
