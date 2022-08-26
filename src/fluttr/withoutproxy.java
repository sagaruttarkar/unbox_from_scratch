package fluttr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class withoutproxy {
	WebDriver driver;
@Test(invocationCount=5)
public void Withoutip() {
			
	DesiredCapabilities caps = new DesiredCapabilities();
	caps.setJavascriptEnabled(true);                  
	caps.setCapability(
	                        PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,
	                        "D:\\my workspace\\unbox_scratch_sagar\\Drivers\\phantomjs.exe"
	                    );
	
	 driver = new  PhantomJSDriver(caps);
	 driver.get("https://fluttr.shop/products/rare-beauty-positive-light-tinted-moisturizer");
		System.out.println(driver.getTitle());
		}

}
