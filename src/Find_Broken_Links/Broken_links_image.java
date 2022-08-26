package Find_Broken_Links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Broken_links_image {
WebDriver driver;



	 public static boolean isUrlValid(String url) {
	      try {
	         URL obj = new URL(url);
	         obj.toURI();
	         return true;
	      } catch (MalformedURLException e) {
	         return false;
	      } catch (URISyntaxException e) {
	         return false;
	      }
	 }
 @BeforeMethod
public void setup() {

			System.setProperty("webdriver.chrome.driver","Drivers/chromedriver_v94.exe");

//		System.setProperty("webdriver.gecko.driver","C:\\Users\\acer\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");

	      driver= new ChromeDriver(options);

//
			//Maximize the browser
			driver.manage().window().maximize();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();

			driver.get("https://www.diamondsfactory.co.uk/sitemap/engagement-rings");
//	        driver.findElement(By.id("email")).sendKeys("sagar.uttarkar@unboxsocial.com");
//			driver.findElement(By.id("pwd")).sendKeys("123456");
//			driver.findElement(By.xpath("//*[@id=\"login\"]")).click();

	 }
	 @Test
	 public void Broken_Link_images() throws IOException {

		 List<WebElement> linklist = driver.findElements(By.tagName("a"));
			List<WebElement> image = driver.findElements(By.tagName("img"));
			System.out.println("total links"+linklist.size());
			System.out.println("total images"+image.size());


			List<String> activeelement = new ArrayList<String>();
			List<String> activeelementimg = new ArrayList<String>();
			for(WebElement e : linklist){
				if(e.getAttribute("href") == null || e.getAttribute("href").toString().contains("javascript")|| e.getAttribute("href").toString().contains("mailto") )
		{


				}
				else {
					activeelement.add(e.getAttribute("href").toString());
				}
			}

		//
			for(WebElement e : image){

				activeelementimg.add(e.getAttribute("src")==null  ? e.getAttribute("data-src"):
					  "https://www.diamondsfactory.co.uk/"+ e.getAttribute("src"));
			}


//			//3. Check the activeelement using httpurlconnection API
			for(String url: activeelement) {
				if(isUrlValid(url)) {
					HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
					connection.connect();
					String response = connection.getResponseMessage();
					connection.disconnect();
					System.out.println(url+"--->"+response);
				}}


				for(String url1: activeelementimg) {
					if(isUrlValid(url1)) {
						HttpURLConnection connection = (HttpURLConnection) new URL(url1).openConnection();
						connection.connect();
						String response = connection.getResponseMessage();
						connection.disconnect();
						System.out.println(url1+"--->"+response);
					}



	 }
				}


//		@AfterMethod
//		public void teardown() throws InterruptedException {
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("/html/body/div[3]/div[1]/div")).click();
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/a")).click();
//			driver.close();
//
//		}



}