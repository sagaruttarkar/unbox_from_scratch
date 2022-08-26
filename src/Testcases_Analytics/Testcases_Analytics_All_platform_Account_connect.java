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

public class Testcases_Analytics_All_platform_Account_connect  extends Base_app{

	modules.Analytics analytics;
	Testutils testutils;



	public Testcases_Analytics_All_platform_Account_connect() {

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

//  @Test(priority=1)
//	public void Testcase_Anayltics_add_client_account_Youtube() throws InterruptedException {
//
//
//         analytics.Add_First_Account_youtube();
//		System.out.println("sucsessfully account added !!");
//
//    }
//	@Test(priority=2)
//	public void Testcase_Anayltics_add_client_account_Youtube_Delete() throws InterruptedException {
//
//
//       analytics.Delete_Account_all();
//		System.out.println("sucsessfully account added !");
//	}

//
/////////////////////////////////////////////////////////facebook/////////////////////////////////////////
@Test(priority=3)

	public void Testcase_Anayltics_add_client_Account_Facebook() throws InterruptedException {

		 analytics.Add_first_Account_Facebook();
		System.out.println("sucsessfully account added ");

	}
//@Test(priority=4)
//public void Testcase_Anayltics_add_client_account_Facebook_Delete() throws InterruptedException {
//
//
//   analytics.Delete_Account_all();
//	System.out.println("sucsessfully account added !");
//}
//
//  @Test(priority=5)
//
//	public void Testcase_Anayltics_add_trials_Account_Facebook() throws InterruptedException {
//
//		 analytics.Add_second_Account_Facebook();
//		System.out.println("sucsessfully account added !");
//	}
//
//	@Test(priority=6)
//	public void Testcase_Anayltics_add_trials_Account_Facebook_delete1() throws InterruptedException {
//
//
//     analytics.Delete_Account_all();
//		System.out.println("sucsessfully account added !");
//	}

////////////////// //////////////////////   /// tweeter/////////////////////////////////////////////////////////
//////
//@Test(priority=7)
//	public void Testcase_Anayltics_Add_clients_Account_Twitter() throws InterruptedException {
//
//
//         analyssssssstics.Add_first_Account_Twitter();
//		System.out.println("sucsessfully account added!!");
//	}
//
//@Test(priority=8)
//public void Testcase_Anayltics_add_trials_Account_Facebook_delete11() throws InterruptedException {
//
//
// analytics.Delete_Account_all();
//	System.out.println("sucsessfully account added !");
//}

///////////////////////////////////////////////////instagram//////////////////////////////////////
//	@Test(priority=9)
//	public void Testcase_Anayltics_Add_clients_Account_Instagram() throws InterruptedException {
//
//
//         analytics.Add_first_Account_Instagram();
//		System.out.println("sucsessfully account added !!");
//	}
//	@Test(priority=10)
//	public void Testcase_Anayltics_add_trials_Account_Facebook_delete() throws InterruptedException {
//
//
//     analytics.Delete_Account_all();
//		System.out.println("sucsessfully account added !");
//	}
//
//	@Test(priority=11)
//	public void Testcase_Anayltics_Add_trials_Account_Instagram() throws InterruptedException {
//
//
//         analytics.Add_second_Account_Instagram();
//		System.out.println("sucsessfully account added !");
//	}
//
//	@Test(priority=12)
//	public void Testcase_Delete_all_accounts() throws InterruptedException {
//
//
//         analytics.Delete_Account_all();
//		System.out.println("sucsessfully account added !");
//	}
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