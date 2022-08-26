package Testcases_competitor;


import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.Testutils;

public class cross_link_checking {


	WebDriver driver;
	@BeforeMethod
	public void setup() {
		     System.setProperty("webdriver.chrome.silentOutput","true");
			System.setProperty("webdriver.chrome.driver","Drivers//chromedriver_v94.exe");
//			WebDriver driver =new ChromeDriver();

			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
			ChromeOptions options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NONE);
		     driver = new ChromeDriver();

//		     ChromeOptions options1 = new ChromeOptions();
//			 options1.addArguments("--headless");
////			options.addArguments("--headless", "--window-size=1920,1200");
//			 driver= new ChromeDriver(options1);
//		      driver = new HtmlUnitDriver(true);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Testutils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(Testutils.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.get("http://app.unboxsocial.com/");
			driver.findElement(By.id("email")).sendKeys("sagar.uttarkar@unboxsocial.com");
			driver.findElement(By.id("pwd")).sendKeys("123456");
			driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
	}


	@Test(priority=0,dataProvider="links")
	public void Cross_link_checking(String l1,String l2,String l3) throws InterruptedException {


		driver.findElement(By.xpath("//*[@id=\"main-menu-wrapper\"]/ul/li[8]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[1]/div[2]/a[1]/div")).click();
		Random random = new Random();
		String car_test = "demo+"+random.nextInt()+"_sagar";
		driver.findElement(By.id("COMPETITOR_NAME")).sendKeys(car_test);
		driver.findElement(By.xpath("//*[@id=\"Competitor_1\"]/div/div/input")).sendKeys(l1);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"Competitor_2\"]/div/div/input")).sendKeys(l2);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"Competitor_3\"]/div/div/input")).sendKeys(l3);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"Competitor_4\"]/div/div/input")).click();
		Thread.sleep(4000);

		String invalid=	driver.findElement(By.xpath("//*[@id=\"Competitor_2\"]/span")).getText();
		System.out.println(invalid);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"addTracker_data\"]/div/h5/span/span[3]")).click();




	}


	@DataProvider(name="links")
	public Object[][] passdata(){

		Object[][] data= new Object[4][3];

		data[0][0]="https://www.instagram.com/bmwindia_official";
		data[0][1]="https://www.facebook.com/229492534096049";
		data[0][2]="https://www.instagram.com/audiin";


		data[1][0]="https://www.facebook.com/1431140343877187";
		data[1][1]="https://www.instagram.com/audiin";
		data[1][2]= "https://www.facebook.com/229492534096049";


		data[2][0]="https://www.youtube.com/channel/UC123j4IJBjDkR5QH6kz1dBw";
		data[2][1]="https://www.instagram.com/audiin";
		data[2][2]="https://www.youtube.com/channel/UCyjiF8QxQIBlI1kEEciJqkw";

		data[3][0]="https://www.twitter.com/needhammktfc";
		data[3][1]="https://www.instagram.com/audiin";
		data[3][2]="https://www.twitter.com/Ms_Onesimo";



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
