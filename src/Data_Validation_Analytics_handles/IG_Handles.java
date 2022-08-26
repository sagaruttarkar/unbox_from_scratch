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

public class IG_Handles {


	WebDriver driver;
	@BeforeMethod
	public void setup() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver","Drivers/chromedriver_v94.exe");
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
	public void IG_Handles1(String handlename) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 12000);


		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]")));
       Thread.sleep(2000);
       driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[1]/div[2]/span/img")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[1]/div[2]/span/input")).sendKeys(handlename);
       Thread.sleep(5000);

       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[contains(@class,'social-profile-platform-icon')])[5]")));
       WebElement temp = driver.findElement(By.xpath("(//img[contains(@class,'social-profile-platform-icon')])[5]"));
       temp.click();
       Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,850)");
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("totalPosts")));
        System.out.println("********NO OF POST**********");
        String fn= driver.findElement(By.id("totalPosts")).getText();
        System.out.println(handlename+"...."+fn);
        Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/a")).click();


	}



	@DataProvider(name="handles")
	public Object[][] passdata(){

		Object[][] data= new Object[15][1];

		    data[0][0]="Julio Cesar";
	        data[1][0]="Kohler India";
			data[2][0]="Spoken Fest";
			data[3][0]="Applause Entertainment";
			data[4][0]="Classparty";
			data[5][0]="Kommune Delhi";
			data[6][0]="Kids' Healthy Mouths";
			data[7][0]="Aer Media";
			data[8][0]="Lakme";
			data[9][0]="DeFi Crown";
			data[10][0]="All about Korea A to Z";
			data[11][0]="Kao Salon Division";
			data[12][0]="Funky Buddha Tap Room";
			data[13][0]="Funky Buddha Brewery";
			data[14][0]="Meredith Jacqueline";
//			data[16][0]="Kommune";
//			data[17][0]="RESET";
//			data[18][0]="Applause Entertainment";
//			data[19][0]="Ryan Group";
//			data[20][0]="VILJAMI KAASALAINEN";
//			data[21][0]="PGP Glassware";
//			data[22][0]="Raskik";
//			data[23][0]="Museum of Solutions";
//			data[24][0]="SunsilkIndia";
//			data[25][0]="Shotlio";
//			data[26][0]="sasu salin";
//			data[27][0]="Thermaissance";
//			data[28][0]="PlusYou Club";
//			data[29][0]="upendogolf";
//			data[30][0]="Pharmascience";
//			data[31][0]="Classparty";
//			data[32][0]="Sangg Geet";
//			data[33][0]="Juha Puhtimäki";
//			data[34][0]="Sapna Kabra Art Studio";
//			data[35][0]="Love Beauty & Planet India";
//			data[36][0]="Ida Hulkko";
//			data[37][0]="Dr. Siddhant Bhargava";
//			data[38][0]="JaldiLive";
//			data[39][0]="Sanni Franssi";
//			data[40][0]="DeBongo";
//			data[41][0]="Lauri Lepisto";
//			data[42][0]="Mahindra Group";
//			data[43][0]="Visa Rahkola";
//			data[44][0]="lakme";






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
