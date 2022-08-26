package Influncer_Data_Scrap;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.Testutils;

public class Influnecer_Singlepage_Scrap {
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
		driver.get("https://starngage.com/app/in/influencer/ranking/united-states?page=20");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/button")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"page-title\"]/div/div/div/h1")));


		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)");
		WebElement l =driver.findElement(By.tagName("tbody"));
		 String data1= l.getText();
		 System.out.println(data1);

	}
}
