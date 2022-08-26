package Find_Broken_Links;

import java.io.File;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class upinfluencer_data_scrap {


	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Drivers//chromedriver_v94.exe");
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File("D:\\BitBucket-jenkins2\\UNBOX_FINAL\\unbox_scratch_sagar\\src\\app.crx")); //adding
        WebDriver driver =new ChromeDriver(options);



		WebDriverWait wait = new WebDriverWait(driver, 1200);
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");


		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		 options.setPageLoadStrategy(PageLoadStrategy.NONE);
//	     driver = new ChromeDriver();
//		options.addArguments("--incognito");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("sagar.uttarkar@unboxsocial.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sagar@12345");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();

	driver.get("https://www.instagram.com/accounts/login/");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")));
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")).sendKeys("sagar.unboxtest@gmail.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")));
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")).sendKeys("sagar@123");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter handlename");
		    String handlename = myObj.nextLine();
		    Actions action = new Actions(driver); action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform(); //opening the URL saved.
		    driver.get("https://www.instagram.com/"+handlename);
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//button[@id='upf-viewstats']")).isEnabled();
		    driver.findElement(By.xpath("//button[@id='upf-viewstats']")).click();
		    Thread.sleep(4000);
		   	driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div/span/div[1]")).isEnabled();
		    driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div/span/div[1]")).click();
		    String Data=driver.findElement(By.className("ember-view")).getText();
		    System.out.println(handlename+Data);


}}
