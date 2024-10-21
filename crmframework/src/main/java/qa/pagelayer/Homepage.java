package qa.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import qa.testbase.TestBase;

public class Homepage extends TestBase {

    @FindBy(xpath = "//i[@class='tasks icon']")
    WebElement icon;

    @FindBy(xpath = "//a[@href=\"/contacts\"]")
    WebElement contactclick;

    public Homepage()
    {
        PageFactory.initElements(driver,this);
    }
    public String gettitle()
    {
         return driver.getTitle();
    }

    public ContactPage contacticon() throws InterruptedException {
        Actions action=new Actions(driver);
      action.moveToElement(icon).build().perform();
       contactclick.click();
        return new ContactPage();


    }

}
