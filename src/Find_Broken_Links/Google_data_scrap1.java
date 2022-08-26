
package Find_Broken_Links;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Google_data_scrap1  {


	WebDriver driver;
	@BeforeMethod
	public void setup() throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver","Drivers//chromedriver_v94.exe");
		System.out.println("reached");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");

       options.addArguments("--enable-features=ReaderMode");
       driver= new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();






	}

		@Test(priority=0,dataProvider="urls")

		public void Testcases_google(String url) throws InterruptedException, AWTException {
         driver.get(url);
         Thread.sleep(2000);
         WebElement l =driver.findElement(By.tagName("body"));
		 String data1= l.getText();
		 String[] parts= data1.split(" ");






	     String[] arr = {"scandal","abuse","drugs","fraud","crime","criminal","porn","paedoph","sex","violence","gun","guns","racist","nazi","activist","scam","drugaddict","illegal","politics","hitler","political","nude","naked","rape","harrassment","racism","racist","slavery","terrorist","terrorism","riot","actingup","boycott","crueltyfree","animaltesting","peta","isis","nigger","nigga","drug","druguse","druguser","murder","homocide","jail","paedophil","hate","hatespeech","suicide","pervert","islamophobia","antisemitism","whiteprivilege","slave","slavelabour","childlabour","revenge","abuser","detention","metoo","blacklivesmatter","alllivesmatter","skinlightening","skinwhitening","racism","genocide","migrant","asylumseek","asylumseeker","kukluxklan","kkk","holocaust","sharia","scientology","islamism","islamist","extremism","alqaeda","daesh","humanrightsviolation","extremist"};

	     for(int i=0; i<parts.length;i++)

	     {
	     for(int i1 =0; i1<arr. length;i1++) {
			if(parts[i].equals(arr[i1])) {

				System.out.println(url+";"+arr[i1]);



	}}
	     }



		}












				@DataProvider(name="urls")
				public Object[][] passdata(){
					//here is first is row nd then col

					Object[][] data= new Object[14][1];
					data[0][0]="https://www.imdb.com/name/nm7775934/";
					data[1][0]="https://www.hindustantimes.com/entertainment/bollywood/alaya-f-says-her-first-meeting-with-a-filmmaker-lasted-1-5-minutes-even-though-i-m-considered-a-product-of-nepotism-101645183044824.html";
					data[2][0]="https://indianexpress.com/article/lifestyle/art-and-culture/alaya-f-artwork-sketch-conscious-subconscious-7721394/";
					data[3][0]="https://zeenews.india.com/tags/alaya-f.html";
					data[4][0]="https://www.freepressjournal.in/bollywood/alaya-f-sets-the-internet-ablaze-with-her-stunning-photos";
					data[5][0]="https://www.news18.com/topics/alaya-f/";
					data[6][0]="https://m.imdb.com/name/nm5249562/filmotype/actress";
					data[7][0]="https://www.indiaglitz.com/tamil-actress-pooja-hegde-photos-6526";
					data[8][0]="https://www.greatandhra.com/topic/pooja-hegde";
					data[9][0]="https://www.hindustantimes.com/entertainment/bollywood/pooja-hegde-complains-about-indigo-airline-staff-s-threatening-tone-on-twitter-101654784785539.html";
					data[10][0]="https://www.ndtv.com/india-news/pooja-hegde-was-extremely-sad-after-indigo-flight-heres-why-3053368";
					data[11][0]="https://www.indiatoday.in/movies/regional-cinema/story/pooja-hegde-tweets-about-rude-indigo-staff-member-s-threatening-tone-airline-responds-1960470-2022-06-09";
					data[12][0]="https://www.abplive.com/business/pooja-hegde-slams-airline-for-staff-rude-behavior-arrogant-ignorant-threatening-tone-used-with-us-2142641";
					data[13][0]="https://www.livemint.com/news/india/pooja-hegde-indigo-row-india-s-largest-airline-grabs-headlines-for-wrong-reasons-again-11654841497625.html";
				
				
				return data;


}
				@AfterMethod
				public void teardown() throws InterruptedException {
					driver.quit();

				}
}