package modules;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.Base_app;

public class Competitor extends Base_app {

	@FindBy(xpath="//a[@href='https://app.unboxsocial.com/competition']")
	WebElement click_competitor;

	@FindBy(xpath="//img[@class='list-search-icon search-anywhere-in-page']")
	WebElement search_img;

	@FindBy(xpath="//input[@name='serach-post']")
	WebElement search_input;


	@FindBy(xpath="//i[@class='fa fa fa-plus add_acc_plus']")
	WebElement Add_list_competitor;


	@FindBy(id="COMPETITOR_NAME")
	WebElement name_competitor_bucket;


	@FindBy(xpath="//*[@id=\"Competitor_1\"]/div/div/input")
	WebElement Brand_Link1;

	@FindBy(xpath="//*[@id=\"Competitor_2\"]/div/div/input")
	WebElement Brand_Link2;

	@FindBy(xpath="//*[@id=\"Competitor_3\"]/div/div/input")
	WebElement Brand_Link3;

	@FindBy(xpath="//*[@id=\"Competitor_4\"]/div/div/input")
	WebElement Brand_Link4;

	@FindBy(xpath="//*[@id=\"Competitor_5\"]/div/div/input")
	WebElement Brand_Link5;

	@FindBy(xpath="//*[@id=\"Competitor_6\"]/div/div/input")
	WebElement Brand_Link6;

	@FindBy(xpath="//*[@id=\"Competitor_7\"]/div/div/input")
	WebElement Brand_Link7;

	@FindBy(xpath="//*[@id=\"Competitor_8\"]/div/div/input")
	WebElement Brand_Link8;
	@FindBy(xpath="//*[@id=\"Competitor_9\"]/div/div/input")
	WebElement Brand_Link9;

	@FindBy(xpath="//*[@id=\"Competitor_10\"]/div/div/input")
	WebElement Brand_Link10;





	@FindBy(xpath="//*[@id=\"addTracker_data\"]/div/h5/span/button")
	WebElement add_btn;


	@FindBy(xpath="//div[@class='bg-circle-img brand-login-img main-add-img for_filter on_page_add']")
		WebElement fillter;
	///////////////// content////////////


	@FindBy(id="link_for_117")
	WebElement content_tab;

	@FindBy(id="link_for_119")
	WebElement Post_tab;


	public Competitor() {

		PageFactory.initElements(driver, this);


	}
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebDriverWait wait = new WebDriverWait(driver, 800);
	public void Testcase_add_list_compitetor_instagram(String I1,String I2,String I3,String I4,String I5,String I6,String I7,String I8, String I9, String I10) throws InterruptedException {
		Thread.sleep(4000);
		click_competitor.click();
         Thread.sleep(2000);
		Add_list_competitor.click();
		Random random = new Random();
		String car_test = "instagram+"+random.nextInt()+"_sagar";
		name_competitor_bucket.sendKeys(car_test);
		WebDriverWait wait = new WebDriverWait(driver, 200);
		Brand_Link1.sendKeys(I1);
		Brand_Link2.click();
		WebElement y1 = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_1\"]/div[3]/img[1]")));

		Brand_Link2.sendKeys(I2);
		Brand_Link3.click();
		WebElement y2 = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_2\"]/div[3]/img[1]")));

		Brand_Link3.sendKeys(I3);
		Brand_Link4.click();
		WebElement y3 = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_3\"]/div[3]/img[1]")));

		Brand_Link4.sendKeys(I4);
		Brand_Link5.click();
		WebElement y4 = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_4\"]/div[3]/img[1]")));

		Brand_Link5.sendKeys(I5);
		Brand_Link6.click();
		WebElement y5 = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_5\"]/div[3]/img[1]")));

		Brand_Link6.sendKeys(I6);
		Brand_Link7.click();
		WebElement y6 = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_6\"]/div[3]/img[1]")));

		Brand_Link7.sendKeys(I7);
		Brand_Link8.click();
		WebElement y7 = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_7\"]/div[3]/img[1]")));

		Brand_Link8.sendKeys(I8);
		Brand_Link9.click();
		WebElement y8 = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_8\"]/div[3]/img[1]")));

		Brand_Link9.sendKeys(I9);
		Brand_Link10.click();
		WebElement y9 = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_9\"]/div[3]/img[1]")));
		Brand_Link10.sendKeys(I10);
		name_competitor_bucket.click();
		WebElement y10 = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_10\"]/div[3]/img[1]")));
		add_btn.isEnabled();
		add_btn.click();
//		boolean row=driver.findElement(By.xpath("//*[@id=\"Competitor_10\"]/div[3]/img[1]")).isDisplayed();


		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"overlay_success_popup\"]/div/button")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div/div[2]/div[1]/a/div/p")).click();
		driver.navigate().refresh();
	





	}


	public void Testcase_add_list_compitetor_Facebook(String F1,String F2,String F3,String F4,String F5,String F6,String F7,String F8,String F9,String F10) throws InterruptedException {
		Thread.sleep(4000);
		click_competitor.click();
		Thread.sleep(2000);
		Add_list_competitor.click();
		Random random = new Random();
		String car_test = "facebook+"+random.nextInt()+"_sagar";
		name_competitor_bucket.sendKeys(car_test);
		WebDriverWait wait = new WebDriverWait(driver, 200);
		Brand_Link1.sendKeys(F1);
		Brand_Link2.click();

		WebElement y1 = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_1\"]/div[3]/img[1]")));

		Brand_Link2.sendKeys(F2);
		Brand_Link3.click();
		WebElement y2 = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_2\"]/div[3]/img[1]")));

		Brand_Link3.sendKeys(F3);
		Brand_Link4.click();
		WebElement y3 = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_3\"]/div[3]/img[1]")));

		Brand_Link4.sendKeys(F4);
		Brand_Link5.click();
		WebElement y4 = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_4\"]/div[3]/img[1]")));

		Brand_Link5.sendKeys(F5);
		Brand_Link6.click();
		WebElement y5 = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_5\"]/div[3]/img[1]")));

		Brand_Link6.sendKeys(F6);
		Brand_Link7.click();
		WebElement y6 = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_6\"]/div[3]/img[1]")));

		Brand_Link7.sendKeys(F7);
		Brand_Link8.click();
		WebElement y7 = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_7\"]/div[3]/img[1]")));

		Brand_Link8.sendKeys(F8);
		Brand_Link9.click();
		WebElement y8 = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_8\"]/div[3]/img[1]")));

		Brand_Link9.sendKeys(F9);
		Brand_Link10.click();
		WebElement y9 = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_9\"]/div[3]/img[1]")));
		Brand_Link10.sendKeys(F10);
		name_competitor_bucket.click();
		WebElement y10 = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_10\"]/div[3]/img[1]")));

		add_btn.isEnabled();

		add_btn.click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"overlay_success_popup\"]/div/button")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div/div[2]/div[1]/a/div")).click();








	}





	public void Tescase_add_list_compitetor_Youtube(String Y1,String Y2,String Y3,String Y4,String Y5,String Y6,String Y7,String Y8,String Y9,String Y10) throws InterruptedException {
		Thread.sleep(4000);
		click_competitor.click();
		Thread.sleep(2000);
		Add_list_competitor.click();
		Random random = new Random();
		String car_test = "Youtube +"+random.nextInt()+"_sagar";
		name_competitor_bucket.sendKeys(car_test);
		WebDriverWait wait = new WebDriverWait(driver, 200);
		Brand_Link1.sendKeys(Y1);
		Brand_Link2.click();

		WebElement y1 = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_1\"]/div[3]/img[1]")));

		Brand_Link2.sendKeys(Y2);
		Brand_Link3.click();
		WebElement y2 = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_2\"]/div[3]/img[1]")));

		Brand_Link3.sendKeys(Y3);
		Brand_Link4.click();
		WebElement y3 = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_3\"]/div[3]/img[1]")));

		Brand_Link4.sendKeys(Y4);
		Brand_Link5.click();
		WebElement y4 = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_4\"]/div[3]/img[1]")));

		Brand_Link5.sendKeys(Y5);
		Brand_Link6.click();
		WebElement y5 = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_5\"]/div[3]/img[1]")));

		Brand_Link6.sendKeys(Y6);
		Brand_Link7.click();
		WebElement y6 = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_6\"]/div[3]/img[1]")));

		Brand_Link7.sendKeys(Y7);
		Brand_Link8.click();
		WebElement y7 = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_7\"]/div[3]/img[1]")));

		Brand_Link8.sendKeys(Y8);
		Brand_Link9.click();
		WebElement y8 = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_8\"]/div[3]/img[1]")));

		Brand_Link9.sendKeys(Y9);
		Brand_Link10.click();
		WebElement y9 = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_9\"]/div[3]/img[1]")));
		Brand_Link10.sendKeys(Y10);
		name_competitor_bucket.click();
		WebElement y10 = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_10\"]/div[3]/img[1]")));
		add_btn.isEnabled();
		add_btn.click();

		driver.findElement(By.xpath("//*[@id=\"overlay_success_popup\"]/div/button")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div/div[2]/div[1]/a/div")).click();



//		String obj=driver.findElement(By.xpath("//*[@id=\"overview_data\"]")).getText();
//		String name=driver.findElement(By.xpath("//*[@id=\"overview_brand_logo_details\"]")).getText();
//		String Details=driver.findElement(By.id("overview_brand_output_details")).getText();
//		String tips=driver.findElement(By.id("tips_overview")).getText();
//
//		System.out.println("List of object"+ obj);
//		Thread.sleep(2000);
//		System.out.println("Name  of Youtuber"+name);
//		System.out.println("List of brand details"+Details);
//		System.out.println("List of brand tips"+tips);



	}


	public void Tescase_add_list_compitetor_Twitter(String T1,String T2,String T3,String T4,String T5,String T6,String T7,String T8,String T9,String T10) throws InterruptedException {
			Thread.sleep(5000);
			click_competitor.click();
			Thread.sleep(2000);
			Add_list_competitor.click();
			Random random = new Random();
			String car_test = "Twitter +"+random.nextInt()+"_sagar";
			name_competitor_bucket.sendKeys(car_test);
			WebDriverWait wait = new WebDriverWait(driver, 200);
			Brand_Link1.sendKeys(T1);
			Brand_Link2.click();

			WebElement y1 = wait.until(
			        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_1\"]/div[3]/img[1]")));

			Brand_Link2.sendKeys(T2);
			Brand_Link3.click();
			WebElement y2 = wait.until(
			        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_2\"]/div[3]/img[1]")));

			Brand_Link3.sendKeys(T3);
			Brand_Link4.click();
			WebElement y3 = wait.until(
			        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_3\"]/div[3]/img[1]")));

			Brand_Link4.sendKeys(T4);
			Brand_Link5.click();
			WebElement y4 = wait.until(
			        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_4\"]/div[3]/img[1]")));

			Brand_Link5.sendKeys(T5);
			Brand_Link6.click();
			WebElement y5 = wait.until(
			        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_5\"]/div[3]/img[1]")));

			Brand_Link6.sendKeys(T6);
			Brand_Link7.click();
			WebElement y6 = wait.until(
			        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_6\"]/div[3]/img[1]")));

			Brand_Link7.sendKeys(T7);
			Brand_Link8.click();
			WebElement y7 = wait.until(
			        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_7\"]/div[3]/img[1]")));

			Brand_Link8.sendKeys(T8);
			Brand_Link9.click();
			WebElement y8 = wait.until(
			        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_8\"]/div[3]/img[1]")));

			Brand_Link9.sendKeys(T9);
			Brand_Link10.click();
			WebElement y9 = wait.until(
			        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_9\"]/div[3]/img[1]")));
			Brand_Link10.sendKeys(T10);
			name_competitor_bucket.click();
			WebElement y10 = wait.until(
			        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"Competitor_10\"]/div[3]/img[1]")));
			add_btn.isEnabled();
			add_btn.click();

			driver.findElement(By.xpath("//*[@id=\"overlay_success_popup\"]/div/button")).click();
			Thread.sleep(2000);
			driver.navigate().refresh();



//			String obj=driver.findElement(By.xpath("//*[@id=\"overview_data\"]")).getText();
//			String name=driver.findElement(By.xpath("//*[@id=\"overview_brand_logo_details\"]")).getText();
//			String Details=driver.findElement(By.id("overview_brand_output_details")).getText();
////			String tips=driver.findElement(By.id("tips_overview")).getText();
//
//			System.out.println("List of object"+ obj);
//			Thread.sleep(2000);
//			System.out.println("Name  of Twitter"+name);
//			System.out.println("List of brand details"+Details);
////			System.out.println("List of brand tips"+tips);



		}


		public void instagram_content_tab_data(String Instagram_data) throws InterruptedException {
System.out.println("no of post for all");
Thread.sleep(4000);
			click_competitor.click();
			Thread.sleep(2000);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-md-12 competition_track_list_data']")));
			  search_img.click();
			    Thread.sleep(4000);
			   search_input.sendKeys(Instagram_data);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[normalize-space()='Demo-2 Testing Accounts']")));
		driver.findElement(By.xpath("//h4[normalize-space()='Demo-2 Testing Accounts']")).click();
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("globalrange_competition")));
		driver.findElement(By.id("globalrange_competition")).click();
		Thread.sleep(2000);
		//6 months
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/ul/li[3]")).click();

		Boolean b1 = driver.findElement(By.id("overview_data")).isDisplayed();
		String data1 = driver.findElement(By.id("overview_data")).getText();
				if(b1== true) {

					System.out.println("data loaded proper");
					System.out.println(data1);

				}else {


					System.out.println("data not loaded proper");
				}


				Boolean b2 = driver.findElement(By.id("share_of_voice")).isDisplayed();
				String data2 = driver.findElement(By.id("share_of_voice")).getText();
						if(b2== true) {

							System.out.println("data loaded proper");
							System.out.println(data2);

						}else {


							System.out.println("data not loaded proper");
						}


		driver.findElement(By.id("link_for_117")).click();
		Thread.sleep(2000);
		String data= driver.findElement(By.id("total_post")).getText();
//		System.out.println(data);

		if(data.isEmpty()) {

			System.out.println("Data not load proper");

		}else {

			System.out.println(data);

		}

		js.executeScript("window.scrollBy(0,650)");

	Thread.sleep(2000);
	System.out.println("How the audience intracted");
	boolean data21= driver.findElement(By.className("highcharts-container")).isDisplayed();
	String t= driver.findElement(By.className("highcharts-container")).getText();

 if(data21==true) {

	 System.out.println("Data loded sucsessfully");

 }else{

	 System.out.println("Data not loded");
 }

 Thread.sleep(2000);
 js.executeScript("window.scrollBy(0,650)");
 System.out.println("TOTAL intraction");

 boolean data3=driver.findElement(By.id("total_interactions")).isDisplayed();
 String data3_1=driver.findElement(By.id("total_interactions")).getText();

 if(data3==true){

	 System.out.println("Data loded sucsessfully");
	 System.out.println(data3_1);

 }
else{

	 System.out.println("Data not loded");
 }

  System.out.println("Engegment Rate");
  boolean data4=driver.findElement(By.id("engagementRate")).isDisplayed();
  String data4_1=driver.findElement(By.id("total_interactions")).getText();


  if(data4==true)
  {

	  System.out.println("Data loded sucsessfully");
		 System.out.println(data4_1);

	 }
	else{

		 System.out.println("Data not loded");
	 }


  Thread.sleep(2000);
  js.executeScript("window.scrollBy(0,750)");
  System.out.println("Average Engagement Per Content Form");
  boolean data5=driver.findElement(By.id("catER")).isDisplayed();
  String data5_1=driver.findElement(By.id("catER")).getText();


  if(data5==true)
  {

	  System.out.println("Data loded sucsessfully");
		 System.out.println(data5_1);

	 }
	else{

		 System.out.println("Data not loded");
	 }

  Thread.sleep(2000);
  js.executeScript("window.scrollBy(0,750)");
  System.out.println("Content themes Brands have been talking about");
  boolean data6=driver.findElement(By.id("comp_brand_talking_abouts")).isDisplayed();
  String data6_1=driver.findElement(By.id("comp_brand_talking_abouts")).getText();


  if(data6==true)
  {

	  System.out.println("Data loded sucsessfully");
		 System.out.println(data6_1);

	 }
	else{

		 System.out.println("Data not loded");
	 }

  Thread.sleep(2000);
  js.executeScript("window.scrollBy(0,750)");
  System.out.println("Recommended Post to Promote");
  boolean data7=driver.findElement(By.id("top_posts_data")).isDisplayed();
  String data7_1=driver.findElement(By.id("top_posts_data")).getText();


  if(data7==true)
  {

	  System.out.println("Data loded sucsessfully");
		 System.out.println(data7_1);


	 }
	else{

		 System.out.println("Data not loded");
	 }

			Thread.sleep(3000);
			((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
			driver.findElement( By.id("link_for_119")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"post\"]/div/div/div/div/div/h5/div[2]/a/div")).click();
		driver.findElement(By.id("likes_sort")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"post\"]/div/div/div/div/div/h5/div[2]/a/div")).click();
		driver.findElement(By.id("eng_sort")).click();
		Thread.sleep(2000);

		}


		public void Facebook_content_tab_data(String Facebook_data) throws InterruptedException {
			Thread.sleep(4000);
			click_competitor.click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-md-12 competition_track_list_data']")));
			  search_img.click();
			    Thread.sleep(4000);
			   search_input.sendKeys(Facebook_data);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[normalize-space()=\"ELECTRONICS_PRODUCTS1\"]")));
		driver.findElement(By.xpath("//h4[normalize-space()=\"ELECTRONICS_PRODUCTS1\"]")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("globalrange_competition")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[6]/div[3]/ul/li[4]")).click();

			////summery
		boolean data=	driver.findElement(By.id("overview_data")).isDisplayed();
			String data_1=driver.findElement(By.id("overview_data")).getText();
		if(data==true) {

			System.out.println("data load properly");
			System.out.println(data_1);


		}
		else {

			System.out.println("data not load properly");
		}
		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,750)");
		/////////share of voice
		boolean data2=	driver.findElement(By.className("highcharts-root")).isDisplayed();
		String data_2=driver.findElement(By.className("highcharts-root")).getText();
	if(data2==true) {

		System.out.println("data load properly");
		System.out.println(data_2);


	}
	else {


		System.out.println("data not load properly");
	}
		//// benchmarking

	System.out.println("benchamrking");

	driver.findElement(By.id("link_for_112")).click();
			// no of post
boolean data1=driver.findElement(By.className("highcharts-root")).isDisplayed();
String data_11= driver.findElement(By.className("highcharts-root")).getText();

			if(data1==true) {


				System.out.println("data load properly");
				System.out.println(data_11);
			}
			else {

				System.out.println("data not load properly");
			}

			////How has the audience interacted?
			System.out.println("How has the audience interacted?");
			js.executeScript("window.scrollBy(0,750)");

			boolean data11=driver.findElement(By.className("highcharts-plot-border")).isDisplayed();
			String data_111= driver.findElement(By.className("highcharts-plot-border")).getText();

						if(data11==true) {


							System.out.println("data load properly");
							System.out.println(data_111);
						}
						else {

							System.out.println("data not load properly");
						}

						System.out.println("Total Interactions By Content Format ");
						Thread.sleep(3000);
						js.executeScript("window.scrollBy(0,750)");

						boolean data111=driver.findElement(By.className("highcharts-container")).isDisplayed();
						String data_1111= driver.findElement(By.className("highcharts-container")).getText();

									if(data111==true) {


										System.out.println("data load properly");
										System.out.println(data_1111);
									}
									else {

										System.out.println("data not load properly");
									}



									System.out.println("Total Interactions By Content Format ");
									Thread.sleep(3000);
									js.executeScript("window.scrollBy(0,750)");

									boolean data1111=driver.findElement(By.className("highcharts-container")).isDisplayed();
									String data_11111= driver.findElement(By.className("highcharts-container")).getText();

												if(data1111==true) {


													System.out.println("data load properly");
													System.out.println(data_11111);
												}
												else {

													System.out.println("data not load properly");
												}
									/////Most Engaging Posts
												System.out.println("Most Engaging Posts");
												Thread.sleep(3000);
												js.executeScript("window.scrollBy(0,750)");

												boolean data11111=driver.findElement(By.id("top_posts_brand_output_details")).isDisplayed();
												String data_111111= driver.findElement(By.id("top_posts_brand_output_details")).getText();

															if(data11111==true) {


																System.out.println("data load properly");
																System.out.println(data_111111);
															}
															else {

																System.out.println("data not load properly");
															}
/////Content & Audience///
		Thread.sleep(200);
		((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
	driver.findElement(By.id("link_for_113")).click();
///Best score

		boolean score_list=driver.findElement(By.id("brand_score_list")).isDisplayed();
		String score_list1=driver.findElement(By.id("brand_score_list")).getText();

		if (score_list==true) {

			System.out.println("data loaded succsesfully");
			System.out.println(score_list1);

		}else {


			System.out.println("data not loaded succsesfully");
		}


		///Audience sentiment by brand //
		System.out.println("Audience sentiment by brand");
		js.executeScript("window.scrollBy(0,750)");

	boolean sentimental_list=driver.findElement(By.id("sentiment_interaction_list")).isDisplayed();
		String sentimental_list1=driver.findElement(By.id("sentiment_interaction_list")).getText();

		if(sentimental_list==true) {

			System.out.println("data  loaded succsesfully");
			System.out.println(sentimental_list1);

		}else {

			System.out.println("data not  loaded succsesfully");
		}

		//Content themes Brands have been talking about
		System.out.println("Content themes Brands have been talking about");
		js.executeScript("window.scrollBy(0,750)");

		boolean com_band_list=driver.findElement(By.id("comp_brand_talking_abouts_list")).isDisplayed();
			String com_band_list_1=driver.findElement(By.id("comp_brand_talking_abouts_list")).getText();

			if(com_band_list==true) {

				System.out.println("data  loaded succsesfully");
				System.out.println(com_band_list_1);

			}else {

				System.out.println("data not  loaded succsesfully");

				}
			Thread.sleep(2000);
		// Sentiment by Emoji//
			System.out.println("Sentiment by Emoji");
			js.executeScript("window.scrollBy(0,1000)");

			boolean emoj_list=driver.findElement(By.id("emoji_tracker_list")).isDisplayed();
				String emoj_list_1=driver.findElement(By.id("emoji_tracker_list")).getText();

				if(emoj_list==true) {

					System.out.println("data  loaded succsesfully");
					System.out.println(emoj_list_1);

				}else {

					System.out.println("data not  loaded succsesfully");

					}

				((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
				Thread.sleep(20000);
				driver.findElement(By.id("link_for_114")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"post\"]/div[1]/div/div[2]/div/div/div/h5/div[2]/a/div/i")).click();
				driver.findElement(By.id("compFBPhotoFilter")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"post\"]/div[1]/div/div[2]/div/div/div/h5/div[2]/a/div/i")).click();
				driver.findElement(By.id("reactions_sort")).click();
		
				}

		public void Twitter_content_tab_data(String Twitter_data) throws InterruptedException {
			System.out.println("no of post for all");
			Thread.sleep(4000);
			click_competitor.click();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-md-12 competition_track_list_data']")));
			  search_img.click();
			    Thread.sleep(4000);
			   search_input.sendKeys(Twitter_data);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[normalize-space()='TW More Than 5']")));
		driver.findElement(By.xpath("//h4[normalize-space()='TW More Than 5']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("globalrange_competition")).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div[3]/ul/li[2]")));

		///// Competition Tracker///

		boolean data= driver.findElement(By.id("overview_brand_output_details")).isDisplayed();
		String data1=driver.findElement(By.id("overview_brand_output_details")).getText();

			if(data==true){

				System.out.println("data load properly!!!");
				System.out.println(data1);

			}else {

				System.out.println("data not load properly!!!");
			}

	///Share of Voice
			Thread.sleep(2000);
			  js.executeScript("window.scrollBy(0,750)");
			System.out.println("Share of Voice !");

			boolean share_voice= driver.findElement(By.className("highcharts-root")).isDisplayed();
			String share_voice1=driver.findElement(By.className("highcharts-root")).getText();

				if(share_voice==true){

					System.out.println("data load properly!!!");
					System.out.println(share_voice1);

				}else {

					System.out.println("data not load properly!!!");
				}

((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
driver.findElement(By.id("link_for_147")).click();
//no of post
Thread.sleep(2000);
System.out.println("no of post");

boolean no_of_post= driver.findElement(By.className("highcharts-container")).isDisplayed();
String no_of_post1=driver.findElement(By.className("highcharts-container")).getText();

	if(no_of_post==true){

		System.out.println("data load properly!!!");
		System.out.println(no_of_post1);

	}else {

		System.out.println("data not load properly!!!");
	}
			Thread.sleep(2000);
js.executeScript("window.scrollBy(0,750)");
	//How has the audience interacted?
	System.out.println("How has the audience interacted? ");


boolean audence= driver.findElement(By.className("highcharts-root")).isDisplayed();
String audence1=driver.findElement(By.className("highcharts-root")).getText();

	if(audence==true){

		System.out.println("data load properly!!!");
		System.out.println(audence1);

	}else {

		System.out.println("data not load properly!!!");
	}


	js.executeScript("window.scrollBy(0,650)");
	//How has the audience interacted?
	 Thread.sleep(4000);
	System.out.println("How has the total audience interacted? ");


boolean total_audence= driver.findElement(By.className("highcharts-root")).isDisplayed();
String total_audence_1=driver.findElement(By.className("highcharts-root")).getText();

	if(total_audence==true){

		System.out.println("data load properly!!!");
		System.out.println(total_audence_1);

	}else {

		System.out.println("data not load properly!!!");
	}

	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,650)");
	///total intraction  by type///
	System.out.println("total intraction  by type");

	boolean total_it_by_type= driver.findElement(By.id("total_reactions")).isDisplayed();
	String total_it_by_type_1=driver.findElement(By.id("total_reactions")).getText();

		if(total_it_by_type == true){

			System.out.println("data load properly!!!");
			System.out.println(total_it_by_type_1);

		}else {

			System.out.println("data not load properly!!!");
		}

	/// tweet and re tweet ratio

		System.out.println("tweet and re tweet ratio");
		js.executeScript("window.scrollBy(0,650)");
		 Thread.sleep(4000);
		boolean tweet_retweet= driver.findElement(By.id("tweets_retweets")).isDisplayed();
		String tweet_retweet_1=driver.findElement(By.id("tweets_retweets")).getText();

			if(tweet_retweet == true){

				System.out.println("data load properly!!!");
				System.out.println(tweet_retweet_1);

			}else {

				System.out.println("data not load properly!!!");
			}


		//related to #tag
			js.executeScript("window.scrollBy(0,650)");
			 Thread.sleep(4000);
			System.out.println("related to #tag");


			boolean hash_tag= driver.findElement(By.id("relatedHashtags")).isDisplayed();
			String hash_tag1=driver.findElement(By.id("relatedHashtags")).getText();

				if(hash_tag == true){

					System.out.println("data load properly!!!");
					System.out.println(hash_tag1);

				}else {

					System.out.println("data not load properly!!!");
				}


				///realted @mention

				js.executeScript("window.scrollBy(0,650)");
				 Thread.sleep(4000);
				System.out.println("related to @mention");


				boolean mention= driver.findElement(By.id("relatedMentions")).isDisplayed();
				String mention_1=driver.findElement(By.id("relatedMentions")).getText();

					if(mention == true){

						System.out.println("data load properly!!!");
						System.out.println(mention_1);

					}else {

						System.out.println("data not load properly!!!");
					}
					Thread.sleep(2000);

					js.executeScript("window.scrollBy(0,650)");
				///most intractive post visible//
					 Thread.sleep(4000);
					System.out.println("most intractive post visible");
					boolean top_post= driver.findElement(By.id("top_interactive_posts")).isDisplayed();
					String top_post_1=driver.findElement(By.id("top_interactive_posts")).getText();

						if(top_post == true){

							System.out.println("data load properly!!!");
							System.out.println(top_post_1);

						}else {

							System.out.println("data not load properly!!!");
						}
				Thread.sleep(2000);
				((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");

				Thread.sleep(2000);


driver.findElement(By.id("link_for_148")).click();
Thread.sleep(4000);


/////////brand score list

System.out.println("brand score list");
Thread.sleep(4000);
boolean best_score= driver.findElement(By.id("brandScore")).isDisplayed();
String best_score_1=driver.findElement(By.id("brandScore")).getText();

	if(best_score == true){

		System.out.println("data load properly!!!");
		System.out.println(best_score_1);

	}else {

		System.out.println("data not load properly!!!");
	}

	Thread.sleep(2000);
	///Influencers Retweeting
	js.executeScript("window.scrollBy(0,650)");
	 Thread.sleep(4000);
	System.out.println("Influencers Retweeting");


	boolean influ_retweeting = driver.findElement(By.xpath("//*[@id=\"audience\"]/div[2]/div/div/div/div/div")).isDisplayed();
	String influ_retweeting_1=driver.findElement(By.xpath("//*[@id=\"audience\"]/div[2]/div/div/div/div/div")).getText();

		if(influ_retweeting == true){

			System.out.println("data load properly!!!");
			System.out.println(influ_retweeting_1);

		}else {

			System.out.println("data not load properly!!!");
		}
	///Content themes Brands have been talking about
		js.executeScript("window.scrollBy(0,650)");
		 Thread.sleep(4000);
		System.out.println("Content themes Brands have been talking about");


		boolean contect= driver.findElement(By.id("comp_brand_talking_abouts_list")).isDisplayed();
		String contect_1 =driver.findElement(By.id("comp_brand_talking_abouts_list")).getText();

			if(contect == true){

				System.out.println("data load properly!!!");
				System.out.println(contect_1);

			}else {

				System.out.println("data not load properly!!!");
			}

			// gender split
			js.executeScript("window.scrollBy(0,650)");

			System.out.println("Content themes Brands have been talking about");


			boolean gender= driver.findElement(By.id("genderDemographics")).isDisplayed();
//			String gender_1=driver.findElement(By.id("genderDemographics")).getText();

				if(gender == true){

					System.out.println("data load properly!!!");
//					System.out.println(gender_1);
//
				}else {

					System.out.println("data not load properly!!!");
				}


			///language

				Thread.sleep(2000);
				js.executeScript("window.scrollBy(0,750)");
				System.out.println("Content themes Brands have been talking about");
				boolean lang= driver.findElement(By.id("audience_language")).isDisplayed();
				String lang1=driver.findElement(By.id("audience_language")).getText();

					if(lang == true){

						System.out.println("data load properly!!!");
						System.out.println(lang1);

					}else {

						System.out.println("data not load properly!!!");
					}

					Thread.sleep(5000);

					((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
					Thread.sleep(2000);
					driver.findElement(By.id("link_for_149")).click();
					driver.findElement(By.xpath("//*[@id=\"post\"]/div/div/div/div/div/h5/div[2]/a/div")).click();
					Thread.sleep(2000);
					// retweet 
					driver.findElement(By.xpath("//*[@id=\"typefilter\"]/div[2]/div/div[1]/div[2]/div[3]")).click();
					driver.findElement(By.xpath("//*[@id=\"post\"]/div/div/div/div/div/h5/div[2]/a/div")).click();
					
					driver.findElement(By.id("compTWLinkFilter")).click();
			Boolean verify = driver.findElement(By.id("all_post_data_capsules")).isDisplayed();
			if(verify==true) {
				System.out.println("result showing proper!!!");


			}else {


				System.out.println("result not  showing proper!!!");
			}

//			driver.findElement(By.xpath("//*[@id=\"post\"]/div/div/div/div/div/h5/div[2]/span/img")).click();
//
//			driver.findElement(By.xpath("//*[@id=\"post\"]/div/div/div/div/div/h5/div[2]/span/input")).sendKeys("2021");
		}




	public void youtube_content_tab_data(String Youtube_data) throws InterruptedException {
		System.out.println("no of post for all");
		Thread.sleep(4000);
		click_competitor.click();
		Thread.sleep(2000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-md-12 competition_track_list_data']")));
		  search_img.click();
		    Thread.sleep(4000);
		   search_input.sendKeys(Youtube_data);
	Thread.sleep(5000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[normalize-space()='Lakme-YT']")));
	driver.findElement(By.xpath("//h4[normalize-space()='Lakme-YT']")).click();

		////Competition Tracker
	Thread.sleep(2000);
	driver.findElement(By.id("globalrange_competition")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[6]/div[3]/ul/li[5]")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("daterangepicker_start")).clear();
	Thread.sleep(2000);
	driver.findElement(By.name("daterangepicker_start")).sendKeys("1012021");
	Thread.sleep(2000);
	driver.findElement(By.name("daterangepicker_end")).clear();
	Thread.sleep(2000);
	driver.findElement(By.name("daterangepicker_end")).sendKeys("23022022");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/button[1]")).click();
	Thread.sleep(5000);

	System.out.println("Competition Tracker");

	boolean data =driver.findElement(By.id("overview_brand_output_details")).isDisplayed();
	String data_1=driver.findElement(By.id("overview_brand_output_details")).getText();


	if(data==true) {

		System.out.println("Data loading sucsseesfully");
		System.out.println(data_1);

	}else {

		System.out.println("Data not loading !!! ");

	}
		/////Share of Voice !
	Thread.sleep(2000);
	 js.executeScript("window.scrollBy(0,1000)");
		System.out.println("Share of Voice !");

		boolean share_voice= driver.findElement(By.id("share_of_voice")).isDisplayed();
		String share_voice1=driver.findElement(By.id("share_of_voice")).getText();
		if(share_voice == true) {

			System.out.println("Data loading sucsseesfully");
			System.out.println(share_voice1);

		}else {

			System.out.println("Data not loading !!! ");

		}
		Thread.sleep(2000);
		((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		driver.findElement(By.id("link_for_155")).click();
		//no of post
		Thread.sleep(2000);
		System.out.println("no of post");

		boolean no_of_post= driver.findElement(By.className("highcharts-container")).isDisplayed();
		String no_of_post11=driver.findElement(By.className("highcharts-container")).getText();

			if(no_of_post==true){

				System.out.println("data load properly!!!");
				System.out.println(no_of_post11);

			}else {

				System.out.println("data not load properly!!!");
			}


			js.executeScript("window.scrollBy(0,750)");
			//How has the audience interacted?
			System.out.println("How has the audience interacted? ");


		boolean audence= driver.findElement(By.className("highcharts-root")).isDisplayed();
		String audence1=driver.findElement(By.className("highcharts-root")).getText();

			if(audence==true){

				System.out.println("data load properly!!!");
				System.out.println(audence1);

			}else {

				System.out.println("data not load properly!!!");
			}


			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,850)");
			///total intraction  by type///
			System.out.println("total intraction  by type");

			boolean total_it_by_type= driver.findElement(By.id("total_reactions")).isDisplayed();
			String total_it_by_type_1=driver.findElement(By.id("total_reactions")).getText();

				if(total_it_by_type == true){

					System.out.println("data load properly!!!");
					System.out.println(total_it_by_type_1);

				}else {

					System.out.println("data not load properly!!!");
				}

				Thread.sleep(2000);
				js.executeScript("window.scrollBy(0,850)");
				System.out.println("total post ");

				boolean total_post= driver.findElement(By.id("top_interactive_posts")).isDisplayed();

					if(total_post == true){

						System.out.println("data load properly!!!");


					}else {

						System.out.println("data not load properly!!!");
					}

					((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");

					driver.findElement(By.id("link_for_156")).click();

					//best score

					boolean score_list=driver.findElement(By.id("brand_score_list")).isDisplayed();
					String score_list1=driver.findElement(By.id("brand_score_list")).getText();

					if (score_list==true) {

						System.out.println("data loaded succsesfully");
						System.out.println(score_list1);

					}else {


						System.out.println("data not loaded succsesfully");
					}
					((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");

					driver.findElement(By.id("link_for_157")).click();
					
					boolean all_posts=driver.findElement(By.id("allVideosYT")).isDisplayed();
					String all_posts1=driver.findElement(By.id("allVideosYT")).getText();

					if (all_posts==true) {

						System.out.println("data loaded succsesfully");
						System.out.println(all_posts1);

					}else {


						System.out.println("data not loaded succsesfully");
					}	


	}


	public void Testcases_main_competition_fillter_IG() throws InterruptedException {

		Thread.sleep(4000);
		click_competitor.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-md-12 competition_track_list_data']")));
		Thread.sleep(2000);
		fillter.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"typefilter\"]/li[3]/a")).click();
		Thread.sleep(8000);
		System.out.println("Instagram result");
		String bucket_ig= driver.findElement(By.xpath("//div[@class='col-md-12 competition_track_list_data']")).getText();
		System.out.println(bucket_ig);


}



	public void Testcases_main_competition_fillter_FB() throws InterruptedException {

		Thread.sleep(4000);
		click_competitor.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-md-12 competition_track_list_data']")));
		Thread.sleep(2000);
		fillter.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"typefilter\"]/li[4]/a")).click();
		Thread.sleep(8000);
		System.out.println("facebook result ");
		String bucket_ig= driver.findElement(By.xpath("//div[@class='col-md-12 competition_track_list_data']")).getText();
		System.out.println(bucket_ig);


}

public void Testcases_main_competition_fillter_TW() throws InterruptedException {

		Thread.sleep(4000);
		click_competitor.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-md-12 competition_track_list_data']")));
		Thread.sleep(2000);
		fillter.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"typefilter\"]/li[5]/a")).click();
		Thread.sleep(8000);
		System.out.println("tweeter result ");
		String bucket_ig= driver.findElement(By.xpath("//div[@class='col-md-12 competition_track_list_data']")).getText();
		System.out.println(bucket_ig);


}
public void Testcases_main_competition_fillter_YT() throws InterruptedException {

	Thread.sleep(4000);
	click_competitor.click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-md-12 competition_track_list_data']")));
	Thread.sleep(2000);
	fillter.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"typefilter\"]/li[6]/a")).click();
	Thread.sleep(8000);
	System.out.println("youtube result of ");
	String bucket_ig= driver.findElement(By.xpath("//div[@class='col-md-12 competition_track_list_data']")).getText();
	System.out.println(bucket_ig);


}



public void Testcases_delete_account_competion() throws InterruptedException {

	Thread.sleep(4000);
	click_competitor.click();
	Thread.sleep(2000);
	fillter.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"typefilter\"]/li[6]/a")).click();
	Thread.sleep(2000);
//	System.out.println("youtube result of ");
//	String bucket_ig= driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div/div[2]")).getText();
//	System.out.println(bucket_ig);
	driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div/div[2]/div[1]/a/div/img[3]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("/html/body/div[8]/div/div/div[3]/button[2]")).click();
}



}



