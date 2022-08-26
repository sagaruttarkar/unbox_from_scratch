package Data_Validation_Analytics_handles;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.Testutils;

public class YT_Handles {


	WebDriver driver;
	@BeforeMethod
	public void setup() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver","Drivers//chromedriver_v94.exe");
//			WebDriver driver =new ChromeDriver();

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


	@Test(priority=0,dataProvider="handles")
	public void YT_Handles1(String handlename) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 12000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]")));
       Thread.sleep(2000);
       driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[1]/div[2]/span/img")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[1]/div[2]/span/input")).sendKeys(handlename);
       Thread.sleep(5000);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@class='social-profile-platform-icon'])[5]")));
       WebElement temp = driver.findElement(By.xpath("(//img[@class='social-profile-platform-icon'])[5]"));
       temp.click();
        Thread.sleep(5000);
       driver.findElement(By.id("link_for_37")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");
        Thread.sleep(2000);
        System.out.println("********NO OF POST**********");
        String fn= driver.findElement(By.id("total_post")).getText();
        System.out.println(handlename+"...."+fn);


	}


	@DataProvider(name="handles")
	public Object[][] passdata(){

		Object[][] data= new Object[9][1];

		data[0][0]="MakeMyTripOfficial";
		data[1][0]="DisneyPlus Hotstar VIP";
		data[2][0]="Reliance Foundation Youth Sports";
		data[3][0]="Disney Plus Hotstar Premium";
		data[4][0]="Dome Entertainment";
		data[5][0]="DisneyPlus Hotstar VIP";
		data[6][0]="Videoleap by Lightricks - Mobile Video Editing";
		data[7][0]="Wildcraft India";
		data[8][0]="Laszlo Bihary";
//		data[9][0]="mirchimumbai";

//		data[10][0]="kohler india";





		return data;

	}
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/a")).click();
		driver.close();

	}



}
