import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Omeyo {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException
    {

        WebDriverManager.chromedriver().setup();
       // ChromeOptions co=new ChromeOptions();
       // co.addArguments("--remote-allow-origins=*");
        driver=new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("keyboard");
        driver.findElement(By.xpath("//div[@class='lJ9FBc']//input[@name='btnK']")).click();

        //get text
        /* String s =driver.findElement(By.className("titlewrapper")).getText();div[class='lJ9FBc'] input[name='btnK']
        System.out.println(s);



    //     link click
    driver.findElement(By.linkText("Home")).click();


//      window handle only

    driver.findElement(By.linkText("Blogs")).click();
        driver.findElement(By.linkText("Selenium143")).click();
      String w  =driver.getWindowHandle();
      Thread.sleep(2000);
   driver.switchTo().window(w).navigate().back();
       String w1  =driver.getWindowHandle();
        Thread.sleep(2000);
        driver.switchTo().window(w).navigate().forward();


//  multi select


     // WebElement w=driver.findElement(By.id("multiselect1"));
      Select s=new Select(w);
      s.selectByIndex(0);
      s.selectByIndex(1);
      s.selectByIndex(2);


     List <WebElement> list=s.getAllSelectedOptions();
     for(WebElement w2 : list)
     {
         System.out.println(w2.getText());
     }
     s.deselectAll();

// clear field and send value
        driver.findElement(By.id("textbox1")).clear();
        driver.findElement(By.id("textbox1")).sendKeys("hello rajat here");


        driver.findElement(By.linkText("SeleniumTutorial")).click();
        Thread.sleep(2000);
        String parent = driver.getWindowHandle();
        Set <String> windows= driver.getWindowHandles();
        Iterator<String> window = windows.iterator();
        while(window.hasNext())
        {
           String ss =window.next();
            System.out.println(ss);
              driver.switchTo().window(ss);
                      if(driver.getTitle().equals("Selenium143"))
              {
                  driver.findElement(By.linkText("What is Selenium?")).click();
              }

        }
        driver.switchTo().window(parent);
        driver.findElement(By.id("textbox1")).clear();
        driver.findElement(By.id("textbox1")).sendKeys("hello rajat here");



            if(driver.findElement(By.id("but1")).isEnabled())
        {
            System.out.println("button is enabled");
        }
            else
            {
                System.out.println("button is disabled");
            }


    //     explicit wait
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(25));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("deletesuccess")));
        driver.findElement(By.id("alert2")).click();
      String s= driver.switchTo().alert().getText();
       System.out.println(s);
       driver.switchTo().alert().accept();



        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("delayedText")));
        System.out.println(driver.findElement(By.id("delayedText")).getText());

// double click

   Actions action=new Actions(driver);
        WebElement w = driver.findElement(By.xpath("//button[contains(text(),'Double click Here')] "));
       action.doubleClick(w).perform();
        System.out.println(driver.switchTo().alert().getText());

// checkbox wait



WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
driver.findElement(By.xpath("//button[contains(text(),'Check this')]")).click();
  wait.until(ExpectedConditions.elementToBeClickable(By.id("dte")));
  driver.findElement(By.id("dte")).click();
  */


       // List<WebElement> elements = driver.findElements(By.xpath("//h2[contains(text(),'Select multiple options')]//following::input[@type=\"checkbox\"]"));

        //for(WebElement w:elements)
       // {
            // String value   =  w.getAttribute("value");
            // if(value.equals("Pen") || value.equals("Bag"))
           //  {
            //     w.click();
           //  }
        //}

         //driver.findElement(By.xpath("//input[@id=\"prompt\"]")).click();
        //Alert a = driver.switchTo().alert();
       // a.sendKeys("hhhhhhhh");

  /*driver.findElement(By.linkText("Open a popup window")).click();
        Set<String> windpws = driver.getWindowHandles();
        Iterator<String> window = windpws.iterator();
        while(window.hasNext())
        {
         String w =window.next();
         driver.switchTo().window(w);
         if(driver.getTitle().equals("Basic Web Page Title"))
         {
             System.out.println(driver.findElement(By.id("para1")).getText());
             driver.close();

         }
        }
   */


    }
}
