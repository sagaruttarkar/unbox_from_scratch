package Testcases_competitor;
import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestBase.Base_app;
import Utils.Testutils;
import modules.Competitor;

public class Testcases_competitor_All_platform_bucket_creation extends Base_app {

	modules.Competitor comp;
	Testutils testutils;

	public Testcases_competitor_All_platform_bucket_creation() {

		super();

	}

	@BeforeMethod
	public void setup() throws IOException, AWTException, InterruptedException {

	Base_app.initialization();
	comp = new Competitor();

	}

	@Test(priority=1)
	public void Testcases_competitors_create_bucket_IG() throws InterruptedException {

		comp.Testcase_add_list_compitetor_instagram(prop.getProperty("I1"),prop.getProperty("I2"),prop.getProperty("I3"),prop.getProperty("I4"),prop.getProperty("I5"),prop.getProperty("I6"),prop.getProperty("I7"),prop.getProperty("I8"),prop.getProperty("I9"),prop.getProperty("I10"));
	}
	@Test(priority=2)
	public void Testcases_competitors_create_bucket_FB() throws InterruptedException {


		comp.Testcase_add_list_compitetor_Facebook(prop.getProperty("F1"),prop.getProperty("F2"),prop.getProperty("F3"),prop.getProperty("F4"),prop.getProperty("F5"),prop.getProperty("F6"),prop.getProperty("F7"),prop.getProperty("F8"),prop.getProperty("F9"),prop.getProperty("F10"));

	}
	@Test(priority=3)
	public void Testcases_competitors_create_bucket_TW() throws InterruptedException {


		comp.Tescase_add_list_compitetor_Twitter(prop.getProperty("T1"),prop.getProperty("T2"),prop.getProperty("T3"),prop.getProperty("T4"),prop.getProperty("T5"),prop.getProperty("T6"),prop.getProperty("T7"),prop.getProperty("T8"),prop.getProperty("T9"),prop.getProperty("T10"));
}


	@Test(priority=4)
	public void Testcases_competitors_create_bucket_YT() throws InterruptedException {


		comp.Tescase_add_list_compitetor_Youtube(prop.getProperty("Y1"),prop.getProperty("Y2"),prop.getProperty("Y3"),prop.getProperty("Y4"),prop.getProperty("Y5"),prop.getProperty("Y6"),prop.getProperty("Y7"),prop.getProperty("Y8"),prop.getProperty("Y9"),prop.getProperty("Y10"));

}
//


@AfterMethod
	public void teardown() throws InterruptedException {
		    Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[3]/div[1]/div")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/a")).click();
			driver.close();


		}

}