
	package instagram;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class tt {
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


		public static void main(String args[]) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","Drivers//chromedriver_v94.exe");
		WebDriver driver =new ChromeDriver();
			ChromeOptions options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NONE);
			 WebDriverWait wait = new WebDriverWait(driver, 1200);
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://google.com/");

			driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("rohit sharma");
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);

			List<WebElement> linklist = driver.findElements(By.tagName("a"));
			 System.out.println("total links"+linklist.size());

			 List<String> activeelement = new ArrayList<String>();
			 for(WebElement e : linklist){
					if(e.getAttribute("href") == null || e.getAttribute("href").toString().contains("javascript")|| e.getAttribute("href").toString().contains("mailto") )
			{


					}
					else {
						activeelement.add(e.getAttribute("href").toString());
					}
				}
			 for(String url: activeelement) {
					if(isUrlValid(url)) {
						HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
						connection.connect();
						String response = connection.getResponseMessage();
						connection.disconnect();
						System.out.println(url+"--->"+response);
					}}

		}

	}


