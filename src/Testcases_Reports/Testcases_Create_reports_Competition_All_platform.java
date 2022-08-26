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

public class Testcases_Create_reports_Competition_All_platform extends Base_app{

	modules.Reports reps;
	Testutils testutils;

	public Testcases_Create_reports_Competition_All_platform() {

		super();

	}

	@BeforeMethod
	public void setup() throws IOException, AWTException, InterruptedException {

	Base_app.initialization();
	reps = new Reports();

	}


////	////competitors////

	@Test(priority=1)
     public void Testcase_create_compitetors_report_instagram1() throws InterruptedException  {
		reps.Reports_add_comp_insta();
		System.out.println("sucsessfully genrate report instagram  into bucket");

	}

	@Test(priority=2)
    public void Testcase_create_compitetors_report_Facebook2() throws InterruptedException  {
		reps.Reports_add_comp_fb();
		System.out.println("sucsessfully genrate report facebook  into bucket");

	}

	@Test(priority=3)
    public void Testcase_create_compitetors_report_twitter3() throws InterruptedException  {
		reps.Reports_add_comp_twitter();
		System.out.println("sucsessfully genrate report twitter  into bucket");

	}

	@Test(priority=4)
    public void Testcase_create_compitetors_report_youtube4() throws InterruptedException  {
		reps.Reports_add_comp_youtube();
		System.out.println("sucsessfully genrate report youtube  into bucket");

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
