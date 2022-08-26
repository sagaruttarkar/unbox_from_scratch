package Trial_Accounts;


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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.Testutils;
;

public class Analytics_Instagram_Trial_Accounts  {

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
			driver.findElement(By.id("email")).sendKeys("infltrack@test.com");
			driver.findElement(By.id("pwd")).sendKeys("123456");
			driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
			Thread.sleep(2000);
	}


//	@Test(priority=0,dataProvider="handles")
//	public void Testcase_verify_Matrics_instagram_clients_account(String handlename) throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 180);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		System.out.println("Anyalytics_module_instagram");
//			driver.findElement(By.xpath("//*[@id=\"main-menu-wrapper\"]/ul/li[3]/a")).click();
//			Thread.sleep(3000);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]")));
//			driver.findElement(By.xpath("//img[@class='list-search-icon search-anywhere-in-page']")).click();
//			driver.findElement(By.xpath("//input[@name='serach-post']")).sendKeys(handlename);
//			Thread.sleep(5000);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/h6[1]/a[1]")));
//			driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/h6[1]/a[1]")).click();
//
////			Thread.sleep(2000);
////			driver.findElement(By.xpath("//*[@id=\"globalrange_analytics\"]/img")).click();
////			Thread.sleep(2000);
////
////			driver.findElement(By.xpath("/html/body/div[6]/div[3]/ul/li[6]")).click();
//
//		//insight tab
//
//		System.out.println("************influencer_insight**********");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("influencerinsights")));
//		Boolean card = driver.findElement(By.id("influencerinsights")).isDisplayed();
//		String  carddetails = driver.findElement(By.id("influencerinsights")).getText();
//
//		if(card == true) {
//		System.out.println("Data loaded properly");
//		System.out.println(carddetails);
//		}
//		else {
//
//		System.out.println("Data not loaded properly");
//
//
//		}
//		//Engagement Rate (by Followers)
//		System.out.println("***Engagement Rate (by Followers) *****");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("engagementRate")));
//		Boolean ER = driver.findElement(By.id("engagementRate")).isDisplayed();
//		String  ER1 = driver.findElement(By.id("engagementRate")).getText();
//
//		if(ER == true) {
//		System.out.println("Data loaded properly");
//		System.out.println(ER1);
//
//
//		}
//		else {
//
//		System.out.println("Data not loaded properly");
//
//		}
//
//		//Engagement Rate (by Reach)
//
//		System.out.println("***Engagement Rate (by Reach) *****");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("engagementRateByReach")));
//		Boolean ERR = driver.findElement(By.id("engagementRateByReach")).isDisplayed();
//		String  ERR1 = driver.findElement(By.id("engagementRateByReach")).getText();
//
//		if(ERR == true) {
//		System.out.println("Data loaded properly");
//		System.out.println(ERR1);
//
//
//		}
//		else {
//
//		System.out.println("Data not loaded properly");
//
//		}
//		//follower_growth
//		System.out.println("***/follower_growth *****");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("follower_growth")));
//		Boolean follower_g = driver.findElement(By.id("follower_growth")).isDisplayed();
//		String  follower_g1 = driver.findElement(By.id("follower_growth")).getText();
//
//		if(follower_g == true) {
//		System.out.println("Data loaded properly");
//		System.out.println(follower_g1);
//
//
//		}
//		else {
//
//		System.out.println("Data not loaded properly");
//
//		}
//
//		System.out.println("***Impressions & Reach *****");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("impressions")));
//		Boolean imp_nd_reach = driver.findElement(By.id("impressions")).isDisplayed();
//		String  imp_nd_reach1 = driver.findElement(By.id("impressions")).getText();
//
//		if(imp_nd_reach == true) {
//		System.out.println("Data loaded properly");
//		System.out.println(imp_nd_reach1);
//
//
//		}
//		else {
//
//		System.out.println("Data not loaded properly");
//
//		}
//
//		js.executeScript("window.scrollBy(0,650)");
//		Thread.sleep(5000);
//		System.out.println("************No. of Posts************");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("totalPosts")));
//		Boolean no_post = driver.findElement(By.id("totalPosts")).isDisplayed();
//		String  no_post1 = driver.findElement(By.id("totalPosts")).getText();
//
//		if(no_post == true) {
//		System.out.println("Data loaded properly");
//		System.out.println(no_post1);
//
//
//		}
//		else {
//
//		System.out.println("Data not loaded properly");
//
//
//		}
//		//Average Engagement Per Content Form (by Followers)
//		System.out.println("************Average Engagement Per Content Form (by Followers)************");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("catER")));
//		Boolean ER_follower = driver.findElement(By.id("catER")).isDisplayed();
//		String  ER_follower1 = driver.findElement(By.id("catER")).getText();
//
//		if(ER_follower == true) {
//		System.out.println("Data loaded properly");
//		System.out.println(ER_follower1);
//
//
//		}
//		else {
//
//		System.out.println("Data not loaded properly");
//
//
//		}
//		//Average Engagement Per Content Form (by Reach
//
//
//		System.out.println("************Average Engagement Per Content Form (by Reach)************");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("engagement_by_reach")));
//		Boolean ER_follower_reach = driver.findElement(By.id("engagement_by_reach")).isDisplayed();
//		String  ER_follower_reach1 = driver.findElement(By.id("engagement_by_reach")).getText();
//
//		if(ER_follower_reach == true) {
//		System.out.println("Data loaded properly");
//		System.out.println(ER_follower_reach1);
//
//
//		}
//		else {
//
//		System.out.println("Data not loaded properly");
//
//
//		}
//		Thread.sleep(5000);
//		js.executeScript("window.scrollBy(0,650)");
//		//Best time to Post
//
//		System.out.println("************Best time to Post ************");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("bestTimeToPostContainer")));
//		Boolean best_time_post = driver.findElement(By.id("bestTimeToPostContainer")).isDisplayed();
//		String  best_time_post1 = driver.findElement(By.id("bestTimeToPostContainer")).getText();
//
//		if(best_time_post == true) {
//		System.out.println("Data loaded properly");
//		System.out.println(best_time_post1);
//
//
//		}
//		else {
//
//		System.out.println("Data not loaded properly");
//
//
//		}
//		//Online Followers
//
//		System.out.println("************Online Followers ***********");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("online_followers")));
//		Boolean ol_follower = driver.findElement(By.id("online_followers")).isDisplayed();
//		String  ol_follower1 = driver.findElement(By.id("online_followers")).getText();
//
//		if(ol_follower == true) {
//		System.out.println("Data loaded properly");
//		System.out.println(ol_follower1);
//
//
//		}
//		else {
//
//		System.out.println("Data not loaded properly");
//
//
//		}
//
//		js.executeScript("window.scrollBy(0,650)");
//		//Website & Email Clicks
//
//
//		System.out.println("************Website & Email Clicks***********");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("website_clicks")));
//		Boolean website_click = driver.findElement(By.id("website_clicks")).isDisplayed();
//		String  website_click1 = driver.findElement(By.id("website_clicks")).getText();
//
//		if(website_click == true) {
//		System.out.println("Data loaded properly");
//		System.out.println(website_click1);
//
//
//		}
//		else {
//
//		System.out.println("Data not loaded properly");
//
//
//		}
//
//
//		System.out.println("************Profile Views **********");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("profile_views")));
//		Boolean profile_review = driver.findElement(By.id("profile_views")).isDisplayed();
//		String  profile_review1 = driver.findElement(By.id("profile_views")).getText();
//
//		if(profile_review == true) {
//		System.out.println("Data loaded properly");
//		System.out.println(profile_review1);
//
//
//		}
//		else {
//
//		System.out.println("Data not loaded properly");
//
//
//		}
//
//
//		Thread.sleep(5000);
//		js.executeScript("window.scrollBy(0,650)");
//		///Recommended posts to promote
//
//		System.out.println("*****Recommended posts to promote ***********");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("topPostByEngagementTabs")));
//		Boolean top_post = driver.findElement(By.id("topPostByEngagementTabs")).isDisplayed();
//		String  top_post1 = driver.findElement(By.id("topPostByEngagementTabs")).getText();
//
//		if(top_post == true) {
//		System.out.println("Data loaded properly");
//		System.out.println(top_post1);
//
//
//		}
//		else {
//
//		System.out.println("Data not loaded properly");
//		}
//		Thread.sleep(5000);
//		js.executeScript("window.scrollBy(0,250)");
//		//TOP Hastag
//		System.out.println("********* TOP HASTAG***************");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tophastag")));
//		Boolean top_Hashtag = driver.findElement(By.id("tophastag")).isDisplayed();
//		String  top_Hashtag1 = driver.findElement(By.id("tophastag")).getText();
//
//		if(top_Hashtag == true) {
//		System.out.println("Data loaded properly");
//		System.out.println(top_Hashtag1);
//
//
//		}
//		else {
//
//		System.out.println("Data not loaded properly");
//		}
//		// performance of stories by content format
//		System.out.println("********* performance of stories by content format***************");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("performance_content")));
//		Boolean stories_format = driver.findElement(By.id("performance_content")).isDisplayed();
//		String  stories_format1 = driver.findElement(By.id("performance_content")).getText();
//
//		if(stories_format == true) {
//		System.out.println("Data loaded properly");
//		System.out.println(stories_format1);
//
//
//		}
//		else {
//
//		System.out.println("Data not loaded properly");
//		}
//
//
//		// AUDIENCE TAB
//		Thread.sleep(3000);
//		((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
//		Thread.sleep(5000);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("link_for_29")));
//		driver.findElement(By.id("link_for_29")).click();
//
//		//Gender Split
//		Thread.sleep(5000);
//		System.out.println("*****Gender Split ***********");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("genderSplit")));
//		Boolean gender_split = driver.findElement(By.id("genderSplit")).isDisplayed();
//		String  gender_split1 = driver.findElement(By.id("genderSplit")).getText();
//
//		if(gender_split == true) {
//		System.out.println("Data loaded properly");
//		System.out.println(gender_split1);
//
//
//		}
//		else {
//
//		System.out.println("Data not loaded properly");
//		}
//
//		System.out.println("*****Age and Gender Split***********");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ageGender")));
//		Boolean age_gender = driver.findElement(By.id("ageGender")).isDisplayed();
//		String  age_gender1 = driver.findElement(By.id("ageGender")).getText();
//
//		if(age_gender == true) {
//		System.out.println("Data loaded properly");
//		System.out.println(age_gender1);
//
//
//		}
//		else {
//
//		System.out.println("Data not loaded properly");
//		}
//
//		js.executeScript("window.scrollBy(0,650)");
//		Thread.sleep(5000);
//
//		///Audience Interest
//
//		System.out.println("*****Audience Interest***********");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("audienceInterest")));
//		Boolean audience_intrest = driver.findElement(By.id("audienceInterest")).isDisplayed();
//		String  audience_intrest1 = driver.findElement(By.id("audienceInterest")).getText();
//
//		if(audience_intrest == true) {
//		System.out.println("Data loaded properly");
//		System.out.println(audience_intrest1);
//
//
//		}
//		else {
//
//		System.out.println("Data not loaded properly");
//		}
//
//
//		js.executeScript("window.scrollBy(0,650)");
//		Thread.sleep(5000);
//		///location spread
//
//		System.out.println("*****location spread***********");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("worldSpread")));
//		Boolean Loc_spread = driver.findElement(By.id("worldSpread")).isDisplayed();
//		String  Loc_spread1 = driver.findElement(By.id("worldSpread")).getText();
//
//		if(Loc_spread == true) {
//		System.out.println("Data loaded properly");
//		System.out.println(Loc_spread1);
//
//
//		}
//		else {
//
//		System.out.println("Data not loaded properly");
//		}
//
//
//		//Audience Quality
//
//		System.out.println("*****Audience Quality ***********");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("activePassive")));
//		Boolean act_quality = driver.findElement(By.id("activePassive")).isDisplayed();
//		String  act_quality1 = driver.findElement(By.id("activePassive")).getText();
//
//		if(act_quality == true) {
//		System.out.println("Data loaded properly");
//		System.out.println(act_quality1);
//
//
//		}
//		else {
//
//		System.out.println("Data not loaded properly");
//		}
//
//		js.executeScript("window.scrollBy(0,650)");
//		Thread.sleep(5000);
//
//
//		///Content themes Brands have been talking about
//
//		System.out.println("*****Content themes Brands have been talking about ***********");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("talkingAbout")));
//		Boolean talking_abt = driver.findElement(By.id("talkingAbout")).isDisplayed();
//		String  talking_abt1 = driver.findElement(By.id("talkingAbout")).getText();
//
//		if(talking_abt == true) {
//		System.out.println("Data loaded properly");
//		System.out.println(talking_abt1);
//
//
//		}
//		else {
//
//		System.out.println("Data not loaded properly");
//		}
//
//		js.executeScript("window.scrollBy(0,650)");
//		Thread.sleep(5000);
//
//		//Audience sentiment
//		System.out.println("************Audience sentiment************");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sentimentSplit")));
//		Boolean sentiments = driver.findElement(By.id("sentimentSplit")).isDisplayed();
//		String  sentiments1 = driver.findElement(By.id("sentimentSplit")).getText();
//
//		if(sentiments == true) {
//		System.out.println("Data loaded properly");
//		System.out.println(sentiments1);
//
//
//		}
//		else {
//
//		System.out.println("Data not loaded properly");
//
//
//		}
//
//		System.out.println("************Sentiment by Emoji************");
//
//		Boolean emoji = driver.findElement(By.id("emojiSentimentHolder")).isDisplayed();
//		String  emoji1 = driver.findElement(By.id("emojiSentimentHolder")).getText();
//
//		if(emoji == true) {
//		System.out.println("Data loaded properly");
//		System.out.println(emoji1);
//
//
//		}
//		else {
//
//		System.out.println("Data not loaded properly");
//
//
//		}
//
//		js.executeScript("window.scrollBy(0,650)");
//		Thread.sleep(5000);
//		//Interactions received on your content
//
//		System.out.println("*****Interactions received on your content***********");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("instaAudienceInterraction")));
//		Boolean instaaud = driver.findElement(By.id("instaAudienceInterraction")).isDisplayed();
//		String  instaaud1 = driver.findElement(By.id("instaAudienceInterraction")).getText();
//
//		if(instaaud == true) {
//		System.out.println("Data loaded properly");
//		System.out.println(instaaud1);
//
//
//		}
//		else {
//
//		System.out.println("Data not loaded properly");
//
//		}
//
//		js.executeScript("window.scrollBy(0,650)");
//		Thread.sleep(5000);
//
//		System.out.println("*****Mode of Interaction 2***********");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("modeOfInteractionChartimage")));
//		Boolean inter = driver.findElement(By.id("modeOfInteractionChartimage")).isDisplayed();
//		String  inter2 = driver.findElement(By.id("modeOfInteractionChartimage")).getText();
//
//		if(inter == true) {
//		System.out.println("Data loaded properly");
//		System.out.println(inter2);
//
//
//		}
//		else {
//
//		System.out.println("Data not loaded properly");
//
//
//		}
//		// post tab
//		Thread.sleep(5000);
//		((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
//		Thread.sleep(3000);
//		driver.findElement(By.id("link_for_31")).click();
//	  	Thread.sleep(8000);
//		String result=driver.findElement(By.id("postss")).getText();
//		System.out.println("result according to filtter"+result);
//
//
//		Thread.sleep(3000);
//		((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
//		Thread.sleep(3000);
//		driver.findElement(By.id("link_for_32")).click();
//
//		///Stories tab
//
//		System.out.println("****Stories tab***********");
//		Thread.sleep(3000);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fbStoriesTopPosts")));
//		Boolean top_stories = driver.findElement(By.id("fbStoriesTopPosts")).isDisplayed();
//		String  top_stories1 = driver.findElement(By.id("fbStoriesTopPosts")).getText();
//
//		if(top_stories == true) {
//		System.out.println("Data loaded properly");
//		System.out.println(top_stories1);
//
//
//		}
//		else {
//
//		System.out.println("Data not loaded properly");
//
//
//		}
//
//	}

//			}
//	@Test(priority=1)
//public void Delete_all_Accounts() throws InterruptedException {
//
//	WebDriverWait wait = new WebDriverWait(driver, 1200);
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	System.out.println("Anyalytics_module_instagram_Delete");
//		driver.findElement(By.xpath("//*[@id=\"main-menu-wrapper\"]/ul/li[3]/a")).click();
//		Thread.sleep(2000);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'col-md-12 grid-fit-screen-pages')]")));
//		Thread.sleep(5000);
//		List<WebElement> close = driver.findElements(By.tagName("i"));
//	for(int i=0;i<close.size();i++) {
//
//driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/div[1]/div/i")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("//button[normalize-space()='YES']")).click();
//Thread.sleep(4000);
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/div[1]/div/i")));
//
//
//	}
//
//
//	}
@Test
	public void get_handle_name() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 1200);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		System.out.println("Anyalytics_module_instagram_Delete");
			driver.findElement(By.xpath("//*[@id=\"main-menu-wrapper\"]/ul/li[3]/a")).click();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'col-md-12 grid-fit-screen-pages')]")));
			Thread.sleep(5000);
//			List<WebElement> name = driver.findElements(By.tagName("div"));
//			System.out.println(name.size());
//
//		for(int i=0;i<name.size();i++) {
//			List<WebElement>p=driver.findElements(By.tagName("div"));
//
//WebElement z=p.get(i);
//System.out.println(z.getText());
	String data = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]")).getText();
	System.out.println(data);
		}






	@DataProvider(name="handles")
	public Object[][] passdata(){

		Object[][] data= new Object[83][1];


		data[0][0]="Add Account";
		data[1][0]="Chasis Bank";
		data[2][0]="Ida Washing Powder";
		data[3][0]="Flick Prime Video";
		data[5][0]="Frye Music Festival";
		data[6][0]="Youlry Designs";
		data[7][0]="Funky Buddha Tap Room";
		data[8][0]="Cream Family Wines";
		data[9][0]="The Truffles Trail";
		data[10][0]="Treecard";
		data[11][0]="NIIC - New American Dreams";
		data[12][0]="Classparty";
		data[13][0]="BIG Drinks";
		data[14][0]="WMS Tax & Advisory";
		data[15][0]="Verada Wines";
		data[16][0]="Richardson Murray Family Law";
		data[17][0]="Vemaker";
		data[18][0]="momocrafting";
		data[19][0]="Askeed";
		data[20][0]="Assembly";
		data[21][0]="Barilla Israel";
		data[22][0]="Soho Myriad";
		data[23][0]="Van der Sande Makelaars";
		data[24][0]="Misen";
		data[25][0]="khaled abu zaid";
		data[26][0]="Nikki Geddes";
		data[27][0]="Montcrest Hotel";
		data[28][0]="Bugaboo ® Benelux";
		data[29][0]="Dr. Lewis Clarke M.D., PhD.";
		data[30][0]="Una Lutin";
		data[31][0]="Studant";
		data[32][0]="Pera Labs";
		data[33][0]="NSLL Business Center";
		data[34][0]="Ben & Aaron | Sell On Insta";
		data[35][0]="sinfully peaceful";
		data[36][0]="Casablanca";
		data[37][0]="Finta";
		data[38][0]="Bantu Jualan";
		data[39][0]="PinkBardot";
		data[40][0]="Ready To Stay";
		data[41][0]="isoroom";
		data[42][0]="Commando Energy Drink";
		data[43][0]="Ozti Kitchen";
		data[44][0]="SEVN Studios";
		data[45][0]="Recyclage Market";
		data[46][0]="The Dry Goods Beverage Company";
		data[47][0]="Light Pong™";
		data[48][0]="FANZIA | Rewarding Fans";
		data[49][0]="L'Elue Collectif";
		data[50][0]="Tango Boutique";
		data[51][0]="Kiddy Cook HQ";
		data[52][0]="Telia Esports Series Nordic";
		data[53][0]="Recyclage Express";
		data[54][0]="Scene Lounge";
		data[55][0]="Geekworkers | Agence Digital";
		data[56][0]="SEE.MAS";
		data[57][0]="Paidia Gaming";
		data[58][0]="Dijip Egitim ve Dan??manl?k";
		data[59][0]="Meredith Jacqueline";
		data[60][0]="Braided Wigs";
		data[61][0]="Corporacio?n U. Nacional";
		data[62][0]="Indus Consulting";
		data[63][0]="RUHS Behavioral Health";
		data[64][0]="AOPA";
		data[65][0]="Kao Salon Division";
		data[66][0]="Little Caesars El Salvador";
		data[67][0]="Green Party of England & Wales";
		data[68][0]="DeFi Crown";
		data[69][0]="Lakme?";
		data[70][0]="K24 Tv";
		data[71][0]="Sonam Kapoor Ahuja";
		data[72][0]="Funky Buddha Brewery";
		data[73][0]="AARMY";
		data[74][0]="Kommune";
		data[75][0]="Borough Market";
		data[76][0]="Canine Arthritis Management";
		data[77][0]="FRESH | A Detail Company";
		data[78][0]="RENOVA BMW";
		data[79][0]="Assembly Computer Festival";
		data[80][0]="BIG MO";
		data[81][0]="Individual- Cabinet De Perfums";
		data[82][0]="Namikka";
		data[83][0]="Fireside Tattoo Network";
		data[84][0]="NPNA";
		data[85][0]="Northern Gas and Power Ltd";
		data[86][0]="Kids' Healthy Mouths";
		data[87][0]="Spoken Fest";
		data[88][0]="!Audacious Church";
		data[89][0]="Quesos Petacones";
		data[90][0]="Carlos Vazquez";
		data[91][0]="PulpBrew";




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
