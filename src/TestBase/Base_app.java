package TestBase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import Utils.Testutils;


public class Base_app {
	public 	static String browser = " ";
	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;

	@BeforeClass
	public static void TestBase1(){
		try {

			String File="src/config/configration.properties";

			FileInputStream ip = new FileInputStream(File);
			prop = new Properties();

			prop.load(ip);
		browser = prop.getProperty("browser");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

@BeforeTest
	public static void initialization() throws IOException, AWTException, InterruptedException
	{

		System.out.println(browser);
		if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","Drivers//chromedriver_v94.exe");
			System.out.println("reached");
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
////			ChromeOptions options = new ChromeOptions();
//			options.setPageLoadStrategy(PageLoadStrategy.NONE);
//			 ChromeOptions options1 = new ChromeOptions();
//			 options1.addArguments("--headless");
//			options.addArguments("--headless", "--window-size=1920,1200");
//			 driver= new ChromeDriver(options1);

			ChromeOptions options = new ChromeOptions();
			 options.setProxy(null);
			options.addArguments("--incognito");
			 driver= new ChromeDriver(options);

//			 options.addArguments("--window-size=1920,1200");

//

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();

			driver.manage().timeouts().pageLoadTimeout(Testutils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(Testutils.IMPLICIT_WAIT, TimeUnit.SECONDS);

			driver.get(prop.getProperty("url1"));
			Robot robot = new Robot();
			//press key Ctrl+Shift+r
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.delay(100);
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.delay(100);
			robot.keyPress(KeyEvent.VK_R);

			//relase key Ctrl+Shift+r

			robot.delay(100);
			robot.keyRelease(KeyEvent.VK_R);
			robot.delay(100);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			robot.delay(100);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(2000);
			driver.findElement(By.id("email")).sendKeys("sagar.uttarkar@unboxsocial.com");
			driver.findElement(By.id("pwd")).sendKeys("123456");
			driver.findElement(By.xpath("//*[@id=\"login\"]")).click();

		}
		else if(browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver","Drivers//geckodriver_latest.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Testutils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Testutils.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url1"));
		driver.findElement(By.id("email")).sendKeys("sagar.uttarkar@unboxsocial.com");
		driver.findElement(By.id("pwd")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();

	}
		else if(browser.equals("edge")){
			System.setProperty("webdriver.edge.driver","Drivers//edgedriver_win64 (1)//msedgedriver.exe");
			 driver = new EdgeDriver();

//
//			options.setPageLoadStrategy(PageLoadStrategy.NONE);

			driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Testutils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Testutils.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url1"));
		driver.findElement(By.id("email")).sendKeys("sagar.uttarkar@unboxsocial.com");
		driver.findElement(By.id("pwd")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();

	}

	}


	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		TestBase1();
		initialization();
		//TestBase1();
	}






}