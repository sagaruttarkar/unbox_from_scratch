package modules;

import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.Base_app;



public class Analytics  extends Base_app{

@FindBy(xpath="//a[@href='https://app.unboxsocial.com/socialinsights']")
WebElement Analytics;

@FindBy(xpath="//img[@class='list-search-icon search-anywhere-in-page']")
WebElement Search;

@FindBy(xpath="//input[@name='serach-post']")
WebElement Search_keyword;

@FindBy(id="link_for_85")
WebElement Audience;

@FindBy(id="link_for_84")
WebElement Posts;

@FindBy(className="add-data-this-page")
WebElement plus_icon;

public  Analytics() {

PageFactory.initElements(driver, this);


}
JavascriptExecutor js = (JavascriptExecutor) driver;
WebDriverWait wait = new WebDriverWait(driver, 1800);



public void Testcase_verify_Matrics_facbook_clients_account() throws InterruptedException {
System.out.println("Anyalytics_module_facebook");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/ul[1]/li[2]/a[1]")));
Analytics.click();
Thread.sleep(12000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]")));
Search.click();
Search_keyword.sendKeys("reliance digital");
Thread.sleep(4000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Reliance Digital')]")));
driver.findElement(By.xpath("//div[contains(text(),'Reliance Digital')]")).click();
/// insights cards



// custome cal
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"globalrange_analytics\"]/img")).click();
	Thread.sleep(2000);

driver.findElement(By.xpath("/html/body/div[6]/div[3]/ul/li[7]")).click();
Thread.sleep(2000);
driver.findElement(By.name("daterangepicker_start")).clear();
Thread.sleep(2000);
driver.findElement(By.name("daterangepicker_start")).sendKeys("01012022");
Thread.sleep(2000);
driver.findElement(By.name("daterangepicker_end")).clear();
Thread.sleep(4000);
driver.findElement(By.name("daterangepicker_end")).sendKeys("01052022");
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/button[1]")).click();


Thread.sleep(4000);

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
Thread.sleep(4000);

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
Thread.sleep(4000);

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
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("engagementRate")));
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
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("impressions")));
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

wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("eng_con")));
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
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("instaAudienceInterraction")));
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

wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("topPostByEngagement")));
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

wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("callToAction")));
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
Audience.click();
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
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("online_followers")));
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
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("brandsTalkingAboutParentContainer")));
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
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sentimentSplit")));
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
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("emojiSentimentHolder")));
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

wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("positive_feedback_pie")));
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
Thread.sleep(4000);
((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");

Posts.click();

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
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("reaction_counter")));
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
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("total_posts")));
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
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postType_fbengagement")));
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
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postsVideoViews")));
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
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("all_posts_fb")));


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
driver.findElement(By.xpath("//*[@id=\"all_posts_fb\"]/div[2]")).click();
Thread.sleep(5000);

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
driver.findElement(By.xpath("//*[@id=\"post-detail-facebook\"]/div/div/button")).click();
Thread.sleep(4000);
js.executeScript("window.scrollBy(0,-350)", "");
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id=\"magic-list\"]/div[3]/span/img")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id=\"magic-list\"]/div[3]/span/input")).sendKeys("#Reliance");
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id=\"magic-list\"]/div[3]/a/div/i")).click();
Thread.sleep(4000);
driver.findElement(By.id("likes_sort")).click();
Thread.sleep(8000);
String filtter_result = driver.findElement(By.id("all_posts_fb")).getText();
System.out.println("result is according to filtter"+filtter_result);

}
public void Testcase_verify_Matrics_facbook_trial_account() throws InterruptedException {
System.out.println("Anyalytics_module_facebook trial account");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/ul[1]/li[2]/a[1]")));
Analytics.click();
Thread.sleep(4000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]")));
Search.click();
Search_keyword.sendKeys("Ducati Singapore");
Thread.sleep(4000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Ducati Singapore')]")));
driver.findElement(By.xpath("//div[contains(text(),'Ducati Singapore')]")).click();
/// insights cards
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id=\"globalrange_analytics\"]/img")).click();
Thread.sleep(4000);
// 1 year
driver.findElement(By.xpath("/html/body/div[6]/div[3]/ul/li[6]")).click();


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
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("views_total")));

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
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("referrals_view")));

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
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("engagementRate")));
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
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("impressions")));
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

wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("eng_con")));
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
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("instaAudienceInterraction")));
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
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("modeOfInteractionChartimage")));
js.executeScript("window.scrollBy(0,250)");
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


wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("topPostByEngagement")));
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

wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("callToAction")));
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


/// tab   Audience
Audience.click();
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
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("online_followers")));
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
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("brandsTalkingAboutParentContainer")));
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
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sentimentSplit")));
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
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("emojiSentimentHolder")));
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

wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("positive_feedback_pie")));
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
Thread.sleep(4000);
((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");

Posts.click();

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
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("reaction_counter")));
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
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("total_posts")));
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
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postType_fbengagement")));
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
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postsVideoViews")));
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
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("all_posts_fb")));


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




}







public void Testcase_verify_Matrics_instagram_clients_account() throws InterruptedException {
System.out.println("Analytics_module_instagram");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/ul[1]/li[2]/a[1]")));
Analytics.click();
Thread.sleep(4000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]")));
Search.click();
Search_keyword.sendKeys("spoken fest");
Thread.sleep(4000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("all_final_social_profiles")));
driver.findElement(By.xpath("//div[contains(text(),'Spoken Fest')]")).click();

// custome
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"globalrange_analytics\"]/img")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("/html/body/div[6]/div[3]/ul/li[7]")).click();
Thread.sleep(2000);
Thread.sleep(2000);
driver.findElement(By.name("daterangepicker_start")).clear();
Thread.sleep(2000);
driver.findElement(By.name("daterangepicker_start")).sendKeys("01012022");
Thread.sleep(2000);
driver.findElement(By.name("daterangepicker_end")).clear();
Thread.sleep(4000);
driver.findElement(By.name("daterangepicker_end")).sendKeys("01052022");
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/button[1]")).click();

//insight tab

System.out.println("************influencer_insight**********");

Boolean card = driver.findElement(By.id("influencerinsights")).isDisplayed();
String  carddetails = driver.findElement(By.id("influencerinsights")).getText();

if(card == true) {
System.out.println("Data loaded properly");
System.out.println(carddetails);
}
else {

System.out.println("Data not loaded properly");


}
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
//follower_growth
System.out.println("***/follower_growth *****");

Boolean follower_g = driver.findElement(By.id("follower_growth")).isDisplayed();
String  follower_g1 = driver.findElement(By.id("follower_growth")).getText();

if(follower_g == true) {
System.out.println("Data loaded properly");
System.out.println(follower_g1);


}
else {

System.out.println("Data not loaded properly");

}

System.out.println("***Impressions & Reach *****");

Boolean imp_nd_reach = driver.findElement(By.id("impressions")).isDisplayed();
String  imp_nd_reach1 = driver.findElement(By.id("impressions")).getText();

if(imp_nd_reach == true) {
System.out.println("Data loaded properly");
System.out.println(imp_nd_reach1);


}
else {

System.out.println("Data not loaded properly");

}

js.executeScript("window.scrollBy(0,650)");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("totalPosts")));
System.out.println("************No. of Posts************");

Boolean no_post = driver.findElement(By.id("totalPosts")).isDisplayed();
String  no_post1 = driver.findElement(By.id("totalPosts")).getText();

if(no_post == true) {
System.out.println("Data loaded properly");
System.out.println(no_post1);


}
else {

System.out.println("Data not loaded properly");


}
//Average Engagement Per Content Form (by Followers)
System.out.println("************Average Engagement Per Content Form (by Followers)************");

Boolean ER_follower = driver.findElement(By.id("catER")).isDisplayed();
String  ER_follower1 = driver.findElement(By.id("catER")).getText();

if(ER_follower == true) {
System.out.println("Data loaded properly");
System.out.println(ER_follower1);

}
else {

System.out.println("Data not loaded properly");


}
//Average Engagement Per Content Form (by Reach


System.out.println("************Average Engagement Per Content Form (by Reach)************");

Boolean ER_follower_reach = driver.findElement(By.id("engagement_by_reach")).isDisplayed();
String  ER_follower_reach1 = driver.findElement(By.id("engagement_by_reach")).getText();

if(ER_follower_reach == true) {
System.out.println("Data loaded properly");
System.out.println(ER_follower_reach1);


}
else {

System.out.println("Data not loaded properly");


}
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("bestTimeToPostContainer")));
js.executeScript("window.scrollBy(0,650)");
//Best time to Post

System.out.println("************Best time to Post ************");

Boolean best_time_post = driver.findElement(By.id("bestTimeToPostContainer")).isDisplayed();
String  best_time_post1 = driver.findElement(By.id("bestTimeToPostContainer")).getText();

if(best_time_post == true) {
System.out.println("Data loaded properly");
System.out.println(best_time_post1);


}
else {

System.out.println("Data not loaded properly");


}
//Online Followers

System.out.println("************Online Followers ***********");

Boolean ol_follower = driver.findElement(By.id("online_followers")).isDisplayed();
String  ol_follower1 = driver.findElement(By.id("online_followers")).getText();

if(ol_follower == true) {
System.out.println("Data loaded properly");
System.out.println(ol_follower1);


}
else {

System.out.println("Data not loaded properly");


}

js.executeScript("window.scrollBy(0,650)");
//Website & Email Clicks


System.out.println("************Website & Email Clicks***********");

Boolean website_click = driver.findElement(By.id("website_clicks")).isDisplayed();
String  website_click1 = driver.findElement(By.id("website_clicks")).getText();

if(website_click == true) {
System.out.println("Data loaded properly");
System.out.println(website_click1);


}
else {

System.out.println("Data not loaded properly");


}


System.out.println("************Profile Views **********");

Boolean profile_review = driver.findElement(By.id("profile_views")).isDisplayed();
String  profile_review1 = driver.findElement(By.id("profile_views")).getText();

if(profile_review == true) {
System.out.println("Data loaded properly");
System.out.println(profile_review1);


}
else {

System.out.println("Data not loaded properly");


}


wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("topPostByEngagementTabs")));
js.executeScript("window.scrollBy(0,650)");
///Recommended posts to promote

System.out.println("*****Recommended posts to promote ***********");

Boolean top_post = driver.findElement(By.id("topPostByEngagementTabs")).isDisplayed();
String  top_post1 = driver.findElement(By.id("topPostByEngagementTabs")).getText();

if(top_post == true) {
System.out.println("Data loaded properly");
System.out.println(top_post1);


}
else {

System.out.println("Data not loaded properly");
}
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tophastag")));
js.executeScript("window.scrollBy(0,250)");
//TOP Hastag
System.out.println("********* TOP HASTAG***************");

Boolean top_Hashtag = driver.findElement(By.id("tophastag")).isDisplayed();
String  top_Hashtag1 = driver.findElement(By.id("tophastag")).getText();

if(top_Hashtag == true) {
System.out.println("Data loaded properly");
System.out.println(top_Hashtag1);


}
else {

System.out.println("Data not loaded properly");
}
// performance of stories by content format
System.out.println("********* performance of stories by content format***************");

Boolean stories_format = driver.findElement(By.id("performance_content")).isDisplayed();
String  stories_format1 = driver.findElement(By.id("performance_content")).getText();

if(stories_format == true) {
System.out.println("Data loaded properly");
System.out.println(stories_format1);


}
else {

System.out.println("Data not loaded properly");
}


// AUDIENCE TAB
Thread.sleep(3000);
((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
driver.findElement(By.id("link_for_29")).click();

//Gender Split
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("genderSplit")));
System.out.println("*****Gender Split ***********");

Boolean gender_split = driver.findElement(By.id("genderSplit")).isDisplayed();
String  gender_split1 = driver.findElement(By.id("genderSplit")).getText();

if(gender_split == true) {
System.out.println("Data loaded properly");
System.out.println(gender_split1);


}
else {

System.out.println("Data not loaded properly");
}

System.out.println("*****Age and Gender Split***********");

Boolean age_gender = driver.findElement(By.id("ageGender")).isDisplayed();
String  age_gender1 = driver.findElement(By.id("ageGender")).getText();

if(age_gender == true) {
System.out.println("Data loaded properly");
System.out.println(age_gender1);


}
else {

System.out.println("Data not loaded properly");
}

js.executeScript("window.scrollBy(0,650)");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("audienceInterest")));

///Audience Interest

System.out.println("*****Audience Interest***********");

Boolean audience_intrest = driver.findElement(By.id("audienceInterest")).isDisplayed();
String  audience_intrest1 = driver.findElement(By.id("audienceInterest")).getText();

if(audience_intrest == true) {
System.out.println("Data loaded properly");
System.out.println(audience_intrest1);


}
else {

System.out.println("Data not loaded properly");
}


js.executeScript("window.scrollBy(0,650)");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("countrySpread")));
///location spread

System.out.println("*****location spread***********");

Boolean Loc_spread = driver.findElement(By.id("countrySpread")).isDisplayed();
String  Loc_spread1 = driver.findElement(By.id("countrySpread")).getText();

if(Loc_spread == true) {
System.out.println("Data loaded properly");
System.out.println(Loc_spread1);


}
else {

System.out.println("Data not loaded properly");
}


//Audience Quality

System.out.println("*****Audience Quality ***********");

Boolean act_quality = driver.findElement(By.id("activePassive")).isDisplayed();
String  act_quality1 = driver.findElement(By.id("activePassive")).getText();

if(act_quality == true) {
System.out.println("Data loaded properly");
System.out.println(act_quality1);


}
else {

System.out.println("Data not loaded properly");
}
Thread.sleep(5000);

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

js.executeScript("window.scrollBy(0,650)");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("instaAudienceInterraction")));
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

js.executeScript("window.scrollBy(0,650)");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("modeOfInteractionChartimage")));

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
// post tab
Thread.sleep(3000);
((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
Thread.sleep(3000);
driver.findElement(By.id("link_for_31")).click();

driver.findElement(By.xpath("//*[@id=\"magic-list\"]/div[1]/h5/div[2]/span/img")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id=\"magic-list\"]/div[1]/h5/div[2]/span/input")).sendKeys("spoken fest");
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id=\"magic-list\"]/div[1]/h5/div[2]/a/div")).click();
Thread.sleep(4000);
driver.findElement(By.id("comments_sort")).click();

Thread.sleep(4000);
String result=driver.findElement(By.id("postss")).getText();
System.out.println("result according to filtter"+result);
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/div/div[1]")));
//driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/div/div[1]")).click();
//Thread.sleep(4000);
//driver.findElement(By.xpath("/html/body/div[5]/div[5]/div/div/div[1]/button")).click();


Thread.sleep(3000);
((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
Thread.sleep(3000);
driver.findElement(By.id("link_for_32")).click();

///Stories tab

System.out.println("****Stories tab***********");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fbStoriesTopPosts")));
Boolean top_stories = driver.findElement(By.id("fbStoriesTopPosts")).isDisplayed();
String  top_stories1 = driver.findElement(By.id("fbStoriesTopPosts")).getText();

if(top_stories == true) {
System.out.println("Data loaded properly");
System.out.println(top_stories1);


}
else {

System.out.println("Data not loaded properly");


}

///////////////

}

public void Testcase_verify_Matrics_instagram_trials_account() throws InterruptedException {
System.out.println("Analytics_module_instagram");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/ul[1]/li[2]/a[1]")));
Analytics.click();
Thread.sleep(4000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]")));
Search.click();
Search_keyword.sendKeys("Youlry Designs");
Thread.sleep(8000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Youlry Designs')]")));
Thread.sleep(2000);
driver.findElement(By.xpath("//div[contains(text(),'Youlry Designs')]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id=\"globalrange_analytics\"]/img")).click();
Thread.sleep(4000);
// last 3 months
driver.findElement(By.xpath("/html/body/div[6]/div[3]/ul/li[4]")).click();
//insight tab

System.out.println("************influencer_insight**********");

Boolean card = driver.findElement(By.id("influencerinsights")).isDisplayed();
String  carddetails = driver.findElement(By.id("influencerinsights")).getText();

if(card == true) {
System.out.println("Data loaded properly");
System.out.println(carddetails);
}
else {

System.out.println("Data not loaded properly");


}
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
//follower_growth
System.out.println("***/follower_growth *****");

Boolean follower_g = driver.findElement(By.id("follower_growth")).isDisplayed();
String  follower_g1 = driver.findElement(By.id("follower_growth")).getText();

if(follower_g == true) {
System.out.println("Data loaded properly");
System.out.println(follower_g1);


}
else {

System.out.println("Data not loaded properly");

}

System.out.println("***Impressions & Reach *****");

Boolean imp_nd_reach = driver.findElement(By.id("impressions")).isDisplayed();
String  imp_nd_reach1 = driver.findElement(By.id("impressions")).getText();

if(imp_nd_reach == true) {
System.out.println("Data loaded properly");
System.out.println(imp_nd_reach1);


}
else {

System.out.println("Data not loaded properly");

}

js.executeScript("window.scrollBy(0,650)");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("totalPosts")));
System.out.println("************No. of Posts************");

Boolean no_post = driver.findElement(By.id("totalPosts")).isDisplayed();
String  no_post1 = driver.findElement(By.id("totalPosts")).getText();

if(no_post == true) {
System.out.println("Data loaded properly");
System.out.println(no_post1);


}
else {

System.out.println("Data not loaded properly");


}
//Average Engagement Per Content Form (by Followers)
System.out.println("************Average Engagement Per Content Form (by Followers)************");

Boolean ER_follower = driver.findElement(By.id("catER")).isDisplayed();
String  ER_follower1 = driver.findElement(By.id("catER")).getText();

if(ER_follower == true) {
System.out.println("Data loaded properly");
System.out.println(ER_follower1);


}
else {

System.out.println("Data not loaded properly");


}
//Average Engagement Per Content Form (by Reach


System.out.println("************Average Engagement Per Content Form (by Reach)************");

Boolean ER_follower_reach = driver.findElement(By.id("engagement_by_reach")).isDisplayed();
String  ER_follower_reach1 = driver.findElement(By.id("engagement_by_reach")).getText();

if(ER_follower_reach == true) {
System.out.println("Data loaded properly");
System.out.println(ER_follower_reach1);


}
else {

System.out.println("Data not loaded properly");


}
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("bestTimeToPostContainer")));
js.executeScript("window.scrollBy(0,650)");
//Best time to Post

System.out.println("************Best time to Post ************");

Boolean best_time_post = driver.findElement(By.id("bestTimeToPostContainer")).isDisplayed();
String  best_time_post1 = driver.findElement(By.id("bestTimeToPostContainer")).getText();

if(best_time_post == true) {
System.out.println("Data loaded properly");
System.out.println(best_time_post1);


}
else {

System.out.println("Data not loaded properly");


}
//Online Followers

System.out.println("************Online Followers ***********");

Boolean ol_follower = driver.findElement(By.id("online_followers")).isDisplayed();
String  ol_follower1 = driver.findElement(By.id("online_followers")).getText();

if(ol_follower == true) {
System.out.println("Data loaded properly");
System.out.println(ol_follower1);


}
else {

System.out.println("Data not loaded properly");


}

js.executeScript("window.scrollBy(0,650)");
//Website & Email Clicks


System.out.println("************Website & Email Clicks***********");

Boolean website_click = driver.findElement(By.id("website_clicks")).isDisplayed();
String  website_click1 = driver.findElement(By.id("website_clicks")).getText();

if(website_click == true) {
System.out.println("Data loaded properly");
System.out.println(website_click1);


}
else {

System.out.println("Data not loaded properly");


}


System.out.println("************Profile Views **********");

Boolean profile_review = driver.findElement(By.id("profile_views")).isDisplayed();
String  profile_review1 = driver.findElement(By.id("profile_views")).getText();

if(profile_review == true) {
System.out.println("Data loaded properly");
System.out.println(profile_review1);


}
else {

System.out.println("Data not loaded properly");


}


wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("topPostByEngagementTabs")));
js.executeScript("window.scrollBy(0,650)");
///Recommended posts to promote

System.out.println("*****Recommended posts to promote ***********");

Boolean top_post = driver.findElement(By.id("topPostByEngagementTabs")).isDisplayed();
String  top_post1 = driver.findElement(By.id("topPostByEngagementTabs")).getText();

if(top_post == true) {
System.out.println("Data loaded properly");
System.out.println(top_post1);


}
else {

System.out.println("Data not loaded properly");
}
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tophastag")));
js.executeScript("window.scrollBy(0,650)");

//TOP Hastag
System.out.println("********* TOP HASTAG***************");

Boolean top_Hashtag = driver.findElement(By.id("tophastag")).isDisplayed();
String  top_Hashtag1 = driver.findElement(By.id("tophastag")).getText();

if(top_Hashtag == true) {
System.out.println("Data loaded properly");
System.out.println(top_Hashtag1);


}
else {

System.out.println("Data not loaded properly");
}
//performance of stories by content format
System.out.println("********* performance of stories by content format***************");

Boolean stories_format = driver.findElement(By.id("performance_content")).isDisplayed();
String  stories_format1 = driver.findElement(By.id("performance_content")).getText();

if(stories_format == true) {
System.out.println("Data loaded properly");
System.out.println(stories_format1);


}
else {

System.out.println("Data not loaded properly");
}

Thread.sleep(3000);
((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
driver.findElement(By.id("link_for_29")).click();

//Gender Split
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("genderSplit")));
System.out.println("*****Gender Split ***********");

Boolean gender_split = driver.findElement(By.id("genderSplit")).isDisplayed();
String  gender_split1 = driver.findElement(By.id("genderSplit")).getText();

if(gender_split == true) {
System.out.println("Data loaded properly");
System.out.println(gender_split1);


}
else {

System.out.println("Data not loaded properly");
}

System.out.println("*****Age and Gender Split***********");

Boolean age_gender = driver.findElement(By.id("ageGender")).isDisplayed();
String  age_gender1 = driver.findElement(By.id("ageGender")).getText();

if(age_gender == true) {
System.out.println("Data loaded properly");
System.out.println(age_gender1);


}
else {

System.out.println("Data not loaded properly");
}

js.executeScript("window.scrollBy(0,650)");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("audienceInterest")));

///Audience Interest

System.out.println("*****Audience Interest***********");

Boolean audience_intrest = driver.findElement(By.id("audienceInterest")).isDisplayed();
String  audience_intrest1 = driver.findElement(By.id("audienceInterest")).getText();

if(audience_intrest == true) {
System.out.println("Data loaded properly");
System.out.println(audience_intrest1);


}
else {

System.out.println("Data not loaded properly");
}


js.executeScript("window.scrollBy(0,650)");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("countrySpread")));
///location spread

System.out.println("*****location spread***********");

Boolean Loc_spread = driver.findElement(By.id("countrySpread")).isDisplayed();
String  Loc_spread1 = driver.findElement(By.id("countrySpread")).getText();

if(Loc_spread == true) {
System.out.println("Data loaded properly");
System.out.println(Loc_spread1);


}
else {

System.out.println("Data not loaded properly");
}


//Audience Quality

System.out.println("*****Audience Quality ***********");

Boolean act_quality = driver.findElement(By.id("activePassive")).isDisplayed();
String  act_quality1 = driver.findElement(By.id("activePassive")).getText();

if(act_quality == true) {
System.out.println("Data loaded properly");
System.out.println(act_quality1);


}
else {

System.out.println("Data not loaded properly");
}

js.executeScript("window.scrollBy(0,650)");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("talkingAbout")));


///Content themes Brands have been talking about

System.out.println("*****Content themes Brands have been talking about ***********");

Boolean talking_abt = driver.findElement(By.id("talkingAbout")).isDisplayed();
String  talking_abt1 = driver.findElement(By.id("talkingAbout")).getText();

if(talking_abt == true) {
System.out.println("Data loaded properly");
System.out.println(talking_abt1);


}
else {

System.out.println("Data not loaded properly");
}

js.executeScript("window.scrollBy(0,650)");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sentimentSplit")));

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

js.executeScript("window.scrollBy(0,650)");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("instaAudienceInterraction")));
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

js.executeScript("window.scrollBy(0,650)");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("instaAudienceInterraction")));

System.out.println("*****Mode of Interaction 2***********");

Boolean inter = driver.findElement(By.id("instaAudienceInterraction")).isDisplayed();
String  inter2 = driver.findElement(By.id("instaAudienceInterraction")).getText();

if(inter == true) {
System.out.println("Data loaded properly");
System.out.println(inter2);


}
else {

System.out.println("Data not loaded properly");


}
// post tab
Thread.sleep(3000);
((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
Thread.sleep(3000);
driver.findElement(By.id("link_for_31")).click();
// comment time being
//driver.findElement(By.xpath("//*[@id=\"magic-list\"]/div[1]/h5/div[2]/span/img")).click();
//Thread.sleep(4000);
//driver.findElement(By.xpath("//*[@id=\"magic-list\"]/div[1]/h5/div[2]/span/input")).sendKeys("NBA75");
//Thread.sleep(4000);
//driver.findElement(By.xpath("//*[@id=\"magic-list\"]/div[1]/h5/div[2]/a/div")).click();
//Thread.sleep(4000);
//driver.findElement(By.id("comments_sort")).click();

wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postss")));
String result=driver.findElement(By.id("postss")).getText();
System.out.println("resuTestcase_verify_Matrics_instagram_clients_accountlt according to filtter"+result);

driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[3]/div/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/div/div[1]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("/html/body/div[5]/div[6]/div/div/div[1]/button")).click();

Thread.sleep(3000);
((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
Thread.sleep(3000);
driver.findElement(By.id("link_for_32")).click();

///Stories tab

System.out.println("****Stories tab***********");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fbStoriesTopPosts")));
Boolean top_stories = driver.findElement(By.id("fbStoriesTopPosts")).isDisplayed();
String  top_stories1 = driver.findElement(By.id("fbStoriesTopPosts")).getText();

if(top_stories == true) {
System.out.println("Data loaded properly");
System.out.println(top_stories1);


}
else {

System.out.println("Data not loaded properly");


}

///////////////

}





public void Testcase_verify_Matrics_twitter_clients_account() throws InterruptedException {
System.out.println("Analytics_module_twitter");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/ul[1]/li[2]/a[1]")));
Analytics.click();
Thread.sleep(4000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]")));
Search.click();
Search_keyword.sendKeys("Ramtons");
Thread.sleep(8000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Ramtons')]")));
Thread.sleep(2000);
driver.findElement(By.xpath("//div[contains(text(),'Ramtons')]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id=\"globalrange_analytics\"]/img")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("/html/body/div[6]/div[3]/ul/li[7]")).click();
// custome
Thread.sleep(2000);
driver.findElement(By.name("daterangepicker_start")).clear();
Thread.sleep(2000);
driver.findElement(By.name("daterangepicker_start")).sendKeys("01012022");
Thread.sleep(2000);
driver.findElement(By.name("daterangepicker_end")).clear();
Thread.sleep(4000);
driver.findElement(By.name("daterangepicker_end")).sendKeys("01052022");
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/button[1]")).click();
//cards
System.out.println("****Score cards***********");
Thread.sleep(4000);
Boolean score_card = driver.findElement(By.xpath("//*[@id=\"influencerinsights\"]/div[1]/div")).isDisplayed();
String  score_card1 = driver.findElement(By.xpath("//*[@id=\"influencerinsights\"]/div[1]/div")).getText();

if(score_card == true) {
System.out.println("Data loaded properly");
System.out.println(score_card1);


}
else {

System.out.println("Data not loaded properly");


}


//Tweet Timeline


System.out.println("****Tweet Timeline***********");
Thread.sleep(4000);
Boolean Tweet_t1 = driver.findElement(By.id("tweet_timeline")).isDisplayed();
String  Tweet_t = driver.findElement(By.id("tweet_timeline")).getText();

if(Tweet_t1 == true) {
System.out.println("Data loaded properly");
System.out.println(Tweet_t);


}
else {

System.out.println("Data not loaded properly");


}

//Total Interactions
System.out.println("****Total Interactions***********");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("net_fans_interactions")));
Boolean total_int = driver.findElement(By.id("net_fans_interactions")).isDisplayed();
String  total_int1 = driver.findElement(By.id("net_fans_interactions")).getText();

if(total_int == true) {
System.out.println("Data loaded properly");
System.out.println(total_int1);


}
else {

System.out.println("Data not loaded properly");


}
js.executeScript("window.scrollBy(0,650)");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("favouretedOverTime")));

//Favourited Over Time

System.out.println("****Favourited Over Time***********");
Thread.sleep(4000);
Boolean Fev_t = driver.findElement(By.id("favouretedOverTime")).isDisplayed();
String  Fev_t1 = driver.findElement(By.id("favouretedOverTime")).getText();

if(Fev_t == true) {
System.out.println("Data loaded properly");
System.out.println(Fev_t1);


}
else {

System.out.println("Data not loaded properly");


}
///Retweets Over Time
System.out.println("****/Retweets Over Time***********");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("retweetedTweetsOverTime")));
Boolean re_tweet = driver.findElement(By.id("retweetedTweetsOverTime")).isDisplayed();
String  re_tweet1 = driver.findElement(By.id("retweetedTweetsOverTime")).getText();

if(re_tweet == true) {
System.out.println("Data loaded properly");
System.out.println(re_tweet1);


}
else {

System.out.println("Data not loaded properly");


}
js.executeScript("window.scrollBy(0,650)");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("engagementRate")));

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

Thread.sleep(4000);
js.executeScript("window.scrollBy(0,650)");

//Total Tweets

System.out.println("*****Total Tweets ***********");

Boolean total_post = driver.findElement(By.id("totalPosts")).isDisplayed();
String  total_post1 = driver.findElement(By.id("totalPosts")).getText();

if(total_post == true) {
System.out.println("Data loaded properly");
System.out.println(total_post1);


}
else {

System.out.println("Data not loaded properly");


}
Thread.sleep(4000);
js.executeScript("window.scrollBy(0,650)");


System.out.println("*****Total Mentions ***********");

Boolean total_m = driver.findElement(By.id("total_mentions")).isDisplayed();
String  total_m1 = driver.findElement(By.id("total_mentions")).getText();

if(total_m == true) {
System.out.println("Data loaded properly");
System.out.println(total_m1);


}
else {

System.out.println("Data not loaded properly");


}

wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("referrals")));
//Top Linked Sources
System.out.println("*****Top Linked Sources ***********");

Boolean top_link = driver.findElement(By.id("referrals")).isDisplayed();
String  top_link1 = driver.findElement(By.id("referrals")).getText();

if(top_link == true) {
System.out.println("Data loaded properly");
System.out.println(top_link1);


}
else {

System.out.println("Data not loaded properly");


}
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("relatedHashtags")));
js.executeScript("window.scrollBy(0,650)");

//Top Hashtags

System.out.println("***** Top Hashtags  ***********");

Boolean top_hashtag = driver.findElement(By.id("relatedHashtags")).isDisplayed();
String  top_hashtag1 = driver.findElement(By.id("relatedHashtags")).getText();

if(top_hashtag == true) {
System.out.println("Data loaded properly");
System.out.println(top_hashtag1);


}
else {

System.out.println("Data not loaded properly");


}
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("relatedMentions")));
//Top Mentions
System.out.println("***** Top Mentions   ***********");

Boolean rel_mention = driver.findElement(By.id("relatedMentions")).isDisplayed();
String  rel_mention1 = driver.findElement(By.id("relatedMentions")).getText();

if(rel_mention == true) {
System.out.println("Data loaded properly");
System.out.println(rel_mention1);


}
else {

System.out.println("Data not loaded properly");


}
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("top_interactive_posts")));
js.executeScript("window.scrollBy(0,650)");
///Most Engaging Tweets

System.out.println("***** Most Engaging Tweets   ***********");

Boolean most_eng = driver.findElement(By.id("top_interactive_posts")).isDisplayed();
String  most_eng1 = driver.findElement(By.id("top_interactive_posts")).getText();

if(most_eng == true) {
System.out.println("Data loaded properly");
System.out.println(most_eng1);


}
else {

System.out.println("Data not loaded properly");


}
Thread.sleep(4000);
((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");

//Audience tab

driver.findElement(By.id("link_for_127")).click();


//	List of Mentions


System.out.println("*****  List of Mentions  ***********");

Boolean list_men = driver.findElement(By.xpath("//*[@id=\"influencerinsights\"]/div[2]/div/div/div/div/table")).isDisplayed();
String  list_men1 = driver.findElement(By.xpath("//*[@id=\"influencerinsights\"]/div[2]/div/div/div/div/table")).getText();

if(list_men == true) {
System.out.println("Data loaded properly");
System.out.println(list_men1);


}
else {

System.out.println("Data not loaded properly");


}
Thread.sleep(4000);
js.executeScript("window.scrollBy(0,750)");

//List of Retweeters
System.out.println("*****  List of Retweeters  ***********");

Boolean list_retweet = driver.findElement(By.xpath("//*[@id=\"influencerinsights\"]/div[3]/div/div/div/div/table")).isDisplayed();
String  list_retweet1 = driver.findElement(By.xpath("//*[@id=\"influencerinsights\"]/div[3]/div/div/div/div/table")).getText();

if(list_retweet == true) {
System.out.println("Data loaded properly");
System.out.println(list_retweet1);


}
else {

System.out.println("Data not loaded properly");


}
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("genderSplit")));
js.executeScript("window.scrollBy(0,650)");
//gender split
System.out.println("*****Gender Split ***********");

Boolean gender_split = driver.findElement(By.id("genderSplit")).isDisplayed();
String  gender_split1 = driver.findElement(By.id("genderSplit")).getText();

if(gender_split == true) {
System.out.println("Data loaded properly");
System.out.println(gender_split1);


}
else {

System.out.println("Data not loaded properly");
}

//Tweet Source

System.out.println("*****Tweet Source ***********");

Boolean tweet_pie = driver.findElement(By.id("tweet_source_pie")).isDisplayed();
String  tweet_pie1 = driver.findElement(By.id("tweet_source_pie")).getText();

if(tweet_pie == true) {
System.out.println("Data loaded properly");
System.out.println(tweet_pie1);


}
else {

System.out.println("Data not loaded properly");
}
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("audienceInterest")));
js.executeScript("window.scrollBy(0,650)");

//Audience Interest
System.out.println("*****Audience Interest***********");

Boolean audience_intrest = driver.findElement(By.id("audienceInterest")).isDisplayed();
String  audience_intrest1 = driver.findElement(By.id("audienceInterest")).getText();

if(audience_intrest == true) {
System.out.println("Data loaded properly");
System.out.println(audience_intrest1);


}
else {

System.out.println("Data not loaded properly");



}

//Location

System.out.println("*****Location***********");

Boolean LOC_tweet = driver.findElement(By.id("location_mentions_retweets")).isDisplayed();
String  LOC_tweet1 = driver.findElement(By.id("location_mentions_retweets")).getText();

if(LOC_tweet == true) {
System.out.println("Data loaded properly");
System.out.println(LOC_tweet1);


}
else {

System.out.println("Data not loaded properly");



}

//Language
System.out.println("*****Language***********");

Boolean Lang_tweet = driver.findElement(By.id("language_mentions_retweets")).isDisplayed();
String  Lang_tweet1 = driver.findElement(By.id("language_mentions_retweets")).getText();

if(Lang_tweet == true) {
System.out.println("Data loaded properly");
System.out.println(Lang_tweet1);


}
else {

System.out.println("Data not loaded properly");



}

wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("audience_mentioned_domains")));
js.executeScript("window.scrollBy(0,650)");

//Top Linked Sources By Mentions

System.out.println("*****Top Linked Sources By Mentions***********");

Boolean Top_links = driver.findElement(By.id("audience_mentioned_domains")).isDisplayed();
String  Top_links1 = driver.findElement(By.id("audience_mentioned_domains")).getText();

if(Top_links == true) {
System.out.println("Data loaded properly");
System.out.println(Top_links1);


}
else {

System.out.println("Data not loaded properly");



}

//Your audience's Follower Account
System.out.println("*****Your audience's Follower Account ***********");

Boolean Aud_foll_ac = driver.findElement(By.id("audience_follower_count")).isDisplayed();
String  Aud_foll_ac1 = driver.findElement(By.id("audience_follower_count")).getText();

if(Aud_foll_ac == true) {
System.out.println("Data loaded properly");
System.out.println(Aud_foll_ac1);


}
else {

System.out.println("Data not loaded properly");



}
Thread.sleep(4000);
js.executeScript("window.scrollBy(0,650)");



//Recent Followers
System.out.println("*****Recent Followers  ***********");

Boolean recent_fol = driver.findElement(By.id("top_followers")).isDisplayed();
String  recent_fol1 = driver.findElement(By.id("top_followers")).getText();

if(recent_fol == true) {
System.out.println("Data loaded properly");
System.out.println(recent_fol1);


}
else {

System.out.println("Data not loaded properly");



}
((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
Thread.sleep(3000);
driver.findElement(By.id("link_for_128")).click();
Thread.sleep(4000);

driver.findElement(By.xpath("//*[@id=\"magic-list\"]/div[1]/h5/div[3]/a/div")).click();
Thread.sleep(4000);
driver.findElement(By.id("retweets_sort")).click();
Thread.sleep(8000);
String result= driver.findElement(By.id("pinBoot")).getText();
System.out.println("result according to fillter"+result);

}


public void Testcase_verify_Matrics_twitter_trials_account() throws InterruptedException {
System.out.println("Analytics_module_twitter");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/ul[1]/li[2]/a[1]")));
Analytics.click();
Thread.sleep(4000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]")));
Search.click();
Search_keyword.sendKeys("zee music company");
Thread.sleep(4000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Zee Music Company')]")));
Thread.sleep(2000);
driver.findElement(By.xpath("//div[contains(text(),'Zee Music Company')]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id=\"globalrange_analytics\"]/img")).click();
Thread.sleep(4000);
// last 30 days
driver.findElement(By.xpath("/html/body/div[6]/div[3]/ul/li[3]")).click();
//cards
System.out.println("****Score cards***********");
Thread.sleep(4000);
Boolean score_card = driver.findElement(By.xpath("//*[@id=\"influencerinsights\"]/div[1]/div")).isDisplayed();
String  score_card1 = driver.findElement(By.xpath("//*[@id=\"influencerinsights\"]/div[1]/div")).getText();

if(score_card == true) {
System.out.println("Data loaded properly");
System.out.println(score_card1);


}
else {

System.out.println("Data not loaded properly");


}


//Tweet Timeline


System.out.println("****Tweet Timeline***********");
Thread.sleep(4000);
Boolean Tweet_t1 = driver.findElement(By.id("tweet_timeline")).isDisplayed();
String  Tweet_t = driver.findElement(By.id("tweet_timeline")).getText();

if(Tweet_t1 == true) {
System.out.println("Data loaded properly");
System.out.println(Tweet_t);


}
else {

System.out.println("Data not loaded properly");


}

//Total Interactions
System.out.println("****Total Interactions***********");
Thread.sleep(4000);
Boolean total_int = driver.findElement(By.id("net_fans_interactions")).isDisplayed();
String  total_int1 = driver.findElement(By.id("net_fans_interactions")).getText();

if(total_int == true) {
System.out.println("Data loaded properly");
System.out.println(total_int1);


}
else {

System.out.println("Data not loaded properly");


}
js.executeScript("window.scrollBy(0,650)");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("favouretedOverTime")));

//Favourited Over Time

System.out.println("****Favourited Over Time***********");
Thread.sleep(4000);
Boolean Fev_t = driver.findElement(By.id("favouretedOverTime")).isDisplayed();
String  Fev_t1 = driver.findElement(By.id("favouretedOverTime")).getText();

if(Fev_t == true) {
System.out.println("Data loaded properly");
System.out.println(Fev_t1);


}
else {

System.out.println("Data not loaded properly");


}
///Retweets Over Time
System.out.println("****/Retweets Over Time***********");
Thread.sleep(4000);
Boolean re_tweet = driver.findElement(By.id("retweetedTweetsOverTime")).isDisplayed();
String  re_tweet1 = driver.findElement(By.id("retweetedTweetsOverTime")).getText();

if(re_tweet == true) {
System.out.println("Data loaded properly");
System.out.println(re_tweet1);


}
else {

System.out.println("Data not loaded properly");


}
js.executeScript("window.scrollBy(0,650)");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("engagementRate")));

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
Thread.sleep(4000);
js.executeScript("window.scrollBy(0,650)");

//Total Tweets

System.out.println("*****Total Tweets ***********");

Boolean total_post = driver.findElement(By.id("totalPosts")).isDisplayed();
String  total_post1 = driver.findElement(By.id("totalPosts")).getText();

if(total_post == true) {
System.out.println("Data loaded properly");
System.out.println(total_post1);


}
else {

System.out.println("Data not loaded properly");


}
Thread.sleep(4000);
js.executeScript("window.scrollBy(0,650)");


System.out.println("*****Total Mentions ***********");

Boolean total_m = driver.findElement(By.id("total_mentions")).isDisplayed();
String  total_m1 = driver.findElement(By.id("total_mentions")).getText();

if(total_m == true) {
System.out.println("Data loaded properly");
System.out.println(total_m1);


}
else {

System.out.println("Data not loaded properly");


}

wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("referrals")));
//Top Linked Sources
System.out.println("*****Top Linked Sources ***********");

Boolean top_link = driver.findElement(By.id("referrals")).isDisplayed();
String  top_link1 = driver.findElement(By.id("referrals")).getText();

if(top_link == true) {
System.out.println("Data loaded properly");
System.out.println(top_link1);


}
else {

System.out.println("Data not loaded properly");


}
Thread.sleep(4000);
js.executeScript("window.scrollBy(0,650)");

//Top Hashtags

System.out.println("***** Top Hashtags  ***********");

Boolean top_hashtag = driver.findElement(By.id("relatedHashtags")).isDisplayed();
String  top_hashtag1 = driver.findElement(By.id("relatedHashtags")).getText();

if(top_hashtag == true) {
System.out.println("Data loaded properly");
System.out.println(top_hashtag1);


}
else {

System.out.println("Data not loaded properly");


}
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("relatedMentions")));
//Top Mentions
System.out.println("***** Top Mentions   ***********");

Boolean rel_mention = driver.findElement(By.id("relatedMentions")).isDisplayed();
String  rel_mention1 = driver.findElement(By.id("relatedMentions")).getText();

if(rel_mention == true) {
System.out.println("Data loaded properly");
System.out.println(rel_mention1);


}
else {

System.out.println("Data not loaded properly");


}
Thread.sleep(4000);
js.executeScript("window.scrollBy(0,650)");
///Most Engaging Tweets

System.out.println("***** Most Engaging Tweets   ***********");

Boolean most_eng = driver.findElement(By.id("top_interactive_posts")).isDisplayed();
String  most_eng1 = driver.findElement(By.id("top_interactive_posts")).getText();

if(most_eng == true) {
System.out.println("Data loaded properly");
System.out.println(most_eng1);


}
else {

System.out.println("Data not loaded properly");


}
Thread.sleep(4000);
((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");

//Audience tab

driver.findElement(By.id("link_for_127")).click();


//	List of Mentions


System.out.println("*****  List of Mentions  ***********");

Boolean list_men = driver.findElement(By.xpath("//*[@id=\"influencerinsights\"]/div[2]/div/div/div/div/table")).isDisplayed();
String  list_men1 = driver.findElement(By.xpath("//*[@id=\"influencerinsights\"]/div[2]/div/div/div/div/table")).getText();

if(list_men == true) {
System.out.println("Data loaded properly");
System.out.println(list_men1);


}
else {

System.out.println("Data not loaded properly");


}
Thread.sleep(4000);
js.executeScript("window.scrollBy(0,750)");

//List of Retweeters
System.out.println("*****  List of Retweeters  ***********");

Boolean list_retweet = driver.findElement(By.xpath("//*[@id=\"influencerinsights\"]/div[3]/div/div/div/div/table")).isDisplayed();
String  list_retweet1 = driver.findElement(By.xpath("//*[@id=\"influencerinsights\"]/div[3]/div/div/div/div/table")).getText();

if(list_retweet == true) {
System.out.println("Data loaded properly");
System.out.println(list_retweet1);


}
else {

System.out.println("Data not loaded properly");


}
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("genderSplit")));
js.executeScript("window.scrollBy(0,650)");
//gender split
System.out.println("*****Gender Split ***********");

Boolean gender_split = driver.findElement(By.id("genderSplit")).isDisplayed();
String  gender_split1 = driver.findElement(By.id("genderSplit")).getText();

if(gender_split == true) {
System.out.println("Data loaded properly");
System.out.println(gender_split1);


}
else {

System.out.println("Data not loaded properly");
}

//Tweet Source

System.out.println("*****Tweet Source ***********");

Boolean tweet_pie = driver.findElement(By.id("tweet_source_pie")).isDisplayed();
String  tweet_pie1 = driver.findElement(By.id("tweet_source_pie")).getText();

if(tweet_pie == true) {
System.out.println("Data loaded properly");
System.out.println(tweet_pie1);


}
else {

System.out.println("Data not loaded properly");
}
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("audienceInterest")));
js.executeScript("window.scrollBy(0,650)");

//Audience Interest
System.out.println("*****Audience Interest***********");

Boolean audience_intrest = driver.findElement(By.id("audienceInterest")).isDisplayed();
String  audience_intrest1 = driver.findElement(By.id("audienceInterest")).getText();

if(audience_intrest == true) {
System.out.println("Data loaded properly");
System.out.println(audience_intrest1);


}
else {

System.out.println("Data not loaded properly");



}

//Location

System.out.println("*****Location***********");

Boolean LOC_tweet = driver.findElement(By.id("location_mentions_retweets")).isDisplayed();
String  LOC_tweet1 = driver.findElement(By.id("location_mentions_retweets")).getText();

if(LOC_tweet == true) {
System.out.println("Data loaded properly");
System.out.println(LOC_tweet1);


}
else {

System.out.println("Data not loaded properly");



}

//Language
System.out.println("*****Language***********");

Boolean Lang_tweet = driver.findElement(By.id("language_mentions_retweets")).isDisplayed();
String  Lang_tweet1 = driver.findElement(By.id("language_mentions_retweets")).getText();

if(Lang_tweet == true) {
System.out.println("Data loaded properly");
System.out.println(Lang_tweet1);


}
else {

System.out.println("Data not loaded properly");



}

wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("audience_mentioned_domains")));
js.executeScript("window.scrollBy(0,650)");

//Top Linked Sources By Mentions

System.out.println("*****Top Linked Sources By Mentions***********");

Boolean Top_links = driver.findElement(By.id("audience_mentioned_domains")).isDisplayed();
String  Top_links1 = driver.findElement(By.id("audience_mentioned_domains")).getText();

if(Top_links == true) {
System.out.println("Data loaded properly");
System.out.println(Top_links1);


}
else {

System.out.println("Data not loaded properly");



}

//Your audience's Follower Account
System.out.println("*****Your audience's Follower Account ***********");

Boolean Aud_foll_ac = driver.findElement(By.id("audience_follower_count")).isDisplayed();
String  Aud_foll_ac1 = driver.findElement(By.id("audience_follower_count")).getText();

if(Aud_foll_ac == true) {
System.out.println("Data loaded properly");
System.out.println(Aud_foll_ac1);


}
else {

System.out.println("Data not loaded properly");



}
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("top_followers")));
js.executeScript("window.scrollBy(0,650)");



//Recent Followers
System.out.println("*****Recent Followers  ***********");

Boolean recent_fol = driver.findElement(By.id("top_followers")).isDisplayed();
String  recent_fol1 = driver.findElement(By.id("top_followers")).getText();

if(recent_fol == true) {
System.out.println("Data loaded properly");
System.out.println(recent_fol1);


}
else {

System.out.println("Data not loaded properly");



}
((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
Thread.sleep(3000);
driver.findElement(By.id("link_for_128")).click();
Thread.sleep(4000);

driver.findElement(By.xpath("//*[@id=\"magic-list\"]/div[1]/h5/div[3]/a/div")).click();
Thread.sleep(4000);
driver.findElement(By.id("retweets_sort")).click();
Thread.sleep(8000);
String result= driver.findElement(By.id("pinBoot")).getText();
System.out.println("result according to fillter"+result);

}





public void Testcase_verify_Matrics_youtube_clients_account() throws InterruptedException {
System.out.println("Analytics_module_youtube");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/ul[1]/li[2]/a[1]")));
Analytics.click();
Thread.sleep(4000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]")));
Search.click();
Search_keyword.sendKeys("disneyplus");
Thread.sleep(4000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'DisneyPlus Hotstar_IN')]")));
driver.findElement(By.xpath("//div[contains(text(),'DisneyPlus Hotstar_IN')]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id=\"globalrange_analytics\"]/img")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("/html/body/div[6]/div[3]/ul/li[7]")).click();

// custome
Thread.sleep(2000);
driver.findElement(By.name("daterangepicker_start")).clear();
Thread.sleep(2000);
driver.findElement(By.name("daterangepicker_start")).sendKeys("01012022");
Thread.sleep(2000);
driver.findElement(By.name("daterangepicker_end")).clear();
Thread.sleep(4000);
driver.findElement(By.name("daterangepicker_end")).sendKeys("01052022");
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/button[1]")).click();

//score card
System.out.println("*****//score card ***********");

Boolean score_card = driver.findElement(By.xpath("//*[@id=\"influencerinsightsYoutube\"]/div[1]/div")).isDisplayed();
String  score_card1 = driver.findElement(By.xpath("//*[@id=\"influencerinsightsYoutube\"]/div[1]/div")).getText();

if(score_card == true) {
System.out.println("Data loaded properly");
System.out.println(score_card1);


}
else {

System.out.println("Data not loaded properly");

}
//Retention Rate

System.out.println("*****Retention Rate  ***********");

Boolean retantion_rate = driver.findElement(By.id("newRetention")).isDisplayed();
String  retantion_rate1 = driver.findElement(By.id("newRetention")).getText();

if(retantion_rate == true) {
System.out.println("Data loaded properly");
System.out.println(retantion_rate1);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(4000);
js.executeScript("window.scrollBy(0,650)");
///Interaction by type
System.out.println("*****Red Views    ***********");

Boolean Red_Views = driver.findElement(By.id("redViewsGraph")).isDisplayed();
String  Red_Views1 = driver.findElement(By.id("redViewsGraph")).getText();

if(Red_Views == true) {
System.out.println("Data loaded properly");
System.out.println(Red_Views1);


}
else {

System.out.println("Data not loaded properly");

}
//	Estimated Minutes Watched vs Estimated Red Minutes Watched
System.out.println("*****Estimated Minutes Watched vs Estimated Red Minutes Watched     ***********");

Boolean Estimated_Minutes_Watched= driver.findElement(By.id("minutes_watched")).isDisplayed();
String   Estimated_Minutes_Watched1 = driver.findElement(By.id("minutes_watched")).getText();

if(Estimated_Minutes_Watched == true) {
System.out.println("Data loaded properly");
System.out.println(Estimated_Minutes_Watched1);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(4000);
js.executeScript("window.scrollBy(0,650)");

//Videos Added To Playlists vs Videos Removed From Playlists
System.out.println("*****//Videos Added To Playlists vs Videos Removed From Playlists ***********");

Boolean vd_added= driver.findElement(By.id("videosPlaylists")).isDisplayed();
String   vd_added1 = driver.findElement(By.id("videosPlaylists")).getText();

if(vd_added == true) {
System.out.println("Data loaded properly");
System.out.println(vd_added1);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(4000);
js.executeScript("window.scrollBy(0,650)");

// video views
System.out.println("*****// video views***********");

Boolean Video_view= driver.findElement(By.id("views")).isDisplayed();
String   Video_view1 = driver.findElement(By.id("views")).getText();

if(Video_view == true) {
System.out.println("Data loaded properly");
System.out.println(Video_view1);


}
else {

System.out.println("Data not loaded properly");

}

//Card Click Rate vs Card Teaser Click Rate

System.out.println("*****// Card Click Rate vs Card Teaser Click Rate***********");

Boolean click_rate= driver.findElement(By.id("ClickRate")).isDisplayed();
String   click_rate1 = driver.findElement(By.id("ClickRate")).getText();

if(click_rate == true) {
System.out.println("Data loaded properly");
System.out.println(click_rate1);


}
else {

System.out.println("Data not loaded properly");

}
//Card Impressions vs Card Teaser Impressions

System.out.println("****Card Impressions vs Card Teaser Impressions ***********");

Boolean cd_imp= driver.findElement(By.id("cardImpressions")).isDisplayed();
String   cd_imp1 = driver.findElement(By.id("cardImpressions")).getText();

if(cd_imp == true) {
System.out.println("Data loaded properly");
System.out.println(cd_imp1);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(4000);
js.executeScript("window.scrollBy(0,650)");

///Card Clicks vs Card Teaser Clicks
System.out.println("*****Card Clicks vs Card Teaser Clicks   ***********");

Boolean card_click= driver.findElement(By.id("cardClicks")).isDisplayed();
String   card_click1 = driver.findElement(By.id("cardClicks")).getText();

if(card_click == true) {
System.out.println("Data loaded properly");
System.out.println(card_click1);


}
else {

System.out.println("Data not loaded properly");

}

//Interaction by type

System.out.println("*****Interaction by type   ***********");

Boolean inter= driver.findElement(By.id("interaction_type_number")).isDisplayed();
String   inter1 = driver.findElement(By.id("interaction_type_number")).getText();

if(inter == true) {
System.out.println("Data loaded properly");
System.out.println(inter1);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(4000);
js.executeScript("window.scrollBy(0,250)");

//Interactions by Percentage

System.out.println("***** Interactions by Percentage  ***********");

Boolean inter_per= driver.findElement(By.id("interaction_type_percentage")).isDisplayed();
String   inter_per1 = driver.findElement(By.id("interaction_type_percentage")).getText();

if(inter_per == true) {
System.out.println("Data loaded properly");
System.out.println(inter_per1);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(4000);
js.executeScript("window.scrollBy(0,250)");

//Engagement Rate (by Followers)
System.out.println("***** Engagement Rate (by Followers) ***********");

Boolean eng_rate= driver.findElement(By.id("engagementRate")).isDisplayed();
String   eng_rate1 = driver.findElement(By.id("engagementRate")).getText();

if(eng_rate == true) {
System.out.println("Data loaded properly");
System.out.println(eng_rate1);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(4000);
js.executeScript("window.scrollBy(0,250)");
//Video Views
System.out.println("***** Video Views ***********");

Boolean videoview= driver.findElement(By.id("views")).isDisplayed();
String   videoview1 = driver.findElement(By.id("views")).getText();

if(videoview == true) {
System.out.println("Data loaded properly");
System.out.println(videoview1);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(4000);

System.out.println("***** Video shares ***********");

Boolean videovshares= driver.findElement(By.id("views")).isDisplayed();
String   videoshares1 = driver.findElement(By.id("views")).getText();

if(videovshares == true) {
System.out.println("Data loaded properly");
System.out.println(videoshares1);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(4000);
js.executeScript("window.scrollBy(0,250)");

System.out.println("*****Optimal Video Length   ***********");

Boolean op_video= driver.findElement(By.xpath("//*[@id=\"influencerinsightsYoutube\"]/div[10]/div/div/div/div/div[2]")).isDisplayed();
String   op_video1 = driver.findElement(By.xpath("//*[@id=\"influencerinsightsYoutube\"]/div[10]/div/div/div/div/div[2]")).getText();

if(op_video == true) {
System.out.println("Data loaded properly");
System.out.println(op_video1);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(4000);
js.executeScript("window.scrollBy(0,250)");																 System.out.println("*****Subscribers Gained & Lost    ***********");
System.out.println("Subscribers Gained & Lost");
Boolean sub_g= driver.findElement(By.id("sub_gained_lost")).isDisplayed();
String sub_g1 = driver.findElement(By.id("sub_gained_lost")).getText();

if(sub_g == true) {
System.out.println("Data loaded properly");
System.out.println(sub_g1);

}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(4000);
System.out.println("Subscribers");
Boolean sub_count= driver.findElement(By.id("subscriberCount")).isDisplayed();
String sub_count1 = driver.findElement(By.id("subscriberCount")).getText();

if(sub_count == true) {
System.out.println("Data loaded properly");
System.out.println(sub_count1);

}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(4000);
js.executeScript("window.scrollBy(0,250)");
System.out.println("Most Engaging Posts");
Boolean most_eng= driver.findElement(By.id("magic-list")).isDisplayed();
String most_eng1 = driver.findElement(By.id("magic-list")).getText();

if(most_eng == true) {
System.out.println("Data loaded properly");
System.out.println(most_eng1);

}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(4000);
((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");

/////Audience tab
//Gender Ratio
Thread.sleep(4000);
driver.findElement(By.id("link_for_35")).click();


System.out.println("*****Gender Ratio ***********");

Boolean gender_ratio= driver.findElement(By.id("youtubeGender")).isDisplayed();
String   gender_ratio1 = driver.findElement(By.id("youtubeGender")).getText();

if(gender_ratio == true) {
System.out.println("Data loaded properly");
System.out.println(gender_ratio1);


}
else {

System.out.println("Data not loaded properly");

}
/////Age And Gender Split
System.out.println("*****Age And Gender Split  ***********");

Boolean Age_g= driver.findElement(By.id("youtubeChannelGender")).isDisplayed();
String   Age_g1 = driver.findElement(By.id("youtubeChannelGender")).getText();

if(Age_g == true) {
System.out.println("Data loaded properly");
System.out.println(Age_g1);


}
else {

System.out.println("Data not loaded properly");

}
Thread.sleep(4000);
js.executeScript("window.scrollBy(0,650)");

///Audience Interest

System.out.println("*****Audience Interest***********");

Boolean audience_intrest = driver.findElement(By.id("audienceInterest")).isDisplayed();
String  audience_intrest1 = driver.findElement(By.id("audienceInterest")).getText();

if(audience_intrest == true) {
System.out.println("Data loaded properly");
System.out.println(audience_intrest1);


}
else {

System.out.println("Data not loaded properly");
}
Thread.sleep(4000);
js.executeScript("window.scrollBy(0,650)");
//Top Location

System.out.println("*****Top Location***********");
Thread.sleep(4000);
Boolean top_loc = driver.findElement(By.id("topLocationYT")).isDisplayed();
String  top_loc1 = driver.findElement(By.id("topLocationYT")).getText();

if(top_loc == true) {
System.out.println("Data loaded properly");
System.out.println(top_loc1);


}
else {

System.out.println("Data not loaded properly");
}

Thread.sleep(4000);
((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
// post tab

Thread.sleep(4000);
driver.findElement(By.id("link_for_37")).click();
//score card
System.out.println("*****score card of yotube***********");

Boolean basic_start = driver.findElement(By.xpath("//*[@id=\"postsYoutube\"]/div[1]/div")).isDisplayed();
String  basic_start1 = driver.findElement(By.xpath("//*[@id=\"postsYoutube\"]/div[1]/div")).getText();

if(basic_start == true) {
System.out.println("Data loaded properly");
System.out.println(basic_start1);


}
else {

System.out.println("Data not loaded properly");
}
Thread.sleep(4000);
js.executeScript("window.scrollBy(0,350)");
///No of post

System.out.println("*****No of post***********");

Boolean no_post = driver.findElement(By.id("total_post")).isDisplayed();
String  no_post1 = driver.findElement(By.id("total_post")).getText();

if(no_post == true) {
System.out.println("Data loaded properly");
System.out.println(no_post1);


}
else {

System.out.println("Data not loaded properly");
}

Thread.sleep(4000);
js.executeScript("window.scrollBy(0,550)");

//All Post

System.out.println("*****All Post***********");

Boolean allpost = driver.findElement(By.xpath("//*[@id=\"allVideosYT\"]")).isDisplayed();
String  allpost1 = driver.findElement(By.xpath("//*[@id=\"allVideosYT\"]")).getText();

if(allpost == true) {
System.out.println("Data loaded properly");
System.out.println(allpost1);


}
else {

System.out.println("Data not loaded properly");
}

//driver.findElement(By.xpath("//*[@id=\"magic-list\"]/div/h5/div[2]/a/div")).click();
//Thread.sleep(3000);
//driver.findElement(By.xpath("//*[@id=\"typefilter\"]/div[2]/div/div[1]/div[5]")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("//*[@id=\"allVideosYT\"]/div[2]/div/div[1]")).click();
//Thread.sleep(4000);
////driver.findElement(By.xpath("//*[@id=\"modal-lg2\"]/div/button")).isEnabled();
////driver.findElement(By.xpath("//*[@id=\"modal-lg2\"]/div/button")).click();
//// Top LIne Number
//System.out.println("top line number");
//boolean top_line = driver.findElement(By.id("yt_post_top_line_number")).isDisplayed();
//String  top_line1 = driver.findElement(By.id("yt_post_top_line_number")).getText();
//
//if(top_line == true) {
//System.out.println("Data loaded properly");
//System.out.println(top_line1);
//
//
//}
//else {
//
//System.out.println("Data not loaded properly");
//}
//Thread.sleep(4000);
//js.executeScript("window.scrollBy(0,550)");
////Retention rate
//System.out.println("Retention rate");
//boolean re_rate = driver.findElement(By.id("yt_post_videoRet")).isDisplayed();
//String  re_rate1 = driver.findElement(By.id("yt_post_videoRet")).getText();
//
//if(re_rate == true) {
//System.out.println("Data loaded properly");
//System.out.println(re_rate1);
//
//
//}
//else {
//
//System.out.println("Data not loaded properly");
//}
//
//Thread.sleep(4000);
//js.executeScript("window.scrollBy(0,550)");
////new card
//System.out.println("Retention rate");
//boolean new_card = driver.findElement(By.id("all-stats-cards-new")).isDisplayed();
//String  new_card1 = driver.findElement(By.id("all-stats-cards-new")).getText();
//
//if(new_card == true) {
//System.out.println("Data loaded properly");
//System.out.println(new_card1);
//
//
//}
//else {
//
//System.out.println("Data not loaded properly");
//}

}


public void Testcase_verify_Matrics_youtube_trials_account() throws InterruptedException {
	System.out.println("Analytics_module_youtube");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/ul[1]/li[2]/a[1]")));
	Analytics.click();
	Thread.sleep(4000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]")));
	Search.click();
	Search_keyword.sendKeys("Ferrari Jones");
	Thread.sleep(4000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Reliance Foundation Youth Sports')]")));
	driver.findElement(By.xpath("//div[contains(text(),'Ferrari Jones')]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"globalrange_analytics\"]/img")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/div[6]/div[3]/ul/li[7]")).click();

	// custome
	Thread.sleep(2000);
	driver.findElement(By.name("daterangepicker_start")).clear();
	Thread.sleep(2000);
	driver.findElement(By.name("daterangepicker_start")).sendKeys("25012021");
	Thread.sleep(2000);
	driver.findElement(By.name("daterangepicker_end")).clear();
	Thread.sleep(4000);
	driver.findElement(By.name("daterangepicker_end")).sendKeys("25062021");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/button[1]")).click();

	//score card
	System.out.println("*****//score card ***********");

	Boolean score_card = driver.findElement(By.xpath("//*[@id=\"influencerinsightsYoutube\"]/div[1]/div")).isDisplayed();
	String  score_card1 = driver.findElement(By.xpath("//*[@id=\"influencerinsightsYoutube\"]/div[1]/div")).getText();

	if(score_card == true) {
	System.out.println("Data loaded properly");
	System.out.println(score_card1);


	}
	else {

	System.out.println("Data not loaded properly");

	}
	//Retention Rate

	System.out.println("*****Retention Rate  ***********");

	Boolean retantion_rate = driver.findElement(By.id("newRetention")).isDisplayed();
	String  retantion_rate1 = driver.findElement(By.id("newRetention")).getText();

	if(retantion_rate == true) {
	System.out.println("Data loaded properly");
	System.out.println(retantion_rate1);


	}
	else {

	System.out.println("Data not loaded properly");

	}
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,650)");
	///Interaction by type
	System.out.println("*****Red Views    ***********");

	Boolean Red_Views = driver.findElement(By.id("redViewsGraph")).isDisplayed();
	String  Red_Views1 = driver.findElement(By.id("redViewsGraph")).getText();

	if(Red_Views == true) {
	System.out.println("Data loaded properly");
	System.out.println(Red_Views1);


	}
	else {

	System.out.println("Data not loaded properly");

	}
//		Estimated Minutes Watched vs Estimated Red Minutes Watched
	System.out.println("*****Estimated Minutes Watched vs Estimated Red Minutes Watched     ***********");

	Boolean Estimated_Minutes_Watched= driver.findElement(By.id("minutes_watched")).isDisplayed();
	String   Estimated_Minutes_Watched1 = driver.findElement(By.id("minutes_watched")).getText();

	if(Estimated_Minutes_Watched == true) {
	System.out.println("Data loaded properly");
	System.out.println(Estimated_Minutes_Watched1);


	}
	else {

	System.out.println("Data not loaded properly");

	}
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,650)");

	//Videos Added To Playlists vs Videos Removed From Playlists
	System.out.println("*****//Videos Added To Playlists vs Videos Removed From Playlists ***********");

	Boolean vd_added= driver.findElement(By.id("videosPlaylists")).isDisplayed();
	String   vd_added1 = driver.findElement(By.id("videosPlaylists")).getText();

	if(vd_added == true) {
	System.out.println("Data loaded properly");
	System.out.println(vd_added1);


	}
	else {

	System.out.println("Data not loaded properly");

	}
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,650)");

	// video views
	System.out.println("*****// video views***********");

	Boolean Video_view= driver.findElement(By.id("views")).isDisplayed();
	String   Video_view1 = driver.findElement(By.id("views")).getText();

	if(Video_view == true) {
	System.out.println("Data loaded properly");
	System.out.println(Video_view1);


	}
	else {

	System.out.println("Data not loaded properly");

	}

	//Card Click Rate vs Card Teaser Click Rate

	System.out.println("*****// Card Click Rate vs Card Teaser Click Rate***********");

	Boolean click_rate= driver.findElement(By.id("ClickRate")).isDisplayed();
	String   click_rate1 = driver.findElement(By.id("ClickRate")).getText();

	if(click_rate == true) {
	System.out.println("Data loaded properly");
	System.out.println(click_rate1);


	}
	else {

	System.out.println("Data not loaded properly");

	}
	//Card Impressions vs Card Teaser Impressions

	System.out.println("****Card Impressions vs Card Teaser Impressions ***********");

	Boolean cd_imp= driver.findElement(By.id("cardImpressions")).isDisplayed();
	String   cd_imp1 = driver.findElement(By.id("cardImpressions")).getText();

	if(cd_imp == true) {
	System.out.println("Data loaded properly");
	System.out.println(cd_imp1);


	}
	else {

	System.out.println("Data not loaded properly");

	}
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,650)");

	///Card Clicks vs Card Teaser Clicks
	System.out.println("*****Card Clicks vs Card Teaser Clicks   ***********");

	Boolean card_click= driver.findElement(By.id("cardClicks")).isDisplayed();
	String   card_click1 = driver.findElement(By.id("cardClicks")).getText();

	if(card_click == true) {
	System.out.println("Data loaded properly");
	System.out.println(card_click1);


	}
	else {

	System.out.println("Data not loaded properly");

	}

	//Interaction by type

	System.out.println("*****Interaction by type   ***********");

	Boolean inter= driver.findElement(By.id("interaction_type_number")).isDisplayed();
	String   inter1 = driver.findElement(By.id("interaction_type_number")).getText();

	if(inter == true) {
	System.out.println("Data loaded properly");
	System.out.println(inter1);


	}
	else {

	System.out.println("Data not loaded properly");

	}
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,250)");

	//Interactions by Percentage

	System.out.println("***** Interactions by Percentage  ***********");

	Boolean inter_per= driver.findElement(By.id("interaction_type_percentage")).isDisplayed();
	String   inter_per1 = driver.findElement(By.id("interaction_type_percentage")).getText();

	if(inter_per == true) {
	System.out.println("Data loaded properly");
	System.out.println(inter_per1);


	}
	else {

	System.out.println("Data not loaded properly");

	}
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,250)");

	//Engagement Rate (by Followers)
	System.out.println("***** Engagement Rate (by Followers) ***********");

	Boolean eng_rate= driver.findElement(By.id("engagementRate")).isDisplayed();
	String   eng_rate1 = driver.findElement(By.id("engagementRate")).getText();

	if(eng_rate == true) {
	System.out.println("Data loaded properly");
	System.out.println(eng_rate1);


	}
	else {

	System.out.println("Data not loaded properly");

	}
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,250)");
	//Video Views
	System.out.println("***** Video Views ***********");

	Boolean videoview= driver.findElement(By.id("views")).isDisplayed();
	String   videoview1 = driver.findElement(By.id("views")).getText();

	if(videoview == true) {
	System.out.println("Data loaded properly");
	System.out.println(videoview1);


	}
	else {

	System.out.println("Data not loaded properly");

	}
	Thread.sleep(4000);

	System.out.println("***** Video shares ***********");

	Boolean videovshares= driver.findElement(By.id("views")).isDisplayed();
	String   videoshares1 = driver.findElement(By.id("views")).getText();

	if(videovshares == true) {
	System.out.println("Data loaded properly");
	System.out.println(videoshares1);


	}
	else {

	System.out.println("Data not loaded properly");

	}
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,250)");

	System.out.println("*****Optimal Video Length   ***********");

	Boolean op_video= driver.findElement(By.xpath("//*[@id=\"influencerinsightsYoutube\"]/div[10]/div/div/div/div/div[2]")).isDisplayed();
	String   op_video1 = driver.findElement(By.xpath("//*[@id=\"influencerinsightsYoutube\"]/div[10]/div/div/div/div/div[2]")).getText();

	if(op_video == true) {
	System.out.println("Data loaded properly");
	System.out.println(op_video1);


	}
	else {

	System.out.println("Data not loaded properly");

	}
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,250)");																 System.out.println("*****Subscribers Gained & Lost    ***********");
	System.out.println("Subscribers Gained & Lost");
	Boolean sub_g= driver.findElement(By.id("sub_gained_lost")).isDisplayed();
	String sub_g1 = driver.findElement(By.id("sub_gained_lost")).getText();

	if(sub_g == true) {
	System.out.println("Data loaded properly");
	System.out.println(sub_g1);

	}
	else {

	System.out.println("Data not loaded properly");

	}
	Thread.sleep(4000);
	System.out.println("Subscribers");
	Boolean sub_count= driver.findElement(By.id("subscriberCount")).isDisplayed();
	String sub_count1 = driver.findElement(By.id("subscriberCount")).getText();

	if(sub_count == true) {
	System.out.println("Data loaded properly");
	System.out.println(sub_count1);

	}
	else {

	System.out.println("Data not loaded properly");

	}
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,250)");
	System.out.println("Most Engaging Posts");
	Boolean most_eng= driver.findElement(By.id("magic-list")).isDisplayed();
	String most_eng1 = driver.findElement(By.id("magic-list")).getText();

	if(most_eng == true) {
	System.out.println("Data loaded properly");
	System.out.println(most_eng1);

	}
	else {

	System.out.println("Data not loaded properly");

	}
	Thread.sleep(4000);
	((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");

	/////Audience tab
	//Gender Ratio
	Thread.sleep(4000);
	driver.findElement(By.id("link_for_35")).click();


	System.out.println("*****Gender Ratio ***********");

	Boolean gender_ratio= driver.findElement(By.id("youtubeGender")).isDisplayed();
	String   gender_ratio1 = driver.findElement(By.id("youtubeGender")).getText();

	if(gender_ratio == true) {
	System.out.println("Data loaded properly");
	System.out.println(gender_ratio1);


	}
	else {

	System.out.println("Data not loaded properly");

	}
	/////Age And Gender Split
	System.out.println("*****Age And Gender Split  ***********");

	Boolean Age_g= driver.findElement(By.id("youtubeChannelGender")).isDisplayed();
	String   Age_g1 = driver.findElement(By.id("youtubeChannelGender")).getText();

	if(Age_g == true) {
	System.out.println("Data loaded properly");
	System.out.println(Age_g1);


	}
	else {

	System.out.println("Data not loaded properly");

	}
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,650)");

	///Audience Interest

	System.out.println("*****Audience Interest***********");

	Boolean audience_intrest = driver.findElement(By.id("audienceInterest")).isDisplayed();
	String  audience_intrest1 = driver.findElement(By.id("audienceInterest")).getText();

	if(audience_intrest == true) {
	System.out.println("Data loaded properly");
	System.out.println(audience_intrest1);


	}
	else {

	System.out.println("Data not loaded properly");
	}
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,650)");
	//Top Location

	System.out.println("*****Top Location***********");
	Thread.sleep(4000);
	Boolean top_loc = driver.findElement(By.id("topLocationYT")).isDisplayed();
	String  top_loc1 = driver.findElement(By.id("topLocationYT")).getText();

	if(top_loc == true) {
	System.out.println("Data loaded properly");
	System.out.println(top_loc1);


	}
	else {

	System.out.println("Data not loaded properly");
	}

	Thread.sleep(4000);
	((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
	// post tab

	Thread.sleep(4000);
	driver.findElement(By.id("link_for_37")).click();
	//score card
	System.out.println("*****score card of yotube***********");

	Boolean basic_start = driver.findElement(By.xpath("//*[@id=\"postsYoutube\"]/div[1]/div")).isDisplayed();
	String  basic_start1 = driver.findElement(By.xpath("//*[@id=\"postsYoutube\"]/div[1]/div")).getText();

	if(basic_start == true) {
	System.out.println("Data loaded properly");
	System.out.println(basic_start1);


	}
	else {

	System.out.println("Data not loaded properly");
	}
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,350)");
	///No of post

	System.out.println("*****No of post***********");

	Boolean no_post = driver.findElement(By.id("total_post")).isDisplayed();
	String  no_post1 = driver.findElement(By.id("total_post")).getText();

	if(no_post == true) {
	System.out.println("Data loaded properly");
	System.out.println(no_post1);


	}
	else {

	System.out.println("Data not loaded properly");
	}

	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,550)");

	//All Post

	System.out.println("*****All Post***********");

	Boolean allpost = driver.findElement(By.xpath("//*[@id=\"allVideosYT\"]")).isDisplayed();
	String  allpost1 = driver.findElement(By.xpath("//*[@id=\"allVideosYT\"]")).getText();

	if(allpost == true) {
	System.out.println("Data loaded properly");
	System.out.println(allpost1);


	}
	else {

	System.out.println("Data not loaded properly");
	}

	}
public void Add_First_Account_youtube() throws InterruptedException {
    System.out.println("Analytics_module");
	Analytics.click();
	Thread.sleep(4000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".col-md-12.grid-fit-screen-pages")));
    // check progress bar
	String progress_bar=driver.findElement(By.xpath("//span[@class='item_has']")).getText();
	int p_bar=Integer.parseInt(progress_bar);
	int add_one =(p_bar+1);

	System.out.println(add_one);
    Thread.sleep(5000);
	plus_icon.click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[@platform='google']//img[@class='social-platforms-icons']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//img[@class='login-with-this-platform google-img']")).click();
	Thread.sleep(4000);
	driver.findElement(By.id("identifierId")).sendKeys("sagar.unboxtest@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.id("identifierNext")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("sagar@123");
	driver.findElement(By.id("passwordNext")).click();
	Thread.sleep(4000);
//   driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/div[1]/div[1]/a")).click();
   Thread.sleep(4000);
//   driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/div[1]/div[2]/p[2]/a")).click();
   js.executeScript("window.scrollBy(0,750)");
   Thread.sleep(4000);
   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div/button/span")).click();
  Thread.sleep(4000);
  driver.navigate().refresh();
  Thread.sleep(4000);
  driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[4]/div/div/div/div[5]/div[3]/div/label")).click();
  Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id=\"connect_accounts\"]/div/div/div/div[5]/div[4]/button[1]")).click();

 String after_progress_bar1=driver.findElement(By.xpath("//span[@class='item_has']")).getText();

	int p_bar1=Integer.parseInt(after_progress_bar1);
//	int after_add =(p_bar1+1);
	System.out.println(p_bar1);
   if(add_one==p_bar1) {
	   System.out.println("data perfect"+"result of data after add ="+p_bar1);

   }else {
	   System.out.println("not added account in progrss bar");

   }

  Thread.sleep(4000);
}






public void Add_second_Account_youtube() throws InterruptedException {
	 System.out.println("Analytics_module");
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/ul[1]/li[2]/a[1]")));
		Analytics.click();
		Thread.sleep(4000);
		System.out.println("testing");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".col-md-12.grid-fit-screen-pages")));

		// check progress bar
		String progress_bar=driver.findElement(By.xpath("//span[@class='item_has']")).getText();
		int p_bar=Integer.parseInt(progress_bar);
		int add_one =(p_bar+1);

		System.out.println(add_one);
		plus_icon.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@platform='google']//img[@class='social-platforms-icons']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//img[@class='login-with-this-platform google-img']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("identifierId")).sendKeys("sagar.uttarkar@unboxsocial.com");
		Thread.sleep(2000);
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("sagar@123");
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(4000);
//	   driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/div[1]/div[1]/a")).click();
//	   Thread.sleep(4000);
//	   driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/div[1]/div[2]/p[2]/a")).click();
	   js.executeScript("window.scrollBy(0,750)");
	   Thread.sleep(4000);
	   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div/button/span")).click();
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"connect_accounts\"]/div/div/div/button")));
	  driver.findElement(By.xpath("//*[@id=\"connect_accounts\"]/div/div/div/button")).click();
	  Thread.sleep(4000);
	  driver.navigate().refresh();
	  Thread.sleep(4000);
	 String after_progress_bar1=driver.findElement(By.xpath("//span[@class='item_has']")).getText();

		int p_bar1=Integer.parseInt(after_progress_bar1);
//		int after_add =(p_bar1+1);
		System.out.println(p_bar1);
	   if(add_one==p_bar1) {
		   System.out.println("data perfect"+"result of data after add ="+p_bar1);

	   }else {
		   System.out.println("not added account in progrss bar");

	   }

	  Thread.sleep(4000);
}

public void Add_first_Account_Facebook() throws InterruptedException {
System.out.println("Analytics_module");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/ul[1]/li[2]/a[1]")));
Analytics.click();
Thread.sleep(4000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".col-md-12.grid-fit-screen-pages")));
String progress_bar=driver.findElement(By.xpath("//span[@class='item_has']")).getText();
int p_bar=Integer.parseInt(progress_bar);
int add_one =(p_bar+1);

System.out.println(add_one);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("add-data-this-page")));
Thread.sleep(2000);
plus_icon.click();
Thread.sleep(4000);
driver.findElement(By.xpath("//div[@platform='facebook']//img[@class='social-platforms-icons']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//button[normalize-space()='Connect Facebook']")).click();
Thread.sleep(4000);
ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
driver.switchTo().window(tabs2.get(1));
driver.findElement(By.id("email")).clear();
driver.findElement(By.id("email")).sendKeys("sagar.uttarkar@unboxsocial.com");
Thread.sleep(2000);
driver.findElement(By.id("pass")).sendKeys("sagar@123");
Thread.sleep(2000);
driver.findElement(By.id("loginbutton")).click();
Thread.sleep(10000);
driver.switchTo().window(tabs2.get(0));
Thread.sleep(4000);
driver.findElement(By.className("yellow-add-btn")).click();

js.executeScript("window.scrollBy(0,650)");
Thread.sleep(2000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Add Accounts']")));
driver.findElement(By.xpath("//button[normalize-space()='Add Accounts']")).click();
Thread.sleep(4000);
driver.navigate().refresh();
Thread.sleep(4000);
//driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[4]/div/div/div/div[5]/div[3]/div/label")).click();
Thread.sleep(4000);
//driver.findElement(By.xpath("//*[@id=\"connect_accounts\"]/div/div/div/div[5]/div[4]/button[1]")).click();
Thread.sleep(4000);
//String after_progress_bar1=driver.findElement(By.xpath("//span[@class='item_has']")).getText();
//
//int p_bar1=Integer.parseInt(after_progress_bar1);
////int after_add =(p_bar1+1);
//System.out.println(p_bar1);
//if(add_one==p_bar1) {
//System.out.println("data perfect"+"result of data after add ="+p_bar1);
//
//}else {
//System.out.println("not added account in progrss bar");
//
//}
//Thread.sleep(4000);
//
}








public void Add_second_Account_Facebook() throws InterruptedException {
	System.out.println("Analytics_module");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/ul[1]/li[2]/a[1]")));
	Analytics.click();
	Thread.sleep(4000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".col-md-12.grid-fit-screen-pages")));
	String progress_bar=driver.findElement(By.xpath("//span[@class='item_has']")).getText();
	int p_bar=Integer.parseInt(progress_bar);
	int add_one =(p_bar+1);

	System.out.println(add_one);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("add-data-this-page")));
	plus_icon.click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[@platform='facebook']//img[@class='social-platforms-icons']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[normalize-space()='Connect Facebook']")).click();
	Thread.sleep(4000);
	ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(tabs2.get(1));
	driver.findElement(By.id("email")).clear();
	driver.findElement(By.id("email")).sendKeys("sagar.unboxtest@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.id("pass")).sendKeys("sagar@123");
	Thread.sleep(2000);
	driver.findElement(By.id("loginbutton")).click();
	Thread.sleep(10000);
	driver.switchTo().window(tabs2.get(0));
	Thread.sleep(4000);
	driver.findElement(By.className("yellow-add-btn")).click();

	js.executeScript("window.scrollBy(0,650)");
	Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Add Accounts']")));
	driver.findElement(By.xpath("//button[normalize-space()='Add Accounts']")).click();
	Thread.sleep(4000);

	driver.navigate().refresh();
//	Thread.sleep(4000);
//	  driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[4]/div/div/div/div[5]/div[3]/div/label")).click();
//	  Thread.sleep(4000);
//	driver.findElement(By.xpath("//*[@id=\"connect_accounts\"]/div/div/div/div[5]/div[4]/button[1]")).click();
//	Thread.sleep(4000);
//	String after_progress_bar1=driver.findElement(By.xpath("//span[@class='item_has']")).getText();
//
//	int p_bar1=Integer.parseInt(after_progress_bar1);
//	//int after_add =(p_bar1+1);
//	System.out.println(p_bar1);
//	if(add_one==p_bar1) {
//	System.out.println("data perfect"+"result of data after add ="+p_bar1);
//
//	}else {
//	System.out.println("not added account in progrss bar");
//
//	}
//	Thread.sleep(4000);
//}

}


public void Add_first_Account_Twitter() throws InterruptedException {
	System.out.println("Analytics_module");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/ul[1]/li[2]/a[1]")));
	Analytics.click();
	Thread.sleep(4000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".col-md-12.grid-fit-screen-pages")));
	String progress_bar=driver.findElement(By.xpath("//span[@class='item_has']")).getText();
	int p_bar=Integer.parseInt(progress_bar);
	int add_one =(p_bar+1);

	System.out.println(add_one);
	plus_icon.click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[@platform='twitter']//img[@class='social-platforms-icons']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[normalize-space()='Connect Twitter']")).click();
	Thread.sleep(4000);
//	ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//	driver.switchTo().window(tabs2.get(1));
//	driver.findElement(By.id("email")).clear();
	driver.findElement(By.id("username_or_email")).sendKeys("sagaruttarkar01");
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys("Sagar@123");
	Thread.sleep(2000);
	driver.findElement(By.id("allow")).click();
	Thread.sleep(10000);

	driver.navigate().refresh();
	Thread.sleep(4000);
//	}
}








public void Add_second_Account_Twitter() throws InterruptedException {
	System.out.println("Analytics_module");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/ul[1]/li[2]/a[1]")));
	Analytics.click();
	Thread.sleep(4000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".col-md-12.grid-fit-screen-pages")));
	String progress_bar=driver.findElement(By.xpath("//span[@class='item_has']")).getText();
	int p_bar=Integer.parseInt(progress_bar);
	int add_one =(p_bar+1);

	System.out.println(add_one);
	plus_icon.click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[@platform='twitter']//img[@class='social-platforms-icons']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[normalize-space()='Connect Twitter']")).click();
	Thread.sleep(4000);
//	ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
//	driver.switchTo().window(tabs2.get(1));
//	driver.findElement(By.id("email")).clear();
	driver.findElement(By.id("username_or_email")).sendKeys("sagar89976832");
	driver.findElement(By.id("password")).sendKeys("sagar@123");
	driver.findElement(By.id("allow")).click();
	Thread.sleep(10000);
	driver.navigate().refresh();
//	Thread.sleep(4000);
//	String after_progress_bar1=driver.findElement(By.xpath("//span[@class='item_has']")).getText();
//
//	int p_bar1=Integer.parseInt(after_progress_bar1);
//	//int after_add =(p_bar1+1);
//	System.out.println(p_bar1);
//	if(add_one==p_bar1) {
//	System.out.println("data perfect"+"result of data after add ="+p_bar1);
//
//	}else {
//	System.out.println("not added account in progrss bar");
//
//	}
//	Thread.sleep(4000);


}





public void Add_first_Account_Instagram() throws InterruptedException {
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/ul[1]/li[2]/a[1]")));
	Analytics.click();
Thread.sleep(4000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".col-md-12.grid-fit-screen-pages")));
String progress_bar=driver.findElement(By.xpath("//span[@class='item_has']")).getText();
int p_bar=Integer.parseInt(progress_bar);
int add_one =(p_bar+1);

System.out.println(add_one);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("add-data-this-page")));
plus_icon.click();
Thread.sleep(4000);
driver.findElement(By.xpath("//div[@platform='instagram']//img[@class='social-platforms-icons']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//button[normalize-space()='Connect Facebook']")).click();
Thread.sleep(4000);
ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
driver.switchTo().window(tabs2.get(1));
Thread.sleep(4000);
driver.findElement(By.id("email")).clear();
Thread.sleep(4000);
driver.findElement(By.id("email")).sendKeys("sagar.uttarkar@unboxsocial.com");
driver.findElement(By.id("pass")).sendKeys("sagar@123");
driver.findElement(By.id("loginbutton")).click();
Thread.sleep(4000);
driver.switchTo().window(tabs2.get(0));
//	driver.findElement(By.xpath("//*[@id=\"connect_accounts\"]/div/div/div/div[3]/div/div[3]/button[2]")).click();
Thread.sleep(4000);
driver.findElement(By.className("yellow-add-btn")).click();
js.executeScript("window.scrollBy(0,650)");
driver.findElement(By.xpath("//button[normalize-space()='Add Accounts']")).click();
Thread.sleep(4000);

Thread.sleep(4000);
driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[4]/div/div/div/div[5]/div[3]/div/label")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id=\"connect_accounts\"]/div/div/div/div[5]/div[4]/button[1]")).click();
Thread.sleep(4000);
String after_progress_bar1=driver.findElement(By.xpath("//span[@class='item_has']")).getText();

int p_bar1=Integer.parseInt(after_progress_bar1);
//	int after_add =(p_bar1+1);
System.out.println(p_bar1);
if(add_one==p_bar1) {
System.out.println("data perfect"+"result of data after add ="+p_bar1);

}else {
System.out.println("not added account in progrss bar");

}


}

public void Delete_Account_all() throws InterruptedException {

	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/ul[1]/li[2]/a[1]")));
	Analytics.click();
	Thread.sleep(4000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".col-md-12.grid-fit-screen-pages")));
	driver.findElement(By.xpath("//input[@name='serach-post']")).sendKeys("sagar");
	Thread.sleep(4000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-times pull-right pointer discard']")));
	driver.findElement(By.xpath("//i[@class='fa fa-times pull-right pointer discard']")).click();
	Thread.sleep(8000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[8]/div[1]/div[1]/div[3]/button[2]")).click();
	Thread.sleep(4000);
	driver.navigate().refresh();
	System.out.println("all Account Deleted Succsefully");



	}




public void Add_second_Account_Instagram() throws InterruptedException {
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/ul[1]/li[2]/a[1]")));
	Analytics.click();
	Thread.sleep(4000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".col-md-12.grid-fit-screen-pages")));
	String progress_bar=driver.findElement(By.xpath("//span[@class='item_has']")).getText();
	int p_bar=Integer.parseInt(progress_bar);
	int add_one =(p_bar+1);

	System.out.println(add_one);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("add-data-this-page")));
	plus_icon.click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[@platform='instagram']//img[@class='social-platforms-icons']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[normalize-space()='Connect Facebook']")).click();
	Thread.sleep(4000);
	ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(tabs2.get(1));
	Thread.sleep(4000);
	driver.findElement(By.id("email")).clear();
	Thread.sleep(4000);
	driver.findElement(By.id("email")).sendKeys("sagar.unboxtest@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("sagar@123");
	driver.findElement(By.id("loginbutton")).click();
	Thread.sleep(4000);
	driver.switchTo().window(tabs2.get(0));
//		driver.findElement(By.xpath("//*[@id=\"connect_accounts\"]/div/div/div/div[3]/div/div[3]/button[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.className("yellow-add-btn")).click();
	js.executeScript("window.scrollBy(0,650)");
	driver.findElement(By.xpath("//button[normalize-space()='Add Accounts']")).click();
	Thread.sleep(4000);
	Thread.sleep(4000);
	  driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[4]/div/div/div/div[5]/div[3]/div/label")).click();
	  Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"connect_accounts\"]/div/div/div/div[5]/div[4]/button[1]")).click();
	String after_progress_bar1=driver.findElement(By.xpath("//span[@class='item_has']")).getText();

	int p_bar1=Integer.parseInt(after_progress_bar1);
//		int after_add =(p_bar1+1);
	System.out.println(p_bar1);
	if(add_one==p_bar1) {
	System.out.println("data perfect"+"result of data after add ="+p_bar1);

	}else {
	System.out.println("not added account in progrss bar");
}


}

public void Clickable_Graphs_best_time_to_post_ig() throws InterruptedException {
System.out.println("Best time to post");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/ul[1]/li[2]/a[1]")));
Analytics.click();
Thread.sleep(4000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]")));
Search.click();
Search_keyword.sendKeys("BIG MO");
Thread.sleep(4000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'BIG MO')]")));
driver.findElement(By.xpath("//div[contains(text(),'BIG MO')]")).click();
Thread.sleep(4000);
js.executeScript("window.scrollBy(0,750)");
boolean best_time =driver.findElement(By.id("bestTimeToPostContainer")).isDisplayed();
if(best_time==true) {
String capsul= driver.findElement(By.xpath("//*[@id=\"influencerinsights\"]/div[2]/div[5]/div[1]/div/div/div[1]/div[2]/span")).getText();
Assert.assertEquals("Click on any data point to view more", capsul);


}else {

System.out.println("data not loading!!! ");
}
Thread.sleep(8000);
driver.findElement(By.xpath("//*[@id=\"bestPostTime\"]/div/div[2]/div[1]/a/div")).click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("best_unique_post_data")));

boolean card =driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[3]/div[1]/div/div")).isDisplayed();
boolean selected_post =driver.findElement(By.id("best_unique_post_data")).isDisplayed();
boolean all_post =driver.findElement(By.id("best_pop_posts")).isDisplayed();
if(card && selected_post &&all_post== true ) {

System.out.println("all data showing proper");

}else {

System.out.println("somethings are wrong!!!");


}
Thread.sleep(4000);
driver.findElement(By.xpath("//img[@class='back-to-view']")).click();

}
public void Clickable_Graphs_Recommanded_post_to_promote_ig() throws InterruptedException {
System.out.println("Recommanded post to promote");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/ul[1]/li[2]/a[1]")));
Analytics.click();
Thread.sleep(4000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]")));
Search.click();
Search_keyword.sendKeys("BIG MO");
Thread.sleep(4000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'BIG MO')]")));
driver.findElement(By.xpath("//div[contains(text(),'BIG MO')]")).click();
Thread.sleep(4000);
js.executeScript("window.scrollBy(0,950)");
boolean post =driver.findElement(By.id("topPostByEngagementTabs")).isDisplayed();
if(post==true) {

driver.findElement(By.xpath("//*[@id=\"influencerinsights\"]/div[4]/div/div[1]/div[3]/a/div/i")).click();
Thread.sleep(2000);
driver.findElement(By.id("likes_sort")).click();
Thread.sleep(2000);
String data=driver.findElement(By.xpath("//*[@id=\"influencerinsights\"]/div[4]/div/div[3]/div/div[1]/div[2]")).getText();
System.out.println("image data ");
System.out.println(data);
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"topPostByEngagementTabs\"]/span[2]")).click();
//String video=driver.findElement(By.xpath("//div[@id='post_by_engagement']//div[@class='col-md-12 no-padding-left']")).getText();
//System.out.println("video data");
//System.out.println(video);
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"topPostByEngagementTabs\"]/span[3]")).click();
//String carosel=driver.findElement(By.xpath("//div[@id='post_by_engagement']//div[@class='col-md-12 no-padding-left']")).getText();
//System.out.println("carousel data");
//System.out.println(carosel);
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"topPostByEngagementTabs\"]/span[4]")).click();
//String igtv=driver.findElement(By.xpath("//div[@id='post_by_engagement']//div[@class='col-md-12 no-padding-left']")).getText();
//System.out.println("igtvdata");
//System.out.println(igtv);
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"topPostByEngagementTabs\"]/span[5]")).click();



}

}
public void  Clickable_Graphs_Top_Hash_Tag_ig() throws InterruptedException {
System.out.println("Top HashTag");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/ul[1]/li[2]/a[1]")));
Analytics.click();
Thread.sleep(4000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]")));
Search.click();
Search_keyword.sendKeys("BIG MO");
Thread.sleep(4000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'BIG MO')]")));
driver.findElement(By.xpath("//div[contains(text(),'BIG MO')]")).click();
Thread.sleep(4000);
js.executeScript("window.scrollBy(0,950)");
boolean top_post =driver.findElement(By.id("tophastag")).isDisplayed();

if(top_post== true) {

System.out.println("all data showing proper");
driver.findElement(By.xpath("//*[@id=\"tophastag\"]/div[2]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"top_hashtag_popup\"]/div[1]/div/div/div[1]/button")).click();

}else {

System.out.println("somethings are wrong!!!");


}
}
public void Clickable_Graphs_Recommanded_post_to_promote_fb() throws InterruptedException {
System.out.println("Recommanded post to promote");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/ul[1]/li[2]/a[1]")));
Analytics.click();
Thread.sleep(4000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]")));
Search.click();
Search_keyword.sendKeys("Ducati Singapore");
Thread.sleep(4000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Ducati Singapore')]")));
driver.findElement(By.xpath("//div[contains(text(),'Ducati Singapore')]")).click();
Thread.sleep(4000);
WebElement element = driver.findElement(By.xpath("//*[@id=\"influencerinsights\"]/div[8]/div/div/div/div[8]/span"));
js.executeScript("arguments[0].scrollIntoView(true);",element);
boolean post =driver.findElement(By.id("topPostByEngagement")).isDisplayed();
if(post==true) {
driver.findElement(By.xpath("//*[@id=\"influencerinsights\"]/div[9]/div/div[1]/div[3]/a/div/i")).click();
Thread.sleep(2000);
driver.findElement(By.id("date_sort")).click();
Thread.sleep(2000);
String data=driver.findElement(By.xpath("//*[@id=\"topPostByEngagement\"]/div[1]/div[2]")).getText();
System.out.println("image data ");
System.out.println(data);
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"topPostByEngagementTabs\"]/span[2]")).click();
String video=driver.findElement(By.xpath("//*[@id=\"topPostByEngagement\"]/div[2]/div[2]")).getText();
System.out.println("video data");
System.out.println(video);
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"topPostByEngagementTabs\"]/span[3]")).click();
String links=driver.findElement(By.xpath("//*[@id=\"topPostByEngagement\"]/div[3]/div[2]")).getText();
System.out.println("links data");
System.out.println(links);
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"topPostByEngagementTabs\"]/span[4]")).click();
String status=driver.findElement(By.xpath("//*[@id=\"topPostByEngagement\"]/div[4]/div[2]")).getText();
System.out.println("status");
System.out.println(status);
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"topPostByEngagementTabs\"]/span[5]")).click();
String album=driver.findElement(By.xpath("//*[@id=\"topPostByEngagement\"]/div[5]/div[2]")).getText();
System.out.println("album");
System.out.println(album);

}



}
public void Clickable_Graphs_Most_Engaging_Tweets_TW() throws InterruptedException {
System.out.println("Most Engaging Tweets");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/ul[1]/li[2]/a[1]")));
Analytics.click();
Thread.sleep(4000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]")));
Search.click();
Search_keyword.sendKeys("zee music company");
Thread.sleep(4000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Zee Music Company')]")));
driver.findElement(By.xpath("//div[contains(text(),'Zee Music Company')]")).click();
Thread.sleep(4000);
((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
boolean post =driver.findElement(By.id("top_interactive_posts")).isDisplayed();
if(post== true) {
driver.findElement(By.xpath("//*[@id=\"influencerinsights\"]/div[9]/div/div/div/div/div[1]/div[3]/a/div/i")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"order_sort_post_asc\"]")).click();
String inter=driver.findElement(By.id("top_interactive_posts")).getText();
System.out.println(inter);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"most_interactive_capsule\"]/span[2]")));
driver.findElement(By.xpath("//*[@id=\"most_interactive_capsule\"]/span[2]")).click();
String retweets=driver.findElement(By.id("top_interactive_posts")).getText();
System.out.println(retweets);
Thread.sleep(4000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"most_interactive_capsule\"]/span[3]")));
driver.findElement(By.xpath("//*[@id=\"most_interactive_capsule\"]/span[3]")).click();
String fav=driver.findElement(By.id("top_interactive_posts")).getText();
System.out.println(fav);
Thread.sleep(2000);

}else {

System.out.println("post not loaded");

}

}
public void Clickable_Graphs_Most_Engaging_post_YT() throws InterruptedException   {
System.out.println("Most Engaging posts");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/ul[1]/li[2]/a[1]")));
Analytics.click();
Thread.sleep(4000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]")));
Search.click();
Search_keyword.sendKeys("disneyplus");
Thread.sleep(4000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'DisneyPlus Hotstar_IN')]")));
driver.findElement(By.xpath("//div[contains(text(),'DisneyPlus Hotstar_IN')]")).click();
Thread.sleep(4000);
((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
Thread.sleep(4000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("topVideosYT")));
boolean top_video =driver.findElement(By.id("topVideosYT")).isDisplayed();
String top_vd=driver.findElement(By.id("topVideosYT")).getText();
if(top_video== true) {
Thread.sleep(2000);
driver.findElement(By.xpath("//i[@class='fa fa-filter for_filter postTypeFilter add_acc_plus']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id=\"typefilter\"]/div[2]/div/div[1]/div[2]")).click();
//Like/desc
System.out.println(top_vd);
}else {

System.out.println("data not loaded !!!");


}
}

public void Add_Reconnect_Account_Facebook() throws InterruptedException {
System.out.println("Analytics_module");
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/ul[1]/li[2]/a[1]")));
Analytics.click();
Thread.sleep(4000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-md-12 grid-fit-screen-pages']")));
String progress_bar=driver.findElement(By.xpath("//span[@class='item_has']")).getText();
int p_bar=Integer.parseInt(progress_bar);
int add_one =(p_bar+1);

System.out.println(add_one);
plus_icon.click();
Thread.sleep(4000);
driver.findElement(By.xpath("//div[@platform='facebook']//img[@class='social-platforms-icons']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//button[normalize-space()='Connect Facebook']")).click();
Thread.sleep(4000);
ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
driver.switchTo().window(tabs2.get(1));
driver.findElement(By.id("email")).clear();
driver.findElement(By.id("email")).sendKeys("sagar.uttarkar+1@unboxsocial.com");
driver.findElement(By.id("pass")).sendKeys("sagar@123");
driver.findElement(By.id("loginbutton")).click();
Thread.sleep(10000);
driver.switchTo().window(tabs2.get(0));
Thread.sleep(4000);
driver.findElement(By.className("yellow-add-btn")).click();
js.executeScript("window.scrollBy(0,650)");
Thread.sleep(2000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Add Accounts']")));
driver.findElement(By.xpath("//button[normalize-space()='Add Accounts']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@id=\"connect_accounts\"]/div/div/div/div[5]/div[3]/button[1]")).click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]")));
Search.click();
Search_keyword.sendKeys("Reconnect");
Thread.sleep(4000);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]")));
driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/div/div/i")).click();
driver.findElement(By.xpath("/html/body/div[8]/div/div/div[3]/button[2]")).click();

}

 public void Testcase_Analytics_demo_account__ig() throws InterruptedException {

	 System.out.println("Analytics_module_instagram");
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/ul[1]/li[2]/a[1]")));
	 Analytics.click();
	 Thread.sleep(4000);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]")));
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("//div[normalize-space()='Chasis Bank']")).click();
	 Thread.sleep(4000);
    System.out.println("************influencer_insight**********");

	 Boolean card = driver.findElement(By.id("influencerinsights")).isDisplayed();
	 String  carddetails = driver.findElement(By.id("influencerinsights")).getText();

	 if(card == true) {
	 System.out.println("Data loaded properly");
	 System.out.println(carddetails);
	 }
	 else {

	 System.out.println("Data not loaded properly");


	 }
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
	 //follower_growth
	 System.out.println("***/follower_growth *****");

	 Boolean follower_g = driver.findElement(By.id("follower_growth")).isDisplayed();
	 String  follower_g1 = driver.findElement(By.id("follower_growth")).getText();

	 if(follower_g == true) {
	 System.out.println("Data loaded properly");
	 System.out.println(follower_g1);


	 }
	 else {

	 System.out.println("Data not loaded properly");

	 }

	 System.out.println("***Impressions & Reach *****");

	 Boolean imp_nd_reach = driver.findElement(By.id("impressions")).isDisplayed();
	 String  imp_nd_reach1 = driver.findElement(By.id("impressions")).getText();

	 if(imp_nd_reach == true) {
	 System.out.println("Data loaded properly");
	 System.out.println(imp_nd_reach1);


	 }
	 else {

	 System.out.println("Data not loaded properly");

	 }

	 js.executeScript("window.scrollBy(0,650)");
	 Thread.sleep(4000);
	 System.out.println("************No. of Posts************");

	 Boolean no_post = driver.findElement(By.id("totalPosts")).isDisplayed();
	 String  no_post1 = driver.findElement(By.id("totalPosts")).getText();

	 if(no_post == true) {
	 System.out.println("Data loaded properly");
	 System.out.println(no_post1);


	 }
	 else {

	 System.out.println("Data not loaded properly");


	 }
	 //Average Engagement Per Content Form (by Followers)
	 System.out.println("************Average Engagement Per Content Form (by Followers)************");

	 Boolean ER_follower = driver.findElement(By.id("catER")).isDisplayed();
	 String  ER_follower1 = driver.findElement(By.id("catER")).getText();

	 if(ER_follower == true) {
	 System.out.println("Data loaded properly");
	 System.out.println(ER_follower1);


	 }
	 else {

	 System.out.println("Data not loaded properly");


	 }
	 //Average Engagement Per Content Form (by Reach


	 System.out.println("************Average Engagement Per Content Form (by Reach)************");

	 Boolean ER_follower_reach = driver.findElement(By.id("engagement_by_reach")).isDisplayed();
	 String  ER_follower_reach1 = driver.findElement(By.id("engagement_by_reach")).getText();

	 if(ER_follower_reach == true) {
	 System.out.println("Data loaded properly");
	 System.out.println(ER_follower_reach1);


	 }
	 else {

	 System.out.println("Data not loaded properly");


	 }
	 Thread.sleep(4000);
	 js.executeScript("window.scrollBy(0,650)");
	 //Best time to Post

	 System.out.println("************Best time to Post ************");

	 Boolean best_time_post = driver.findElement(By.id("bestTimeToPostContainer")).isDisplayed();
	 String  best_time_post1 = driver.findElement(By.id("bestTimeToPostContainer")).getText();

	 if(best_time_post == true) {
	 System.out.println("Data loaded properly");
	 System.out.println(best_time_post1);


	 }
	 else {

	 System.out.println("Data not loaded properly");


	 }
	 //Online Followers

	 System.out.println("************Online Followers ***********");

	 Boolean ol_follower = driver.findElement(By.id("online_followers")).isDisplayed();
	 String  ol_follower1 = driver.findElement(By.id("online_followers")).getText();

	 if(ol_follower == true) {
	 System.out.println("Data loaded properly");
	 System.out.println(ol_follower1);


	 }
	 else {

	 System.out.println("Data not loaded properly");


	 }

	 js.executeScript("window.scrollBy(0,650)");
	 //Website & Email Clicks


	 System.out.println("************Website & Email Clicks***********");

	 Boolean website_click = driver.findElement(By.id("website_clicks")).isDisplayed();
	 String  website_click1 = driver.findElement(By.id("website_clicks")).getText();

	 if(website_click == true) {
	 System.out.println("Data loaded properly");
	 System.out.println(website_click1);


	 }
	 else {

	 System.out.println("Data not loaded properly");


	 }


	 System.out.println("************Profile Views **********");

	 Boolean profile_review = driver.findElement(By.id("profile_views")).isDisplayed();
	 String  profile_review1 = driver.findElement(By.id("profile_views")).getText();

	 if(profile_review == true) {
	 System.out.println("Data loaded properly");
	 System.out.println(profile_review1);


	 }
	 else {

	 System.out.println("Data not loaded properly");


	 }


	 Thread.sleep(4000);
	 js.executeScript("window.scrollBy(0,650)");
	 ///TOP Post

	 System.out.println("*****Top posts ***********");

	 Boolean top_post = driver.findElement(By.id("topPostByEngagementTabs")).isDisplayed();
	 String  top_post1 = driver.findElement(By.id("topPostByEngagementTabs")).getText();

	 if(top_post == true) {
	 System.out.println("Data loaded properly");
	 System.out.println(top_post1);


	 }
	 else {

	 System.out.println("Data not loaded properly");
	 }
	 Thread.sleep(4000);
	 js.executeScript("window.scrollBy(0,650)");

	 //TOP Hastag
	 System.out.println("********* TOP HASTAG***************");

	 Boolean top_Hashtag = driver.findElement(By.id("tophastag")).isDisplayed();
	 String  top_Hashtag1 = driver.findElement(By.id("tophastag")).getText();

	 if(top_Hashtag == true) {
	 System.out.println("Data loaded properly");
	 System.out.println(top_Hashtag1);


	 }
	 else {

	 System.out.println("Data not loaded properly");
	 }
	 //performance of stories by content format
	 System.out.println("********* performance of stories by content format***************");

	 Boolean stories_format = driver.findElement(By.id("performance_content")).isDisplayed();
	 String  stories_format1 = driver.findElement(By.id("performance_content")).getText();

	 if(stories_format == true) {
	 System.out.println("Data loaded properly");
	 System.out.println(stories_format1);


	 }
	 else {

	 System.out.println("Data not loaded properly");
	 }

	 Thread.sleep(3000);
	 ((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
	 driver.findElement(By.id("link_for_29")).click();

	 //Gender Split
	 Thread.sleep(4000);
	 System.out.println("*****Gender Split ***********");

	 Boolean gender_split = driver.findElement(By.id("genderSplit")).isDisplayed();
	 String  gender_split1 = driver.findElement(By.id("genderSplit")).getText();

	 if(gender_split == true) {
	 System.out.println("Data loaded properly");
	 System.out.println(gender_split1);


	 }
	 else {

	 System.out.println("Data not loaded properly");
	 }

	 System.out.println("*****Age and Gender Split***********");

	 Boolean age_gender = driver.findElement(By.id("ageGender")).isDisplayed();
	 String  age_gender1 = driver.findElement(By.id("ageGender")).getText();

	 if(age_gender == true) {
	 System.out.println("Data loaded properly");
	 System.out.println(age_gender1);


	 }
	 else {

	 System.out.println("Data not loaded properly");
	 }

	 js.executeScript("window.scrollBy(0,650)");
	 Thread.sleep(4000);

	 ///Audience Interest

	 System.out.println("*****Audience Interest***********");

	 Boolean audience_intrest = driver.findElement(By.id("audienceInterest")).isDisplayed();
	 String  audience_intrest1 = driver.findElement(By.id("audienceInterest")).getText();

	 if(audience_intrest == true) {
	 System.out.println("Data loaded properly");
	 System.out.println(audience_intrest1);


	 }
	 else {

	 System.out.println("Data not loaded properly");
	 }


	 js.executeScript("window.scrollBy(0,650)");
	 Thread.sleep(4000);
	 ///location spread

	 System.out.println("*****location spread***********");

	 Boolean Loc_spread = driver.findElement(By.id("worldSpread")).isDisplayed();
	 String  Loc_spread1 = driver.findElement(By.id("worldSpread")).getText();

	 if(Loc_spread == true) {
	 System.out.println("Data loaded properly");
	 System.out.println(Loc_spread1);


	 }
	 else {

	 System.out.println("Data not loaded properly");
	 }


	 //Audience Quality

	 System.out.println("*****Audience Quality ***********");

	 Boolean act_quality = driver.findElement(By.id("activePassive")).isDisplayed();
	 String  act_quality1 = driver.findElement(By.id("activePassive")).getText();

	 if(act_quality == true) {
	 System.out.println("Data loaded properly");
	 System.out.println(act_quality1);


	 }
	 else {

	 System.out.println("Data not loaded properly");
	 }

	 js.executeScript("window.scrollBy(0,650)");
	 Thread.sleep(4000);


	 ///Content themes Brands have been talking about

	 System.out.println("*****Content themes Brands have been talking about ***********");

	 Boolean talking_abt = driver.findElement(By.id("talkingAbout")).isDisplayed();
	 String  talking_abt1 = driver.findElement(By.id("talkingAbout")).getText();

	 if(talking_abt == true) {
	 System.out.println("Data loaded properly");
	 System.out.println(talking_abt1);


	 }
	 else {

	 System.out.println("Data not loaded properly");
	 }

	 js.executeScript("window.scrollBy(0,650)");
	 Thread.sleep(4000);

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

	 js.executeScript("window.scrollBy(0,650)");
	 Thread.sleep(4000);
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

	 js.executeScript("window.scrollBy(0,650)");
	 Thread.sleep(4000);

	 System.out.println("*****Mode of Interaction 2***********");

	 Boolean inter = driver.findElement(By.id("instaAudienceInterraction")).isDisplayed();
	 String  inter2 = driver.findElement(By.id("instaAudienceInterraction")).getText();

	 if(inter == true) {
	 System.out.println("Data loaded properly");
	 System.out.println(inter2);


	 }
	 else {

	 System.out.println("Data not loaded properly");


	 }
	 // post tab
	 Thread.sleep(3000);
	 ((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
	 Thread.sleep(3000);
	 driver.findElement(By.id("link_for_31")).click();
	 // comment time being
	 //driver.findElement(By.xpath("//*[@id=\"magic-list\"]/div[1]/h5/div[2]/span/img")).click();
	 //Thread.sleep(4000);
	 //driver.findElement(By.xpath("//*[@id=\"magic-list\"]/div[1]/h5/div[2]/span/input")).sendKeys("NBA75");
	 //Thread.sleep(4000);
	 //driver.findElement(By.xpath("//*[@id=\"magic-list\"]/div[1]/h5/div[2]/a/div")).click();
	 //Thread.sleep(4000);
	 //driver.findElement(By.id("comments_sort")).click();

	 Thread.sleep(2000);
	 String result=driver.findElement(By.id("postss")).getText();
	 System.out.println("resuTestcase_verify_Matrics_instagram_clients_accountlt according to filtter"+result);
     Thread.sleep(2000);
	 driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[3]/div/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/div/div[1]")).click();
	 Thread.sleep(4000);         
	 driver.findElement(By.xpath("/html/body/div[5]/div[6]/div/div/div[1]/button")).click();
	

	 Thread.sleep(3000);
	 ((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
	 Thread.sleep(3000);
	 driver.findElement(By.id("link_for_32")).click();

	 ///Stories tab

	 System.out.println("****Stories tab***********");
	 Thread.sleep(3000);
	 Boolean top_stories = driver.findElement(By.id("fbStoriesTopPosts")).isDisplayed();
	 String  top_stories1 = driver.findElement(By.id("fbStoriesTopPosts")).getText();

	 if(top_stories == true) {
	 System.out.println("Data loaded properly");
	 System.out.println(top_stories1);


	 }
	 else {

	 System.out.println("Data not loaded properly");


	 }


	 }
public void Testcase_Analytics_Demo_Account_FB() throws InterruptedException {
	System.out.println("Anyalytics_module_facebook demo account");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/ul[1]/li[2]/a[1]")));
	Analytics.click();
	Thread.sleep(4000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]")));

	driver.findElement(By.xpath("//div[normalize-space()='Ida Washing Powder']")).click();
	/// insights cards
	Thread.sleep(4000);
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
	Thread.sleep(4000);

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
	Thread.sleep(4000);

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
	Thread.sleep(4000);
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
	Thread.sleep(4000);
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

	Thread.sleep(4000);
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
	Thread.sleep(4000);
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
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,250)");
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


	Thread.sleep(4000);
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

	Thread.sleep(4000);
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


	/// tab   Audience
	Audience.click();
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
	Thread.sleep(4000);
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
	Thread.sleep(4000);
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
	Thread.sleep(4000);
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
	Thread.sleep(4000);
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

	Thread.sleep(4000);
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
	Thread.sleep(4000);
	((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");

	Posts.click();

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
	Thread.sleep(4000);
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
	Thread.sleep(4000);
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
	Thread.sleep(4000);
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
	Thread.sleep(4000);
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
	Thread.sleep(4000);


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
	driver.findElement(By.xpath("//*[@id=\"all_posts_fb\"]/div[2]")).click();
	Thread.sleep(4000);



	Boolean post_er = driver.findElement(By.id("scrollable-popup")).isDisplayed();
	String  post_er1 = driver.findElement(By.id("scrollable-popup")).getText();

	if(post_er == true) {
	System.out.println("Data loaded properly");
	System.out.println(post_er1);


	}
	else {

	System.out.println("Data not loaded properly");

	}
	Thread.sleep(4000);
	// close btn//
	driver.findElement(By.xpath("//*[@id=\"post-detail-facebook\"]/div/div/button")).click();


	}


public void Testcases_demo_Account_TW() throws InterruptedException {

	System.out.println("Analytics_module_twitter");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/ul[1]/li[2]/a[1]")));
	Analytics.click();
	Thread.sleep(4000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]")));
	Thread.sleep(2000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]")));
	driver.findElement(By.xpath("//div[normalize-space()='Frye Music Festival']")).click();
	Thread.sleep(4000);
	//cards
	System.out.println("****Score cards***********");
	Thread.sleep(4000);
	Boolean score_card = driver.findElement(By.xpath("//*[@id=\"influencerinsights\"]/div[1]/div")).isDisplayed();
	String  score_card1 = driver.findElement(By.xpath("//*[@id=\"influencerinsights\"]/div[1]/div")).getText();

	if(score_card == true) {
	System.out.println("Data loaded properly");
	System.out.println(score_card1);


	}
	else {

	System.out.println("Data not loaded properly");


	}


	//Tweet Timeline


	System.out.println("****Tweet Timeline***********");
	Thread.sleep(4000);
	Boolean Tweet_t1 = driver.findElement(By.id("tweet_timeline")).isDisplayed();
	String  Tweet_t = driver.findElement(By.id("tweet_timeline")).getText();

	if(Tweet_t1 == true) {
	System.out.println("Data loaded properly");
	System.out.println(Tweet_t);


	}
	else {

	System.out.println("Data not loaded properly");


	}

	//Total Interactions
	System.out.println("****Total Interactions***********");
	Thread.sleep(4000);
	Boolean total_int = driver.findElement(By.id("net_fans_interactions")).isDisplayed();
	String  total_int1 = driver.findElement(By.id("net_fans_interactions")).getText();

	if(total_int == true) {
	System.out.println("Data loaded properly");
	System.out.println(total_int1);


	}
	else {

	System.out.println("Data not loaded properly");


	}
	js.executeScript("window.scrollBy(0,650)");
	Thread.sleep(4000);

	//Favourited Over Time

	System.out.println("****Favourited Over Time***********");
	Thread.sleep(4000);
	Boolean Fev_t = driver.findElement(By.id("favouretedOverTime")).isDisplayed();
	String  Fev_t1 = driver.findElement(By.id("favouretedOverTime")).getText();

	if(Fev_t == true) {
	System.out.println("Data loaded properly");
	System.out.println(Fev_t1);


	}
	else {

	System.out.println("Data not loaded properly");


	}
	///Retweets Over Time
	System.out.println("****/Retweets Over Time***********");
	Thread.sleep(4000);
	Boolean re_tweet = driver.findElement(By.id("retweetedTweetsOverTime")).isDisplayed();
	String  re_tweet1 = driver.findElement(By.id("retweetedTweetsOverTime")).getText();

	if(re_tweet == true) {
	System.out.println("Data loaded properly");
	System.out.println(re_tweet1);


	}
	else {

	System.out.println("Data not loaded properly");


	}
	js.executeScript("window.scrollBy(0,650)");
	Thread.sleep(4000);

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

	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,650)");

	//Total Tweets

	System.out.println("*****Total Tweets ***********");

	Boolean total_post = driver.findElement(By.id("totalPosts")).isDisplayed();
	String  total_post1 = driver.findElement(By.id("totalPosts")).getText();

	if(total_post == true) {
	System.out.println("Data loaded properly");
	System.out.println(total_post1);


	}
	else {

	System.out.println("Data not loaded properly");


	}
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,650)");


	System.out.println("*****Total Mentions ***********");

	Boolean total_m = driver.findElement(By.id("total_mentions")).isDisplayed();
	String  total_m1 = driver.findElement(By.id("total_mentions")).getText();

	if(total_m == true) {
	System.out.println("Data loaded properly");
	System.out.println(total_m1);


	}
	else {

	System.out.println("Data not loaded properly");


	}

	Thread.sleep(4000);
	//Top Linked Sources
	System.out.println("*****Top Linked Sources ***********");

	Boolean top_link = driver.findElement(By.id("referrals")).isDisplayed();
	String  top_link1 = driver.findElement(By.id("referrals")).getText();

	if(top_link == true) {
	System.out.println("Data loaded properly");
	System.out.println(top_link1);


	}
	else {

	System.out.println("Data not loaded properly");


	}
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,650)");

	//Top Hashtags

	System.out.println("***** Top Hashtags  ***********");

	Boolean top_hashtag = driver.findElement(By.id("relatedHashtags")).isDisplayed();
	String  top_hashtag1 = driver.findElement(By.id("relatedHashtags")).getText();

	if(top_hashtag == true) {
	System.out.println("Data loaded properly");
	System.out.println(top_hashtag1);


	}
	else {

	System.out.println("Data not loaded properly");


	}
	Thread.sleep(4000);
	//Top Mentions
	System.out.println("***** Top Mentions   ***********");

	Boolean rel_mention = driver.findElement(By.id("relatedMentions")).isDisplayed();
	String  rel_mention1 = driver.findElement(By.id("relatedMentions")).getText();

	if(rel_mention == true) {
	System.out.println("Data loaded properly");
	System.out.println(rel_mention1);


	}
	else {

	System.out.println("Data not loaded properly");


	}
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,650)");
	///Most Engaging Tweets

	System.out.println("***** Most Engaging Tweets   ***********");

	Boolean most_eng = driver.findElement(By.id("top_interactive_posts")).isDisplayed();
	String  most_eng1 = driver.findElement(By.id("top_interactive_posts")).getText();

	if(most_eng == true) {
	System.out.println("Data loaded properly");
	System.out.println(most_eng1);


	}
	else {

	System.out.println("Data not loaded properly");


	}
	Thread.sleep(4000);
	((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");

	//Audience tab

	driver.findElement(By.id("link_for_127")).click();


//		List of Mentions


	System.out.println("*****  List of Mentions  ***********");

	Boolean list_men = driver.findElement(By.xpath("//*[@id=\"influencerinsights\"]/div[2]/div/div/div/div/table")).isDisplayed();
	String  list_men1 = driver.findElement(By.xpath("//*[@id=\"influencerinsights\"]/div[2]/div/div/div/div/table")).getText();

	if(list_men == true) {
	System.out.println("Data loaded properly");
	System.out.println(list_men1);


	}
	else {

	System.out.println("Data not loaded properly");


	}
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,750)");

	//List of Retweeters
	System.out.println("*****  List of Retweeters  ***********");

	Boolean list_retweet = driver.findElement(By.xpath("//*[@id=\"influencerinsights\"]/div[3]/div/div/div/div/table")).isDisplayed();
	String  list_retweet1 = driver.findElement(By.xpath("//*[@id=\"influencerinsights\"]/div[3]/div/div/div/div/table")).getText();

	if(list_retweet == true) {
	System.out.println("Data loaded properly");
	System.out.println(list_retweet1);


	}
	else {

	System.out.println("Data not loaded properly");


	}
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,650)");
	//gender split
	System.out.println("*****Gender Split ***********");

	Boolean gender_split = driver.findElement(By.id("genderSplit")).isDisplayed();
	String  gender_split1 = driver.findElement(By.id("genderSplit")).getText();

	if(gender_split == true) {
	System.out.println("Data loaded properly");
	System.out.println(gender_split1);


	}
	else {

	System.out.println("Data not loaded properly");
	}

	//Tweet Source

	System.out.println("*****Tweet Source ***********");

	Boolean tweet_pie = driver.findElement(By.id("tweet_source_pie")).isDisplayed();
	String  tweet_pie1 = driver.findElement(By.id("tweet_source_pie")).getText();

	if(tweet_pie == true) {
	System.out.println("Data loaded properly");
	System.out.println(tweet_pie1);


	}
	else {

	System.out.println("Data not loaded properly");
	}
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,650)");

	//Audience Interest
	System.out.println("*****Audience Interest***********");

	Boolean audience_intrest = driver.findElement(By.id("audienceInterest")).isDisplayed();
	String  audience_intrest1 = driver.findElement(By.id("audienceInterest")).getText();

	if(audience_intrest == true) {
	System.out.println("Data loaded properly");
	System.out.println(audience_intrest1);


	}
	else {

	System.out.println("Data not loaded properly");



	}

	//Location

	System.out.println("*****Location***********");

	Boolean LOC_tweet = driver.findElement(By.id("location_mentions_retweets")).isDisplayed();
	String  LOC_tweet1 = driver.findElement(By.id("location_mentions_retweets")).getText();

	if(LOC_tweet == true) {
	System.out.println("Data loaded properly");
	System.out.println(LOC_tweet1);


	}
	else {

	System.out.println("Data not loaded properly");



	}

	//Language
	System.out.println("*****Language***********");

	Boolean Lang_tweet = driver.findElement(By.id("language_mentions_retweets")).isDisplayed();
	String  Lang_tweet1 = driver.findElement(By.id("language_mentions_retweets")).getText();

	if(Lang_tweet == true) {
	System.out.println("Data loaded properly");
	System.out.println(Lang_tweet1);


	}
	else {

	System.out.println("Data not loaded properly");



	}

	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,650)");

	//Top Linked Sources By Mentions

	System.out.println("*****Top Linked Sources By Mentions***********");

	Boolean Top_links = driver.findElement(By.id("audience_mentioned_domains")).isDisplayed();
	String  Top_links1 = driver.findElement(By.id("audience_mentioned_domains")).getText();

	if(Top_links == true) {
	System.out.println("Data loaded properly");
	System.out.println(Top_links1);


	}
	else {

	System.out.println("Data not loaded properly");



	}

	//Your audience's Follower Account
	System.out.println("*****Your audience's Follower Account ***********");

	Boolean Aud_foll_ac = driver.findElement(By.id("audience_follower_count")).isDisplayed();
	String  Aud_foll_ac1 = driver.findElement(By.id("audience_follower_count")).getText();

	if(Aud_foll_ac == true) {
	System.out.println("Data loaded properly");
	System.out.println(Aud_foll_ac1);


	}
	else {

	System.out.println("Data not loaded properly");



	}
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,650)");



	//Recent Followers
	System.out.println("*****Recent Followers  ***********");

	Boolean recent_fol = driver.findElement(By.id("top_followers")).isDisplayed();
	String  recent_fol1 = driver.findElement(By.id("top_followers")).getText();

	if(recent_fol == true) {
	System.out.println("Data loaded properly");
	System.out.println(recent_fol1);


	}
	else {

	System.out.println("Data not loaded properly");



	}
	((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
	Thread.sleep(3000);
	driver.findElement(By.id("link_for_128")).click();
	Thread.sleep(4000);

	driver.findElement(By.xpath("//*[@id=\"magic-list\"]/div[1]/h5/div[3]/a/div")).click();
	Thread.sleep(4000);
	driver.findElement(By.id("retweets_sort")).click();
	Thread.sleep(8000);
	String result= driver.findElement(By.id("pinBoot")).getText();
	System.out.println("result according to fillter"+result);

	}

public void Testcases_Demo_Account_YT() throws InterruptedException {

	System.out.println("Analytics_module_youtube");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[2]/ul[1]/li[2]/a[1]")));
	Analytics.click();
	Thread.sleep(4000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]")));
	driver.findElement(By.xpath("//div[normalize-space()='Flick Prime Video']")).click();
	Thread.sleep(4000);
	//score card
	System.out.println("*****//score card ***********");

	Boolean score_card = driver.findElement(By.xpath("//*[@id=\"influencerinsightsYoutube\"]/div[1]/div")).isDisplayed();
	String  score_card1 = driver.findElement(By.xpath("//*[@id=\"influencerinsightsYoutube\"]/div[1]/div")).getText();

	if(score_card == true) {
	System.out.println("Data loaded properly");
	System.out.println(score_card1);


	}
	else {

	System.out.println("Data not loaded properly");

	}
	//Retention Rate

	System.out.println("*****Retention Rate  ***********");

	Boolean retantion_rate = driver.findElement(By.id("newRetention")).isDisplayed();
	String  retantion_rate1 = driver.findElement(By.id("newRetention")).getText();

	if(retantion_rate == true) {
	System.out.println("Data loaded properly");
	System.out.println(retantion_rate1);


	}
	else {

	System.out.println("Data not loaded properly");

	}
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,650)");
	///Interaction by type
	System.out.println("*****Red Views    ***********");

	Boolean Red_Views = driver.findElement(By.id("redViewsGraph")).isDisplayed();
	String  Red_Views1 = driver.findElement(By.id("redViewsGraph")).getText();

	if(Red_Views == true) {
	System.out.println("Data loaded properly");
	System.out.println(Red_Views1);


	}
	else {

	System.out.println("Data not loaded properly");

	}
//		Estimated Minutes Watched vs Estimated Red Minutes Watched
	System.out.println("*****Estimated Minutes Watched vs Estimated Red Minutes Watched     ***********");

	Boolean Estimated_Minutes_Watched= driver.findElement(By.id("minutes_watched")).isDisplayed();
	String   Estimated_Minutes_Watched1 = driver.findElement(By.id("minutes_watched")).getText();

	if(Estimated_Minutes_Watched == true) {
	System.out.println("Data loaded properly");
	System.out.println(Estimated_Minutes_Watched1);


	}
	else {

	System.out.println("Data not loaded properly");

	}
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,650)");

	//Videos Added To Playlists vs Videos Removed From Playlists
	System.out.println("*****//Videos Added To Playlists vs Videos Removed From Playlists ***********");

	Boolean vd_added= driver.findElement(By.id("videosPlaylists")).isDisplayed();
	String   vd_added1 = driver.findElement(By.id("videosPlaylists")).getText();

	if(vd_added == true) {
	System.out.println("Data loaded properly");
	System.out.println(vd_added1);


	}
	else {

	System.out.println("Data not loaded properly");

	}
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,650)");

	// video views
	System.out.println("*****// video views***********");

	Boolean Video_view= driver.findElement(By.id("views")).isDisplayed();
	String   Video_view1 = driver.findElement(By.id("views")).getText();

	if(Video_view == true) {
	System.out.println("Data loaded properly");
	System.out.println(Video_view1);


	}
	else {

	System.out.println("Data not loaded properly");

	}

	//Card Click Rate vs Card Teaser Click Rate

	System.out.println("*****// Card Click Rate vs Card Teaser Click Rate***********");

	Boolean click_rate= driver.findElement(By.id("ClickRate")).isDisplayed();
	String   click_rate1 = driver.findElement(By.id("ClickRate")).getText();

	if(click_rate == true) {
	System.out.println("Data loaded properly");
	System.out.println(click_rate1);


	}
	else {

	System.out.println("Data not loaded properly");

	}
	//Card Impressions vs Card Teaser Impressions

	System.out.println("****Card Impressions vs Card Teaser Impressions ***********");

	Boolean cd_imp= driver.findElement(By.id("cardImpressions")).isDisplayed();
	String   cd_imp1 = driver.findElement(By.id("cardImpressions")).getText();

	if(cd_imp == true) {
	System.out.println("Data loaded properly");
	System.out.println(cd_imp1);


	}
	else {

	System.out.println("Data not loaded properly");

	}
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,650)");

	///Card Clicks vs Card Teaser Clicks
	System.out.println("*****Card Clicks vs Card Teaser Clicks   ***********");

	Boolean card_click= driver.findElement(By.id("cardClicks")).isDisplayed();
	String   card_click1 = driver.findElement(By.id("cardClicks")).getText();

	if(card_click == true) {
	System.out.println("Data loaded properly");
	System.out.println(card_click1);


	}
	else {

	System.out.println("Data not loaded properly");

	}

	//Interaction by type

	System.out.println("*****Interaction by type   ***********");

	Boolean inter= driver.findElement(By.id("interaction_type_number")).isDisplayed();
	String   inter1 = driver.findElement(By.id("interaction_type_number")).getText();

	if(inter == true) {
	System.out.println("Data loaded properly");
	System.out.println(inter1);


	}
	else {

	System.out.println("Data not loaded properly");

	}
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,250)");

	//Interactions by Percentage

	System.out.println("***** Interactions by Percentage  ***********");

	Boolean inter_per= driver.findElement(By.id("interaction_type_percentage")).isDisplayed();
	String   inter_per1 = driver.findElement(By.id("interaction_type_percentage")).getText();

	if(inter_per == true) {
	System.out.println("Data loaded properly");
	System.out.println(inter_per1);


	}
	else {

	System.out.println("Data not loaded properly");

	}
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,250)");

	//Engagement Rate (by Followers)
	System.out.println("***** Engagement Rate (by Followers) ***********");

	Boolean eng_rate= driver.findElement(By.id("engagementRate")).isDisplayed();
	String   eng_rate1 = driver.findElement(By.id("engagementRate")).getText();

	if(eng_rate == true) {
	System.out.println("Data loaded properly");
	System.out.println(eng_rate1);


	}
	else {

	System.out.println("Data not loaded properly");

	}
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,250)");
	//Video Views
	System.out.println("***** Video Views ***********");

	Boolean videoview= driver.findElement(By.id("views")).isDisplayed();
	String   videoview1 = driver.findElement(By.id("views")).getText();

	if(videoview == true) {
	System.out.println("Data loaded properly");
	System.out.println(videoview1);


	}
	else {

	System.out.println("Data not loaded properly");

	}
	Thread.sleep(4000);

	System.out.println("***** Video shares ***********");

	Boolean videovshares= driver.findElement(By.id("views")).isDisplayed();
	String   videoshares1 = driver.findElement(By.id("views")).getText();

	if(videovshares == true) {
	System.out.println("Data loaded properly");
	System.out.println(videoshares1);


	}
	else {

	System.out.println("Data not loaded properly");

	}
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,250)");

	System.out.println("*****Optimal Video Length   ***********");

	Boolean op_video= driver.findElement(By.xpath("//*[@id=\"influencerinsightsYoutube\"]/div[10]/div/div/div/div/div[2]")).isDisplayed();
	String   op_video1 = driver.findElement(By.xpath("//*[@id=\"influencerinsightsYoutube\"]/div[10]/div/div/div/div/div[2]")).getText();

	if(op_video == true) {
	System.out.println("Data loaded properly");
	System.out.println(op_video1);


	}
	else {

	System.out.println("Data not loaded properly");

	}
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,250)");																 System.out.println("*****Subscribers Gained & Lost    ***********");
	System.out.println("Subscribers Gained & Lost");
	Boolean sub_g= driver.findElement(By.id("sub_gained_lost")).isDisplayed();
	String sub_g1 = driver.findElement(By.id("sub_gained_lost")).getText();

	if(sub_g == true) {
	System.out.println("Data loaded properly");
	System.out.println(sub_g1);

	}
	else {

	System.out.println("Data not loaded properly");

	}
	Thread.sleep(4000);
	System.out.println("Subscribers");
	Boolean sub_count= driver.findElement(By.id("subscriberCount")).isDisplayed();
	String sub_count1 = driver.findElement(By.id("subscriberCount")).getText();

	if(sub_count == true) {
	System.out.println("Data loaded properly");
	System.out.println(sub_count1);

	}
	else {

	System.out.println("Data not loaded properly");

	}
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,250)");
	System.out.println("Most Engaging Posts");
	Boolean most_eng= driver.findElement(By.id("magic-list")).isDisplayed();
	String most_eng1 = driver.findElement(By.id("magic-list")).getText();

	if(most_eng == true) {
	System.out.println("Data loaded properly");
	System.out.println(most_eng1);

	}
	else {

	System.out.println("Data not loaded properly");

	}
	Thread.sleep(4000);
	((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");

	/////Audience tab
	//Gender Ratio
	Thread.sleep(4000);
	driver.findElement(By.id("link_for_35")).click();


	System.out.println("*****Gender Ratio ***********");

	Boolean gender_ratio= driver.findElement(By.id("youtubeGender")).isDisplayed();
	String   gender_ratio1 = driver.findElement(By.id("youtubeGender")).getText();

	if(gender_ratio == true) {
	System.out.println("Data loaded properly");
	System.out.println(gender_ratio1);


	}
	else {

	System.out.println("Data not loaded properly");

	}
	/////Age And Gender Split
	System.out.println("*****Age And Gender Split  ***********");

	Boolean Age_g= driver.findElement(By.id("youtubeChannelGender")).isDisplayed();
	String   Age_g1 = driver.findElement(By.id("youtubeChannelGender")).getText();

	if(Age_g == true) {
	System.out.println("Data loaded properly");
	System.out.println(Age_g1);


	}
	else {

	System.out.println("Data not loaded properly");

	}
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,650)");

	///Audience Interest

	System.out.println("*****Audience Interest***********");

	Boolean audience_intrest = driver.findElement(By.id("audienceInterest")).isDisplayed();
	String  audience_intrest1 = driver.findElement(By.id("audienceInterest")).getText();

	if(audience_intrest == true) {
	System.out.println("Data loaded properly");
	System.out.println(audience_intrest1);


	}
	else {

	System.out.println("Data not loaded properly");
	}
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,650)");
	//Top Location

	System.out.println("*****Top Location***********");
	Thread.sleep(4000);
	Boolean top_loc = driver.findElement(By.id("topLocationYT")).isDisplayed();
	String  top_loc1 = driver.findElement(By.id("topLocationYT")).getText();

	if(top_loc == true) {
	System.out.println("Data loaded properly");
	System.out.println(top_loc1);


	}
	else {

	System.out.println("Data not loaded properly");
	}

	Thread.sleep(4000);
	((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
	// post tab

	Thread.sleep(4000);
	driver.findElement(By.id("link_for_37")).click();
	//score card
	System.out.println("*****score card of yotube***********");

	Boolean basic_start = driver.findElement(By.xpath("//*[@id=\"postsYoutube\"]/div[1]/div")).isDisplayed();
	String  basic_start1 = driver.findElement(By.xpath("//*[@id=\"postsYoutube\"]/div[1]/div")).getText();

	if(basic_start == true) {
	System.out.println("Data loaded properly");
	System.out.println(basic_start1);


	}
	else {

	System.out.println("Data not loaded properly");
	}
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,350)");
	///No of post

	System.out.println("*****No of post***********");

	Boolean no_post = driver.findElement(By.id("total_post")).isDisplayed();
	String  no_post1 = driver.findElement(By.id("total_post")).getText();

	if(no_post == true) {
	System.out.println("Data loaded properly");
	System.out.println(no_post1);


	}
	else {

	System.out.println("Data not loaded properly");
	}

	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,550)");

	//All Post

	System.out.println("*****All Post***********");

	Boolean allpost = driver.findElement(By.xpath("//*[@id=\"allVideosYT\"]")).isDisplayed();
	String  allpost1 = driver.findElement(By.xpath("//*[@id=\"allVideosYT\"]")).getText();

	if(allpost == true) {
	System.out.println("Data loaded properly");
	System.out.println(allpost1);


	}
	else {

	System.out.println("Data not loaded properly");
	}
}}
//	driver.findElement(By.xpath("//*[@id=\"magic-list\"]/div/h5/div[2]/a/div")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id=\"typefilter\"]/div[2]/div/div[1]/div[2]/div[2]")).click();
//	Thread.sleep(2000);         
//	driver.findElement(By.xpath("//*[@id=\"allVideosYT\"]/div[2]/div/div[1]")).click();
//	Thread.sleep(4000);
//	//driver.findElement(By.xpath("//*[@id=\"modal-lg2\"]/div/button")).isEnabled();
//	//driver.findElement(By.xpath("//*[@id=\"modal-lg2\"]/div/button")).click();
//	// Top LIne Number
//	System.out.println("top line number");
//	boolean top_line = driver.findElement(By.id("yt_post_top_line_number")).isDisplayed();
//	String  top_line1 = driver.findElement(By.id("yt_post_top_line_number")).getText();
//
//	if(top_line == true) {
//	System.out.println("Data loaded properly");
//	System.out.println(top_line1);
//
//
//	}
//	else {
//
//	System.out.println("Data not loaded properly");
//	}
//	Thread.sleep(4000);
//	js.executeScript("window.scrollBy(0,550)");
//	//Retention rate
//	System.out.println("Retention rate");
//	boolean re_rate = driver.findElement(By.id("yt_post_videoRet")).isDisplayed();
//	String  re_rate1 = driver.findElement(By.id("yt_post_videoRet")).getText();
//
//	if(re_rate == true) {
//	System.out.println("Data loaded properly");
//	System.out.println(re_rate1);
//
//
//	}
//	else {
//
//	System.out.println("Data not loaded properly");
//	}
//
//	Thread.sleep(4000);
//	js.executeScript("window.scrollBy(0,550)");
//	//new card
//	System.out.println("Retention rate");
//	boolean new_card = driver.findElement(By.id("all-stats-cards-new")).isDisplayed();
//	String  new_card1 = driver.findElement(By.id("all-stats-cards-new")).getText();
//
//	if(new_card == true) {
//	System.out.println("Data loaded properly");
//	System.out.println(new_card1);
//
//
//	}
//	else {
//
//	System.out.println("Data not loaded properly");
//	}
//
//	}




//}









