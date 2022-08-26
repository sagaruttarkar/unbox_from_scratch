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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class reels2 {

	WebDriver driver;
//	@BeforeMethod
	public static void main (String args[]) throws InterruptedException {

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
			driver.get("https://www.instagram.com/");
			driver.findElement(By.name("username")).sendKeys("reconnectsagar");
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys("sagar@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(5000);
			boolean b =driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div/div/div/button")).isDisplayed();
			if (b==true)

			{
				driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div/div/div/button")).click();

			}else {

				System.out.println("not now not dispaly");
			}
Thread.sleep(5000);

			boolean b1 =driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[3]/button[2]")).isDisplayed();
			if (b1==true)

			{
				driver.findElement(By.xpath("/html/body/div[5]/div/div/div/div[3]/button[2]")).click();

			}else {

				System.out.println("not now not dispaly");
			}

            Thread.sleep(5000);
             new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/section[1]/nav[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/span[2]"))).click();
			Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("superwowstyle");
		   WebDriverWait wait1 = new WebDriverWait(driver, 1200);
		   wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/section/nav/div[2]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/a/div/div[2]/div[1]/div/div")));
			driver.findElement(By.xpath("/html/body/div[1]/section/nav/div[2]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/a/div/div[2]/div[1]/div/div")).click();
	        Thread.sleep(2000);
			driver.findElement(By.cssSelector("._1C0MX")).click();

			List<WebElement>list=driver.findElements(By.tagName("a"));
			System.out.println("Total links are ????"+list.size());
			Thread.sleep(5000);
			for(WebElement e : list){
				Thread.sleep(5000);


			System.out.println(e.getAttribute("href")+e.getText());
				Thread.sleep(5000);
				new Actions(driver).moveToElement(e).build().perform();
				System.out.println("links>>views>>likes>>comments format ");
				System.out.println(e.getAttribute("href")+">>"+e.getText());
	//


			}}}



//	@Test(priority=0,dataProvider="Handles")
//	public  void  test124(String l1)throws InterruptedException {
//
//
//		driver.findElement(By.xpath("/html/body/div[1]/div/div/section/nav/div[2]/div/div/div[3]/div/div[6]/span/img")).click();
//        driver.findElement(By.cssSelector("input[placeholder='Search']")).isSelected();
//        Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).click();
//		Thread.sleep(2000);
//	   driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys(l1);
//	   WebDriverWait wait = new WebDriverWait(driver, 1200);
//	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/section/nav/div[2]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/a/div/div[2]/div[2]/div")));
//		driver.findElement(By.xpath("/html/body/div[1]/div/div/section/nav/div[2]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/a/div/div[2]/div[2]/div")).click();
//        Thread.sleep(2000);
//		driver.findElement(By.cssSelector("._1C0MX")).click();
//		Thread.sleep(8000);
//
//		List<WebElement>list=driver.findElements(By.tagName("a"));
//		System.out.println("Total links are ????"+list.size());
//		Thread.sleep(5000);
//		for(WebElement e : list){
//			Thread.sleep(5000);
//
//
//		System.out.println(e.getAttribute("href")+e.getText());
//			Thread.sleep(5000);
//			new Actions(driver).moveToElement(e).build().perform();
//			System.out.println("links>>views>>likes>>comments format ");
//			System.out.println(e.getAttribute("href")+">>"+e.getText());
//
//
//			}
//	}
//
//	@DataProvider(name="Handles")
//	public Object[][] passdata(){
//
//		Object[][] data= new Object[10][1];
//        data[0][0]="superwowstyle";
//		data[1][0]="priyanka.s.borkar";
//		data[2][0]="bbhiral";
//		data[3][0]="sunnyhairport";
//		data[4][0]="mr.jaggigill_";
//		data[5][0]="manaseedograa";
//		data[6][0]="mrunalofficial2016";
//		data[7][0]="maliniagarwal";
//		data[8][0]="alaya.f";
//		data[9][0]="monicadogra";
//
//	return data;
//
//	}



