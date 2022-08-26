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

public class Testcases_Analytics_All_platform_Account_Reconnect  extends Base_app{

	modules.Analytics analytics;
	Testutils testutils;



	public Testcases_Analytics_All_platform_Account_Reconnect() {

		super();

	}

	@BeforeMethod
	public void setup() throws IOException, AWTException, InterruptedException {

	Base_app.initialization();
	analytics = new Analytics();

	}

   @Test(priority=1)
	public void Testcase_Anayltics_Reconnect_Account_Facebook() throws InterruptedException {


		analytics.Add_Reconnect_Account_Facebook();
		System.out.println("sucsessfully added and Deleted!!");
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


