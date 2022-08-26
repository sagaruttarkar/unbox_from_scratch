package modules;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.base_app1;

public class Influencer_tracking extends base_app1{


	@FindBy(xpath="//img[contains(@src,'https://app.unboxsocial.com/public/images/sidebar-icons/infltracking.svg')]")
	WebElement influencertracking;

	@FindBy(xpath="//a[@href='https://app.unboxsocial.com/influencerTracking']")
	WebElement influencertracking_list;


	@FindBy(xpath="//i[@class='fa fa-plus add_acc_plus']")
	WebElement addplus;

	@FindBy(xpath="//img[@class='list-search-icon search-anywhere-in-page']")
	WebElement searchicon;

	@FindBy(xpath="//input[@placeholder='Search by Name or Handle']")
	WebElement searchinput;


	@FindBy(xpath="//a[normalize-space()='Back']")
	WebElement backbtn;

	@FindBy(id="link_for_IG1")
	WebElement posts_tabs;



	@FindBy(xpath="//a[@href='https://app.unboxsocial.com/influencerTracking/brandSafety']")
	WebElement brand_safty_report;
	
	
@FindBy (xpath="//button[normalize-space()='Refresh']")
WebElement refreshbtn;


	public  Influencer_tracking() {

		PageFactory.initElements(driver, this);


		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, 1200);  
		
public void Testcase_Influencer_tracking_IG_search_suggestion(String  handlename) throws InterruptedException {
	Thread.sleep(2000);
	influencertracking.click();
	Thread.sleep(2000);
	influencertracking_list.click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-plus add_acc_plus']")));
	addplus.click();
Thread.sleep(5000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("recommended-influencer")));
searchinput.sendKeys(handlename);

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='inner_content']")));
driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[1]/div/div/div[2]/div/div/div/div/div/div[2]/div[1]/div[3]/div/div/table/tbody/tr[1]/td[1]/div/img")).click();
Thread.sleep(2000);
driver.findElement(By.id("track")).click();
Thread.sleep(5000);
backbtn.click();
Thread.sleep(2000);
driver.navigate().refresh();
searchicon.click();
Thread.sleep(5000);
searchinput.sendKeys(handlename);
Thread.sleep(5000);
driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div[2]/div/div/div/table/tbody/tr/td[6]/img")).click();
Thread.sleep(2000);
driver.findElement(By.id("delete-btn")).click();
Thread.sleep(3000);


}
public void Testcase_IG_metrics_vadlidation(String handlename ) throws InterruptedException, AWTException {
	Thread.sleep(2000);
	influencertracking.click();
	Thread.sleep(2000);
	influencertracking_list.click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-plus add_acc_plus']")));
	addplus.click();
Thread.sleep(4000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("recommended-influencer")));
searchinput.sendKeys(handlename);

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='inner_content']")));
driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[1]/div/div/div[2]/div/div/div/div/div/div[2]/div[1]/div[3]/div/div/table/tbody/tr[1]/td[1]/div/img")).click();
Thread.sleep(2000);
driver.findElement(By.id("track")).click();
Thread.sleep(5000);
backbtn.click();
Thread.sleep(2000);
driver.navigate().refresh();
searchicon.click();
searchinput.sendKeys(handlename);
Thread.sleep(5000);
driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div[2]/div/div/div/table/tbody/tr/td[6]/img")).click();
Thread.sleep(2000);
driver.findElement(By.id("delete-btn")).click();
Thread.sleep(3000);
influencertracking.click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-plus add_acc_plus']")));
addplus.click();
Thread.sleep(2000);
Thread.sleep(4000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("recommended-influencer")));
searchinput.sendKeys(handlename);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='inner_content']")));
driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[1]/div/div/div[2]/div/div/div/div/div/div[2]/div[1]/div[3]/div/div/table/tbody/tr[1]/td[1]/div/img")).click();
Thread.sleep(2000);
driver.findElement(By.id("track")).click();
Thread.sleep(5000);
backbtn.click();
Thread.sleep(2000);
driver.navigate().refresh();
searchicon.click();
searchinput.sendKeys(handlename);
Thread.sleep(5000);
driver.findElement(By.xpath("//i[@class='fa fa-eye view_right']")).click();
ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
driver.switchTo().window(tabs2.get(1));
Thread.sleep(2000);
// Refresh button logic
try
{
	refreshbtn.isDisplayed();
  System.out.println("Submit button has displayed");
	refreshbtn.click();
}
catch (Exception e)
{
  System.out.println("Submit button did not displayed");
} 
////Engagmant Rate
System.out.println("Engagmant Rate");
Boolean ER = driver.findElement(By.id("engagementRate")).isDisplayed();
String  ER1 = driver.findElement(By.id("engagementRate")).getText();

if(ER == true) {
System.out.println("Data loaded properly");
System.out.println(ER1);


}
else {

System.out.println("Data not loaded properly");

}
////Average Engagement Per Content Form
System.out.println("Average Engagement Per Content Form ");
Boolean AV = driver.findElement(By.id("catER")).isDisplayed();
String  AV1 = driver.findElement(By.id("catER")).getText();

if(AV == true) {
System.out.println("Data loaded properly");
System.out.println(AV1);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,650)");
////Interactions received on your content
System.out.println("Interactions received on your content");
Boolean intrac = driver.findElement(By.id("instaAudienceInterraction")).isDisplayed();
String  intrac1 = driver.findElement(By.id("instaAudienceInterraction")).getText();

if(intrac == true) {
System.out.println("Data loaded properly");
System.out.println(intrac1);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,650)");

////Content themes Brands have been talking about
System.out.println("Content themes Brands have been talking about ");
Boolean brand = driver.findElement(By.id("talkingAbout")).isDisplayed();
String  brand1 = driver.findElement(By.id("talkingAbout")).getText();

if(brand == true) {
System.out.println("Data loaded properly");
System.out.println(brand1);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,650)");
////How has the audience interacted?
System.out.println("How has the audience interacted? ");
Boolean d = driver.findElement(By.id("interaction_data")).isDisplayed();
String  d1 = driver.findElement(By.id("interaction_data")).getText();

if(d == true) {
System.out.println("Data loaded properly");
System.out.println(d1);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,650)");
////Top Hashtags
System.out.println("Top Hashtags");
Boolean top = driver.findElement(By.id("tophastag")).isDisplayed();
String  top1 = driver.findElement(By.id("tophastag")).getText();

if(top == true) {
System.out.println("Data loaded properly");
System.out.println(top1);


}
else {

System.out.println("Data not loaded properly");

}


////Audience Interest
System.out.println("Audience Interest");
Boolean aud = driver.findElement(By.id("audienceInterest")).isDisplayed();
String  aud1 = driver.findElement(By.id("audienceInterest")).getText();

if(aud == true) {
System.out.println("Data loaded properly");
System.out.println(aud1);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(2000);
((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
Thread.sleep(2000);
// posts tab
posts_tabs.click();
Thread.sleep(2000);
System.out.println("NO of posts");
Boolean totalpost = driver.findElement(By.id("totalPosts")).isDisplayed();
String  totalpost1 = driver.findElement(By.id("totalPosts")).getText();

if(totalpost == true) {
System.out.println("Data loaded properly");
System.out.println(totalpost1);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,650)");

System.out.println("All posts");
driver.findElement(By.xpath("//input[@placeholder='Search through all the posts for any campaign']")).sendKeys("puma");
Thread.sleep(2000);
driver.findElement(By.xpath("//h3[normalize-space()='Search Post']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@id='search-all-post']")).click();
Thread.sleep(8000);
String all_data=driver.findElement(By.xpath("//div[@class='col-md-12 no-padding text-center public_profile_ig competition-chart-contained posts']")).getText();
System.out.println("Result of search"+all_data);
Thread.sleep(2000);
((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
Thread.sleep(2000);
driver.findElement(By.id("link_for_IG4")).click();
Thread.sleep(2000);
String brand_list=driver.findElement(By.id("all-brands-worked-list")).getText();
System.out.println(brand_list);
driver.findElement(By.xpath("//span[@class='view-all medium']")).click();
Thread.sleep(5000);
String popup_data=driver.findElement(By.id("topBrands_recent_popup")).getText();
System.out.println(popup_data);
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id=\"brnad-detail\"]/div/div/div/button")).click();
Thread.sleep(2000);
System.out.println("Performance by brand");
Boolean p_brand = driver.findElement(By.id("top_brands_er")).isDisplayed();
String  p_brand1 = driver.findElement(By.id("top_brands_er")).getText();

if(p_brand == true) {
System.out.println("Data loaded properly");
System.out.println(p_brand1);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(2000);
System.out.println("Performance by industry");
Boolean I_brand = driver.findElement(By.id("top_industry_er")).isDisplayed();
String  I_brand1 = driver.findElement(By.id("top_industry_er")).getText();

if(I_brand == true) {
System.out.println("Data loaded properly");
System.out.println(I_brand1);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,650)");
System.out.println("Brands most frequently worked with");
Boolean brand_work = driver.findElement(By.id("brands_worked_frequency")).isDisplayed();
String  brand_work1 = driver.findElement(By.id("brands_worked_frequency")).getText();

if(brand_work == true) {
System.out.println("Data loaded properly");
System.out.println(brand_work1);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,650)");
System.out.println("Brands most successfully worked with");
Boolean Sucsess1_brands_worked_er = driver.findElement(By.id("brands_worked_er")).isDisplayed();
String  Sucsess_brands_worked_er = driver.findElement(By.id("brands_worked_er")).getText();

if(Sucsess1_brands_worked_er == true) {
System.out.println("Data loaded properly");
System.out.println(Sucsess_brands_worked_er);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(2000);
influencertracking.click();
Thread.sleep(2000);
influencertracking_list.click();
searchicon.click();

//driver.navigate().refresh();
searchinput.sendKeys(handlename);
Thread.sleep(8000);
driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div[2]/div/div/div/table/tbody/tr/td[6]/img")).click();
Thread.sleep(2000);
driver.findElement(By.id("delete-btn")).click();
Robot robot = new Robot();
//press key Ctrl+Shift+r
robot.keyPress(KeyEvent.VK_CONTROL);
robot.delay(100);
robot.keyPress(KeyEvent.VK_SHIFT);
robot.delay(100);
robot.keyPress(KeyEvent.VK_R);
//relase key Ctrl+Shift+r
robot.delay(100);
robot.keyRelease(KeyEvent.VK_R);
robot.delay(100);
robot.keyRelease(KeyEvent.VK_SHIFT);
robot.delay(100);
robot.keyRelease(KeyEvent.VK_CONTROL);
Thread.sleep(2000);
driver.close();
Thread.sleep(5000);
driver.switchTo().window(tabs2.get(0));
driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div[2]/div/div/div/table/tbody/tr/td[6]/img")).click();
Thread.sleep(2000);
driver.findElement(By.id("delete-btn")).click();

}


public void Testcase_TW_metrics_vadlidation(String TW_handlename) throws InterruptedException, AWTException {
	Thread.sleep(2000);
	influencertracking.click();
	Thread.sleep(2000);
	influencertracking_list.click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-plus add_acc_plus']")));
	addplus.click();
Thread.sleep(4000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("recommended-influencer")));
searchinput.sendKeys(TW_handlename);

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='inner_content']")));
driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[1]/div/div/div[2]/div/div/div/div/div/div[2]/div[1]/div[3]/div/div/table/tbody/tr[1]/td[1]/div/img")).click();
Thread.sleep(2000);
driver.findElement(By.id("track")).click();
Thread.sleep(5000);
backbtn.click();
Thread.sleep(2000);
driver.navigate().refresh();
searchicon.click();
searchinput.sendKeys(TW_handlename);
Thread.sleep(5000);
driver.findElement(By.xpath("//i[@class='fa fa-eye view_right']")).click();
ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
driver.switchTo().window(tabs2.get(1));
Thread.sleep(4000);
//Refresh button logic
try
{
	refreshbtn.isDisplayed();
  System.out.println("Submit button has displayed");
	refreshbtn.click();
}
catch (Exception e)
{
  System.out.println("Submit button did not displayed");
} 
//



// insight tab
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tweet_timeline")));
System.out.println("Tweet Timeline");
Boolean Sucsess1_tweet_timeline = driver.findElement(By.id("tweet_timeline")).isDisplayed();
String  Sucsess_tweet_timeline = driver.findElement(By.id("tweet_timeline")).getText();

if(Sucsess1_tweet_timeline == true) {
System.out.println("Data loaded properly");
System.out.println(Sucsess_tweet_timeline);


}
else {

System.out.println("Data not loaded properly");

}
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("retweetedTweetsOverTime")));
System.out.println("Retweets Over Time");
Boolean Sucsess1_Retweets_Over_Time = driver.findElement(By.id("retweetedTweetsOverTime")).isDisplayed();
String  Sucsess_Retweets_Over_Time = driver.findElement(By.id("retweetedTweetsOverTime")).getText();

if(Sucsess1_Retweets_Over_Time == true) {
System.out.println("Data loaded properly");
System.out.println(Sucsess_Retweets_Over_Time);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,650)");
System.out.println("Top Hashtags");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("topHashtags")));
Boolean Sucsess1_tophashtag = driver.findElement(By.id("topHashtags")).isDisplayed();
String  Sucsess_tophashtag = driver.findElement(By.id("topHashtags")).getText();

if(Sucsess1_tophashtag == true) {
System.out.println("Data loaded properly");
System.out.println(Sucsess_tophashtag);


}
else {

System.out.println("Data not loaded properly");

}
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("topMentions")));
System.out.println("Top Mentions");
Boolean Sucsess1_topmentions = driver.findElement(By.id("topMentions")).isDisplayed();
String  Sucsess_topmentions = driver.findElement(By.id("topMentions")).getText();

if(Sucsess1_topmentions == true) {
System.out.println("Data loaded properly");
System.out.println(Sucsess_topmentions);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,650)");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("genderSplit")));
System.out.println("Gender Split ");
Boolean Sucsess1_genderSplit = driver.findElement(By.id("genderSplit")).isDisplayed();
String  Sucsess_genderSplit = driver.findElement(By.id("genderSplit")).getText();

if(Sucsess1_genderSplit == true) {
System.out.println("Data loaded properly");
System.out.println(Sucsess_genderSplit);


}
else {

System.out.println("Data not loaded properly");

}
System.out.println("Language");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("language_mentions_retweets")));
Boolean Sucsess1_language = driver.findElement(By.id("language_mentions_retweets")).isDisplayed();
String  Sucsess_language = driver.findElement(By.id("language_mentions_retweets")).getText();

if(Sucsess1_language == true) {
System.out.println("Data loaded properly");
System.out.println(Sucsess_language);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,650)");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("audienceInterest")));
System.out.println("Audience Interest");
Boolean Sucsess1_audienceInterest = driver.findElement(By.id("audienceInterest")).isDisplayed();
String  Sucsess_audienceInterest = driver.findElement(By.id("audienceInterest")).getText();

if(Sucsess1_audienceInterest == true) {
System.out.println("Data loaded properly");
System.out.println(Sucsess_audienceInterest);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,650)");
System.out.println("List of Retweeters");
Boolean Sucsess1_retweets = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[6]/div[2]/div/div[5]/div/div")).isDisplayed();
String  Sucsess_retweets = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[6]/div[2]/div/div[5]/div/div")).getText();
                                                       
if(Sucsess1_retweets == true) {
System.out.println("Data loaded properly");
System.out.println(Sucsess_retweets);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,650)");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("top_interactive_posts")));
System.out.println("Most Engaging Tweets ");
Boolean Sucsess1_retweets_topintractive = driver.findElement(By.id("top_interactive_posts")).isDisplayed();
String  Sucsess_retweets_topintractive = driver.findElement(By.id("top_interactive_posts")).getText();

if(Sucsess1_retweets_topintractive == true) {
System.out.println("Data loaded properly");
System.out.println(Sucsess_retweets_topintractive);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(2000);
//js.executeScript("window.scrollBy(0,650)");
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("talkingAbout")));
//System.out.println("Content themes Brands have been talking about");
//Boolean Sucsess1_talkingAbout = driver.findElement(By.id("talkingAbout")).isDisplayed();
//String  Sucsess_talkingAbout = driver.findElement(By.id("talkingAbout")).getText();
//
//if(Sucsess1_talkingAbout == true) {
//System.out.println("Data loaded properly");
//System.out.println(Sucsess_talkingAbout);
//
//
//}
//else {
//
//System.out.println("Data not loaded properly");
//
//}
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,650)");
System.out.println("How has the audience interacted?");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("interaction_data")));
Boolean Sucsess1_interaction_data = driver.findElement(By.id("interaction_data")).isDisplayed();
String  Sucsess_interaction_data = driver.findElement(By.id("interaction_data")).getText();

if(Sucsess1_interaction_data == true) {
System.out.println("Data loaded properly");
System.out.println(Sucsess_interaction_data);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,650)");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("totalPosts")));
System.out.println("No. of Tweets");
Boolean Sucsess1_totalPosts = driver.findElement(By.id("totalPosts")).isDisplayed();
String  Sucsess_totalPosts = driver.findElement(By.id("totalPosts")).getText();

if(Sucsess1_totalPosts == true) {
System.out.println("Data loaded properly");
System.out.println(Sucsess_totalPosts);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,650)");

System.out.println("No. of Tweets");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("modeOfInteractionChartimage")));
Boolean Sucsess1_modeOfInteractionChartimage = driver.findElement(By.id("modeOfInteractionChartimage")).isDisplayed();
String  Sucsess_modeOfInteractionChartimage = driver.findElement(By.id("modeOfInteractionChartimage")).getText();

if(Sucsess1_modeOfInteractionChartimage == true) {
System.out.println("Data loaded properly");
System.out.println(Sucsess_modeOfInteractionChartimage);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,650)");
Thread.sleep(2000);
((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
Thread.sleep(2000);
driver.findElement(By.id("link_for_IG1")).click();
System.out.println("All tweets");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='Search through all the posts for any campaign']")).sendKeys("soodfoundation");
Thread.sleep(2000);
driver.findElement(By.xpath("//h3[normalize-space()='Search Post']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@id='search-all-post']")).click();
String alltweet = driver.findElement(By.id("pinBootBlock")).getText();
System.out.println(alltweet);
Thread.sleep(2000);
((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
Thread.sleep(2000);
driver.findElement(By.id("link_for_IG4")).click();
Thread.sleep(2000);
String brand_list=driver.findElement(By.id("all-brands-worked-list")).getText();
System.out.println(brand_list);
driver.findElement(By.xpath("//span[@class='view-all medium']")).click();
Thread.sleep(5000);
String popup_data=driver.findElement(By.id("topBrands_recent_popup")).getText();
System.out.println(popup_data);
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id=\"brnad-detail\"]/div/div/div/button")).click();
Thread.sleep(2000);
System.out.println("Performance by brand");
Boolean p_brand = driver.findElement(By.id("top_brands_er")).isDisplayed();
String  p_brand1 = driver.findElement(By.id("top_brands_er")).getText();

if(p_brand == true) {
System.out.println("Data loaded properly");
System.out.println(p_brand1);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(2000);
System.out.println("Performance by industry");
Boolean I_brand = driver.findElement(By.id("top_industry_er")).isDisplayed();
String  I_brand1 = driver.findElement(By.id("top_industry_er")).getText();

if(I_brand == true) {
System.out.println("Data loaded properly");
System.out.println(I_brand1);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,650)");
System.out.println("Brands most frequently worked with");
Boolean brand_work = driver.findElement(By.id("brands_worked_frequency")).isDisplayed();
String  brand_work1 = driver.findElement(By.id("brands_worked_frequency")).getText();

if(brand_work == true) {
System.out.println("Data loaded properly");
System.out.println(brand_work1);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,650)");
System.out.println("Brands most successfully worked with");
Boolean Sucsess1_brands_worked_er = driver.findElement(By.id("brands_worked_er")).isDisplayed();
String  Sucsess_brands_worked_er = driver.findElement(By.id("brands_worked_er")).getText();

if(Sucsess1_brands_worked_er == true) {
System.out.println("Data loaded properly");
System.out.println(Sucsess_brands_worked_er);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(2000);
driver.close();
Thread.sleep(2000);
driver.switchTo().window(tabs2.get(0));
Thread.sleep(5000);
driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div[2]/div/div/div/table/tbody/tr/td[6]/img")).click();
Thread.sleep(2000);
driver.findElement(By.id("delete-btn")).click();
Robot robot = new Robot();
//press key Ctrl+Shift+r
robot.keyPress(KeyEvent.VK_CONTROL);
robot.delay(100);
robot.keyPress(KeyEvent.VK_SHIFT);
robot.delay(100);
robot.keyPress(KeyEvent.VK_R);
//relase key Ctrl+Shift+r
robot.delay(100);
robot.keyRelease(KeyEvent.VK_R);
robot.delay(100);
robot.keyRelease(KeyEvent.VK_SHIFT);
robot.delay(100);
robot.keyRelease(KeyEvent.VK_CONTROL);
searchicon.click();
searchinput.sendKeys(TW_handlename);

}
public void Testcase_YT_metrics_vadlidation(String YT_handlename) throws InterruptedException, AWTException {
	Thread.sleep(2000);
	influencertracking.click();
	Thread.sleep(2000);
	influencertracking_list.click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-plus add_acc_plus']")));
	addplus.click();
Thread.sleep(8000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("recommended-influencer")));
searchinput.sendKeys(YT_handlename);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='inner_content']")));
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[1]/div/div/div[2]/div/div/div/div/div/div[2]/div[1]/div[3]/div/div/table/tbody/tr[1]/td[1]/div/img")).click();
Thread.sleep(2000);
driver.findElement(By.id("track")).click();
Thread.sleep(5000);
backbtn.click();
Thread.sleep(2000);
driver.navigate().refresh();
searchicon.click();
Thread.sleep(8000);
searchinput.sendKeys(YT_handlename);
Thread.sleep(5000);
driver.findElement(By.xpath("//i[@class='fa fa-eye view_right']")).click();
ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
driver.switchTo().window(tabs2.get(1));
Thread.sleep(4000);
//Refresh button logic
try
{
	refreshbtn.isDisplayed();
  System.out.println("Submit button has displayed");
	refreshbtn.click();
}
catch (Exception e)
{
  System.out.println("Submit button did not displayed");
} 
//

// insight tab
System.out.println("Interactions by Type ");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("interactionModeBars")));
Boolean Sucsess1_interactionModeBars = driver.findElement(By.id("interactionModeBars")).isDisplayed();
String  Sucsess_interactionModeBars = driver.findElement(By.id("interactionModeBars")).getText();

if(Sucsess1_interactionModeBars == true) {
System.out.println("Data loaded properly");
System.out.println(Sucsess_interactionModeBars);


}
else {

System.out.println("Data not loaded properly");

}
System.out.println("Interactions by Percentage ");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("modeofInteractionDoughnut")));
Boolean Sucsess1_modeofInteractionDoughnut = driver.findElement(By.id("modeofInteractionDoughnut")).isDisplayed();
String  Sucsess_modeofInteractionDoughnut = driver.findElement(By.id("modeofInteractionDoughnut")).getText();

if(Sucsess1_modeofInteractionDoughnut == true) {
System.out.println("Data loaded properly");
System.out.println(Sucsess_modeofInteractionDoughnut);


}
else {

System.out.println("Data not loaded properly");

}
System.out.println("Optimal Video Length ");
Thread.sleep(5000);
Boolean Sucsess1_optimum_video_lenght = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[6]/div[3]/div[3]/div/div/div/div[1]/div[2]")).isDisplayed();
String  Sucsess_optimum_video_lenght = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[6]/div[3]/div[3]/div/div/div/div[1]/div[2]")).getText();

if(Sucsess1_optimum_video_lenght == true) {
System.out.println("Data loaded properly");
System.out.println(Sucsess_optimum_video_lenght);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,650)");
System.out.println("Audience Interest");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("audienceInterest")));
Boolean Sucsess1_audienceInterest = driver.findElement(By.id("audienceInterest")).isDisplayed();
String  Sucsess_audienceInterest= driver.findElement(By.id("audienceInterest")).getText();

if(Sucsess1_audienceInterest == true) {
System.out.println("Data loaded properly");
System.out.println(Sucsess_audienceInterest);


}
else {

System.out.println("Data not loaded properly");

}
//Thread.sleep(2000);
//js.executeScript("window.scrollBy(0,650)");
//System.out.println("Content themes Brands have been talking about ");
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("talkingAbout")));
//Boolean Sucsess1_talkingAbout = driver.findElement(By.id("talkingAbout")).isDisplayed();
//String  Sucsess_talkingAbout= driver.findElement(By.id("talkingAbout")).getText();
//
//if(Sucsess1_talkingAbout == true) {
//System.out.println("Data loaded properly");
//System.out.println(Sucsess_talkingAbout);
//
//
//}
//else {
//
//System.out.println("Data not loaded properly");
//
//}
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,650)");
System.out.println("Most Engaging Posts ");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("topVideosYT")));
Boolean Sucsess1_topVideosYT = driver.findElement(By.id("topVideosYT")).isDisplayed();
String  Sucsess_topVideosYT= driver.findElement(By.id("topVideosYT")).getText();

if(Sucsess1_topVideosYT == true) {
System.out.println("Data loaded properly");
System.out.println(Sucsess_topVideosYT);


}
else {

System.out.println("Data not loaded properly");

}
((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
Thread.sleep(2000);
driver.findElement(By.id("link_for_YT2")).click();
Thread.sleep(2000);
System.out.println("No. of Posts");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("total_posts")));
Boolean Sucsess1_total_posts = driver.findElement(By.id("total_posts")).isDisplayed();
String  Sucsess_total_posts= driver.findElement(By.id("total_posts")).getText();

if(Sucsess1_total_posts == true) {
System.out.println("Data loaded properly");
System.out.println(Sucsess_total_posts);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,650)");

System.out.println("All Posts");
driver.findElement(By.xpath("//*[@id=\"magic-list\"]/div[2]/div[2]/input")).sendKeys("dhindora");
Thread.sleep(2000);
driver.findElement(By.xpath("//h3[normalize-space()='Search Post']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"search-all-post\"]")).click();
Thread.sleep(5000);
System.out.println("all videos");
Boolean Sucsess1_allVideosYT = driver.findElement(By.id("allVideosYT")).isDisplayed();
String  Sucsess_allVideosYT= driver.findElement(By.id("allVideosYT")).getText();

if(Sucsess1_allVideosYT == true) {
System.out.println("Data loaded properly");
System.out.println(Sucsess_allVideosYT);


}
else {

System.out.println("Data not loaded properly");

}
((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
Thread.sleep(2000);
driver.findElement(By.id("link_for_IG4")).click();
Thread.sleep(2000);
String brand_list=driver.findElement(By.id("all-brands-worked-list")).getText();
System.out.println(brand_list);
driver.findElement(By.xpath("//span[@class='view-all medium']")).click();
Thread.sleep(5000);
String popup_data=driver.findElement(By.id("topBrands_recent_popup")).getText();
System.out.println(popup_data);
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id=\"brnad-detail\"]/div/div/div/button")).click();
Thread.sleep(2000);
System.out.println("Performance by brand");
Boolean p_brand = driver.findElement(By.id("top_brands_er")).isDisplayed();
String  p_brand1 = driver.findElement(By.id("top_brands_er")).getText();

if(p_brand == true) {
System.out.println("Data loaded properly");
System.out.println(p_brand1);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(2000);
System.out.println("Performance by industry");
Boolean I_brand = driver.findElement(By.id("top_industry_er")).isDisplayed();
String  I_brand1 = driver.findElement(By.id("top_industry_er")).getText();

if(I_brand == true) {
System.out.println("Data loaded properly");
System.out.println(I_brand1);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,650)");
System.out.println("Brands most frequently worked with");
Boolean brand_work = driver.findElement(By.id("brands_worked_frequency")).isDisplayed();
String  brand_work1 = driver.findElement(By.id("brands_worked_frequency")).getText();

if(brand_work == true) {
System.out.println("Data loaded properly");
System.out.println(brand_work1);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,650)");
System.out.println("Brands most successfully worked with");
Boolean Sucsess1_brands_worked_er = driver.findElement(By.id("brands_worked_er")).isDisplayed();
String  Sucsess_brands_worked_er = driver.findElement(By.id("brands_worked_er")).getText();

if(Sucsess1_brands_worked_er == true) {
System.out.println("Data loaded properly");
System.out.println(Sucsess_brands_worked_er);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(2000);
influencertracking.click();
Thread.sleep(2000);
influencertracking_list.click();
searchicon.click();
//driver.navigate().refresh();
searchinput.sendKeys(YT_handlename);
Thread.sleep(8000);
driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div[2]/div/div/div/table/tbody/tr/td[6]/img")).click();
Thread.sleep(8000);
driver.findElement(By.id("delete-btn")).click();
Robot robot = new Robot();
//press key Ctrl+Shift+r
robot.keyPress(KeyEvent.VK_CONTROL);
robot.delay(100);
robot.keyPress(KeyEvent.VK_SHIFT);
robot.delay(100);
robot.keyPress(KeyEvent.VK_R);
//relase key Ctrl+Shift+r
robot.delay(100);
robot.keyRelease(KeyEvent.VK_R);
robot.delay(100);
robot.keyRelease(KeyEvent.VK_SHIFT);
robot.delay(100);
robot.keyRelease(KeyEvent.VK_CONTROL);
Thread.sleep(2000);
driver.close();
Thread.sleep(2000);
driver.switchTo().window(tabs2.get(0));

}
public void Testcases_add_manually_influencer_tracking(String handlename) throws InterruptedException {
	Thread.sleep(2000);
	influencertracking.click();
	Thread.sleep(2000);
	influencertracking_list.click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-plus add_acc_plus']")));
	addplus.click();
    Thread.sleep(2000);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("recommended-influencer")));
    searchinput.sendKeys(handlename);
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@class='btn-add-influencer-manually ']")).click();
    Thread.sleep(5000);
    //For instagram
    driver.findElement(By.xpath("//input[@placeholder='https://www.instagram.com/nike/']")).sendKeys("https://www.instagram.com/rohitsharma45/");
	// for facebook
    driver.findElement(By.xpath("//input[@id='yt_infl']")).sendKeys("https://www.youtube.com/channel/UC544wgZVGXORbuaZskjc6PQ");
    //for tweeter
    driver.findElement(By.xpath("//input[@id='tw_infl']")).sendKeys("https://twitter.com/SrBachchan");
    driver.findElement(By.xpath("//button[@id='add-link']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@id='add-link']")).click();
    Thread.sleep(2000);



}
// brand Safty//////////
public void add_brand_safty_List() throws InterruptedException {
	Thread.sleep(2000);
	influencertracking.click();
	Thread.sleep(2000);
	brand_safty_report.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//i[@class='fa fa fa-plus add_acc_plus']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='brandList_title']")).sendKeys("health");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='brandList_keyword']")));
	driver.findElement(By.xpath("//input[@id='brandList_keyword']")).sendKeys("health,exercise,fitness,bodystamina,immunity,booster,yoga,pushups,healthy");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='save_brandlist_data']")));
	driver.findElement(By.xpath("//button[@id='save_brandlist_data']")).click();
	Thread.sleep(5000);






}
public void Search_and_delete() throws InterruptedException {
	Thread.sleep(2000);
	influencertracking.click();
	Thread.sleep(2000);
	brand_safty_report.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='serach-post']")).sendKeys("health");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//img[@class='edit-icon delete_brandSafety_list'])[1]")).click();
	Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@id='delete-btn']")).click();
    Thread.sleep(5000);

}





}