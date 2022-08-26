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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class blogblog {
	
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

			driver.get("https://www.unboxsocial.com/blog/");

}
@Test
public void blogblog() throws InterruptedException, IOException {
	

	 List<WebElement> str = driver.findElements(By.tagName("a"));
	 List<String> activeelement = new ArrayList<String>();

do {

	
	Thread.sleep(2000);
	System.out.println("loop started");
	List <WebElement>ele = driver.findElements(By.className("elementor-post__thumbnail"));
for(WebElement e : ele){
	 
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,200)", "");
	
	 for(WebElement e1 : str){
			if(e1.getAttribute("href") == null || e1.getAttribute("href").toString().contains("javascript")|| e1.getAttribute("href").toString().contains("mailto") )
	{


			}
			else {
				activeelement.add(e1.getAttribute("href").toString());
		
			}
			
		}





Thread.sleep(4000);




}
}while(driver.findElement(By.xpath("/html/body/main/article/div[1]/div/div[2]/section[6]/div/div/div/div/div/div[3]")).isDisplayed());



for(String url: activeelement) {
	if(isUrlValid(url)) {
		HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
		connection.connect();
		String response = connection.getResponseMessage();
		connection.disconnect();
		System.out.println("total links"+activeelement.size());
		System.out.println(url+"--->"+response);
	}}}}