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

public class Testcases_demo_Accounts_verification  extends Base_app{

	modules.Analytics analytics;
	Testutils testutils;



	public Testcases_demo_Accounts_verification() {

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


	@AfterMethod
	public void teardown() throws InterruptedException {
	                        Thread.sleep(2000);
							driver.findElement(By.xpath("/html/body/div[3]/div[1]/div")).click();
							Thread.sleep(2000);
							driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/a")).click();
							driver.close();

					}
}