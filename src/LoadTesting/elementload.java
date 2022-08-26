package LoadTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class elementload {

	public  static void main(String args[]) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","Drivers//chromedriver_v94.exe");
	System.out.println("reached");
	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");

	ChromeOptions options = new ChromeOptions();
	options.addArguments("--incognito");

   options.addArguments("--enable-features=ReaderMode");
 WebDriver driver= new ChromeDriver(options);

	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://app.unboxsocial.com/");
	driver.findElement(By.id("email")).sendKeys("sagar.uttarkar@unboxsocial.com");
	driver.findElement(By.id("pwd")).sendKeys("123456");
	driver.findElement(By.xpath("//*[@id=\"login\"]")).click();

	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebDriverWait wait = new WebDriverWait(driver, 1200);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/ul[1]/li[2]/a[1]")));
	driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/ul[1]/li[3]/a[1]")).click();
	Thread.sleep(12000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]")));
	driver.findElement(By.xpath("//img[@class='list-search-icon search-anywhere-in-page']")).click();
	driver.findElement(By.xpath("//input[@name='serach-post']")).sendKeys("Hope Philippines Church");
	Thread.sleep(5000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]")));
	driver.findElement(By.xpath("//div[contains(text(),'Hope Philippines Church')]")).click();

//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//*[@id=\"globalrange_analytics\"]/img")).click();
//	Thread.sleep(2000);

//	driver.findElement(By.xpath("/html/body/div[6]/div[3]/ul/li[7]")).click();
//	Thread.sleep(2000);
//	Thread.sleep(2000);
//	driver.findElement(By.name("daterangepicker_start")).clear();
//	Thread.sleep(2000);
//	driver.findElement(By.name("daterangepicker_start")).sendKeys("25012021");
//	Thread.sleep(2000);
//	driver.findElement(By.name("daterangepicker_end")).clear();
//	Thread.sleep(5000);
//	driver.findElement(By.name("daterangepicker_end")).sendKeys("25062021");
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/button[1]")).click();


	 double start = System.currentTimeMillis();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("page_fan_count")));
    WebElement fan=driver.findElement(By.id("page_fan_count"));


    double finsh= System.currentTimeMillis();

    double totalfan= finsh-start;
    System.out.println("fan and unfan tab");

    System.out.println("Time taken to load in milisecounds"+"="+ totalfan);

  //milesecounds to secounds

    double secounds = totalfan/1000;
    System.out.println("Time taken to load in secounds"+"="+ secounds);

    /////////////////////////////////
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fan_growth")));
    WebElement fan_growth=driver.findElement(By.id("fan_growth"));
    double finsh1= System.currentTimeMillis();
    double totalfangrowth= finsh1-start;
    System.out.println("followers growth");

    System.out.println("Time taken to load in milisecounds"+"="+ totalfangrowth);

  //milesecounds to secounds

    double totalfangrowth_secounds = totalfangrowth/1000;
    System.out.println("Time taken to load in secounds"+"="+ totalfangrowth_secounds);


    //// view total
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("views_total")));
    WebElement views_total=driver.findElement(By.id("views_total"));
    double viewfinsh1= System.currentTimeMillis();
    double totalviews_total= viewfinsh1-start;
    System.out.println("view total");

    System.out.println("Time taken to load in milisecounds"+"="+ totalviews_total);

  //milesecounds to secounds

    double totalviews_total_secounds = totalviews_total/1000;
    System.out.println("Time taken to load in secounds"+"="+ totalviews_total_secounds);
}
}

