package qa.testlayer;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.pagelayer.Homepage;
import qa.pagelayer.Landingpage;
import qa.pagelayer.loginpage;
import qa.testbase.TestBase;

public class logintest extends TestBase {

    loginpage page1;
    Landingpage page;
    Homepage homepage;

    public logintest()
    {

        super();
    }
    @BeforeMethod
    public void init()
    {
        initialize();
        page1=new loginpage();
       page=new Landingpage();


    }
    @Test(priority = 1, enabled = false)
    public void verifytitle()
    {
         String title = page1.logintitle();
        Assert.assertEquals(title,"Cogmento CRM");
    }
    @Test(priority = 2)
    public void verifylogin()
    {
        page1 =page.click();
       homepage= page1.dologin(prop.getProperty("username"), prop.getProperty("passward"));
    }
}
