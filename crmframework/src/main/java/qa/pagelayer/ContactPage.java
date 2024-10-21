package qa.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import qa.testbase.TestBase;

public class ContactPage  extends TestBase {

    @FindBy(xpath = "//button[normalize-space()='Create']")
    WebElement create;
@FindBy(xpath = "//input[@name='first_name']")
    WebElement firstname;

    @FindBy(xpath = "//input[@name='last_name']")
    WebElement lastname;

    @FindBy(xpath = "//button[@class='ui linkedin button']")
    WebElement  button;

    public ContactPage()
    {
        PageFactory.initElements(driver,this);

    }

     public Homepage createcontacts(String fn,String ln)
     {
         create.click();
         firstname.sendKeys(fn);
         lastname.sendKeys(ln);
         button.click();
         return new Homepage();
     }
}
