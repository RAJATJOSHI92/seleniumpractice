package qa.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import qa.testbase.TestBase;


public class loginpage  extends TestBase {

    @FindBy(xpath="//input[@name=\"email\"]")
    WebElement email;

    @FindBy(xpath="//input[@name=\"password\"]")
    WebElement passward;

    @FindBy(xpath = "//div[text()=\"Login\"]")
    WebElement button;


    public loginpage()
    {
        PageFactory.initElements(driver,this);
    }

  public String logintitle()
  {
        return driver.getTitle();
  }

  public Homepage dologin(String ur,String pss)
  {
      email.sendKeys(ur);
      passward.sendKeys(pss);
      button.click();
      return new Homepage();
  }

}
