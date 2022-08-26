package Account_Upgrade_Downgrade;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utils.Testutils;

public class Upgrade_Downgrade {

	WebDriver driver;

	@BeforeMethod
    public void setup() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver","Drivers//chromedriver_v94.exe");
            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			 driver= new ChromeDriver(options);
             driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Testutils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(Testutils.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.get("http://stagingnew.unboxsocial.com/");
			driver.findElement(By.id("email")).sendKeys("sagar@tester.com");
			driver.findElement(By.id("pwd")).sendKeys("123456");
			driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
			Thread.sleep(2000);

	}
	@Test(priority=0)
	public void Test_Upgrade_mode() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, 1200);
		driver.findElement(By.xpath("//div[@class='nametoinitialBox text-center']")).click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div/div/div/div/div[1]/div[1]/div[4]/div/div/div/div/div/div[2]/div[2]/div[3]/div[2]/button")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div/div[1]/div[1]/div[4]/div/div/div/div/div/div[2]/div[2]/div[3]/div[2]/button")).click();
         Thread.sleep(20000);
         driver.findElement(By.id("last_name")).sendKeys("Uttarkar");
         driver.findElement(By.id("phone_number")).sendKeys("8898223093");
         Thread.sleep(2000);
         driver.findElement(By.id("checkout_payNow")).click();
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cardNumber")));
         driver.findElement(By.id("cardNumber")).sendKeys("4242 4242 4242 4242");
         driver.findElement(By.id("cardExpiry")).sendKeys("0225");
         driver.findElement(By.id("cardCvc")).sendKeys("123");
         driver.findElement(By.id("billingName")).sendKeys("Sagar Uttarkar");
         driver.findElement(By.xpath("//div[@class='SubmitButton-IconContainer']")).click();
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-wire-teal payment-success']")));
         driver.findElement(By.xpath("//button[@class='btn btn-wire-teal payment-success']")).click();

	}

	@Test(priority=1)
	public void Test_Downgrade_mode() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, 1200);
		driver.findElement(By.xpath("//div[@class='nametoinitialBox text-center']")).click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div/div/div/div/div[1]/div[1]/div[4]/div/div/div/div/div/div[2]/div[2]/div[2]/div[2]/button")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div/div[1]/div[1]/div[4]/div/div/div/div/div/div[2]/div[2]/div[2]/div[2]/button")).click();
         Thread.sleep(2000);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[7]/div/div/div/form/div/h5/span/button")));
         driver.findElement(By.xpath("/html/body/div[7]/div/div/div/form/div/h5/span/button")).click();
          driver.findElement(By.id("last_name")).sendKeys("Uttarkar");
         driver.findElement(By.id("phone_number")).sendKeys("8898223093");
         Thread.sleep(2000);
         driver.findElement(By.id("checkout_payNow")).click();
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cardNumber")));
         driver.findElement(By.id("cardNumber")).sendKeys("4242 4242 4242 4242");
         driver.findElement(By.id("cardExpiry")).sendKeys("0225");
         driver.findElement(By.id("cardCvc")).sendKeys("123");
         driver.findElement(By.id("billingName")).sendKeys("Sagar Uttarkar");
         driver.findElement(By.xpath("//div[@class='SubmitButton-IconContainer']")).click();
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-wire-teal payment-success']")));
         driver.findElement(By.xpath("//button[@class='btn btn-wire-teal payment-success']")).click();

	}



	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("html[1]/body[1]/div[3]/div[3]/div[4]/a[1]")).click();
		driver.close();

	}
}
