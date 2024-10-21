package qa.testlayer;

import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.pagelayer.Landingpage;
import qa.pagelayer.loginpage;
import qa.testbase.TestBase;
import qa.util.TestUtil;

import java.io.IOException;

public class LandingTest extends TestBase {

    Landingpage page;
    loginpage login;
    public LandingTest()
    {
        super();
    }

    @BeforeMethod
    public void setup()
    {


        initialize();
        page=new Landingpage();

    }

    @Test(priority = 1)
    public void verifypagetitle() throws IOException
    {
       String title =page.Pagetite();

           Assert.assertEquals(title, "#1 Free CRM Software Power Up your Entire Business Free Forever");
           test = extent.createTest("test successfully passed");
           test.log(Status.PASS, "page verify passed");

         test.log(Status.FAIL, "page verify failed");
           TestUtil.Screenshot();

    }
    @Test(priority = 2 ,enabled = false)
    public void verifyimg()
    {
     Boolean flag  = page.Pageimg();
     Assert.assertTrue(flag);
        test =extent.createTest("test successfully passed");
        test.log(Status.PASS,"img verify passed");
    }

    @Test(priority = 3,enabled = false)
    public void click()
    {
      login= page.click();
        test =extent.createTest("test successfully passed");
        test.log(Status.PASS,"click verify passed");
    }

@AfterMethod
    public void closure()
{
    driver.quit();
    extent.flush();
}

}
