package Find_Broken_Links;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utils.Testutils;

public class analytics_all_platform_get_handle {
	WebDriver driver;
	@BeforeMethod



	public void setup() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver","Drivers//chromedriver_v94.exe");


			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			 driver= new ChromeDriver(options);
             driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Testutils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(Testutils.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.get("http://app.unboxsocial.com/");
			driver.findElement(By.id("email")).sendKeys("sagar.uttarkar@unboxsocial.com");
			driver.findElement(By.id("pwd")).sendKeys("123456");
			driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"main-menu-wrapper\"]/ul/li[2]/a")).click();
	}
	@Test
	public void get_handle_name() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 1200);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		System.out.println("Anyalytics_module_instagram_Delete");
			driver.findElement(By.xpath("//*[@id=\"main-menu-wrapper\"]/ul/li[3]/a")).click();
			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]")));
			driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[1]/div[2]/span/img")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[1]/div[2]/span/input")).sendKeys("instagram");
			Thread.sleep(8000);
	String data = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]")).getText();
	System.out.println(data);
		}
}
