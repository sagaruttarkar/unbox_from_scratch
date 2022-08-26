package modules;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.Base_app;

public class Reports extends Base_app {

	@FindBy(xpath ="//div[@class='bg-circle-img brand-login-img main-add-img create_new on_page_add']")
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

	public Reports() {

		PageFactory.initElements(driver, this);

	}

	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebDriverWait wait = new WebDriverWait(driver, 1000);

	/// for analytics///////////////////*
	public void Reports_add_instagram1() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='https://app.unboxsocial.com/public/images/sidebar-icons/reports.svg ']")).click();
		String progress_bar = driver.findElement(By.xpath("//span[@class='item_has']")).getText();
		int p_bar = Integer.parseInt(progress_bar);
		int add_one = (p_bar + 1);

		System.out.println(add_one);

		add.click();
		analytics_click.click();
		driver.findElement(By.xpath("//img[@class='list-search-icon search-anywhere-in-page']")).click();
		driver.findElement(By.xpath("//input[@name='serach-post']"))
				.sendKeys("Spoken Fest");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h5[contains(text(),'Spoken Fest')]")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[1]/div[2]/div[1]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[1]/div[2]/div[2]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[1]/div[2]/div[3]/img")).click();
		Thread.sleep(5000);
		// calender 3 months
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[2]/div[4]/span")).click();
		genrate_report_btn.click();
		Thread.sleep(5000);
		//engegment rate and follower growth
		driver.findElement(By.xpath("//*[@id=\"graph_reports_lists\"]/div[1]/div[1]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"graph_reports_lists\"]/div[2]/div[1]/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"Instagram\"]/div[4]/button")).click();
		driver.getTitle();
		driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div/a[1]")).click();
	
		driver.navigate().refresh();

		String after_progress_bar1 = driver.findElement(By.xpath("//span[@class='item_has']")).getText();

		int p_bar1 = Integer.parseInt(after_progress_bar1);
		// int after_add =(p_bar1+1);
		System.out.println(p_bar1);
		if (add_one == p_bar1) {
			System.out.println("data perfect" + "result of data after add =" + p_bar1);

		} else {
			System.out.println("not added account in progrss bar");

		}
		Thread.sleep(300000);
		 driver.navigate().refresh();
		wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[7]")));

//	boolean report_gen=	driver.findElement(By.className("maa_ki_aankh")).isDisplayed();
	boolean reprt_ex=driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[7]")).isDisplayed();
	if(reprt_ex==true) {

		System.out.println("report_genrated");
		driver.findElement(By.xpath("//*[@id=\"rendered_report_list_generated\"]/tr[1]/td[7]/a[1]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id=\"rendered_report_list_generated\"]/tr[1]/td[7]/a[2]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id=\"rendered_report_list_generated\"]/tr[1]/td[7]/a[3]")).click();


	}else {

		System.out.println("processing!!!!!!!");
	}


	}



	public void Reports_add_facebook2() throws InterruptedException {
		driver.findElement(By.xpath("//img[@src='https://app.unboxsocial.com/public/images/sidebar-icons/reports.svg ']")).click();
		add.click();
		analytics_click.click();
		driver.findElement(By.xpath("//img[@class='platform-report-icons facebook social-icons-blacknwhite']")).click();
		driver.findElement(By.xpath("//img[@class='list-search-icon search-anywhere-in-page']")).click();
		driver.findElement(By.xpath("//input[@name='serach-post']"))
				.sendKeys("reliance Digital");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,250)");
		driver.findElement(By.xpath("//*[@id=\"analyticsCardsContainer\"]/div/div/h5")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[1]/div[2]/div[1]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[1]/div[2]/div[2]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[1]/div[2]/div[3]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[2]/div[3]/span")).click();
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[2]/div[3]/span")).click();
		genrate_report_btn.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"graph_reports_lists\"]/div[1]/div[1]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"graph_reports_lists\"]/div[2]/div[1]/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"Facebook\"]/div[4]/button")).click();
		driver.getTitle();
		driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div/a[1]")).click();

		Thread.sleep(300000);
		 driver.navigate().refresh();
		wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[7]")));

//	boolean report_gen=	driver.findElement(By.className("maa_ki_aankh")).isDisplayed();
	boolean reprt_ex=driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[7]")).isDisplayed();
	if(reprt_ex==true) {

		System.out.println("report_genrated");
		driver.findElement(By.xpath("//*[@id=\"rendered_report_list_generated\"]/tr[1]/td[7]/a[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"rendered_report_list_generated\"]/tr[1]/td[7]/a[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"rendered_report_list_generated\"]/tr[1]/td[7]/a[3]")).click();

	}else {

		System.out.println("processing!!!!!!!");
	}

	}

	public void Reports_add_Twitter3() throws InterruptedException {
		driver.findElement(By.xpath("//img[@src='https://app.unboxsocial.com/public/images/sidebar-icons/reports.svg ']")).click();
		add.click();
		analytics_click.click();
		driver.findElement(By.xpath("//img[@class='platform-report-icons twitter social-icons-blacknwhite']")).click();
		driver.findElement(By.xpath("//img[@class='list-search-icon search-anywhere-in-page']")).click();
		driver.findElement(By.xpath("//input[@name='serach-post']"))
				.sendKeys("zee music company");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"analyticsCardsContainer\"]/div/div/h5")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[1]/div[2]/div[1]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[1]/div[2]/div[2]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[1]/div[2]/div[3]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[2]/div[3]/span")).click();
		Thread.sleep(5000);
		//by defulat last weeks
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[2]/div[2]/span")).click();
		genrate_report_btn.click();
		Thread.sleep(5000);


		 driver.findElement(By.xpath("//*[@id=\"graph_reports_lists\"]/div[1]/div[1]/img")).click();
			driver.findElement(By.xpath("//*[@id=\"graph_reports_lists\"]/div[2]/div[1]/img")).click();
			Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"Twitter\"]/div[4]/button")).click();
		driver.getTitle();
		driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div/a[1]")).click();
		Thread.sleep(300000);
		 driver.navigate().refresh();
		wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[7]")));

//	boolean report_gen=	driver.findElement(By.className("maa_ki_aankh")).isDisplayed();
	boolean reprt_ex=driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[7]")).isDisplayed();
	if(reprt_ex==true) {

		System.out.println("report_genrated");
		driver.findElement(By.xpath("//*[@id=\"rendered_report_list_generated\"]/tr[1]/td[7]/a[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"rendered_report_list_generated\"]/tr[1]/td[7]/a[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"rendered_report_list_generated\"]/tr[1]/td[7]/a[3]")).click();

	}else {

		System.out.println("processing!!!!!!!");
	}


	}

	public void Reports_add_Youtube4() throws InterruptedException {
		driver.findElement(By.xpath("//img[@src='https://app.unboxsocial.com/public/images/sidebar-icons/reports.svg ']")).click();
		add.click();
		analytics_click.click();
		driver.findElement(By.xpath("//img[@class='platform-report-icons google social-icons-blacknwhite']")).click();
		driver.findElement(By.xpath("//img[@class='list-search-icon search-anywhere-in-page']")).click();
		driver.findElement(By.xpath("//input[@name='serach-post']"))
				.sendKeys("disney");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"analyticsCardsContainer\"]/div/div/h5")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[1]/div[2]/div[1]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[1]/div[2]/div[2]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[1]/div[2]/div[3]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[2]/div[3]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[2]/div[5]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("daterangepicker_start")).clear();
		Thread.sleep(5000);
		driver.findElement(By.name("daterangepicker_start")).sendKeys("25012021");
		Thread.sleep(5000);
		driver.findElement(By.name("daterangepicker_end")).clear();
		Thread.sleep(5000);
       driver.findElement(By.name("daterangepicker_end")).sendKeys("25062021");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Apply']")).click();
		Thread.sleep(5000);
		genrate_report_btn.click();
		Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id=\"graph_reports_lists\"]/div[1]/div[1]/img")).click();
	     driver.findElement(By.xpath("//*[@id=\"graph_reports_lists\"]/div[2]/div[1]/img")).click();
	    Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"Youtube\"]/div[4]/button")).click();
		driver.getTitle();
		driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div/a[1]")).click();
		Thread.sleep(300000);
		 driver.navigate().refresh();
		wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[7]")));

//	boolean report_gen=	driver.findElement(By.className("maa_ki_aankh")).isDisplayed();
	boolean reprt_ex=driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[7]")).isDisplayed();
	if(reprt_ex==true) {

		System.out.println("report_genrated");
		driver.findElement(By.xpath("//*[@id=\"rendered_report_list_generated\"]/tr[1]/td[7]/a[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"rendered_report_list_generated\"]/tr[1]/td[7]/a[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"rendered_report_list_generated\"]/tr[1]/td[7]/a[3]")).click();

	}else {

		System.out.println("processing!!!!!!!");
	}
//

	}

	///////////// for compitetors//////////////////////////
	public void Reports_add_comp_insta() throws InterruptedException {
		driver.findElement(By.xpath("//img[@src='https://app.unboxsocial.com/public/images/sidebar-icons/reports.svg ']")).click();
		add.click();
		click_compitetors.click();
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,250)");
		wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.id("analyticsCardsContainer")));
		driver.findElement(By.xpath("//img[@class='list-search-icon search-anywhere-in-page']")).click();
		driver.findElement(By.xpath("//input[@name='serach-post']"))
				.sendKeys("boat-3");
		Thread.sleep(3000);
        driver.findElement(By.xpath("//h4[normalize-space()='BOAT-3']")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[1]/div[2]/div[1]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[1]/div[2]/div[2]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[1]/div[2]/div[3]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[2]/div[5]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[2]/div[4]/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[2]/div[2]/span")).click();
		Thread.sleep(5000);
		genrate_report_btn.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"graph_reports_lists\"]/div[1]/div[1]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"graph_reports_lists\"]/div[2]/div[1]/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"BOAT-3\"]/div[4]/button")).click();
		driver.getTitle();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div/a[1]")).click();
			String list = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/table"))
				.getText();
		System.out.println(list);
		Thread.sleep(300000);
		 driver.navigate().refresh();
		wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[7]")));

//	boolean report_gen=	driver.findElement(By.className("maa_ki_aankh")).isDisplayed();
	boolean reprt_ex=driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[7]")).isDisplayed();
	if(reprt_ex==true) {

		System.out.println("report_genrated");
		driver.findElement(By.xpath("//*[@id=\"rendered_report_list_generated\"]/tr[1]/td[7]/a[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"rendered_report_list_generated\"]/tr[1]/td[7]/a[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"rendered_report_list_generated\"]/tr[1]/td[7]/a[3]")).click();

	}else {

		System.out.println("processing!!!!!!!");
	}


	}

	public void Reports_add_comp_fb() throws InterruptedException {
		driver.findElement(By.xpath("//img[@src='https://app.unboxsocial.com/public/images/sidebar-icons/reports.svg ']")).click();
		add.click();
		click_compitetors.click();
		driver.findElement(By.xpath("//*[@id=\"stepTwo\"]/div[1]/img[2]")).click();
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,250)");
		wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.id("analyticsCardsContainer")));
		driver.findElement(By.xpath("//img[@class='list-search-icon search-anywhere-in-page']")).click();
		driver.findElement(By.xpath("//input[@name='serach-post']"))
				.sendKeys("TRISVARAA'S");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"analyticsCardsContainer\"]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[1]/div[2]/div[1]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[1]/div[2]/div[2]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[1]/div[2]/div[3]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[2]/div[5]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[2]/div[4]/span")).click();
		Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[2]/div[3]/span")).click();
		 Thread.sleep(5000);
		genrate_report_btn.click();
		Thread.sleep(5000);


		driver.findElement(By.xpath("//*[@id=\"graph_reports_lists\"]/div[1]/div[1]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"graph_reports_lists\"]/div[2]/div[1]/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"Trisvaraa's\"]/div[4]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div/a[1]")).click();
		Thread.sleep(300000);
		 driver.navigate().refresh();
		wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[7]")));

//	boolean report_gen=	driver.findElement(By.className("maa_ki_aankh")).isDisplayed();
	boolean reprt_ex=driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[7]")).isDisplayed();
	if(reprt_ex==true) {

		System.out.println("report_genrated");
		driver.findElement(By.xpath("//*[@id=\"rendered_report_list_generated\"]/tr[1]/td[7]/a[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"rendered_report_list_generated\"]/tr[1]/td[7]/a[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"rendered_report_list_generated\"]/tr[1]/td[7]/a[3]")).click();

	}else {

		System.out.println("processing!!!!!!!");
	}


	}

	public void Reports_add_comp_twitter() throws InterruptedException {
		driver.findElement(By.xpath("//img[@src='https://app.unboxsocial.com/public/images/sidebar-icons/reports.svg ']")).click();
		add.click();
		click_compitetors.click();
		driver.findElement(By.xpath("//*[@id=\"stepTwo\"]/div[1]/img[3]")).click();
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,250)");
		wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.id("analyticsCardsContainer")));
		driver.findElement(By.xpath("//img[@class='list-search-icon search-anywhere-in-page']")).click();
		driver.findElement(By.xpath("//input[@name='serach-post']"))
				.sendKeys("TWC3");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"analyticsCardsContainer\"]/div")).click();

		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[1]/div[2]/div[1]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[1]/div[2]/div[2]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[1]/div[2]/div[3]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[2]/div[5]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[2]/div[4]/span")).click();
		Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[2]/div[4]/span")).click();
		genrate_report_btn.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"graph_reports_lists\"]/div[1]/div[1]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"graph_reports_lists\"]/div[2]/div[1]/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"TWC3\"]/div[4]/button")).click();
		driver.getTitle();
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div/a[1]")).click();
		
		
		String list = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/table"))
				.getText();
		System.out.println(list);
		Thread.sleep(300000);
		 driver.navigate().refresh();
		wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[7]")));

//	boolean report_gen=	driver.findElement(By.className("maa_ki_aankh")).isDisplayed();
	boolean reprt_ex=driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[7]")).isDisplayed();
	if(reprt_ex==true) {

		System.out.println("report_genrated");
		driver.findElement(By.xpath("//*[@id=\"rendered_report_list_generated\"]/tr[1]/td[7]/a[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"rendered_report_list_generated\"]/tr[1]/td[7]/a[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"rendered_report_list_generated\"]/tr[1]/td[7]/a[3]")).click();

	}else {

		System.out.println("processing!!!!!!!");
	}


	}

	public void Reports_add_comp_youtube() throws InterruptedException {
		driver.findElement(By.xpath("//img[@src='https://app.unboxsocial.com/public/images/sidebar-icons/reports.svg ']")).click();
		add.click();
		click_compitetors.click();
		driver.findElement(By.xpath("//*[@id=\"stepTwo\"]/div[1]/img[4]")).click();
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,250)");
		wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.id("analyticsCardsContainer")));
		driver.findElement(By.xpath("//img[@class='list-search-icon search-anywhere-in-page']")).click();
		driver.findElement(By.xpath("//input[@name='serach-post']"))
				.sendKeys("mobiless");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"analyticsCardsContainer\"]/div")).click();

		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[1]/div[2]/div[1]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[1]/div[2]/div[2]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[1]/div[2]/div[3]/img")).click();
//
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[2]/div[5]")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("daterangepicker_start")).clear();
		Thread.sleep(5000);
		driver.findElement(By.name("daterangepicker_start")).sendKeys("25062021");
		Thread.sleep(5000);
		driver.findElement(By.name("daterangepicker_end")).clear();
		Thread.sleep(5000);
       driver.findElement(By.name("daterangepicker_end")).sendKeys("25122021");
       Thread.sleep(5000);
       driver.findElement(By.xpath("/html/body/div[9]/div[3]/div/button[1]")).click();
       Thread.sleep(5000);
		genrate_report_btn.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"graph_reports_lists\"]/div[1]/div[1]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"graph_reports_lists\"]/div[2]/div[1]/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"Mobiless \"]/div[4]/button")).click();
		driver.getTitle();
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div/a[1]")).click();
		
		
		String list = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/table"))
				.getText();
		System.out.println(list);
		Thread.sleep(400000);
		 driver.navigate().refresh();
		wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[7]/a[2]")));

//	boolean report_gen=	driver.findElement(By.className("maa_ki_aankh")).isDisplayed();
	boolean reprt_ex=driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[7]/a[2]")).isDisplayed();
	if(reprt_ex==true) {

		System.out.println("report_genrated");
		driver.findElement(By.xpath("//*[@id=\"rendered_report_list_generated\"]/tr[1]/td[7]/a[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"rendered_report_list_generated\"]/tr[1]/td[7]/a[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"rendered_report_list_generated\"]/tr[1]/td[7]/a[3]")).click();
	}else {

		System.out.println("processing!!!!!!!");
	}


	}

	/////////////////////////// Influencer_camping/////////////////////////////////////

	public void Reports_create_influencer_camping_instagram() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"main-menu-wrapper\"]/ul/li[7]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"4_\"]/span[1]/a")).click();
		Thread.sleep(1000);
		wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]")));
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[1]/div/div[2]/span/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[1]/div/div[2]/span/input")).sendKeys("sagar_test1");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div[1]/div/div/span/img[1]")).click();
		Random random = new Random();
		String list_name = "sagar_testing+" + random.nextInt() + "_list";
		driver.findElement(By.xpath("//input[@placeholder='Enter List name here']")).sendKeys(list_name);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@src='https://app.unboxsocial.com/public/images/sidebar-icons/reports.svg ']")).click();
		Thread.sleep(5000);
		add.click();
		click_influencer_camping.click();
//		System.out.println(list_name);
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/span[4]/img")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/span[4]/input"))
				.sendKeys(list_name);
		Thread.sleep(5000);

		js.executeScript("window.scrollBy(0,250)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[normalize-space()='147 Influencers']")).click();

		driver.findElement(By.xpath("//*[@id=\"influencerCampaignHashtag\"]")).sendKeys("#OnePastEveryone, #BeAnXPlorer, #MoreInEveryday, #SeeTheBiggerPicture, #SwitchOverToTheBrightSide, #KeepPlaying, #WatchMatrix, #FasterWithBlaze, #WavePro47, #NowIsOurTime, #LiteItUp, #WatchWaveL");
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"brandsInfluencerCampaign-selectized\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[2]/div[2]/div/div[2]/div/div[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[3]/div[2]/img")).click();

		Thread.sleep(5000);
		// 3 months
		js.executeScript("scroll(0, -250);");
		driver.findElement(By.xpath("/html/body/div[9]/div[3]/ul/li[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[4]/div[2]/div[1]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[4]/div[2]/div[2]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[4]/div[2]/div[3]/img")).click();
		genrate_report_btn.click();
//
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div/a[1]")).click();
		Thread.sleep(300000);
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
//


	}
	public void Reports_create_influencer_camping_instagram_and_youtube() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"main-menu-wrapper\"]/ul/li[7]")).click();
		driver.findElement(By.xpath("//*[@id=\"4_\"]/span[1]/a")).click();
		Thread.sleep(1000);
		wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='all-lists col-md-12 no-padding']")));
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[1]/div/div[2]/span/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[1]/div/div[2]/span/input")).sendKeys("matrix_for");
		Thread.sleep(5000);
		wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div[1]/div/div/span/img[1]")));

		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div[1]/div/div/span/img[1]")).click();
		Random random = new Random();
		String list_name = "sagar_testing+" + random.nextInt() + "_list";
		driver.findElement(By.xpath("//input[@placeholder='Enter List name here']")).sendKeys(list_name);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@src='https://app.unboxsocial.com/public/images/sidebar-icons/reports.svg ']")).click();
		add.click();
		click_influencer_camping.click();
//		System.out.println(list_name);
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/span[4]/img")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/span[4]/input"))
				.sendKeys(list_name);
		Thread.sleep(5000);

		js.executeScript("window.scrollBy(0,250)");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='20 Influencers']")));
		driver.findElement(By.xpath("//p[normalize-space()='20 Influencers']")).click();
		driver.findElement(By.xpath("//*[@id=\"influencerCampaignHashtag\"]")).sendKeys("happyday");
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"brandsInfluencerCampaign-selectized\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[2]/div[2]/div/div[2]/div/div[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[3]/div[2]/img")).click();
		Thread.sleep(5000);
		// 1 years
		js.executeScript("scroll(0, -250);");
		driver.findElement(By.xpath("/html/body/div[9]/div[3]/ul/li[5]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[4]/div[2]/div[1]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[4]/div[2]/div[2]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[4]/div[2]/div[3]/img")).click();
		genrate_report_btn.click();

		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div/a[1]")).click();
		Thread.sleep(300000);
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


	}
	public void Reports_create_influencer_camping_youtube() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"main-menu-wrapper\"]/ul/li[7]")).click();
		driver.findElement(By.xpath("//*[@id=\"4_\"]/span[1]/a")).click();
		Thread.sleep(1000);
		wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]")));
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[1]/div/div[2]/span/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[1]/div/div[2]/span/input")).sendKeys("travelers");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div[1]/div/div/span/img[1]")).click();
		Thread.sleep(4000);
		Random random = new Random();
		String list_name = "sagar_testing+" + random.nextInt() + "_list";
		driver.findElement(By.xpath("//input[@placeholder='Enter List name here']")).sendKeys(list_name);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@src='https://app.unboxsocial.com/public/images/sidebar-icons/reports.svg ']")).click();
		Thread.sleep(5000);
		add.click();
		click_influencer_camping.click();
//		System.out.println(list_name);
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/span[4]/img")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/span[4]/input"))
				.sendKeys(list_name);
		Thread.sleep(5000);

		js.executeScript("window.scrollBy(0,250)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[normalize-space()='10 Influencers']")).click();

		driver.findElement(By.xpath("//*[@id=\"influencerCampaignHashtag\"]")).sendKeys("NikeShoes");
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"brandsInfluencerCampaign-selectized\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[2]/div[2]/div/div[2]/div/div[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[3]/div[2]/img")).click();
		Thread.sleep(5000);
		// 6 months
		js.executeScript("scroll(0, -250);");
		driver.findElement(By.xpath("/html/body/div[9]/div[3]/ul/li[4]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[4]/div[2]/div[1]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[4]/div[2]/div[2]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[4]/div[2]/div[3]/img")).click();
		genrate_report_btn.click();

		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div/a[1]")).click();
		Thread.sleep(300000);
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
	}
	public void Reports_create_influencer_camping_twitter() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"main-menu-wrapper\"]/ul/li[7]")).click();
		driver.findElement(By.xpath("//*[@id=\"4_\"]/span[1]/a")).click();
		Thread.sleep(1000);
		wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]")));
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[1]/div/div[2]/span/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[1]/div/div[2]/span/input")).sendKeys("testing_sagar_twitter");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div[1]/div/div/span/img[1]")).click();
		Random random = new Random();
		String list_name = "sagar_testing+" + random.nextInt() + "_list";
		driver.findElement(By.xpath("//input[@placeholder='Enter List name here']")).sendKeys(list_name);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@src='https://app.unboxsocial.com/public/images/sidebar-icons/reports.svg ']")).click();
		Thread.sleep(5000);
		add.click();
		click_influencer_camping.click();
//		System.out.println(list_name);
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/span[4]/img")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/span[4]/input"))
				.sendKeys(list_name);
		Thread.sleep(5000);

		js.executeScript("window.scrollBy(0,250)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[normalize-space()='14 Influencers']")).click();

		driver.findElement(By.xpath("//*[@id=\"influencerCampaignHashtag\"]")).sendKeys("SongOfTheDay");
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"brandsInfluencerCampaign-selectized\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[2]/div[2]/div/div[2]/div/div[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[3]/div[2]/img")).click();
		Thread.sleep(5000);
		// 6 months
		js.executeScript("scroll(0, -250);");
		driver.findElement(By.xpath("/html/body/div[9]/div[3]/ul/li[4]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[4]/div[2]/div[1]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[4]/div[2]/div[2]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[4]/div[2]/div[3]/img")).click();
		genrate_report_btn.click();

		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div/a[1]")).click();
		Thread.sleep(300000);
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


	}
	public void Reports_create_influencer_camping_instagram_and_youtube_and_twitter() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"main-menu-wrapper\"]/ul/li[7]")).click();
		driver.findElement(By.xpath("//*[@id=\"4_\"]/span[1]/a")).click();
		Thread.sleep(1000);
		wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='all-lists col-md-12 no-padding']")));
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[1]/div/div[2]/span/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[1]/div/div[2]/span/input")).sendKeys("testing_sagar_all_account");
		Thread.sleep(5000);
		wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div[1]/div/div/span/img[1]")));

		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div[1]/div/div/span/img[1]")).click();
		Random random = new Random();
		String list_name = "sagar_testing+" + random.nextInt() + "_list";
		driver.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/div/form/input")).sendKeys(list_name);
		driver.findElement(By.xpath("/html/body/div[8]/div/div/div[3]/button[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@src='https://app.unboxsocial.com/public/images/sidebar-icons/reports.svg ']")).click();
		add.click();
		click_influencer_camping.click();
//		System.out.println(list_name);
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/span[4]/img")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/span[4]/input"))
				.sendKeys(list_name);
		Thread.sleep(5000);

		js.executeScript("window.scrollBy(0,250)");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[normalize-space()='18 Influencers']")));
		driver.findElement(By.xpath("//p[normalize-space()='18 Influencers']")).click();
		driver.findElement(By.xpath("//*[@id=\"influencerCampaignHashtag\"]")).sendKeys("lorial,fitness");
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"brandsInfluencerCampaign-selectized\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[2]/div[2]/div/div[2]/div/div[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[3]/div[2]/img")).click();
		Thread.sleep(5000);
		// 1 years
		js.executeScript("scroll(0, -250);");
		driver.findElement(By.xpath("/html/body/div[9]/div[3]/ul/li[5]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[4]/div[2]/div[1]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[4]/div[2]/div[2]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[4]/div[2]/div[3]/img")).click();
		genrate_report_btn.click();

		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div/a[1]")).click();
		Thread.sleep(300000);
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


	}



	public void All_reports() throws InterruptedException {
		driver.findElement(By.xpath("//img[@src='https://app.unboxsocial.com/public/images/sidebar-icons/reports.svg ']")).click();
		String total_report = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[1]/span[1]"))
				.getText();

		String total_data = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]"))
				.getText();
		System.out.println(total_report);
		System.out.println(total_data);

		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[1]/span[2]")).click();
		String analytics_data_count = driver
				.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[1]/span[2]")).getText();
		System.out.println(analytics_data_count);
		String analytics_data_list = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]"))
				.getText();
		System.out.println(analytics_data_list);

		Thread.sleep(5000);

		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[1]/span[3]")).click();
		Thread.sleep(5000);
		String competitors_data_count = driver
				.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[1]/span[3]")).getText();
		System.out.println(competitors_data_count);
		String compitetors_data = driver
				.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/table")).getText();
		System.out.println(compitetors_data);

		Thread.sleep(5000);

		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[1]/span[4]")).click();
		Thread.sleep(5000);
		String Influencer_camping_count = driver
				.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[1]/span[4]")).getText();
		System.out.println(Influencer_camping_count);
		String Influencer_data = driver
				.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/table")).getText();
		System.out.println(Influencer_data);

	}

	public void All_Reports_search() throws InterruptedException {
		driver.findElement(By.xpath("//img[@src='https://app.unboxsocial.com/public/images/sidebar-icons/reports.svg ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[1]/div[2]/span/img")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[1]/div[2]/span/input")).sendKeys("spots");
		//
		String result = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/table"))
				.getText();
		System.out.println(result);

	}

	public void instagram_Report_Filtter() throws InterruptedException {

		driver.findElement(By.xpath("//img[@src='https://app.unboxsocial.com/public/images/sidebar-icons/reports.svg ']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[1]/div[2]/a[2]/div/i")).click();

		// Select instagram

		driver.findElement(By.xpath("//*[@id=\"typefilter\"]/li[3]/a")).click();

	}
	public void facebook_Report_Filtter() throws InterruptedException {

		driver.findElement(By.xpath("//img[@src='https://app.unboxsocial.com/public/images/sidebar-icons/reports.svg ']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[1]/div[2]/a[2]/div/i")).click();

		// Select facebook

		driver.findElement(By.xpath("//*[@id=\"typefilter\"]/li[4]/a")).click();

	}
	public void tweeter_Report_Filtter() throws InterruptedException {

		driver.findElement(By.xpath("//img[@src='https://app.unboxsocial.com/public/images/sidebar-icons/reports.svg ']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[1]/div[2]/a[2]/div/i")).click();

		// Select facebook

		driver.findElement(By.xpath("//*[@id=\"typefilter\"]/li[5]/a")).click();

	}
	public void youtube_Report_Filtter() throws InterruptedException {

		driver.findElement(By.xpath("//img[@src='https://app.unboxsocial.com/public/images/sidebar-icons/reports.svg ']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[1]/div[2]/a[2]/div/i")).click();

		// Select facebook

		driver.findElement(By.xpath("//*[@id=\"typefilter\"]/li[6]/a")).click();

	}

	public void campings_report_view() throws InterruptedException {
		driver.findElement(By.xpath("//img[@src='https://app.unboxsocial.com/public/images/sidebar-icons/reports.svg ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[1]/span[4]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[1]/div[2]/span/img")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[1]/div[2]/span/input"))
				.sendKeys("happyday");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"rendered_report_list_generated\"]/tr[1]/td[7]/a[1]")).click();
		Thread.sleep(5000);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(5000);


		System.out.println("********overview*********");
		boolean top_start = driver.findElement(By.xpath("//*[@id=\"overview\"]/div[5]/div/div/div"))
				.isDisplayed();
		String top_start1 = driver.findElement(By.xpath("//*[@id=\"overview\"]/div[5]/div/div/div"))
				.getText();

		if (top_start == true) {

			System.out.println(top_start1);

		} else {

			System.out.println("data missing!!!");
		}

		System.out.println("List of Influencers activated on the Pyramid*************");
		boolean top_influencer_ig = driver.findElement(By.id("pyramidCategoriesStats")).isDisplayed();
		String top_influencer_ig_1 = driver.findElement(By.id("pyramidCategoriesStats")).getText();

		if (top_influencer_ig == true) {

			System.out.println(top_influencer_ig_1);

		} else {

			System.out.println("data missing!!!");
		}
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"total_intr_capsules\"]/span[2]")).click();

		System.out.println("*******\r\n" +
				"Age, Location and Gender of Influencers, Audience Interest*************");
		boolean top_influencer_yt = driver.findElement(By.id("top-google")).isDisplayed();
		String top_influencer_yt_1 = driver.findElement(By.id("top-google")).getText();

		if (top_influencer_yt == true) {

			System.out.println(top_influencer_yt_1);

		} else {

			System.out.println("data missing!!!");
		}

		js.executeScript("window.scrollBy(0,250)");
		System.out.println("*******List of Influencers*************");
		boolean List_of_Influencers = driver
				.findElement(By.id("instagramInfluencerList_container")).isDisplayed();
		String List_of_Influencers_1 = driver
				.findElement(By.id("instagramInfluencerList_container")).getText();

		if (List_of_Influencers == true) {

			System.out.println(List_of_Influencers_1);

		} else {

			System.out.println("data missing!!!");

		}
		Thread.sleep(5000);

		js.executeScript("window.scrollBy(0,250)");
		boolean List_of_Influencers_yt = driver
				.findElement(By.id("youtubeInfluencerList_container")).isDisplayed();
		String List_of_Influencers_yt_1 = driver
				.findElement(By.id("youtubeInfluencerList_container")).getText();

		if (List_of_Influencers_yt == true) {

			System.out.println(List_of_Influencers_yt_1);

		} else {

			System.out.println("data missing!!!");

		}



		System.out.println("*******\r\n" +
				"Campaign Top-lines*************");
		boolean Activated_Influencers = driver.findElement(By.id("top_lines_container"))
				.isDisplayed();
		String Activated_Influencers_ig = driver.findElement(By.id("top_lines_container"))
				.getText();

		if (Activated_Influencers == true) {

			System.out.println(Activated_Influencers_ig);

		} else {

			System.out.println("data missing!!!");

		}


		Thread.sleep(5000);
		System.out.println("*******\r\n" +
				"Top-lines by Platform*************");
		boolean Activated_Influencersyt = driver.findElement(By.id("ig_yt_top_lines_platformsContainer"))
				.isDisplayed();
		String Activated_Influencers_yt = driver.findElement(By.id("ig_yt_top_lines_platformsContainer"))
				.getText();

		if (Activated_Influencersyt == true) {

			System.out.println(Activated_Influencers_yt);

		} else {

			System.out.println("data missing!!!");

		}
		Thread.sleep(5000);
		((JavascriptExecutor) driver) .executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		// overview tab end

		System.out.println("Content & Influencer performance");
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/ul/li[2]/a")).click();
		System.out.println("summery card");
		boolean card = driver.findElement(By.id("contentSummaryCards")).isDisplayed();
		String Summery_card = driver.findElement(By.id("contentSummaryCards")).getText();

		if(card==true) {
			System.out.println("data loaded sucsessfully!!");
			System.out.println(Summery_card);

		}else
		{

			System.out.println("data not loaded");

		}

		System.out.println("\r\n" +
				"Mode of Interaction");
		boolean ig_inter = driver.findElement(By.id("instagramModeOfInteractionContainer")).isDisplayed();
		String ig_inter_1 = driver.findElement(By.id("instagramModeOfInteractionContainer")).getText();

		if(ig_inter==true) {
			System.out.println("data loaded sucsessfully!!");
			System.out.println(ig_inter_1);

		}else
		{

			System.out.println("data not loaded");

		}

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"performance\"]/div[3]/div/div/div[2]/div/span[2]/img")).click();
		boolean yt_inter = driver.findElement(By.id("youtubeModeOfInteractionContainer")).isDisplayed();
		String yt_inter_1 = driver.findElement(By.id("youtubeModeOfInteractionContainer")).getText();

		if(yt_inter==true) {
			System.out.println("data loaded sucsessfully!!");
			System.out.println(yt_inter_1);

		}else
		{

			System.out.println("data not loaded");

		}

		System.out.println("Content Formats Created");
		boolean formate = driver.findElement(By.id("contentFormatPlatformDivs")).isDisplayed();
		String formate1 = driver.findElement(By.id("contentFormatPlatformDivs")).getText();

		if(formate==true) {
			System.out.println("data loaded sucsessfully!!");
			System.out.println(formate1);

		}else
		{

			System.out.println("data not loaded");

		}
		System.out.println("Performance by Content Format (ER & Interaction)");
		boolean ig = driver.findElement(By.id("instagramPerformanceByContentFormat")).isDisplayed();
		String ig1 = driver.findElement(By.id("instagramPerformanceByContentFormat")).getText();

		if(ig==true) {
			System.out.println("data loaded sucsessfully!!");
			System.out.println(ig1);

		}else
		{

			System.out.println("data not loaded");

		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"performance\"]/div[5]/div[1]/div/div/div[2]/div[1]/div[1]/div/div[1]/div")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"performance\"]/div[5]/div[1]/div/div/div[2]/div[1]/div[1]/div/div[2]/div/div[2]")).click();
		Thread.sleep(5000);
		System.out.println("for youtube platform");
		boolean yt = driver.findElement(By.id("youtubePerformanceByContentFormat")).isDisplayed();
		String yt1 = driver.findElement(By.id("youtubePerformanceByContentFormat")).getText();

		if(yt==true) {
			System.out.println("data loaded sucsessfully!!");
			System.out.println(yt1);

		}else
		{

			System.out.println("data not loaded");

		}
		System.out.println("Influencers Performance by Category");
		boolean influ = driver.findElement(By.id("instagraminflPerformByCategoryErContainer")).isDisplayed();
		String influ_per = driver.findElement(By.id("instagraminflPerformByCategoryErContainer")).getText();

		if(influ==true) {
			System.out.println("data loaded sucsessfully!!");
			System.out.println(influ_per);

		}else
		{

			System.out.println("data not loaded");

		}

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"performance\"]/div[5]/div[2]/div/div/div[2]/div[1]/div/div[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"performance\"]/div[5]/div[2]/div/div/div[2]/div[1]/div/div[2]/div/div[2]")).click();
		Thread.sleep(5000);
		System.out.println("for youtube");
		boolean influ_yt= driver.findElement(By.id("youtubeInfluencerPerformanceByCat")).isDisplayed();
		String influ_yt1 = driver.findElement(By.id("youtubeInfluencerPerformanceByCat")).getText();

		if(influ_yt==true) {
			System.out.println("data loaded sucsessfully!!");
			System.out.println(influ_yt1);

		}else
		{

			System.out.println("data not loaded");

		}
		js.executeScript("window.scrollBy(0,750)");
		Thread.sleep(5000);
		System.out.println("ALL POST");
		boolean ALL_post= driver.findElement(By.id("contentAllPostsAllContainer")).isDisplayed();
		String ALL_post1 = driver.findElement(By.id("contentAllPostsAllContainer")).getText();

		if(ALL_post==true) {
			System.out.println("data loaded sucsessfully!!");
			System.out.println(ALL_post1);

		}else
		{

			System.out.println("data not loaded");

		}
		js.executeScript("window.scrollBy(0,750)");
		Thread.sleep(5000);
		System.out.println("\r\n" +
				"Top Influencers by Interactions");
		boolean influ_inter1= driver.findElement(By.id("instagramContentTopInfluencersInteractionContainer")).isDisplayed();
		String influ_inter = driver.findElement(By.id("instagramContentTopInfluencersInteractionContainer")).getText();

		if(influ_inter1==true) {
			System.out.println("data loaded sucsessfully!!");
			System.out.println(influ_inter);

		}else
		{

			System.out.println("data not loaded");

		}
		driver.findElement(By.xpath("//div[contains(@class,'col-md-6 no-padding-right')]//div[contains(@class,'option')][normalize-space()='Youtube']")).click();
		Thread.sleep(5000);
		System.out.println("for youtube");
		boolean influ_inter_yt= driver.findElement(By.id("youtubeContentTopInfluencersInteractionContainer")).isDisplayed();
		String influ_inter_yt1 = driver.findElement(By.id("youtubeContentTopInfluencersInteractionContainer")).getText();

		if(influ_inter_yt==true) {
			System.out.println("data loaded sucsessfully!!");
			System.out.println(influ_inter_yt1);

		}else
		{

			System.out.println("data not loaded");

		}
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(tabs2.get(0));

	}
	public void Report_instagram_StoryForm_check() throws InterruptedException, HeadlessException, UnsupportedFlavorException, IOException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"main-menu-wrapper\"]/ul/li[7]")).click();
		driver.findElement(By.xpath("//*[@id=\"4_\"]/span[1]/a")).click();
		Thread.sleep(2000);
		wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]")));
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[1]/div/div[2]/span/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[1]/div/div[2]/span/input")).sendKeys("passionmadepossible");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div[2]/div[1]/div/div/span/img[1]")).click();
		Random random = new Random();
		String list_name = "sagar_testing+" + random.nextInt() + "_list";
		driver.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/div/form/input")).sendKeys(list_name);
		driver.findElement(By.xpath("/html/body/div[8]/div/div/div[3]/button[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@src='https://app.unboxsocial.com/public/images/sidebar-icons/reports.svg ']")).click();
		add.click();
		click_influencer_camping.click();
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/span[4]/img")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/span[4]/input"))
				.sendKeys(list_name);   
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,250)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[normalize-space()='36 Influencers']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"influencerCampaignHashtag\"]")).sendKeys("travel");
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"brandsInfluencerCampaign-selectized\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[2]/div[2]/div/div[2]/div/div[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("createReportInfluencerCampaignStageThree")).click();
		js.executeScript("scroll(0, -250);");
		driver.findElement(By.name("daterangepicker_start")).clear();
		Thread.sleep(5000);
		driver.findElement(By.name("daterangepicker_start")).sendKeys("25012020");
		Thread.sleep(5000);
		driver.findElement(By.name("daterangepicker_end")).clear();
		Thread.sleep(5000);
	     driver.findElement(By.name("daterangepicker_end")).sendKeys("25012021");
	     Thread.sleep(5000);
	     js.executeScript("window.scrollBy(0,350)");
	     driver.findElement(By.xpath("/html/body/div[9]/div[3]/div/button[1]")).click();
		Thread.sleep(5000);
		((JavascriptExecutor) driver)
	     .executeScript("window.scrollTo(0, document.body.scrollHeight)");
		  Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[4]/div[2]/div[1]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[4]/div[2]/div[2]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"stepThree\"]/div[4]/div[2]/div[3]/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"url_input\"]/i")).click(); //text copied to clipboard
		String link = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor); // extracting the text that was copied to the clipboard
       System.out.println(link);
       Thread.sleep(5000);
		genrate_report_btn.click();
		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/div/div/a[1]")).click();
		Thread.sleep(180000);
	    driver.navigate().refresh();
		wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div/div/div/div[2]/div[2]/table/tbody/tr[1]/td[7]")));
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		   jse.executeScript("window.open()");

		   //Switch to new tab
		   ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		   driver.switchTo().window(tabs2.get(1));
	        driver.get(link);


	        // influencr forms start
	        //post
	        driver.findElement(By.name("ig_handle")).sendKeys("just_neel_things");
	        Thread.sleep(5000);
	        driver.findElement(By.name("ig_account_name")).sendKeys("Neel");
	        Thread.sleep(5000);
	        driver.findElement(By.name("followers")).sendKeys("1,016");
	        Thread.sleep(5000);
	        driver.findElement(By.name("post_count")).sendKeys("1");
	        Thread.sleep(5000);
	        driver.findElement(By.name("stories_count")).sendKeys("1");
	        Thread.sleep(5000);
	        driver.findElement(By.name("reels_count")).sendKeys("1");
	        Thread.sleep(5000);
	        driver.findElement(By.name("igtv_count")).sendKeys("1");
	        Thread.sleep(5000);
	        // for post1
	        driver.findElement(By.name("post[0][post_link]")).sendKeys("https://www.instagram.com/p/CQsUY48DK3M/");
	        Thread.sleep(5000);
	        String projectpath = System.getProperty("user.dir");
	        System.out.println(projectpath);
	        WebElement uploadElement = driver.findElement(By.id("screenshot_post_0"));
	        uploadElement.sendKeys(projectpath +"/src/config/dummy-data/Supermanflying.png");
	        Thread.sleep(5000);
	        js.executeScript("window.scrollBy(0,250)");
	        driver.findElement(By.name("post[0][post_date]")).click();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[1]/td[6]")).click();
	        Thread.sleep(5000);
	        js.executeScript("window.scrollBy(0,250)");
	        driver.findElement(By.name("post[0][metrics][impressions]")).click();
	        Thread.sleep(5000);
	        driver.findElement(By.name("post[0][metrics][impressions]")).sendKeys("1000");
	        Thread.sleep(5000);
	        driver.findElement(By.id("post-0-reach")).sendKeys("999");
	        Thread.sleep(5000);
	        driver.findElement(By.name("post[0][metrics][profile_visits]")).sendKeys("100");
	        Thread.sleep(5000);
	        driver.findElement(By.name("post[0][metrics][follows]")).sendKeys("1000");
	        Thread.sleep(5000);
	        driver.findElement(By.name("post[0][metrics][saves]")).sendKeys("100");
	        Thread.sleep(5000);
	        driver.findElement(By.name("post[0][metrics][shares]")).sendKeys("100");
	        Thread.sleep(5000);
	        driver.findElement(By.name("post[0][metrics][likes_count]")).sendKeys("100");
	        Thread.sleep(5000);
	        driver.findElement(By.name("post[0][metrics][comments_count]")).sendKeys("100");
	        Thread.sleep(5000);
	        driver.findElement(By.name("post[0][metrics][views]")).sendKeys("100");
	        Thread.sleep(5000);
//
//	     //Story
	      String projectpath1 = System.getProperty("user.dir");
	        System.out.println(projectpath1);
	        WebElement uploadElement1 = driver.findElement(By.id("file-upload-stories"));
	        uploadElement1.sendKeys(projectpath1 +"/src/config/dummy-data/Supermanflying.png");
	        Thread.sleep(5000);
	        String projectpath2 = System.getProperty("user.dir");
	        System.out.println(projectpath2);
	        WebElement uploadElement11 = driver.findElement(By.id("file-upload-stories-insights"));
	        uploadElement11.sendKeys(projectpath2 +"/src/config/dummy-data/Supermanflying.png");
	        Thread.sleep(5000);
		driver.findElement(By.name("story[0][post_date]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[1]/td[6]")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("story[0][metrics][impressions]")).sendKeys("1000");
		Thread.sleep(5000);
		driver.findElement(By.name("story[0][metrics][reach]")).sendKeys("999");
		Thread.sleep(5000);
		driver.findElement(By.name("story[0][metrics][link_clicks]")).sendKeys("100");
		Thread.sleep(5000);
		driver.findElement(By.name("story[0][metrics][shares]")).sendKeys("100");
		Thread.sleep(5000);
		driver.findElement(By.name("story[0][metrics][profile_visits]")).sendKeys("100");
		Thread.sleep(5000);
		driver.findElement(By.name("story[0][metrics][sticker_taps]")).sendKeys("100");
		Thread.sleep(5000);
		driver.findElement(By.name("story[0][metrics][follows]")).sendKeys("100");
		Thread.sleep(5000);
		driver.findElement(By.name("story[0][metrics][replies]")).sendKeys("100");
//
//	//reels
		driver.findElement(By.name("reel[0][post_link]")).sendKeys("https://www.instagram.com/reel/CQtvgTXjKnT/");
		Thread.sleep(5000);
		String projectpath21 = System.getProperty("user.dir");
        System.out.println(projectpath21);
        WebElement uploadElement111 = driver.findElement(By.name("reel[screenshot_post][0]"));
        uploadElement111.sendKeys(projectpath1 +"/src/config/dummy-data/Supermanflying.png");
        Thread.sleep(5000);
        driver.findElement(By.name("reel[0][post_date]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[1]/td[6]")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("reel[0][metrics][accountsreached]")).sendKeys("100");
        Thread.sleep(5000);
        driver.findElement(By.name("reel[0][metrics][plays]")).sendKeys("100");
        Thread.sleep(5000);
        driver.findElement(By.name("reel[0][metrics][likes_count]")).sendKeys("100");
        Thread.sleep(5000);
        driver.findElement(By.name("reel[0][metrics][comments_count]")).sendKeys("100");
        Thread.sleep(5000);
        driver.findElement(By.name("reel[0][metrics][shares]")).sendKeys("100");
        Thread.sleep(5000);
        driver.findElement(By.name("reel[0][metrics][saves]")).sendKeys("100");
        Thread.sleep(5000);

//
		//IGTV

        driver.findElement(By.name("igtv[0][post_link]")).sendKeys("https://www.instagram.com/tv/COCd9KXDktW/");
        Thread.sleep(5000);
        String projectpath211 = System.getProperty("user.dir");
        System.out.println(projectpath211);
        WebElement uploadElement1111 = driver.findElement(By.name("igtv[screenshot_post][0]"));
        uploadElement1111.sendKeys(projectpath1 +"/src/config/dummy-data/Supermanflying.png");
        Thread.sleep(5000);
        driver.findElement(By.name("igtv[0][post_date]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[1]/td[6]")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("igtv[0][metrics][impressions]")).sendKeys("1000");
        Thread.sleep(5000);
        driver.findElement(By.name("igtv[0][metrics][reach]")).sendKeys("99");
        Thread.sleep(5000);
        driver.findElement(By.name("igtv[0][metrics][profile_visits]")).sendKeys("100");
        Thread.sleep(5000);
        driver.findElement(By.name("igtv[0][metrics][follows]")).sendKeys("100");
        Thread.sleep(5000);
        driver.findElement(By.name("igtv[0][metrics][likes_count]")).sendKeys("100");
        Thread.sleep(5000);
        driver.findElement(By.name("igtv[0][metrics][comments_count]")).sendKeys("100");
        Thread.sleep(5000);
        driver.findElement(By.name("igtv[0][metrics][saves_count]")).sendKeys("100");
        Thread.sleep(5000);
        driver.findElement(By.name("igtv[0][metrics][shares_count]")).sendKeys("100");
        Thread.sleep(5000);
        driver.findElement(By.name("igtv[0][metrics][views_count]")).sendKeys("100");
        Thread.sleep(5000);
        driver.findElement(By.name("igtv[0][metrics][audiencepercentagewatched_count]")).sendKeys("100");
        Thread.sleep(5000);
          driver.findElement(By.id("submit_text")).click();
	      Thread.sleep(5000);
	      driver.switchTo().window(tabs2.get(0));
	      driver.navigate().refresh();
	      Thread.sleep(5000);
	      driver.findElement(By.xpath("//*[@id=\"rendered_report_list_generated\"]/tr[1]/td[7]/span[1]/i")).click();
	      Thread.sleep(5000);
	      driver.findElement(By.xpath("//*[@id=\"modalRegenerate\"]/div/div/div[3]/button[2]")).click();
	      driver.switchTo().window(tabs2.get(1));
	      driver.close();
	      Thread.sleep(5000);
	      driver.switchTo().window(tabs2.get(0));
	     Thread.sleep(300000);
	     driver.navigate().refresh();
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[7]/span[2]/i[1]")).click();
	     Thread.sleep(5000);
	     String influencer_list= driver.findElement(By.id("influencer_form_list")).getText();
	     boolean influencer_list1= driver.findElement(By.id("influencer_form_list")).isDisplayed();
	     if(influencer_list1==true) {

	    	 System.out.println(influencer_list);

	     }else
	     {

	    	 System.out.println("list not loaded !!!");
	     }
	     //close btn
		driver.findElement(By.xpath("//*[@id=\"influencer_form\"]/div/div/button")).click();
		 driver.navigate().refresh();

	}



	}

