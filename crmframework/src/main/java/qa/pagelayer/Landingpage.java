package qa.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import qa.testbase.TestBase;

public class Landingpage extends TestBase {
    @FindBy(xpath = "//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")
    WebElement login;

    @FindBy(xpath = "//font[normalize-space()='crm']")
    WebElement crmimg;



    public Landingpage()
    {
        PageFactory.initElements(driver,this);
    }


    //actions
     public String Pagetite()
     {
        return driver.getTitle();
     }

     public Boolean Pageimg()
     {
            return crmimg.isDisplayed();
     }

     public loginpage click()
    {
        login.click();
        return new loginpage();
    }
}
