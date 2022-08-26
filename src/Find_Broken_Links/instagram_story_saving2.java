package Find_Broken_Links;

import java.util.ArrayList;
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
import org.testng.annotations.Test;

import Utils.Testutils;

public class instagram_story_saving2 {

	WebDriver driver;
	@Test
	public void setup() throws InterruptedException {
 {

			System.setProperty("webdriver.chrome.driver","Drivers//chromedriver_v94.exe");
//			WebDriver driver =new ChromeDriver();
  
			
			
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
			ChromeOptions options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NONE);
		     driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Testutils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(Testutils.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.get("http://app.unboxsocial.com/");
			driver.findElement(By.id("email")).sendKeys("sagar.uttarkar@unboxsocial.com");
			driver.findElement(By.id("pwd")).sendKeys("123456");
			driver.findElement(By.xpath("//*[@id=\"login\"]")).click();

	WebDriverWait wait = new WebDriverWait(driver, 1200);
	 Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"main-menu-wrapper\"]/ul/li[3]/a")).click();
	Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='add-account']")));
	Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@class='list-search-icon search-anywhere-in-page']")).click();
	driver.findElement(By.xpath("//input[@name='serach-post']"))
			.sendKeys("instagram");
	Thread.sleep(5000);

	WebDriverWait wait1 = new WebDriverWait(driver, 10);
List click = driver.findElements(By.linkText("View Analytics"));


WebElement isPresent = driver.findElement(By.className("all_final_social_profiles"));

int view= click.size();
//int active_acc = isPresent.size();
//System.out.println(active_acc);
List<WebElement> linktext = isPresent.findElements(By.tagName("a"));
List<String> thetext = new ArrayList<String>();
for (WebElement element : linktext) {
	String text = element.getAttribute("href");
	thetext.add(text);
//	System.out.println(text);

}

for(String s : thetext) {
	driver.get(s);
String handle_name = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/span")).getText();
	driver.findElement(By.id("link_for_32")).click();
	Thread.sleep(8000);
	driver.findElement(By.xpath("//div[@id='globalrange_analytics']")).click();// cal click
	Thread.sleep(2000);

	driver.findElement(By.cssSelector("li[data-range-key='Custom Range']")).click();
	Thread.sleep(2000);
	Thread.sleep(2000);
	driver.findElement(By.name("daterangepicker_start")).clear();
	Thread.sleep(2000);
	driver.findElement(By.name("daterangepicker_start")).sendKeys("01062022");
	Thread.sleep(2000);
	driver.findElement(By.name("daterangepicker_end")).clear();
	Thread.sleep(5000);
	driver.findElement(By.name("daterangepicker_end")).sendKeys("15062022");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[11]/div[3]/div/button[1]")).click();
	Thread.sleep(5000);          
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,750)");
	Thread.sleep(5000);


	System.out.println("**** Thae brand is >>>> >>>>  "+handle_name);

	List<WebElement>list=driver.findElements(By.className("story-img-holder-outer"));

	System.out.println("Total links are ????"+list.size());
	for(WebElement e : list){
	WebElement str=(e.findElement(By.tagName("img")));
	System.out.println(str.getAttribute("src"));

	}

}



	}

}


}









