 package fluttr;
 import org.openqa.selenium.*;
 import org.openqa.selenium.remote.DesiredCapabilities;
 import java.net.MalformedURLException;
 import java.net.URL;
 import org.openqa.selenium.remote.RemoteWebDriver;
 import org.testng.Assert;
 import org.testng.annotations.*;

 public class selenium_grid {

     WebDriver driver;
     String baseURL, nodeURL;

     @BeforeTest
     public void setUp() throws MalformedURLException {
         baseURL = "https://fluttr.shop/products/rare-beauty-positive-light-tinted-moisturizer";
         nodeURL = "http://localhost:4444";
         DesiredCapabilities capability = DesiredCapabilities.chrome();
         capability.setBrowserName("firefox");
         capability.setPlatform(Platform.WIN10);
         driver = new RemoteWebDriver(new URL(nodeURL), capability);
     }

   
     @Test(invocationCount=10)
     public void sampleTest() {
         driver.get(baseURL);
         

     }  
     @AfterTest
     public void afterTest() {
         driver.close();
     }
 }
