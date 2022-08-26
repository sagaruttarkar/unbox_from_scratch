package fluttr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class fluttrScenario {
	public static WebDriver driver;
	

@Test(invocationCount=10)
public void loadrun() {
	
	WebDriverWait wait = new WebDriverWait(driver, 1800);
 String	proxy = "94.122.251.105:3128";
	DesiredCapabilities caps = new DesiredCapabilities();
	caps.setJavascriptEnabled(true);                  
	caps.setCapability(
	                        PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
	                        "D:\\my workspace\\unbox_scratch_sagar\\Drivers\\phantomjs.exe"
	                    );
	
	 driver = new  PhantomJSDriver(caps);
	
	 
	
	driver.get("https://fluttr.shop/products/rare-beauty-positive-light-tinted-moisturizer");
	driver.close();
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@type='button']")));
//	driver.findElement(By.xpath("//div[@type='button']")).click();
    }

}




