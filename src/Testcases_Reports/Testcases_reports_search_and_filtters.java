package Testcases_Reports;
import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestBase.Base_app;
import Utils.Testutils;
import modules.Reports;

public class Testcases_reports_search_and_filtters extends Base_app{

	modules.Reports reps;
	Testutils testutils;

	public Testcases_reports_search_and_filtters() {

		super();

	}

	@BeforeMethod
	public void setup() throws IOException, AWTException, InterruptedException {

	Base_app.initialization();
	reps = new Reports();

	}



//////////////////////influencer_camping/////////



	@Test(priority=11)
	public void Testcases_all_reports() throws InterruptedException {

		reps.All_reports();
	}

	@Test(priority=12)

	public void Testcases_all_reports_search() throws InterruptedException {

		reps.All_Reports_search();
	}



	@Test(priority=13)

	public void Testcases_instagram_report_fillter() throws InterruptedException {

		reps.instagram_Report_Filtter();


	}
	@Test(priority=14)

	public void Testcases_facebook_report_fillter() throws InterruptedException {

		reps.facebook_Report_Filtter();


	}
	@Test(priority=15)

	public void Testcases_tweeter_report_fillter() throws InterruptedException {

		reps.tweeter_Report_Filtter();


	}
	@Test(priority=16)

	public void Testcases_youtube_report_fillter() throws InterruptedException {

		reps.youtube_Report_Filtter();


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
