package modules;

import java.util.ArrayList;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.base_app1;

public class Reports_influencer_tracking_and_Brand_safty extends base_app1 {

	@FindBy(xpath = "//div[@class='bg-circle-img brand-login-img main-add-img create_new on_page_add']")
	WebElement add;

	@FindBy(xpath = "//div[@type='analytics']")
	WebElement analytics_click;

	@FindBy(xpath = "//*[@id=\"analyticsCardsContainer\"]/div[1]/div[4]/div")
	WebElement select_account;

	@FindBy(id = "downloadReportButton")
	WebElement genrate_report_btn;

	@FindBy(xpath = "//div[@type='competition']")
	WebElement click_compitetors;

	@FindBy(xpath = "/html/body/div[5]/div[2]/div/div/div/div[2]/div[1]/div[2]/div[3]/div/h6")
	WebElement click_influencer_camping;

	public Reports_influencer_tracking_and_Brand_safty() {

		PageFactory.initElements(driver, this);

	}

	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebDriverWait wait = new WebDriverWait(driver, 1000);


	public void brand_safty() throws InterruptedException {

		driver.findElement(By.xpath("//a[@href='https://app.unboxsocial.com/createReport']")).click();
		Thread.sleep(4000);
         // brand safty

		driver.findElement(By.xpath("//span[contains(text(),'Brand Safety')]")).click();

	}
	public void Testcases_brand_safty_export() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//img[contains(@src,'https://app.unboxsocial.com/public/images/sidebar-icons/infltracking.svg')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@href='https://app.unboxsocial.com/influencerTracking/brandSafety']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//i[@class='fa fa fa-plus add_acc_plus']")).click();
		Thread.sleep(4000);
		Random random = new Random();
		String listname = "brandsafty+" + random.nextInt();
		driver.findElement(By.xpath("//input[@id='brandList_title']")).sendKeys(listname);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='brandList_keyword']")));
		driver.findElement(By.xpath("//input[@id='brandList_keyword']")).sendKeys("health,exercise,fitness,bodystamina,immunity,booster,yoga,pushups,healthy");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='save_brandlist_data']")));
		driver.findElement(By.xpath("//button[@id='save_brandlist_data']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@src='https://app.unboxsocial.com/public/images/sidebar-icons/reports.svg ']")).click();
		add.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[contains(text(),'Get a detailed report on the keywords you want to ')]")));
		driver.findElement(By.xpath("//h6[contains(text(),'Get a detailed report on the keywords you want to ')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class='pull-right page-search-everything searchBox brandSafety_List_search']//img[@class='list-search-icon search-anywhere-in-page']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='serach-post search_dataQuery search']")).sendKeys(listname);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='col-md-12 cards-content-wrapper']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//img[@class='brandSafety-select-all-button brandSafetySelectAllInfl']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//img[@tag_val='excel']")).click();
		driver.findElement(By.xpath("//img[@tag_val='PPT']")).click();
		driver.findElement(By.xpath("//img[@tag_val='PDF']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"stepFourBrand\"]/div[2]/div[4]/span")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='downloadReportButton']")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("View All Reports")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@href='https://app.unboxsocial.com/createReport']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'Brand Safety')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//i[@class='fa fa-eye view_right'])[1]")).click();
		Thread.sleep(4000);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(4000);
		String list_influencer = driver.findElement(By.id("influencer_list")).getText();
		System.out.print(list_influencer);
		Thread.sleep(4000);
		System.out.print("36 Content Pieces Found");
		String content_pieces = driver.findElement(By.id("content_pieces")).getText();
		System.out.print(content_pieces);
		driver.close();
		Thread.sleep(4000);
		driver.switchTo().window(tabs2.get(0));
		Thread.sleep(4000);
//		driver.findElement(By.xpath("(//img[@title='Excel'])[1]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("(//img[@title='Power Point'])[1]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("(//img[@title='PDF'])[1]")).click();
		Thread.sleep(4000);
       driver.findElement(By.xpath("//img[@src='https://app.unboxsocial.com/public/images/sidebar-icons/infltracking.svg ']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[normalize-space()='Brand Safety Report']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='serach-post']")).sendKeys(listname);
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//img[@class='edit-icon delete_brandSafety_list'])[1]")).click();
		Thread.sleep(4000);
	    driver.findElement(By.xpath("//button[@id='delete-btn']")).click();
	    Thread.sleep(5000);





	}

	public void Testcases_Influencer_tracking_camping() throws InterruptedException {
	Thread.sleep(4000);
	driver.findElement(By.xpath("//img[contains(@src,'https://app.unboxsocial.com/public/images/sidebar-icons/reports.svg')]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//i[@class='fa fa-plus add_acc_plus']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[@type='infltracking-campaign']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//img[@class='inflTrack-select-all-button inflTrackSelectAllInfl']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@id='influencerCampaignHashtag']")).click();
	driver.findElement(By.xpath("//input[@id='influencerCampaignHashtag']")).sendKeys("teamindia");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//img[@class='campaign-date-picker campaign_date_picker_event']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/div[9]/div[3]/ul/li[3]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//img[@tag_val='excel']")).click();
driver.findElement(By.xpath("//img[@tag_val='PPT']")).click();
driver.findElement(By.xpath("//img[@tag_val='PDF']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//button[@id='downloadReportButton']")).click();
driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div/a[1]")).click();
Thread.sleep(500000);
 driver.navigate().refresh();
wait.until(
        ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[7]/a[2]")));

boolean report_gen=	driver.findElement(By.className("maa_ki_aankh")).isDisplayed();
boolean reprt_ex=driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[7]/a[2]")).isDisplayed();
if(report_gen&&reprt_ex==true) {

System.out.println("report_genrated");

}else {

System.out.println("processing!!!!!!!");
}
driver.findElement(By.className("maa_ki_aankh")).click();
Thread.sleep(4000);
ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
driver.switchTo().window(tabs2.get(1));
System.out.println("camping names");
boolean report_gen1=	driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[1]/div[1]/div[5]/div")).isDisplayed();

String overview=driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[1]/div[1]/div[5]/div")).getText();

if(report_gen1==true) {

System.out.println(overview);

}else {

System.out.println("processing!!!!!!!");
}
System.out.println("List of Influencers activated on the Pyramid");
boolean list_pym=	driver.findElement(By.id("pyramidCategoriesStats")).isDisplayed();

String list_pym1=driver.findElement(By.id("pyramidCategoriesStats")).getText();

if(list_pym==true) {

System.out.println(list_pym1);

}else {

System.out.println("processing!!!!!!!");
}
System.out.println("List of Influencers");
boolean influ_list=	driver.findElement(By.id("instagramInfluencerList_container")).isDisplayed();

String influ_list1=driver.findElement(By.id("instagramInfluencerList_container")).getText();

if(influ_list==true) {

System.out.println(influ_list1);

}else {

System.out.println("processing!!!!!!!");
}

System.out.println("Campaign Top-lines");
boolean camp_topline=	driver.findElement(By.id("top_lines_container")).isDisplayed();

String camp_topline1=driver.findElement(By.id("top_lines_container")).getText();

if(camp_topline==true) {

System.out.println(camp_topline1);

}else {

System.out.println("processing!!!!!!!");
}

System.out.println("Top-lines by Platform");
boolean topline_by_performance=driver.findElement(By.id("ig_yt_top_lines_platformsContainer")).isDisplayed();

String topline_by_performance1=driver.findElement(By.id("ig_yt_top_lines_platformsContainer")).getText();

if(topline_by_performance==true) {

System.out.println(topline_by_performance1);

}else {

System.out.println("processing!!!!!!!");
}

Thread.sleep(4000);
((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
Thread.sleep(4000);
driver.findElement(By.xpath("//a[normalize-space()='Content & Influencer performance']")).click();
Thread.sleep(4000);
System.out.println("Mode of Interaction");
boolean mode_of_intraction=driver.findElement(By.id("instagramModeOfInteractionContainer")).isDisplayed();

String mode_of_intraction1=driver.findElement(By.id("instagramModeOfInteractionContainer")).getText();

if(mode_of_intraction==true) {

System.out.println(mode_of_intraction1);

}else {

System.out.println("processing!!!!!!!");
}
System.out.println("Content Formats Created");
boolean contentFormatPlatformDivs=driver.findElement(By.id("contentFormatPlatformDivs")).isDisplayed();

String contentFormatPlatformDivs1=driver.findElement(By.id("contentFormatPlatformDivs")).getText();

if(contentFormatPlatformDivs==true) {

System.out.println(contentFormatPlatformDivs1);

}else {

System.out.println("processing!!!!!!!");
}
System.out.println("Performance by Content Format (ER & Interaction)");
boolean instagramperformByFormatErContainer=driver.findElement(By.id("instagramperformByFormatErContainer")).isDisplayed();

String instagramperformByFormatErContainer1=driver.findElement(By.id("instagramperformByFormatErContainer")).getText();

if(instagramperformByFormatErContainer==true) {

System.out.println(instagramperformByFormatErContainer1);

}else {

System.out.println("processing!!!!!!!");
}

driver.findElement(By.xpath("/html/body/div[3]/div[1]/div")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/a")).click();
Thread.sleep(4000);
driver.close();
Thread.sleep(5000);
driver.switchTo().window(tabs2.get(0));
	}

}