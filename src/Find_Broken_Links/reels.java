package Find_Broken_Links;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class reels {

	@Test(priority=0,dataProvider="URL")
	public  void test(String urls) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Drivers//chromedriver_v94.exe");
		WebDriver driver =new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);

		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");



		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.instagram.com/");

		driver.get("urls");
		System.out.println(urls);
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/section/nav/div[2]/div/div/div[3]/div/div/div/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("._1C0MX")).click();
		Thread.sleep(8000);

		List<WebElement>list=driver.findElements(By.tagName("a"));
		System.out.println("Total links are ????"+list.size());
		Thread.sleep(5000);
		for(WebElement e : list){
			Thread.sleep(5000);

			String views=(e.getAttribute("href")+e.getText());
			System.out.println(views);
			Thread.sleep(5000);
			new Actions(driver).moveToElement(e).build().perform();
			System.out.println("links>>views>>likes>>comments format ");
			System.out.println(e.getAttribute("href")+">>"+views+">>"+e.getText());


			}

		}
//
//
	@DataProvider(name="URL")
	public Object[][] passdata(){

		Object[][] data= new Object[10][1];

		data[0][0]="https://www.instagram.com/superwowstyle/";
		data[1][0]="https://www.instagram.com/priyanka.s.borkar/";
		data[2][0]="https://www.instagram.com/bbhiral/";
		data[3][0]="https://www.instagram.com/sunnyhairport/";
		data[4][0]="https://www.instagram.com/mr.jaggigill_/";
		data[5][0]="https://www.instagram.com/manaseedograa/";
		data[6][0]="https://www.instagram.com/mrunalofficial2016/";
		data[7][0]="https://www.instagram.com/maliniagarwal/";
		data[8][0]="https://www.instagram.com/alaya.f/";
		data[9][0]="https://www.instagram.com/monicadogra/";





		return data;

	}

	}

