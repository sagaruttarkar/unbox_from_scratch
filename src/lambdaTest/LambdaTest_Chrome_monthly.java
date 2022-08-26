//This is maven project

package lambdaTest; //<your package name>

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LambdaTest_Chrome_monthly {
//WebDriver driver;
	public RemoteWebDriver driver = null;
   String username = "sagar.uttarkar";
	String accessKey = "EoBmt3scdRrV4Bjg2OTxj1qIQkDto97L0A3WfgnGzReL1gT04O";

	@BeforeTest
    public void setUp() throws Exception {
//		System.setProperty("webdriver.chrome.driver","Drivers//chromedriver_v93.exe");
//		driver= new ChromeDriver();
//		driver.manage().window().maximize();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platform", "Windows 10");
	     capabilities.setCapability("browserName", "Chrome");
	     capabilities.setCapability("version", "91"); // If this cap isn't specified, it will just get the any available one
        capabilities.setCapability("resolution","1920x1080");
        capabilities.setCapability("build", "First Test");
        capabilities.setCapability("name", "Chrome1 Test");
        capabilities.setCapability("network", true); // To enable network logs
        capabilities.setCapability("visual", true); // To enable step by step screenshot
        capabilities.setCapability("video", true); // To enable video recording
        capabilities.setCapability("console", true); // To capture console logs
        capabilities.setCapability("idleTimeout","95");
//
//
        try {
			driver= new RemoteWebDriver(new URL("https://"+username+":"+accessKey+"@hub.lambdatest.com/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            System.out.println("Invalid grid URL");
        }
    }

	@Test(enabled = true)
	public void HomePage_start7daystrial() throws Exception {

					driver.get("http://demo.unboxsocial.com/pricing");
					driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul[1]/li[1]/a")).click();
					WebDriverWait wait = new WebDriverWait(driver,80);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='newdesktopEmail']")));
					driver.findElement(By.xpath("//input[@id='newdesktopEmail']")).sendKeys("sagar.uttarkar132323@unboxsocial.com");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id=\"getstartedDesktop\"]")).isEnabled();
					driver.findElement(By.xpath("//*[@id=\"getstartedDesktop\"]")).click();
					Thread.sleep(5000);
					JavascriptExecutor js = driver;
					js.executeScript("window.scrollBy(0,350)");
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[1]/div/div[2]/div/button")));
					Thread.sleep(5000);
					 driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div[2]/div/button")).click();
					 Thread.sleep(5000);
					 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first_name")));
					//Form

					driver.findElement(By.id("first_name")).sendKeys("sagar");
					driver.findElement(By.id("last_name")).sendKeys("uttarkar");
					Random random = new Random();
					String unique_email = "sagar"+random.nextInt()+"@unboxsocial.com";
					driver.findElement(By.id("signup_email")).sendKeys(unique_email);
					Thread.sleep(2000);
					driver.findElement(By.id("phone_number")).sendKeys("8898230133");
					driver.findElement(By.id("password")).sendKeys("Sagar@123");
					driver.findElement(By.id("reenter_password")).sendKeys("Sagar@123");
					Thread.sleep(2000);
					driver.findElement(By.id("coupon_code")).sendKeys("signupnew");
					driver.findElement(By.xpath("//button[normalize-space()='Apply']")).click();
					Thread.sleep(2000);
					driver.findElement(By.id("next_payNow")).click();
					Thread.sleep(5000);
					driver.findElement(By.id("cardNumber")).sendKeys("4242 4242 4242 4242");
					driver.findElement(By.id("cardExpiry")).sendKeys("0223");
					driver.findElement(By.id("cardCvc")).sendKeys("123");
					driver.findElement(By.id("billingName")).sendKeys("sagar uttarkar");
                     Thread.sleep(2000);
					driver.findElement(By.id("billingAddressLine1")).sendKeys("Test1test");
					driver.findElement(By.id("billingAddressLine2")).sendKeys("Test1test");
					 Thread.sleep(2000);
					 driver.findElement(By.id("billingLocality")).sendKeys("Test1test");
					driver.findElement(By.id("billingPostalCode")).sendKeys("66891");
					 Thread.sleep(2000);
					 Select dropdown = new Select(driver.findElement(By.id("billingAdministrativeArea")));
					 dropdown.selectByIndex(1);

					driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/form/div[2]/div[4]/button/div[3]")).click();
                    Thread.sleep(5000);
                    ///On boarding
                    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"step-1\"]/div[1]/h5")));
                    driver.findElement(By.id("first_name")).sendKeys("Testing group");
					driver.findElement(By.id("onboardingNext")).click();
					Thread.sleep(2000);
					driver.findElement( By.id("skip-2")).click();
					Thread.sleep(2000);
					driver.findElement(By.id("skip-3")).click();
                    driver.quit();
					}



}