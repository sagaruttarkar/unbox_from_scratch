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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class scrap_folloers {
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
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/section/nav/div[2]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/a/div/div[2]/div[1]/div/div")));
			driver.findElement(By.xpath("/html/body/div[1]/section/nav/div[2]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/a/div/div[2]/div[1]/div/div")).click();
			driver.findElement(By.partialLinkText("following")).click();
			Thread.sleep(3000);

			String b1 = driver.findElement(By.xpath("/html/body/div[1]/section/main/div/header/section/ul/li[3]/a/span")).getText();
			int i=Integer.parseInt(b1);
			System.out.println("follower count is ="+i);


		JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement  element= driver.findElement(By.xpath("//div[@role='dialog']"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='dialog']")));
	 js.executeScript("return arguments[0].scrollIntoView();", element);


WebElement pop_up= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='isgrP']")));

//
//	 WebElement element1  = driver.findElement(By.className("isgrP"));

//
//		WebElement p=driver.findElement(By.tagName("button")).is
//		int t=linklist.size();
//	System.out.println("aaaa"+linklist.size());
	List<String> list=new ArrayList<String>();

	int count=1;

while(true &&list.size()<=i) {

//	js.executeScript("arguments[0].scrollTop = arguments[1];",driver.findElement(By.className("isgrP")),800);
		js.executeScript("arguments[0].scrollTop = arguments[0].scrollTop + arguments[0].offsetHeight;",pop_up);


    String abc=   driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div[3]/ul/div/li["+String.valueOf(count++)+"]/div/div[1]/div[2]/div[1]/span")).getText();
    System.out.println(abc);

Thread.sleep(2000);
}
}

     @DataProvider(name="influ")
     public Object[][] passdata(){
     	//here is first is row nd then col

     	Object[][] data= new Object[6][1];


     	data[0][0]="aliabhatt_fantasy";
     	data[1][0]="virat kohli";
     	data[2][0]="rohit sharma";
     	data[3][0]="sachin tendulkar";
     	data[4][0]="imsrk";
     	data[5][0]="hardik pandya";





     	return data;

     }

@AfterMethod
public void teardown() {

	driver.close();


}

}