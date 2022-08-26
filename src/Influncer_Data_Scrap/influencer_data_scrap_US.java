package Influncer_Data_Scrap;

import java.util.List;
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

public class influencer_data_scrap_US {

	public static void main(String args[]) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver","Drivers//chromedriver_v94.exe");
			WebDriver driver =new ChromeDriver();
			WebDriverWait wait = new WebDriverWait(driver, 1200);
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
			ChromeOptions options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NONE);
//		     driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Testutils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(Testutils.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.get("https://starngage.com/app/in/influencer/ranking/india");
			driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/button")).click();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"page-title\"]/div/div/div/h1")));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("country")));
		     driver.findElement(By.xpath("//*[@id=\"country\"]/option[1]")).click();
		     Thread.sleep(2000);
		     driver.findElement(By.id("submit")).click();
		     Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,750)");
			WebElement l =driver.findElement(By.tagName("tbody"));
			 String data1= l.getText();
			 System.out.println(data1);

			 List<WebElement> pagination =driver.findElements(By.cssSelector("li[class='page-item'] a[class='page-link']"));

			 driver.findElement(By.xpath("//i[@class='far fa-angle-right']")).click();
do {

	if(!driver.findElement(By.xpath("//i[@class='far fa-angle-right']")).isDisplayed()){

		break;
	}else {
				 		driver.findElement(By.xpath("//i[@class='far fa-angle-right']")).click();
						 }
//			 		if(pagination.size()>0){
				 System.out.println("pagination exists");
//				 for(int i=0; i<pagination.size();i++){
//					 Thread.sleep(5000);
//					 pagination.get(i).click();
				 WebElement l1 =driver.findElement(By.tagName("tbody"));
				 String data11= l1.getText();
				 System.out.println(data11);



			 }while(driver.findElement(By.xpath("//i[@class='far fa-angle-right']")).isDisplayed());


	}



}









