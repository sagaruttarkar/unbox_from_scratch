package Testcases_PaymentGatway;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Utils.Testutils;

public class Testcases_invoice_payments {

	 WebDriver driver;





	 @Test
	 	public void Payments_invoice_validation() throws Exception {
	 		System.setProperty("webdriver.chrome.driver","Drivers//chromedriver_v94.exe");
	 		driver= new ChromeDriver();
	 		JavascriptExecutor js = (JavascriptExecutor) driver;
	 	     WebDriverWait wait = new WebDriverWait(driver,80);

	 		driver.manage().window().maximize();
			driver.manage().deleteAllCookies();

			driver.manage().timeouts().pageLoadTimeout(Testutils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(Testutils.IMPLICIT_WAIT, TimeUnit.SECONDS);

			driver.get("https://app.unboxsocial.com/");
			driver.findElement(By.id("email")).sendKeys("sagaru@unboxsocial.com");
			driver.findElement(By.id("pwd")).sendKeys("123456");
			driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='nametoinitialBox-text']")));
			 driver.findElement(By.xpath("//span[@class='nametoinitialBox-text']")).click();
//			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("button")));
//			 driver.findElement(By.tagName("button")).click();
//
//			 driver.findElement(By.id("first_name")).clear();
//			 driver.findElement(By.id("first_name")).sendKeys("sagar");
//
//			 driver.findElement(By.id("last_name")).clear();
//				driver.findElement(By.id("last_name")).sendKeys("uttarkar");
//
//				driver.findElement(By.id("Email_id")).clear();
//                Random random = new Random();
//				String unique_email = "sagar"+random.nextInt()+"@unboxsocial.com";
//				driver.findElement(By.id("Email_id")).sendKeys(unique_email);
//				Thread.sleep(2000);
//				driver.findElement(By.id("phone_number")).sendKeys("8898230133");
//			  driver.findElement(By.id("checkout_payNow")).click();
//			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cardNumber")));
//				driver.findElement(By.id("cardNumber")).sendKeys("5241 9331 3794 4013");
//				driver.findElement(By.id("cardExpiry")).sendKeys("0123");
//				driver.findElement(By.id("cardCvc")).sendKeys("991");
//				driver.findElement(By.id("billingName")).sendKeys("sagar uttarkar");
//				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='SubmitButton-IconContainer']")));
//				driver.findElement(By.xpath("//div[@class='SubmitButton-IconContainer']")).click();

				driver.findElement(By.xpath("//a[normalize-space()='Finance & Billing']")).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("View Invoice")));
				driver.findElement(By.linkText("View Invoice")).click();

	 }


}
