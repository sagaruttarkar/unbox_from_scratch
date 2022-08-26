package Testcases_Reports;
import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestBase.base_app1;
import Utils.Testutils;
import modules.Reports_influencer_tracking_and_Brand_safty;

public class Testcases_create_report_infltracking_brand_safty extends base_app1{

	modules.Reports_influencer_tracking_and_Brand_safty reps_influ;
	Testutils testutils;

	public Testcases_create_report_infltracking_brand_safty() {

		super();

	}

	@BeforeMethod
	public void setup() throws IOException, AWTException, InterruptedException {

	base_app1.initialization();
	reps_influ = new Reports_influencer_tracking_and_Brand_safty();

	}

	@Test(priority=1)
	public void Testcase_Create_report_brand_safty() throws InterruptedException {


		reps_influ.Testcases_brand_safty_export();
		System.out.println("sucsessfully genrate brand safty report");
	}

	@Test(priority=2)
	public void Testcases_brand_safty() throws InterruptedException {

	reps_influ.brand_safty();


	}
//
//	@Test(priority=3)
//	public void Testcases_Export_reports_influencer_tracking() throws InterruptedException {
//
//	reps_influ.Testcases_Influencer_tracking_camping();
//
//
//	}



	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/a")).click();
		driver.close();

	}

}
