package qa.util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static qa.testbase.TestBase.driver;

public class TestUtil {

    public static long implicit_wait=20;

    public static  void Screenshot() throws IOException {
       File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
           //  String destination=System.getProperty("usr.dir");
        FileUtils.copyFile(src,new File("/Users/macbookpro/Desktop/crmframework/src/main/screenshot"+System.currentTimeMillis()+".png"));
    }
}
