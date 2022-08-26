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

public class Testcases_Analytics_Demo_Account_verification  extends Base_app{

	modules.Analytics analytics;
	Testutils testutils;



	public Testcases_Analytics_Demo_Account_verification() {

		super();

	}

	@BeforeMethod
	public void setup() throws IOException, AWTException, InterruptedException {

	Base_app.initialization();
	analytics = new Analytics();

	}
//

//

	 // youtube////////////////////////////////////////////////////////////////

    @Test(priority=1)
	public void Testcase_Anayltics_add_Demo_account_IG() throws InterruptedException {


         analytics.Testcase_Analytics_demo_account__ig();
		System.out.println("sucsessfully verify Demo account  !!");

    }

    @Test(priority=2)
	public void Testcase_Anayltics_add_Demo_account_FB() throws InterruptedException {


         analytics.Testcase_Analytics_Demo_Account_FB();
		System.out.println("sucsessfully verify Demo account  !!");

    }

    @Test(priority=3)
 	public void Testcase_Anayltics_add_Demo_account_TW() throws InterruptedException {


          analytics.Testcases_demo_Account_TW();
 		System.out.println("sucsessfully verify Demo account  !!");

     }

    @Test(priority=4)
 	public void Testcase_Anayltics_add_Demo_account_YT() throws InterruptedException {


          analytics.Testcases_Demo_Account_YT();
 		System.out.println("sucsessfully verify Demo account  !!");

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