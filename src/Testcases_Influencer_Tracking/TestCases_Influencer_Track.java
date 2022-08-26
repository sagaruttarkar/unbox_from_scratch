package Testcases_Influencer_Tracking;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestBase.base_app1;
import Utils.Testutils;
import modules.Influencer_tracking;




	public class TestCases_Influencer_Track extends base_app1{


		Influencer_tracking influencer_track;
		Testutils testutils;



		public TestCases_Influencer_Track () {

			super();

		}

		@BeforeMethod
		public void setup() throws IOException, AWTException, InterruptedException {

		base_app1.initialization();
		influencer_track = new Influencer_tracking();

		}
	   @Test(priority=1)
		public void Testcases_Handle_IG_add_and_delete() throws InterruptedException {


			influencer_track.Testcase_Influencer_tracking_IG_search_suggestion(prop.getProperty("handlename"));

		}

		@Test(priority=2)
		public void Testcases_influencer_tracking_IG_metrics_validation() throws InterruptedException, AWTException {


			influencer_track.Testcase_IG_metrics_vadlidation(prop.getProperty("handlename"));

		}

		@Test(priority=3)
		public void Testcases_influencer_tracking_TW_metrics_validation() throws InterruptedException, AWTException {


			influencer_track.Testcase_TW_metrics_vadlidation(prop.getProperty("TW_handlename"));
		}

		@Test(priority=4)
		public void Testcases_influencer_tracking_YT_metrics_validation() throws InterruptedException, AWTException {


			influencer_track.Testcase_YT_metrics_vadlidation(prop.getProperty("YT_handlename"));
		}

		@Test(priority=5)
		public void Testcases_influencer_tracking_manually_add_influencer() throws InterruptedException, AWTException {


			influencer_track.Testcases_add_manually_influencer_tracking(prop.getProperty("handlename"));
		}


		@AfterMethod
		public void teardown() throws InterruptedException {
               driver.navigate().refresh();
		     	Thread.sleep(4000);
				driver.findElement(By.xpath("/html/body/div[3]/div[1]/div")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/a")).click();
				driver.close();

			}


}
