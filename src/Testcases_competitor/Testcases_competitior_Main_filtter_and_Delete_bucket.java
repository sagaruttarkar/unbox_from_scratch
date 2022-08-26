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

public class Testcases_competitior_Main_filtter_and_Delete_bucket extends Base_app {

	modules.Competitor comp;
	Testutils testutils;

	public Testcases_competitior_Main_filtter_and_Delete_bucket() {

		super();

	}

	@BeforeMethod
	public void setup() throws IOException, AWTException, InterruptedException {

	Base_app.initialization();
	comp = new Competitor();

	}



	@Test(priority=1)
  public void Testcase_competition_fillter_FB() throws InterruptedException {



			comp.Testcases_main_competition_fillter_FB();

		}
	@Test(priority=2)
	  public void Testcase_competition_fillter_TW() throws InterruptedException {



				comp.Testcases_main_competition_fillter_TW();

			}
	@Test(priority=3)
	  public void Testcase_competition_fillter_YT() throws InterruptedException {



				comp.Testcases_main_competition_fillter_YT();

			}
	@Test(priority=4)
	  public void Testcase_competition_fillter_IG() throws InterruptedException {



				comp.Testcases_main_competition_fillter_IG();

			}

//	@Test(priority=5)
//	  public void Testcase_competition_Account_delete() throws InterruptedException {
//
//
//
//				comp.Testcases_delete_account_competion();
//
//			}

@AfterMethod
	public void teardown() throws InterruptedException {
		    Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[3]/div[1]/div")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/a")).click();
			driver.close();


		}

}