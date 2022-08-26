package Testcases_Analytics;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestBase.Base_app;
import Utils.Testutils;
import modules.Analytics;

public class Testcase_Analytics_All_platform_Metrics_verification  extends Base_app{

	modules.Analytics analytics;
	Testutils testutils;



	public Testcase_Analytics_All_platform_Metrics_verification() {

		super();

	}



	@BeforeMethod
	public  void setup() throws IOException, AWTException, InterruptedException {
	Base_app.initialization();
	analytics = new Analytics();

	}

  @Test(priority=1)
	public void Testcase_Anayltics_facebook_clients_matrics() throws InterruptedException {


         analytics.Testcase_verify_Matrics_facbook_clients_account();
		System.out.println("sucsessfully check all clients metrics Facebook");
	}

  @Test(priority=2)
	public void Testcase_Anayltics_facebook_trial_matrics() throws InterruptedException {


         analytics.Testcase_verify_Matrics_facbook_trial_account();
        System.out.println("sucsessfully check all trials metrics Facebook");
	}

	@Test(priority=3)
	public void Testcase_Anayltics_instagram_clients_matrics() throws InterruptedException {
         analytics.Testcase_verify_Matrics_instagram_clients_account();
		System.out.println(	"sucsessfully clients Instagram");
	}
	@Test(priority=4)
	public void Testcase_Anayltics_instagram_trials_matrics() throws InterruptedException {


         analytics.Testcase_verify_Matrics_instagram_trials_account();
		System.out.println(	"sucsessfully trials Instagram");


	}
	@Test(priority=5)
	public void Testcase_Anayltics_Twitter_clients_matrics() throws InterruptedException {


         analytics.Testcase_verify_Matrics_twitter_clients_account();
		System.out.println("sucsessfully  clients Twitter");
	}

	@Test(priority=6)
	public void Testcase_Anayltics_Twitter_trials_matrics() throws InterruptedException {


         analytics.Testcase_verify_Matrics_twitter_trials_account();
		System.out.println("sucsessfully trialls  Twitter");
	}

	@Test(priority=7)
	public void Testcase_Anayltics_Youtube_clients_matrics() throws InterruptedException {


         analytics.Testcase_verify_Matrics_youtube_clients_account();
		System.out.println("sucsessfully clients metrics Youtube");
	}

	@Test(priority=8)
	public void Testcase_Anayltics_Youtube_trials_matrics() throws InterruptedException {


         analytics.Testcase_verify_Matrics_youtube_trials_account();
		System.out.println("sucsessfully trials metrics  Youtube");
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