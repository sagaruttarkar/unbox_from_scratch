package Find_Broken_Links;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ForgetPassword {
	WebDriver driver;
	@BeforeMethod
	public void Setup() {
		

		System.setProperty("webdriver.chrome.driver","Drivers//chromedriver_91v.exe");
		
//	System.setProperty("webdriver.gecko.driver","C:\\Users\\acer\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		
		
          driver= new ChromeDriver(options);
		
//		
		//Maximize the browser
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://app.unboxsocial.com/");
       	
	}
	
	@Test
	public void To_check_Forgetpassword() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"forgot-pwd\"]")).click();
		Thread.sleep(2000);
		driver.getCurrentUrl();
		String str=driver.findElement(By.xpath("//*[@id=\"loginCard\"]/div[2]/h3")).getText();
	     System.out.println(str);
	     Thread.sleep(3000);
	   driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]/input")).sendKeys("sagar.uttarkar@unboxsocial.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[3]/div[2]/button/div")).click();
		String msg = driver.findElement(By.id("Email-sent")).getText();
		System.out.println(msg);
		driver.close();
		
		
		
	}

}
