package Find_Broken_Links;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.Testutils;

public class demo {


	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","Drivers//chromedriver_v94.exe");
		WebDriver driver =new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 1200);
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
//	     driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Testutils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Testutils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get("https://starngage.com/app/in/influencer/ranking/india");




	}

}
