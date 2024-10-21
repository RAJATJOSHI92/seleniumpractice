package qa.testlayer;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.pagelayer.ContactPage;
import qa.pagelayer.Homepage;
import qa.pagelayer.Landingpage;
import qa.pagelayer.loginpage;
import qa.testbase.TestBase;

public class Contacttest extends TestBase {
    Homepage home;
    Landingpage landing;
    loginpage login;
    ContactPage contact;
   public Contacttest()
   {
       super();
   }
@BeforeMethod
   public void init() throws InterruptedException {
       initialize();
       home=new Homepage();
       landing=new Landingpage();
       login=new loginpage();
       contact=new ContactPage();
       login=landing.click();
       home = login.dologin(prop.getProperty("username"), prop.getProperty("passward"));
       contact = home.contacticon();
   }
   @Test
    public void createcontact() throws InterruptedException {
      home= contact.createcontacts("rrrajat","jggoshi");
   }
}
