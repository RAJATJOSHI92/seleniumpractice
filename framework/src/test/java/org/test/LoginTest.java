package org.test;

import org.example.Loginpage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest  extends Basetest{
    @Test
    public void verifyloginpage()
    {
       String title= page.getinstance(Loginpage.class).getloginpageTitle();
        System.out.println("title is"+title);
        Assert.assertEquals(title,"");
    }

    @Test
    public void loginTest()
    {
        page.getinstance(Loginpage.class).dologin("","");

    }


}
