package Testcases_PaymentGatway;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Testcases_paymentgatway_Yearly {
WebDriver driver;

@Test
public void Yearly_Unbox_pro() throws Exception {
	System.setProperty("webdriver.chrome.driver","Drivers//chromedriver_v94.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.unboxsocial.com/pricing");
	           JavascriptExecutor js = (JavascriptExecutor) driver;
	             WebDriverWait wait = new WebDriverWait(driver,80);
//				driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/ul[1]/li[1]/a")).click();
//				Thread.sleep(2000);
//				WebElement Element = driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[2]/div[1]/h4/a"));
//				js.executeScript("arguments[0].scrollIntoView();", Element);
//				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='newdesktopEmail2']")));
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//*[@id=\"newdesktopEmail2\"]")).sendKeys("sagar.uttarkar132323@unboxsocial.com");
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//*[@id=\"getstartedDesktop2\"]")).isEnabled();
//				driver.findElement(By.xpath("//*[@id=\"getstartedDesktop2\"]")).click();
//				Thread.sleep(5000);
				// for yearly payment
				driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/span[1]/span[2]/label")).isEnabled();
				driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/span[1]/span[2]/label")).click();
				Thread.sleep(2000);
				js.executeScript("window.scrollBy(0,350)");
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div[2]/div/div[3]/div/button")));
				Thread.sleep(5000);
				 driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div[3]/div/button")).click();
				 Thread.sleep(5000);
				 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first_name")));
				//Form

				driver.findElement(By.id("first_name")).sendKeys("sagar");
				driver.findElement(By.id("last_name")).sendKeys("uttarkar");
				Random random = new Random();
				String unique_email = "sagar"+random.nextInt()+"@unboxsocial.com";
				driver.findElement(By.id("signup_email")).sendKeys(unique_email);
				System.out.println(unique_email);
				Thread.sleep(2000);
				driver.findElement(By.id("phone_number")).sendKeys("8898230133");
				driver.findElement(By.id("password")).sendKeys("Sagar@123");
				driver.findElement(By.id("reenter_password")).sendKeys("Sagar@123");
				Thread.sleep(2000);
				driver.findElement(By.id("next_payNow")).click();
				Thread.sleep(5000);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cardNumber")));
				driver.findElement(By.id("cardNumber")).sendKeys("4242 4242 4242 4242");
				driver.findElement(By.id("cardExpiry")).sendKeys("0223");
				driver.findElement(By.id("cardCvc")).sendKeys("123");
				driver.findElement(By.id("billingName")).sendKeys("sagar uttarkar");
                 Thread.sleep(2000);
				driver.findElement(By.id("billingAddressLine1")).sendKeys("Test1test");
				driver.findElement(By.id("billingAddressLine2")).sendKeys("Test1test");
				 Thread.sleep(2000);
				 driver.findElement(By.id("billingLocality")).sendKeys("Test1test");
					driver.findElement(By.id("billingPostalCode")).sendKeys("66891");
					 Thread.sleep(2000);
					 Select dropdown = new Select(driver.findElement(By.id("billingAdministrativeArea")));
					 dropdown.selectByIndex(1);
                      Thread.sleep(2000);
					 WebElement element =driver.findElement(By.xpath("//button[@type='submit']"));
	                    JavascriptExecutor executor = (JavascriptExecutor) driver;
	                    executor.executeScript("arguments[0].scrollIntoView(true);", element);
	                    element.click();
                    Thread.sleep(5000);
                ///On boarding
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"step-1\"]/div[1]/h5")));
                driver.findElement(By.id("first_name")).sendKeys("Testing group");
				driver.findElement(By.id("onboardingNext")).click();
				Thread.sleep(2000);
				driver.findElement( By.id("skip-2")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("skip-3")).click();
				driver.close();

								}
}