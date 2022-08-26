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
import org.openqa.selenium.support.ui.WebDriverWait;

public class testcase1 {

	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","Drivers//chromedriver_v94.exe");
		WebDriver driver =new ChromeDriver();

		WebDriverWait wait = new WebDriverWait(driver, 1200);
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
//	     driver = new ChromeDriver();
		options.addArguments("--incognito");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/explore/tags/itscrystalclear/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/section/nav/div[2]/div/div/div[3]/div/div/div/button")).click();
         Thread.sleep(8000);
		List<WebElement>list=driver.findElements(By.tagName("a"));
System.out.println("Total links are ????"+list.size());
for(WebElement e : list){
WebElement str=(e.findElement(By.tagName("img")));
System.out.println(str.getAttribute("src"));
}}}