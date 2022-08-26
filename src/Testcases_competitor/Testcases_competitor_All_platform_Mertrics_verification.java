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

public class Testcases_competitor_All_platform_Mertrics_verification extends Base_app {

	modules.Competitor comp;
	Testutils testutils;

	public Testcases_competitor_All_platform_Mertrics_verification() {

		super();

	}

	@BeforeMethod
	public void setup() throws IOException, AWTException, InterruptedException {

	Base_app.initialization();
	comp = new Competitor();

	}

  @Test(priority=1)
  public void Testcase_competition_all_matrics_IG() throws InterruptedException {


		comp.instagram_content_tab_data(prop.getProperty("Instagram_data"));
}

   @Test(priority=2)
   public void Testcase_competition_all_matrics_FB() throws InterruptedException {


		comp.Facebook_content_tab_data(prop.getProperty("Facebook_data"));
	}
//
   @Test(priority=3)
   public void Testcase_competition_all_matrics_TW() throws InterruptedException {



			comp.Twitter_content_tab_data(prop.getProperty("Twitter_data"));

	}
   @Test(priority=4)
   public void Testcase_competition_all_matrics_YT() throws InterruptedException {

			comp.youtube_content_tab_data(prop.getProperty("Youtube_data"));

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