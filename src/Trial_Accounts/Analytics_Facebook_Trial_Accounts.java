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

public class Analytics_Facebook_Trial_Accounts  {

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
			driver.findElement(By.xpath("//*[@id=\"main-menu-wrapper\"]/ul/li[2]/a")).click();
	}


	@Test(priority=0,dataProvider="handles")
	public void Testcase_verify_Matrics_facbook_clients_account(String handlename) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 1200);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		System.out.println("Anyalytics_module_facebook");
			driver.findElement(By.xpath("//*[@id=\"main-menu-wrapper\"]/ul/li[3]/a")).click();
			Thread.sleep(5000);
            driver.findElement(By.xpath("//img[@class='list-search-icon search-anywhere-in-page']")).click();
			driver.findElement(By.xpath("//input[@name='serach-post']")).sendKeys(handlename);
			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/h6[1]/a[1]")));
			driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/h6[1]/a[1]")).click();
			/// insights cards



			// custome cal
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"globalrange_analytics\"]/img")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("/html/body/div[6]/div[3]/ul/li[6]")).click();

//			driver.findElement(By.xpath("/html/body/div[6]/div[3]/ul/li[7]")).click();
//			Thread.sleep(2000);
//			Thread.sleep(2000);
//			driver.findElement(By.name("daterangepicker_start")).clear();
//			Thread.sleep(2000);
//			driver.findElement(By.name("daterangepicker_start")).sendKeys("25012021");
//			Thread.sleep(2000);
//			driver.findElement(By.name("daterangepicker_end")).clear();
//			Thread.sleep(5000);
//			driver.findElement(By.name("daterangepicker_end")).sendKeys("25062021");
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/button[1]")).click();


			Thread.sleep(5000);

			System.out.println("**insights cards**");

			Boolean demo1=driver.findElement(By.xpath("//*[@id=\"influencerinsights\"]/div[1]/div")).isDisplayed();
			String  demo= driver.findElement(By.xpath("//*[@id=\"influencerinsights\"]/div[1]/div")).getText();

			if(demo1==true) {
			System.out.println("Data loaded properly");
			System.out.println(demo);


			}else {

			System.out.println("\"Data not loaded properly");

			}

			System.out.println("****fans and unfans**********");
			///fans and unfans



			Boolean fans1=driver.findElement(By.id("page_fan_count")).isDisplayed();
			String  fans= driver.findElement(By.id("page_fan_count")).getText();

			if(fans1==true) {
			System.out.println("Data loaded properly");
			System.out.println(fans);


			}else {

			System.out.println("\"Data not loaded properly");

			}
			System.out.println("*******fan_growth****");
			//fan_growth
			Boolean follower=driver.findElement(By.id("fan_growth")).isDisplayed();
			String  follower1= driver.findElement(By.id("fan_growth")).getText();

			if(follower== true) {
			System.out.println("Data loaded properly");
			System.out.println(follower1);


			}else {

			System.out.println("Data not loaded properly");

			}
			js.executeScript("window.scrollBy(0,650)");
			Thread.sleep(5000);

			// view count

			System.out.println(" ****view count****");


			Boolean count = driver.findElement(By.id("views_total")).isDisplayed();
			String  count1 = driver.findElement(By.id("views_total")).getText();

			if(count == true) {
			System.out.println("Data loaded properly");
			System.out.println(count1);


			}else {

			System.out.println("Data not loaded properly");

			}
			js.executeScript("window.scrollBy(0,650)");
			Thread.sleep(5000);

			System.out.println("****//view by refral*****");
			//view by refral
			Boolean internal = driver.findElement(By.id("referrals_view")).isDisplayed();
			String  internal1 = driver.findElement(By.id("referrals_view")).getText();

			if(internal == true) {
			System.out.println("Data loaded properly");
			System.out.println(internal1);


			}
			else {

			System.out.println("Data not loaded properly");

			}
			Thread.sleep(5000);
			js.executeScript("window.scrollBy(0,650)");

			//Engagement Rate (by Followers)

			System.out.println("***Engagement Rate (by Followers) *****");

			Boolean ER = driver.findElement(By.id("engagementRate")).isDisplayed();
			String  ER1 = driver.findElement(By.id("engagementRate")).getText();

			if(ER == true) {
			System.out.println("Data loaded properly");
			System.out.println(ER1);


			}
			else {

			System.out.println("Data not loaded properly");

			}
			//Engagement Rate (by Reach)

			System.out.println("***Engagement Rate (by Reach) *****");

			Boolean ERR = driver.findElement(By.id("engagementRateByReach")).isDisplayed();
			String  ERR1 = driver.findElement(By.id("engagementRateByReach")).getText();

			if(ERR == true) {
			System.out.println("Data loaded properly");
			System.out.println(ERR1);


			}
			else {

			System.out.println("Data not loaded properly");

			}
			//Impressions vs Reach
			Thread.sleep(5000);
			js.executeScript("window.scrollBy(0,650)");
			System.out.println("*****Impressions vs Reach***********");

			Boolean imp = driver.findElement(By.id("impressions")).isDisplayed();
			String  imp1 = driver.findElement(By.id("impressions")).getText();

			if(imp == true) {
			System.out.println("Data loaded properly");
			System.out.println(imp1);


			}
			else {

			System.out.println("Data not loaded properly");

			}

			///Impressions by Frequency Distribution

			System.out.println("*****Impressions by Frequency Distribution***********");

			Boolean fre = driver.findElement(By.id("frequency")).isDisplayed();
			String  fre1 = driver.findElement(By.id("frequency")).getText();

			if(fre == true) {
			System.out.println("Data loaded properly");
			System.out.println(fre1);


			}
			else {

			System.out.println("Data not loaded properly");

			}

			Thread.sleep(5000);
			js.executeScript("window.scrollBy(0,650)");

			///Engagement vs Consumptions

			System.out.println("*****Engagement vs Consumptions ***********");

			Boolean eng_vs_con = driver.findElement(By.id("eng_con")).isDisplayed();
			String  eng_vs_con1 = driver.findElement(By.id("eng_con")).getText();

			if(eng_vs_con == true) {
			System.out.println("Data loaded properly");
			System.out.println(eng_vs_con1);


			}
			else {

			System.out.println("Data not loaded properly");

			}

			//Total Reach vs Engaged Users

			System.out.println("*****Total Reach vs Engaged Users  ***********");

			Boolean rech_eng = driver.findElement(By.id("reach_eng_users")).isDisplayed();
			String  rech_eng1 = driver.findElement(By.id("reach_eng_users")).getText();

			if(rech_eng == true) {
			System.out.println("Data loaded properly");
			System.out.println(rech_eng1);


			}
			else {

			System.out.println("Data not loaded properly");

			}
			Thread.sleep(5000);
			js.executeScript("window.scrollBy(0,650)");

			//Interactions received on your content

			System.out.println("*****Interactions received on your content***********");

			Boolean instaaud = driver.findElement(By.id("instaAudienceInterraction")).isDisplayed();
			String  instaaud1 = driver.findElement(By.id("instaAudienceInterraction")).getText();

			if(instaaud == true) {
			System.out.println("Data loaded properly");
			System.out.println(instaaud1);


			}
			else {

			System.out.println("Data not loaded properly");

			}

			///Mode of Interaction

			System.out.println("*****Mode of Interaction***********");

			Boolean interbar = driver.findElement(By.id("modeOfInteractionChartimage")).isDisplayed();
			String  interbar1 = driver.findElement(By.id("modeOfInteractionChartimage")).getText();

			if(interbar == true) {
			System.out.println("Data loaded properly");
			System.out.println(interbar1);


			}
			else {

			System.out.println("Data not loaded properly");


			}


			System.out.println("*****Mode of Interaction 2***********");

			Boolean inter = driver.findElement(By.id("modeOfInteractionChartimage")).isDisplayed();
			String  inter2 = driver.findElement(By.id("modeOfInteractionChartimage")).getText();

			if(inter == true) {
			System.out.println("Data loaded properly");
			System.out.println(inter2);


			}
			else {

			System.out.println("Data not loaded properly");


			}

			Thread.sleep(5000);
			js.executeScript("window.scrollBy(0,650)");
			///Recommended posts to promote

			System.out.println("*****Recommended posts to promote ***********");

			Boolean top_post = driver.findElement(By.id("topPostByEngagement")).isDisplayed();
			String  top_post1 = driver.findElement(By.id("topPostByEngagement")).getText();

			if(top_post == true) {
			System.out.println("Data loaded properly");
			System.out.println(top_post1);


			}
			else {

			System.out.println("Data not loaded properly");


			}

			Thread.sleep(5000);
			js.executeScript("window.scrollBy(0,650)");
			///Page CTA (No. of clicks)

			System.out.println("*****Page CTA (No. of clicks)***********");

			Boolean CTA = driver.findElement(By.id("callToAction")).isDisplayed();
			String  CTA1 = driver.findElement(By.id("callToAction")).getText();

			if(CTA == true) {
			System.out.println("Data loaded properly");
			System.out.println(CTA1);


			}
			else {

			System.out.println("Data not loaded properly");


			}
			//Top Tabs

			System.out.println("*****Top Tabs***********");

			Boolean top_tabs = driver.findElement(By.id("topTabs")).isDisplayed();
			String  top_tabs1 = driver.findElement(By.id("topTabs")).getText();

			if(top_tabs == true) {
			System.out.println("Data loaded properly");
			System.out.println(top_tabs1);


			}
			else {

			System.out.println("Data not loaded properly");


			}
			Thread.sleep(3000);
			((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");


			/// tab 	Audience
			driver.findElement(By.id("link_for_85")).click();
			///Age & Gender Split, Location Spread

			System.out.println("********Age & Gender Split, Location Spread*****************");

			Boolean age_num = driver.findElement(By.id("audienceFansPagesviewsReach_genderSplitFacebook")).isDisplayed();
			String  age_num1 = driver.findElement(By.id("audienceFansPagesviewsReach_genderSplitFacebook")).getText();

			if(age_num == true) {
			System.out.println("Data loaded properly");
			System.out.println(age_num1);


			}
			else {

			System.out.println("Data not loaded properly");


			}


			System.out.println("********Age & Gender Split, Location Spread ---2*****************");

			Boolean location = driver.findElement(By.id("audienceFansPagesviewsReach_LocationSpread_country")).isDisplayed();
			String  location1 = driver.findElement(By.id("audienceFansPagesviewsReach_LocationSpread_country")).getText();

			if(location == true) {
			System.out.println("Data loaded properly");
			System.out.println(location1);


			}
			else {

			System.out.println("Data not loaded properly");


			}
			Thread.sleep(5000);
			js.executeScript("window.scrollBy(0,650)");

			///When are your followers online?

			System.out.println("********When are your followers online? *****************");

			Boolean ol_follower = driver.findElement(By.id("online_followers")).isDisplayed();
			String  ol_follower1 = driver.findElement(By.id("online_followers")).getText();

			if(ol_follower == true) {
			System.out.println("Data loaded properly");
			System.out.println(ol_follower1);


			}
			else {

			System.out.println("Data not loaded properly");


			}

			//Language your followers are using Facebook in

			System.out.println("********/Language your followers are using Facebook in ****************");

			Boolean lang_imp = driver.findElement(By.id("languageImpressions")).isDisplayed();
			String  lang_imp1 = driver.findElement(By.id("languageImpressions")).getText();

			if(lang_imp == true) {
			System.out.println("Data loaded properly");
			System.out.println(lang_imp1);


			}
			else {

			System.out.println("Data not loaded properly");


			}
			Thread.sleep(5000);
			js.executeScript("window.scrollBy(0,650)");
			//Content themes brands have been talking about

			System.out.println("********/Content themes brands have been talking about  ****************");

			Boolean Brand_cont = driver.findElement(By.id("brandsTalkingAboutParentContainer")).isDisplayed();
			String  Brand_cont1 = driver.findElement(By.id("brandsTalkingAboutParentContainer")).getText();

			if(Brand_cont == true) {
			System.out.println("Data loaded properly");
			System.out.println(Brand_cont1);


			}
			else {

			System.out.println("Data not loaded properly");


			}
			Thread.sleep(5000);
			js.executeScript("window.scrollBy(0,650)");


			//Audience sentiment
			System.out.println("************Audience sentiment************");

			Boolean sentiments = driver.findElement(By.id("sentimentSplit")).isDisplayed();
			String  sentiments1 = driver.findElement(By.id("sentimentSplit")).getText();

			if(sentiments == true) {
			System.out.println("Data loaded properly");
			System.out.println(sentiments1);


			}
			else {

			System.out.println("Data not loaded properly");


			}
			Thread.sleep(5000);
			js.executeScript("window.scrollBy(0,650)");

			System.out.println("************Sentiment by Emoji************");

			Boolean emoji = driver.findElement(By.id("emojiSentimentHolder")).isDisplayed();
			String  emoji1 = driver.findElement(By.id("emojiSentimentHolder")).getText();

			if(emoji == true) {
			System.out.println("Data loaded properly");
			System.out.println(emoji1);


			}
			else {

			System.out.println("Data not loaded properly");


			}

			Thread.sleep(5000);
			js.executeScript("window.scrollBy(0,650)");

			///Feedback Ratio by Type
			System.out.println("************Feedback Ratio by Type ************");

			Boolean feedback_type = driver.findElement(By.id("positive_feedback_pie")).isDisplayed();
			String  feedback_type1 = driver.findElement(By.id("positive_feedback_pie")).getText();

			if(feedback_type == true) {
			System.out.println("Data loaded properly");
			System.out.println(feedback_type1);


			}
			else {

			System.out.println("Data not loaded properly");


			}

			///Feedback vs Unique Feedback

			System.out.println("************ Feedback vs Unique Feedback ************");

			Boolean feedback_vs_Unique= driver.findElement(By.id("feedback")).isDisplayed();
			String  feedback_vs_Unique1 = driver.findElement(By.id("feedback")).getText();

			if(feedback_vs_Unique == true) {
			System.out.println("Data loaded properly");
			System.out.println(feedback_vs_Unique1);


			}
			else {

			System.out.println("Data not loaded properly");


			}
			Thread.sleep(5000);
			((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");

			driver.findElement(By.id("link_for_84")).click();

			boolean b= driver.findElement(By.xpath("//*[@id=\"postsFacebook\"]/div[1]/div")).isDisplayed();

			String all_data =  driver.findElement(By.xpath("//*[@id=\"postsFacebook\"]/div[1]/div")).getText();

			if(b == true) {
			System.out.println("Data loaded properly");
			System.out.println(all_data);


			}
			else {

			System.out.println("Data not loaded properly");


			}
			///Reaction Meter
			js.executeScript("window.scrollBy(0,650)");
			Thread.sleep(5000);
			System.out.println("************Reaction Meter************");

			Boolean react_metter = driver.findElement(By.id("reaction_counter")).isDisplayed();
			String  react_metter1 = driver.findElement(By.id("reaction_counter")).getText();

			if(react_metter == true) {
			System.out.println("Data loaded properly");
			System.out.println(react_metter1);


			}
			else {

			System.out.println("Data not loaded properly");


			}
			//No. of Posts

			js.executeScript("window.scrollBy(0,650)");
			Thread.sleep(5000);
			System.out.println("************No. of Posts************");

			Boolean no_post = driver.findElement(By.id("total_posts")).isDisplayed();
			String  no_post1 = driver.findElement(By.id("total_posts")).getText();

			if(no_post == true) {
			System.out.println("Data loaded properly");
			System.out.println(no_post1);


			}
			else {

			System.out.println("Data not loaded properly");


			}


			js.executeScript("window.scrollBy(0,650)");
			Thread.sleep(5000);
			System.out.println("************Post type***********");

			Boolean post_type = driver.findElement(By.id("postType_fbengagement")).isDisplayed();
			String  post_type1 = driver.findElement(By.id("postType_fbengagement")).getText();

			if(post_type == true) {
			System.out.println("Data loaded properly");
			System.out.println(post_type1);


			}
			else {

			System.out.println("Data not loaded properly");


			}
			js.executeScript("window.scrollBy(0,650)");
			Thread.sleep(5000);
			System.out.println("************Video Views***********");

			Boolean video_view = driver.findElement(By.id("postsVideoViews")).isDisplayed();
			String  video_view1 = driver.findElement(By.id("postsVideoViews")).getText();

			if(video_view == true) {
			System.out.println("Data loaded properly");
			System.out.println(video_view1);


			}
			else {

			System.out.println("Data not loaded properly");


			}

			System.out.println("************Repeat Views**********");

			Boolean video_rep = driver.findElement(By.id("postsRepeatViews")).isDisplayed();
			String  video_rep1 = driver.findElement(By.id("postsRepeatViews")).getText();

			if(video_rep == true) {
			System.out.println("Data loaded properly");
			System.out.println(video_rep1);


			}
			else {

			System.out.println("Data not loaded properly");


			}

			System.out.println("************All Posts**********");
			Thread.sleep(5000);


			Boolean all_post = driver.findElement(By.id("all_posts_fb")).isDisplayed();
			String  all_post1 = driver.findElement(By.id("all_posts_fb")).getText();

			if(all_post == true) {
			System.out.println("Data loaded properly");
			System.out.println(all_post1);


			}
			else {

			System.out.println("Data not loaded properly");


			}
			Thread.sleep(3000);

			// pick up 2nd image
//			driver.findElement(By.xpath("//*[@id=\"all_posts_fb\"]/div[2]")).click();
//			Thread.sleep(5000);

			Boolean post_er = driver.findElement(By.id("scrollable-popup")).isDisplayed();
			String  post_er1 = driver.findElement(By.id("scrollable-popup")).getText();

			if(post_er == true) {
			System.out.println("Data loaded properly");
			System.out.println(post_er1);


			}
			else {

			System.out.println("Data not loaded properly");

			}
			Thread.sleep(2000);
			// close btn
//			driver.findElement(By.xpath("//*[@id=\"post-detail-facebook\"]/div/div/button")).click();

			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"magic-list\"]/div[1]/h5/div[2]/a/div")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("likes_sort")).click();
			Thread.sleep(8000);
			String filtter_result = driver.findElement(By.id("all_posts_fb")).getText();
			System.out.println("result is according to filtter"+filtter_result);

			}



	@DataProvider(name="handles")
	public Object[][] passdata(){

		Object[][] data= new Object[116][1];

		data[0][0]="revlon Israel ????? ?????";
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
		data[15][0]="????";
		data[16][0]="Khaled Abu Zaid Photography";
		data[17][0]="meatybros";
		data[18][0]="Quesos Petacones";
		data[19][0]="Little Caesars El Salvador";
		data[20][0]="Free to choose right";
		data[21][0]="Barilla ?????";
		data[22][0]="Schick Israel";
		data[23][0]="Balloons - ?????";
		data[24][0]="???? - ????? ????";
		data[25][0]="embryolisse_il";
		data[26][0]="Oatly";
		data[27][0]="Sisley Paris";
		data[28][0]="Revlon Israel ????? ?????";
		data[29][0]="AOPA: your freedom to fly";
		data[30][0]="BILL BROWN FORD";
		data[31][0]="SOFTHOUSE RESEARCH & PROGRAMMING.";
		data[32][0]="???????????? ?????????? NANA Resort";
		data[33][0]="Treecard";
		data[34][0]="Kids' Healthy Mouths";
		data[35][0]="Hope Philippines Church";
		data[36][0]="Dental Trade Alliance Foundation";
		data[37][0]="Basicallymenz by SR";
		data[38][0]="Polycab India Limited";
		data[39][0]="Deblina Rababi";
		data[40][0]="Tad Too Trendy";
		data[41][0]="Megna Mukherjee";
		data[42][0]="Unbox";
		data[43][0]="Upendo Golf KENYA";
		data[44][0]="GO FIRST";
		data[45][0]="Social Media Analytics";
		data[46][0]="Raskik";
		data[47][0]="Momocrafting";
		data[48][0]="Funky Buddha Brewery";
		data[49][0]="Kao Salon Division";
		data[50][0]="Funky Buddha Tap Room";
		data[51][0]="Paintly - Avatar Creator Art Maker & Coloring Book";
		data[52][0]="HushHush by Buzzr";
		data[53][0]="Compartamos Financiera";
		data[54][0]="Local Hero";
		data[55][0]="DeFi Crown";
		data[56][0]="Individual Cabinet de Parfums";
		data[57][0]="Swagitupsite";
		data[58][0]="The_shorty_doowop";
		data[59][0]="Sanika V";
		data[60][0]="Arabellastyling";
		data[61][0]="Clover Zambia";
		data[62][0]="Light Pong";
		data[63][0]="TheBeautitude";
		data[64][0]="Attica Springboks Rugby Footbal Club";
		data[65][0]="Mette Willert";
		data[66][0]="Miss.prianca";
		data[67][0]="iPhone 4S";
		data[68][0]="We Won't Wait";
		data[69][0]="Borough Market";
		data[70][0]="Joga Singh";
		data[71][0]="Fireside Tattoo";
		data[72][0]="Bantu Jualan";
		data[73][0]="Green Party of England and Wales";
		data[74][0]="Nitin Tours & Travels";
		data[75][0]="Finta";
		data[76][0]="BIG Drinks";
		data[77][0]="CUN - Corporación Unificada Nacional de Educación Superior";
		data[78][0]="AARMY";
		data[79][0]="Yummy Snack Foods";
		data[80][0]="xeberz.net";
		data[81][0]="Equinety";
		data[82][0]="NUERO-ads";
		data[83][0]="Audacious Church";
		data[84][0]="Codan Forsikring A/S";
		data[85][0]="NXTmine";
		data[86][0]="Game of Silks";
		data[87][0]="gigkigk";
		data[88][0]="Babyjoy Diapers";
		data[89][0]="Matterhorn Fit";
		data[90][0]="Autonics Global";
		data[91][0]="Experience Shelbyville";
		data[92][0]="Kommune";
		data[93][0]="Visit Manchester TN";
		data[94][0]="Museum of Solutions";
		data[95][0]="Suomen Cheerleadingliitto - SCL";
		data[96][0]="Pulp Brew";
		data[97][0]="École supérieure de ballet du Québec";
		data[98][0]="Fanzia";
		data[99][0]="Riverside University Health System - Behavioral Health";
		data[100][0]="Cream Family Wines";
		data[101][0]="Adelady";
		data[102][0]="Harbour Town Adelaide";
		data[103][0]="The Digital Work";
		data[104][0]="Vintage Braided Wigs";
		data[105][0]="Vintage Salon Port Harcourt";
		data[106][0]="Montcrest Hotel & Lounge";
		data[107][0]="Van der Sande Makelaars - regio Breda";
		data[108][0]="Ducati Singapore";
		data[109][0]="Reliance Digital";
		data[110][0]="HT Pune";
		data[111][0]="Red Bull BC One";
		data[112][0]="Red Bull";
		data[113][0]="Ankesh";
		data[114][0]="Hindustan Times Cricket";
		data[115][0]="Hindustan Times Kolkata";






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
