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

public class TW_Handles {


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
	public void TW_Handles1(String handlename) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 12000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]")));
       Thread.sleep(2000);
       driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[1]/div[2]/span/img")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[1]/div[2]/span/input")).sendKeys(handlename);
       Thread.sleep(2000);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[contains(@class,'social-profile-platform-icon')])[5]")));
       WebElement temp = driver.findElement(By.xpath("(//img[contains(@class,'social-profile-platform-icon')])[5]"));
       temp.click();
        Thread.sleep(5000);
        driver.findElement(By.id("link_for_128")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,650)");
        Thread.sleep(2000);
        System.out.println("********TOTAL TWEETS**********");
        String fn= driver.findElement(By.id("pinBoot")).getText();
        System.out.println(handlename+"...."+fn);


	}


	@DataProvider(name="handles")
	public Object[][] passdata(){

		Object[][] data= new Object[23][1];

		data[0][0]="fbb_india";
		data[1][0]="Hindustan Times";
		data[2][0]="DTA";
		data[3][0]="RF Youth Sports";
		data[4][0]="Tanishq";
		data[5][0]="Tinkle Magazine";
		data[6][0]="DTA";
		data[7][0]="Polycab India Limited";
		data[8][0]="Stellar";
		data[9][0]="Gautam Gambhir";
		data[10][0]="Zee Music Company";
		data[11][0]="Bharti AXA GI";
		data[12][0]="GO FIRST";
		data[14][0]="JTsocial";
		data[15][0]="Aimen Boukhouidem";
		data[16][0]="Susanne Krone";
		data[17][0]="DeFiCrown";
		data[18][0]="ZeroAlpha";
		data[19][0]="Pathway Medical";
		data[20][0]="HUHFT";
		data[21][0]="momocrafting";
		data[22][0]="NBAIndia";







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
