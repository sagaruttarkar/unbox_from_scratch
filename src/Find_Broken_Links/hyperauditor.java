package Find_Broken_Links;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class hyperauditor {

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
		driver.get("https://hypeauditor.com/login/");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		driver.findElement(By.id("email")).sendKeys("vinay@unboxsocial.com");
		driver.findElement(By.name("password")).sendKeys("9833290227@");
		driver.findElement(By.xpath("//*[@id=\"login-form-wrap\"]/form[1]/button")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/main/div[2]/div[1]/i"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/main/aside/div/nav[1]/a[2]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='discovery-active-filters']//div[1]//button[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='discovery-active-filters']//div[1]//button[1]")).click();
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button items-center discovery-search-btns-filters --size-md --type-ghost-orange --icon']"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//h4[@data-key='is_personal'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='discovery-filter --unavailable --with-separator']//div[@class='radio__item'][normalize-space()='Personal']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div[4]/div[2]/div/div/div[1]/div[1]/div[6]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div[4]/div[2]/div/div/div[1]/div[1]/div[6]/div[2]/div/div/div[1]/div[2]/input")).sendKeys("usa");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div[4]/div[2]/div/div/div[1]/div[1]/div[6]/div[2]/div/div/div[1]/div[3]/ul/li[2]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div[4]/div[2]/div/div/div[1]/div[1]/div[6]/div[2]/div/div/div[1]/div[2]/input")).sendKeys("canada");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div[4]/div[2]/div/div/div[1]/div[1]/div[6]/div[2]/div/div/div[1]/div[3]/ul/li[2]/span")).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/main/div/div/div/div[4]/div[2]/div/div/div[2]/button[1]"))).click();
		System.out.println("testing");



		do {


		 System.out.println("pagination exists");

			String data= driver.findElement(By.xpath("//div[@class='table-wrapper']")).getText();
			Thread.sleep(5000);
			System.out.println(data);
			((JavascriptExecutor) driver)
		     .executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(8000);
			WebElement element = driver.findElement(By.xpath("(//button[@class='pager__button --left'])[2]"));

			Actions actions = new Actions(driver);

			actions.moveToElement(element).click().perform();



	 }while(driver.findElement(By.xpath("(//button[@class='pager__button --left'])[2]")).isDisplayed());

}

     }




