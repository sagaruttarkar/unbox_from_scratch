package scrapping_reels;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class caption_scrap {
	WebDriver driver;
	@Test(priority=0,dataProvider="Handles")
	public void caption_scrap(String reels) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","Drivers//chromedriver_v94.exe");
		WebDriver driver =new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);

		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");


		WebDriverWait wait = new WebDriverWait(driver, 1200);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(reels);
		Thread.sleep(5000);
	String caption =driver.findElement(By.tagName("span")).getAttribute("innerHTML");

	System.out.println(reels+">>>"+caption);
	driver.close();


	}

	@DataProvider(name="Handles")
	public Object[][] passdata(){

		Object[][] data= new Object[7][1];
        data[0][0]="https://www.instagram.com/reel/CW-uuCHjvKi/";
		data[1][0]="https://www.instagram.com/reel/CW5AZOzjs5d/";
		data[2][0]="https://www.instagram.com/reel/CWvhso7jc9s/";
		data[3][0]="https://www.instagram.com/reel/CWvTJ42D9WD/";
		data[4][0]="https://www.instagram.com/reel/CWqkRaADIj0/";
		data[5][0]="https://www.instagram.com/reel/CWqYp1HDhal/";
		data[6][0]="https://www.instagram.com/reel/CWfSPYpj4Mj/";


	return data;

	}

}
