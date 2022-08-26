package Find_Broken_Links;

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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.Testutils;

public class instagram_story_saving {

	WebDriver driver;
	@BeforeMethod
	public void setup() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver","Drivers//chromedriver_v94.exe");
//			WebDriver driver =new ChromeDriver();

			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
			ChromeOptions options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NONE);
		     driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Testutils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(Testutils.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.get("http://app.unboxsocial.com/");
			driver.findElement(By.id("email")).sendKeys("sagar.uttarkar@unboxsocial.com");
			driver.findElement(By.id("pwd")).sendKeys("123456");
			driver.findElement(By.xpath("//*[@id=\"login\"]")).click();


	}
	@Test(priority=0,dataProvider="brands")
public void Instagram_story_save(String brand) throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, 1200);
	 Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"main-menu-wrapper\"]/ul/li[3]/a")).click();
	Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='add-account']")));
	Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@class='list-search-icon search-anywhere-in-page']")).click();
	driver.findElement(By.xpath("//input[@name='serach-post']"))
			.sendKeys(brand);
	Thread.sleep(5000);
    driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/div/div/div[3]/h6/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("link_for_32")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"globalrange_analytics\"]/img")).click();// cal click
	Thread.sleep(2000);

	driver.findElement(By.cssSelector("li[data-range-key='Custom Range']")).click();
	Thread.sleep(2000);
	Thread.sleep(2000);
	driver.findElement(By.name("daterangepicker_start")).clear();
	Thread.sleep(2000);
	driver.findElement(By.name("daterangepicker_start")).sendKeys("15042022");
	Thread.sleep(2000);
	driver.findElement(By.name("daterangepicker_end")).clear();
	Thread.sleep(5000);
	driver.findElement(By.name("daterangepicker_end")).sendKeys("11052022");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[12]/div[3]/div/button[1]")).click();
	Thread.sleep(5000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,750)");
	Thread.sleep(5000);


	System.out.println("**** Thae brand is >>>> >>>>  "+brand);

	List<WebElement>list=driver.findElements(By.className("story-img-holder-outer"));

	System.out.println("Total links are ????"+list.size());
	for(WebElement e : list){
	WebElement str=(e.findElement(By.tagName("img")));
	System.out.println(str.getAttribute("src"));



	}
	}










@DataProvider(name="brands")
public Object[][] passdata(){
	//here is first is row nd then col

	Object[][] data= new Object[73][1];

	data[0][0]="Meredith Jacqueline";
	data[1][0]="Van der Sande Makelaars";
	data[2][0]="Misen";
	data[3][0]="Barilla Israel";
	data[4][0]="khaled abu zaid";
	data[5][0]="Soho Myriad";
	data[6][0]="FRESH | A Detail Company";
	data[7][0]="RENOVA BMW";
	data[8][0]="Assembly Computer Festival";
	data[9][0]="Individual- Cabinet De Perfums";
	data[10][0]="Fireside Tattoo Network";
	data[11][0]="Namikka";
	data[12][0]="Youlry Designs";
	data[13][0]="Cream Family Wines";
	data[14][0]="Funky Buddha Tap Room";
	data[15][0]="BIG Drinks";
	data[15][0]="Bugaboo ® Benelux";
	data[16][0]="Classparty";
	data[17][0]="Treecard";
	data[18][0]="Engage Education Ireland";
	data[19][0]="Balloons ?????";
	data[21][0]="Engage Australia";
	data[20][0]="Engage Education Canada";
	data[23][0]="The Truffles Trail";
	data[24][0]="Assembly";
	data[21][0]="Nikki Geddes | Franchisor";
	data[22][0]="AARMY";
	data[23][0]="Funky Buddha Brewery";
	data[28][0]="Kommune";
	data[24][0]="AOPA";
	data[25][0]="Corporacio?n U. Nacional";
	data[26][0]="DeFi Crown";
	data[32][0]="Sage Goddess";
	data[27][0]="K24 Tv";
	data[28][0]="Lakme?";
	data[29][0]="Sonam Kapoor Ahuja";
	data[30][0]="Kao Salon Division";
	data[31][0]="Spoken Fest";
	data[32][0]="Carlos Vazquez";
	data[33][0]="NPNA";
	data[34][0]="Green Party of England & Wales";
	data[35][0]="Canine Arthritis Management";
	data[36][0]="!Audacious Church";
	data[37][0]="Quesos Petacones";
	data[38][0]="Verada Wines";
	data[39][0]="WMS Tax & Advisory";
	data[40][0]="Bantu Jualan";
	data[41][0]="Casablanca";
	data[42][0]="PinkBardot";
	data[43][0]="SEE.MAS";
	data[44][0]="Nikki Geddes - Franchisor";
	data[45][0]="Telia Esports Series Nordic";
	data[46][0]="Geekworkers | Agence Digital";
	data[47][0]="Paidia Gaming";
	data[48][0]="Recyclage Market";
	data[49][0]="Billd";
	data[50][0]="Light Pong™";
	data[51][0]="FANZIA | Rewarding Fans";
	data[52][0]="Richardson Murray Family Law";
	data[53][0]="momocrafting";
	data[54][0]="L'Elue Collectif";
	data[55][0]="The Dry Goods Beverage Company";
	data[56][0]="SEVN Studios";
	data[57][0]="Leo The Label";
	data[58][0]="Finta";
	data[59][0]="Regina Phalange";
	data[60][0]="Dr. Lewis Clarke M.D., PhD.";
	data[61][0]="Studant";
	data[62][0]="Engage Construction";
	data[63][0]="Ready To Stay";
	data[64][0]="sinfully peaceful";
	data[65][0]="Pera Labs";
	data[66][0]="isoroom";
	data[67][0]="Scene Lounge";
	data[68][0]="Commando Energy Drink";
	data[69][0]="Recyclage Express";
	data[70][0]="NSLL Business Center";
	data[71][0]="Ben & Aaron | Sell On Insta";
	data[72][0]="Una Lutin";


	return data;

}

@AfterMethod
public void teardown() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[3]/div[1]/div")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/a")).click();
	driver.close();

}



}