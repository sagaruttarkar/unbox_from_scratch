package modules;

import java.util.ArrayList;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.Base_app;

public class Influncer_suite extends Base_app {

	@FindBy(xpath="//*[@id=\"main-menu-wrapper\"]/ul/li[7]/a")
	WebElement influencer_suite;

	@FindBy(xpath="//*[@id=\"4_\"]/span[1]/a")
	WebElement curated_list;



	@FindBy(xpath="/html/body/div[5]/div[2]/div/div/div[1]/div/div[2]/a[2]/div/i")
	WebElement Filters;

	@FindBy(xpath="/html/body/div[5]/div[2]/div/div/div[1]/div/div[2]/a[1]/div")
      WebElement add;

	@FindBy(xpath="//*[@id=\"4_\"]/span[2]/a")
	WebElement campings;

	@FindBy(xpath="//*[@id=\"influencers\"]/div[2]/div[1]/div[1]/span[1]")
	WebElement Advance_filtter;




public Influncer_suite() {

		PageFactory.initElements(driver, this);


	}
JavascriptExecutor js = (JavascriptExecutor) driver;
WebDriverWait wait = new WebDriverWait(driver, 200);

public void curated_list_Filters() throws InterruptedException {
    influencer_suite.click();
	curated_list.click();
	Thread.sleep(2000);
	Filters.click();
	driver.findElement(By.xpath("//*[@id=\"typefilter\"]/li[3]/a")).click();
	Thread.sleep(2000);
String List_all=driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]")).getText();
System.out.println("INSTAGRAM FILTERS RESULT="+List_all);
System.out.println("///////////////////////////////////////////////////////////////////////////////////");
Thread.sleep(4000);

Filters.click();
	driver.findElement(By.xpath("//*[@id=\"typefilter\"]/li[4]/a")).click();
	Thread.sleep(2000);
String List_all1=	driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]")).getText();

	System.out.println("YOUTUBE FILTERS RESULT="+List_all1);
}


public void Add_to_curate_list() throws InterruptedException {
	influencer_suite.click();
	curated_list.click();
	add.click();
	driver.findElement(By.xpath("//*[@id=\"ig_infl_list\"]/tr[1]/td[1]/div/img")).click();
	driver.findElement(By.xpath("//*[@id=\"ig_infl_list\"]/tr[2]/td[1]/div/img")).click();
	driver.findElement(By.xpath("//*[@id=\"ig_infl_list\"]/tr[3]/td[1]/div/img"	)).click();
	js.executeScript("window.scrollBy(0,450)");
	driver.findElement(By.xpath("//*[@id=\"ig_infl_list\"]/tr[4]/td[1]/div/img")).click();
	driver.findElement(By.xpath("//*[@id=\"ig_infl_list\"]/tr[5]/td[1]/div/img")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[5]/div[3]/a[2]")).click();
	Random random = new Random();
	String create_list = "sagar_Testing+"+random.nextInt()+"_sagar";
	driver.findElement(By.xpath("/html/body/div[9]/div/div/div[2]/div/form/input")).sendKeys(create_list);
driver.findElement(By.xpath("/html/body/div[9]/div/div/div[3]/button[2]")).click();
}


public void Search_delete() throws InterruptedException {
	// Delete
	influencer_suite.click();
	curated_list.click();
	driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div[1]/div/div/span/img[2]")).click();
	Thread.sleep(2000);
	 String msg= driver.findElement(By.className("discard-text")).getText();
	 System.out.println("The account Deleted !!"+ msg);
	driver.findElement(By.xpath("/html/body/div[8]/div/div/div[3]/button[2]")).click();

	//search


	driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[1]/div/div[2]/span/img")).click();
	driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[1]/div/div[2]/span/input")).sendKeys("matrix");
	Thread.sleep(2000);
String SearchData=	driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]")).getText();
System.out.println(SearchData);


}

public void influence_list_matrics() throws InterruptedException {
	influencer_suite.click();
	curated_list.click();
	driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div[1]/div/div")).click();
	Thread.sleep(2000);
	// search
	driver.findElement(By.xpath("//*[@id=\"influencers\"]/div[2]/div[1]/div[3]/div/span/input")).sendKeys("Aashna Hegde");
String Searchlist =driver.findElement(By.className("curatelist")).getText();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"ig_infl_list\"]/tr/td[8]/a")).click();
System.out.println(Searchlist);

ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
driver.switchTo().window(tabs2.get(1));
//driver.close();
//driver.switchTo().window(tabs2.get(0));
///insight tab
System.out.println("///insight tab");
System.out.println("******er****");
boolean data1 =driver.findElement(By.id("engagementRate")).isDisplayed();
String data=driver.findElement(By.id("engagementRate")).getText();

if (data1 == true ) {

	System.out.println("Data showing proper!");
	System.out.println(data);



}else {
	System.out.println("Data not showing proper!");


}


///gender split//


System.out.println("///Average Engagement Per Content Form //");

boolean g =driver.findElement(By.id("catER")).isDisplayed();
String g1=driver.findElement(By.id("catER")).getText();

if (g == true ) {

	System.out.println("Data showing proper!");
	System.out.println(g1);



}else {
	System.out.println("Data not showing proper!");


}
//Interactions received on your content
System.out.println("//Interactions received on your content  ");


boolean inter =driver.findElement(By.id("instaAudienceInterraction")).isDisplayed();
String inter_1=driver.findElement(By.id("instaAudienceInterraction")).getText();

if (inter == true ) {

	System.out.println("Data showing proper!");
	System.out.println(inter_1);



}else {
	System.out.println("Data not showing proper!");


}
Thread.sleep(5000);
js.executeScript("window.scrollBy(0,650)");

//most engaging post

System.out.println("/*** most engaging post ****");
boolean most_eg_post =driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[6]/div[2]/div[2]/div/div/div[3]")).isDisplayed();
String most_eg_post_1=driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[6]/div[2]/div[2]/div/div/div[3]")).getText();

if (most_eg_post == true ) {

	System.out.println("Data showing proper!");
	System.out.println(most_eg_post_1);
	



}else {
	System.out.println("Data not showing proper!");


}

js.executeScript("window.scrollBy(0,650)");

//Content themes Brands have been talking about

System.out.println("/*** Content themes Brands have been talking about  ****");
boolean content_talk =driver.findElement(By.id("talkingAbout")).isDisplayed();
String content_talk_1=driver.findElement(By.id("talkingAbout")).getText();

if (content_talk == true ) {

	System.out.println("Data showing proper!");
	System.out.println(content_talk_1);



}else {
	System.out.println("Data not showing proper!");


}
js.executeScript("window.scrollBy(0,650)");

//How has the audience interacted?

System.out.println("/*** Content themes Brands have been talking about  ****");
boolean interaction_data =driver.findElement(By.id("interaction_data")).isDisplayed();
String interaction_data_1=driver.findElement(By.id("interaction_data")).getText();

if (interaction_data == true ) {

	System.out.println("Data showing proper!");
	System.out.println(interaction_data_1);



}else {
	System.out.println("Data not showing proper!");


}
js.executeScript("window.scrollBy(0,650)");

//tophastag

System.out.println("/*** tophastag  ****");
boolean tophastag =driver.findElement(By.id("tophastag")).isDisplayed();
String tophastag_1=driver.findElement(By.id("tophastag")).getText();

if (tophastag == true ) {

	System.out.println("Data showing proper!");
	System.out.println(tophastag_1);



}else {
	System.out.println("Data not showing proper!");


}
//Audience Interest
System.out.println("/*** Audience Interest  ****");
boolean audi =driver.findElement(By.id("audienceInterest")).isDisplayed();
String audi1=driver.findElement(By.id("audienceInterest")).getText();

if (audi == true ) {

	System.out.println("Data showing proper!");
	System.out.println(audi1);



}else {
	System.out.println("Data not showing proper!");


}




Thread.sleep(2000);
((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
///Audience Quality

Thread.sleep(5000);
driver.findElement(By.id("link_for_IG1")).click();

Thread.sleep(2000);
System.out.println("*gender split****");
boolean gender_split =driver.findElement(By.id("genderSplit")).isDisplayed();
String gender_split1=driver.findElement(By.id("genderSplit")).getText();

if (gender_split == true ) {

	System.out.println("Data showing proper!");
	System.out.println(gender_split1);



}else {
	System.out.println("Data not showing proper!");


}
Thread.sleep(2000);

//Age and gender split

System.out.println("**Age and gender split**");
boolean age =driver.findElement(By.id("ageGender")).isDisplayed();
String age1=driver.findElement(By.id("ageGender")).getText();

if (age == true ) {

	System.out.println("Data showing proper!");
	System.out.println(age1);



}else {
	System.out.println("Data not showing proper!");


}

js.executeScript("window.scrollBy(0,650)");
// location spread
System.out.println("location spread");
boolean  location_spread =driver.findElement(By.id("worldSpread")).isDisplayed();
String location_spread1=driver.findElement(By.id("worldSpread")).getText();

if (location_spread == true ) {

	System.out.println("Data showing proper!");
	System.out.println(location_spread1);



}else {
	System.out.println("Data not showing proper!");


}




boolean audience_quality =driver.findElement(By.id("activePassive")).isDisplayed();
String audience_quality1=driver.findElement(By.id("activePassive")).getText();

if (audience_quality == true ) {

	System.out.println("Data showing proper!");
	System.out.println(audience_quality1);



}else {
	System.out.println("Data not showing proper!");


}





Thread.sleep(2000);
((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
Thread.sleep(2000);
driver.findElement(By.id("link_for_IG2")).click();
Thread.sleep(2000);

System.out.println("No. of Posts");

boolean total_post =driver.findElement(By.id("totalPosts")).isDisplayed();
String total_post1=driver.findElement(By.id("totalPosts")).getText();

if (total_post == true ) {

	System.out.println("Data showing proper!");
	System.out.println(total_post1);



}else {
	System.out.println("Data not showing proper!");

}
//All posts
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,650)");
System.out.println("All posts");


boolean all_post =driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[6]/div[2]/div[1]/div[2]/div[2]/div/div/div[5]/div/div")).isDisplayed();
String all_post1=driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[6]/div[2]/div[1]/div[2]/div[2]/div/div/div[5]/div/div")).getText();

if (all_post == true ) {

	System.out.println("Data showing proper!");
	System.out.println(all_post1);



}else {
	System.out.println("Data not showing proper!");

}

driver.findElement(By.xpath("/html/body/div[3]/div[1]/div")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/a")).click();
Thread.sleep(2000);
driver.close();
Thread.sleep(5000);
driver.switchTo().window(tabs2.get(0));



}


public void influencer_smart_search_instagaram() throws InterruptedException {
	influencer_suite.click();
	curated_list.click();
	Thread.sleep(2000);
	add.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[3]/div/div[2]/ul/li[2]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"brandscheck\"]/div[2]/div[1]/div[2]/span[1]/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"brandscheck\"]/div[2]/div[1]/div[2]/span[1]/input")).sendKeys("run");
		Thread.sleep(2000);
// calender

		driver.findElement(By.xpath("//*[@id=\"brandscheck\"]/div[2]/div[1]/div[2]/a/div/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/ul/li[4]")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,250)");
		// show all
		driver.findElement(By.xpath("//*[@id=\"brandMentions_IG\"]/div[1]/div[1]/div[2]/h4/span[2]")).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div[2]/div/div/div[2]")));

// add influencer directory
	driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/div/div/div[2]/div[1]/div/div[3]/div/span")).click();
	driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/div/div/div[2]/div[2]/div/div[3]/div/span")).click();
	driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/div/div/div[2]/div[3]/div/div[3]/div/span")).click();
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,250)");
//     driver.findElement(By.xpath("//*[@id=\"brandMentions_IG\"]/div[1]/div[2]/div[4]/div/div[3]/div")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[5]/div[3]/a[2]")).click();
	Random random = new Random();
	String Smart_search = "Smart_search+"+random.nextInt()+"_sagar";
	driver.findElement(By.xpath("/html/body/div[9]/div/div/div[2]/div/form/input")).sendKeys(Smart_search);
	driver.findElement(By.xpath("/html/body/div[9]/div/div/div[3]/button[2]")).click();





	///Selected tab
   driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div[1]/div/div")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[3]/div/div[2]/ul/li[3]/a")).click();
	Thread.sleep(2000);
    driver.findElement(By.id("instagram")).click();

	String all_instagram_data = driver.findElement(By.xpath("//*[@id=\"selected_for_ig\"]")).getText();
	System.out.println("instagram data = " +all_instagram_data);

	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"selected\"]/div/div[1]/div[2]/span/input")).click();
	Thread.sleep(2000);
	String table=driver.findElement(By.xpath("//*[@id=\"selected_for_all\"]/tr/td[2]/span[2]")).getText();
	Thread.sleep(2000);
	System.out.println(table);



}

public void smart_search_twitter() throws InterruptedException {
	influencer_suite.click();
	curated_list.click();
	add.click();
	Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[3]/div/div[2]/ul/li[2]/a")).click();
    Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"brandscheck\"]/div[1]/div/span/button[3]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"brandscheck\"]/div[2]/div[1]/div[2]/span[1]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"brandscheck\"]/div[2]/div[1]/div[2]/span[1]/input")).sendKeys("run");
	Thread.sleep(2000);

	driver.findElement(By.xpath("//*[@id=\"brandMentions_TW\"]/div[1]/div[1]/div[2]/h4/span[2]")).click();
	Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div[2]/div/div/div[2]")));


//add influencer directory
driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/div/div/div[2]/div[1]/div/div[3]/div/span")).click();
driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/div/div/div[2]/div[2]/div/div[3]/div/span")).click();
driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/div/div/div[2]/div[3]/div/div[3]/div/span")).click();
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,250)");
	Thread.sleep(2000);
	// create list btn
	driver.findElement(By.xpath("/html/body/div[5]/div[3]/a[2]")).click();

	Random random = new Random();
	String Smart_search = "Twitter_Smart_search+"+random.nextInt()+"_sagar";
	driver.findElement(By.xpath("/html/body/div[9]/div/div/div[2]/div/form/input")).sendKeys(Smart_search);
	driver.findElement(By.xpath("/html/body/div[9]/div/div/div[2]/div/form/input")).click();
	Thread.sleep(2000);

	driver.findElement(By.xpath("/html/body/div[9]/div/div/div[3]/button[2]")).click();
	Thread.sleep(2000);

	driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div[1]/div/div")).click();

	driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[3]/div/div[2]/ul/li[3]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("twitter")).click();

	String Twitter_data = driver.findElement(By.xpath("//*[@id=\"selected_for_tw\"]")).getText();
	System.out.println(Twitter_data);




}


public void influencer_smart_search_youtube() throws InterruptedException {
	influencer_suite.click();
	curated_list.click();
	add.click();
	Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[3]/div/div[2]/ul/li[2]/a")).click();
    Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"brandscheck\"]/div[1]/div/span/button[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"brandscheck\"]/div[2]/div[1]/div[2]/span[1]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"brandscheck\"]/div[2]/div[1]/div[2]/span[1]/input")).sendKeys("spots");
	Thread.sleep(2000);
/// calender
	driver.findElement(By.xpath("//*[@id=\"brandscheck\"]/div[2]/div[1]/div[2]/a/div/i")).click();

	driver.findElement(By.xpath("/html/body/div[6]/div[3]/ul/li[4]")).click();
	js.executeScript("window.scrollBy(0,250)");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"brandTags_YT\"]/div[1]/div[1]/div[2]/h4/span[2]")).click();
	Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div[2]/div/div/div[2]")));

//add influencer directory
driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/div/div/div[2]/div[1]/div/div[3]/div/span")).click();
driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/div/div/div[2]/div[2]/div/div[3]/div/span")).click();
driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/div/div/div[2]/div[3]/div/div[3]/div/span")).click();
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,250)");
	Thread.sleep(2000);
	// create list btn
	driver.findElement(By.xpath("/html/body/div[5]/div[3]/a[2]")).click();

	Random random = new Random();
	String Smart_search = "youtube_Smart_search+"+random.nextInt()+"_sagar";
	driver.findElement(By.xpath("/html/body/div[9]/div/div/div[2]/div/form/input")).sendKeys(Smart_search);
	driver.findElement(By.xpath("/html/body/div[9]/div/div/div[2]/div/form/input")).click();
	Thread.sleep(2000);

	driver.findElement(By.xpath("/html/body/div[9]/div/div/div[3]/button[2]")).click();
	Thread.sleep(2000);

	driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div[1]/div/div")).click();

	driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[3]/div/div[2]/ul/li[3]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("youtube")).click();

	String youtube_data = driver.findElement(By.xpath("//*[@id=\"selected_for_yt\"]")).getText();
	System.out.println(youtube_data);



}

///Testcases_campings module/////


public void create_campings_youtube() throws InterruptedException {
	influencer_suite.click();
	campings.click();
	Thread.sleep(2000);
	add.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"updateCampaign\"]/div/div/div[2]/div/div[1]/div/img[1]")).click();
	driver.findElement(By.id("campaign_name")).sendKeys("sports");
	Thread.sleep(2000);
	driver.findElement(By.id("campaign_end_date")).click();
	js.executeScript("window.scrollBy(0,250)");

	driver.findElement(By.id("campaign_brief")).sendKeys("HI im Tester");
	driver.findElement(By.id("terms_conditions")).sendKeys("HI im Tester 123");


	Thread.sleep(2000);

	driver.findElement(By.xpath("//*[@id=\"updateCampaign\"]/div/div/div[3]/div[3]/img")).click();
	Thread.sleep(2000);

	driver.findElement(By.xpath("//*[@id=\"curated-list\"]/div[1]/div/div")).click();
	js.executeScript("window.scrollBy(0,650)");
	driver.findElement(By.xpath("//*[@id=\"post_block_1\"]/div/div[2]/div/input")).sendKeys("Test");
	Thread.sleep(2000);
	//pending
//    driver.findElement(By.xpath("//*[@id=\"post_block_1\"]/div/div[3]/div[2]/img")).click();
//    Thread.sleep(2000);
//	WebElement AddFile= driver.findElement(By.xpath("//*[@id=\"post_block_1\"]/div/div[3]/div[2]/img"));
//	AddFile.sendKeys("src/config/sagar_testing.pdf");

	driver.findElement(By.xpath("//*[@id=\"post_block_1\"]/div/div[4]/div[2]/img")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("select_all")).click();
	driver.findElement(By.id("selected_infl_ok")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"updateCampaign\"]/div/div/div[6]/span[1]")).click();
	System.out.println("campings added sucsesfully!!");
	Thread.sleep(2000);
	///delete caamping
	influencer_suite.click();
	campings.click();
	driver.findElement(By.xpath("//*[@id=\"rendered_campaign_list\"]/tr[1]/td[7]/span/img")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/div[8]/div/div/div[3]/button[2]")).isEnabled();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[8]/div/div/div[3]/button[2]")).click();
	System.out.println("campings deleted sucsesfully!!");

}

public void create_campings_instagram() throws InterruptedException {
	influencer_suite.click();
	campings.click();
	Thread.sleep(2000);
	add.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"updateCampaign\"]/div/div/div[2]/div/div[1]/div/img[2]")).click();
	driver.findElement(By.id("campaign_name")).sendKeys("sports");
	Thread.sleep(2000);
js.executeScript("window.scrollBy(0,250)");

	driver.findElement(By.id("campaign_brief")).sendKeys("HI im Tester");
	driver.findElement(By.id("terms_conditions")).sendKeys("HI im Tester 123");


	Thread.sleep(2000);

	driver.findElement(By.xpath("//*[@id=\"updateCampaign\"]/div/div/div[3]/div[3]/img")).click();
	Thread.sleep(2000);

	driver.findElement(By.xpath("//*[@id=\"curated-list\"]/div[1]/div/div")).click();
	js.executeScript("window.scrollBy(0,650)");
	driver.findElement(By.xpath("//*[@id=\"post_block_1\"]/div/div[2]/div/input")).sendKeys("Test");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"post_block_1\"]/div/div[4]/div[2]/img")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("select_all")).click();
	driver.findElement(By.id("selected_infl_ok")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"updateCampaign\"]/div/div/div[6]/span[1]")).click();
	System.out.println("campings added sucsesfully!!");
	///delete caamping
//	Thread.sleep(5000);
//	influencer_suite.click();
//	campings.click();
//	driver.findElement(By.xpath("//*[@id=\"rendered_campaign_list\"]/tr[1]/td[7]/span/img")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/div[8]/div/div/div[3]/button[2]")).isEnabled();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html/body/div[8]/div/div/div[3]/button[2] ")).click();
//	System.out.println("campings deleted sucsesfully!!");



}

public void campings_verify_matrics() throws InterruptedException {
	influencer_suite.click();
	campings.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[1]/div[2]/span/img")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[1]/div[2]/span/input")).sendKeys("laptop");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"rendered_campaign_list\"]/tr/td[7]/a[2]")).click();
	Thread.sleep(2000);
	//Live Tracker

	System.out.println("****Live Tracker***********");
	boolean track_live =driver.findElement(By.id("all_tracker_blocks")).isDisplayed();
	String track_live1=driver.findElement(By.id("all_tracker_blocks")).getText();

	if (track_live == true ) {

		System.out.println("Data showing proper!");
		System.out.println(track_live1);



	}else {
		System.out.println("Data not showing proper!");


	}

	///Top Stats
	System.out.println("****Top Stats r***********");
	boolean top_starts =driver.findElement(By.xpath("//*[@id=\"campaign-tracker\"]/div[1]/div/div[1]/div[2]")).isDisplayed();
	String top_starts1=driver.findElement(By.xpath("//*[@id=\"campaign-tracker\"]/div[1]/div/div[1]/div[2]")).getText();

	if (top_starts == true ) {

		System.out.println("Data showing proper!");
		System.out.println(top_starts1);



	}else {
		System.out.println("Data not showing proper!");


	}
	js.executeScript("window.scrollBy(0,650)");
	//Category Split
	System.out.println("****Category Split ***********");
	boolean category_split =driver.findElement(By.id("cate_split_ig_chart")).isDisplayed();
	String category_split1=driver.findElement(By.id("cate_split_ig_chart")).getText();

	if (category_split == true ) {

		System.out.println("Data showing proper!");
		System.out.println(category_split1);



	}else {
		System.out.println("Data not showing proper!");


	}
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,650)");
	//Interactions Recieved per content
	System.out.println("****Interactions Recieved per content ***********");
	boolean intraction_recived =driver.findElement(By.id("int_split_ig")).isDisplayed();
	String intraction_recived1=driver.findElement(By.id("int_split_ig")).getText();

	if (intraction_recived == true ) {

		System.out.println("Data showing proper!");
		System.out.println(intraction_recived1);



	}else {
		System.out.println("Data not showing proper!");


	}


	//Reach
		System.out.println("****Reach ***********");
		boolean Reach_insta  =driver.findElement(By.id("ig_reach_block")).isDisplayed();
		boolean Reach_youtube  =driver.findElement(By.id("yt_reach_block")).isDisplayed();
		String Reach_ig=driver.findElement(By.id("ig_reach_block")).getText();
		String Reach_yt=driver.findElement(By.id("yt_reach_block")).getText();

		if (Reach_insta == true ) {

			System.out.println("Data showing proper!");
			System.out.println(Reach_ig);



		}else {
			System.out.println("Data not showing proper!");


		}
if (Reach_youtube == true ) {

			System.out.println("Data showing proper!");
			System.out.println(Reach_yt);



		}else {
			System.out.println("Data not showing proper!");


		}
js.executeScript("window.scrollBy(0,650)");
	Thread.sleep(2000);
	//Weekly Trackers

	System.out.println("****Weekly Trackers  ***********");
	boolean Weekly_Trackers =driver.findElement(By.xpath("//*[@id=\"campaign-tracker\"]/div[1]/div/div[2]")).isDisplayed();
	String Weekly_Trackers1=driver.findElement(By.xpath("//*[@id=\"campaign-tracker\"]/div[1]/div/div[2]")).getText();

	if (Weekly_Trackers == true ) {

		System.out.println("Data showing proper!");
		System.out.println(Weekly_Trackers1);



	}else {
		System.out.println("Data not showing proper!");


	}

}

public void Advance_filtter_Testing_Instagram() throws InterruptedException {
	influencer_suite.click();
	curated_list.click();
	add.click();
	Advance_filtter.click();
	Thread.sleep(2000);
	//select actegory
	driver.findElement(By.xpath("//*[@id=\"ig_filters\"]/div[1]/div[2]/div[1]/div/button/span[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"ig_filters\"]/div[1]/div[2]/div[1]/div/div/ul/li[4]/a")).click();
	//select location

	driver.findElement(By.xpath("//*[@id=\"ig_filters\"]/div[1]/div[2]/div[2]/div/button")).click();
	driver.findElement(By.xpath("//*[@id=\"ig_filters\"]/div[1]/div[2]/div[2]/div/div/div/input")).sendKeys("mumbai");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Mumbai")).click();

	//Audience location

	driver.findElement(By.xpath("//*[@id=\"ig_filters\"]/div[2]/div[2]/div[1]/div/button/span[1]")).click();

	driver.findElement(By.xpath("//*[@id=\"ig_filters\"]/div[2]/div[2]/div[1]/div/div/div/input")).sendKeys("mumbai");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Mumbai")).click();

	//Audience Age
	driver.findElement(By.xpath("//*[@id=\"ig_filters\"]/div[2]/div[2]/div[2]/div/button/span[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"ig_filters\"]/div[2]/div[2]/div[2]/div/div/ul/li[2]/a/span[1]")).click();

	//Audience language hindi
	driver.findElement(By.xpath("//*[@id=\"ig_filters\"]/div[2]/div[2]/div[3]/div/button/span[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"ig_filters\"]/div[2]/div[2]/div[3]/div/div/div/input")).sendKeys("Hindi");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Hindi")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"ig_filters\"]/div[2]/div[3]/span[2]")).click();
	Thread.sleep(2000);

String ig_list= driver.findElement(By.xpath("//*[@id=\"ig_list\"]/div")).getText();
System.out.println("Result will be="+ig_list);



//driver.findElement(By.xpath("//*[@id=\"ig_filters\"]/div[1]/div[2]/div[4]/div")).isDisplayed();
WebElement slider = driver.findElement(By.xpath("//*[@id=\"ig_filters\"]/div[1]/div[2]/div[4]/div/span/span[3]"));
Actions action =new Actions(driver);


}


public void Advance_filtter_Testing_Youtube() throws InterruptedException {
	influencer_suite.click();
	curated_list.click();
	add.click();
	Advance_filtter.click();
	driver.findElement(By.id("inflYoutube")).click();
	Thread.sleep(2000);
	//select actegory
		driver.findElement(By.xpath("//*[@id=\"yt_filters\"]/div[1]/div[2]/div[1]/div/button/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"yt_filters\"]/div[1]/div[2]/div[1]/div/div/div/input")).sendKeys("food");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Food")).click();

		// influencer location

		driver.findElement(By.xpath("//*[@id=\"yt_filters\"]/div[1]/div[2]/div[2]/div/button/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"yt_filters\"]/div[1]/div[2]/div[2]/div/div/div/input")).sendKeys("delhi");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Delhi NCR")).click();

		driver.findElement(By.xpath("//*[@id=\"yt_filters\"]/div[2]/div/span[2]")).click();


}

public void view_summery_campings() throws InterruptedException {
	influencer_suite.click();
	curated_list.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[1]/div/div[2]/span/img")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[1]/div/div[2]/span/input")).sendKeys("testing report");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div/div/div")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/div[5]/div[3]/a[1]")).isEnabled();
	driver.findElement(By.xpath("/html/body/div[5]/div[3]/a[1]")).click();

	boolean cards=driver.findElement(By.id("preCampaignStats")).isDisplayed();
	String score_cards=driver.findElement(By.id("preCampaignStats")).getText();

	if(cards==true) {

		System.out.println(score_cards);


	}else {

		System.out.println("cards instagram showing blank");

	}
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"youtube_summary_menu\"]")).click();
	boolean cards_yt=driver.findElement(By.id("preCampaignStatsYT")).isDisplayed();
	String score_cards_yt=driver.findElement(By.id("preCampaignStatsYT")).getText();

if(cards_yt==true) {

		System.out.println(score_cards_yt);


	}else {

		System.out.println("cards youtube showing blank");

	}
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"campaign_pre_campaign_analysis\"]/div/div/div[1]/button/span")).click();

}
}
