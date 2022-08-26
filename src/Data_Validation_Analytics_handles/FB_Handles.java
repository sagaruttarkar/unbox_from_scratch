package Data_Validation_Analytics_handles;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class FB_Handles {


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
			driver.get("http://app.unboxsocial.com/");
			driver.findElement(By.id("email")).sendKeys("sagar.uttarkar@unboxsocial.com");
			driver.findElement(By.id("pwd")).sendKeys("123456");
			driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/ul[1]/li[3]/a[1]")).click();
	}


	@Test(priority=0,dataProvider="handles")
	public void FB_Handles1(String handlename) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,6000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]")));
       Thread.sleep(2000);
       driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[1]/div[2]/span/img")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[1]/div[2]/span/input")).sendKeys(handlename);
       Thread.sleep(5000);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@class='social-profile-platform-icon'])[5]")));
         WebElement temp = driver.findElement(By.xpath("(//img[@class='social-profile-platform-icon'])[5]"));
         temp.click();
        Thread.sleep(5000);
        driver.findElement(By.id("link_for_84")).click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,650)");
        Thread.sleep(8000);
        System.out.println("********NO OF POST**********");
        String fn= driver.findElement(By.id("total_posts")).getText();
        System.out.println(handlename+"...."+fn);


	}


	@DataProvider(name="handles")
	public Object[][] passdata(){

		Object[][] data= new Object[116][1];

		data[0][0]="lazyclasssy";
		data[1][0]="Allin HK";
		data[2][0]="lazyclasssy";
		data[3][0]="Advance Resources";
		data[4][0]="Bob Feist Invitational";
		data[5][0]="Aurai HK";
		data[6][0]="Thevelvetvanity";
		data[7][0]="And She Could Be Next";
		data[8][0]="The Essential Campaign";
		data[9][0]="Lazy E Arena";
		data[10][0]="Vlad Gheorghe";
		data[11][0]="Society for Redox Biology & Medicine";
		data[12][0]="Jak na web";
		data[13][0]="Bergsmith";
		data[14][0]="K24 TV";
		data[15][0]="Khaled Abu Zaid Photography";
		data[16][0]="meatybros";
		data[17][0]="Quesos Petacones";
		data[18][0]="Little Caesars El Salvador";
		data[19][0]="Free to choose right";
		data[20][0]="Schick Israel";
		data[21][0]="embryolisse_il";
		data[22][0]="Oatly";
		data[23][0]="Sisley Paris";
		data[24][0]="AOPA: your freedom to fly";
		data[25][0]="BILL BROWN FORD";
		data[26][0]="SOFTHOUSE RESEARCH & PROGRAMMING.";
		data[27][0]="Treecard";
		data[28][0]="Kids' Healthy Mouths";
		data[29][0]="Hope Philippines Church";
		data[30][0]="Dental Trade Alliance Foundation";
		data[31][0]="Basicallymenz by SR";
		data[32][0]="Polycab India Limited";
		data[33][0]="Deblina Rababi";
		data[34][0]="Tad Too Trendy";
		data[35][0]="Megna Mukherjee";
		data[36][0]="Unbox";
		data[37][0]="Upendo Golf KENYA";
		data[38][0]="GO FIRST";
		data[39][0]="Social Media Analytics";
		data[40][0]="Raskik";
		data[41][0]="Momocrafting";
		data[42][0]="Funky Buddha Brewery";
		data[43][0]="Kao Salon Division";
		data[44][0]="Funky Buddha Tap Room";
		data[45][0]="Paintly - Avatar Creator Art Maker & Coloring Book";
		data[46][0]="HushHush by Buzzr";
		data[47][0]="Compartamos Financiera";
		data[48][0]="Local Hero";
		data[49][0]="DeFi Crown";
		data[50][0]="Individual Cabinet de Parfums";
		data[51][0]="Swagitupsite";
		data[52][0]="The_shorty_doowop";
		data[53][0]="Sanika V";
		data[54][0]="Arabellastyling";
		data[55][0]="Clover Zambia";
		data[56][0]="Light Pong";
		data[57][0]="TheBeautitude";
		data[58][0]="Attica Springboks Rugby Footbal Club";
		data[59][0]="Mette Willert";
		data[60][0]="Miss.prianca";
		data[61][0]="iPhone 4S";
		data[62][0]="We Won't Wait";
		data[63][0]="Borough Market";
		data[64][0]="Joga Singh";
		data[65][0]="Fireside Tattoo";
		data[66][0]="Bantu Jualan";
		data[67][0]="Green Party of England and Wales";
		data[68][0]="Nitin Tours & Travels";
		data[69][0]="Finta";
		data[70][0]="BIG Drinks";
		data[71][0]="CUN - Corporación Unificada Nacional de Educación Superior";
		data[72][0]="AARMY";
		data[73][0]="Yummy Snack Foods";
		data[74][0]="xeberz.net";
		data[75][0]="Equinety";
		data[76][0]="NUERO-ads";
		data[77][0]="Audacious Church";
		data[78][0]="Codan Forsikring A/S";
		data[79][0]="NXTmine";
		data[80][0]="Game of Silks";
		data[81][0]="gigkigk";
		data[82][0]="Babyjoy Diapers";
		data[83][0]="Matterhorn Fit";
		data[84][0]="Autonics Global";
		data[85][0]="Experience Shelbyville";
		data[86][0]="Kommune";
		data[87][0]="Visit Manchester TN";
		data[88][0]="Museum of Solutions";
		data[89][0]="Suomen Cheerleadingliitto - SCL";
		data[90][0]="Pulp Brew";
		data[91][0]="École supérieure de ballet du Québec";
		data[92][0]="Fanzia";
		data[93][0]="Riverside University Health System - Behavioral Health";
		data[94][0]="Cream Family Wines";
		data[95][0]="Adelady";
		data[96][0]="Harbour Town Adelaide";
		data[97][0]="The Digital Work";
		data[98][0]="Vintage Braided Wigs";
		data[99][0]="Vintage Salon Port Harcourt";
		data[100][0]="Montcrest Hotel & Lounge";
		data[101][0]="Van der Sande Makelaars - regio Breda";
		data[102][0]="Ducati Singapore";
		data[103][0]="Reliance Digital";
		data[104][0]="HT Pune";
		data[105][0]="Red Bull BC One";
		data[106][0]="Red Bull";
		data[107][0]="Ankesh";
		data[108][0]="Hindustan Times Cricket";
		data[109][0]="Hindustan Times Kolkata";










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
