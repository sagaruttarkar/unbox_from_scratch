package instagram;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class hasttag {
public WebDriver driver;
     @Test
     (priority=0,dataProvider="influ")
	public  void test(String l1) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Drivers//chromedriver_v94.exe");
		 driver =new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		 WebDriverWait wait = new WebDriverWait(driver, 1200);
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("reconnectsagar");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("sagar@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		 new WebDriverWait(driver,80).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/section/nav/div[2]/div/div/div[2]/div[1]/div"))).click();
			Thread.sleep(5000);
		   driver.findElement(By.xpath("/html/body/div[1]/section/nav/div[2]/div/div/div[2]/input")).sendKeys(l1);
		  Thread.sleep(8000);

driver.findElement(By.linkText(l1)).click();
List<WebElement>list=driver.findElements(By.tagName("a"));
System.out.println("Total links are ????"+list.size());



















}

     @DataProvider(name="influ")
     public Object[][] passdata(){
     	//here is first is row nd then col

     	Object[][] data= new Object[6][1];


     	data[0][0]="#hairdresser";
     	data[1][0]="#hairdressermagic";
     	data[2][0]="#bandrasalon";
     	data[3][0]="#salonhai";
     	data[4][0]="#salon";
     	data[5][0]="#haircutsforwomen";





     	return data;

     }

@AfterMethod
public void teardown() {

	driver.close();


}

}