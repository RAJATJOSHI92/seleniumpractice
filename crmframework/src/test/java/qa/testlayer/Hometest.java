package qa.testlayer;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.pagelayer.ContactPage;
import qa.pagelayer.Homepage;
import qa.pagelayer.Landingpage;
import qa.pagelayer.loginpage;
import qa.testbase.TestBase;

public class Hometest extends TestBase {
    Homepage home;
    Landingpage landing;
    loginpage login;
    ContactPage contact;

    public  Hometest()
    {
        super();
    }

    @BeforeMethod
    public void init()
    {
        initialize();
        home=new Homepage();
        landing=new Landingpage();
        login=new loginpage();
        login=landing.click();
        home = login.dologin(prop.getProperty("username"), prop.getProperty("passward"));

    }

    @Test(enabled = false)
    public void verifytitle()
    {
        String title= home.gettitle();
        Assert.assertEquals(title,"Cogmento CRM");
    }

    @Test
    public  void verifyiconcontact() throws InterruptedException {
        contact=home.contacticon();
    }
}
