package Testcases_Influencer_suite;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestBase.Base_app;
import Utils.Testutils;
import modules.Influncer_suite;


public class Testcases_influencer_suite_List extends Base_app {


	modules.Influncer_suite influencer;
	Testutils testutils;



	public Testcases_influencer_suite_List() {

		super();

	}

	@BeforeMethod
	public void setup() throws IOException, AWTException, InterruptedException {

	Base_app.initialization();
	influencer = new Influncer_suite();

	}


	@Test(priority=1)
	public void Testcases_curate_list_filters() throws InterruptedException {


		influencer.curated_list_Filters();


	}

	@Test(priority=2)
	public void Testcases_add_List_curate() throws InterruptedException {


		influencer.Add_to_curate_list();
	}

	@Test(priority=3)
	public void Testcases_search_edit_delete() throws InterruptedException {


		influencer.Search_delete();
	}

	@Test(priority=4)
	public void Testcase_linfluencer_main() throws InterruptedException {


		influencer.influence_list_matrics();
	}

	@Test(priority=5)
	public void Testcases_influencer_smart_search_instagram() throws InterruptedException {

		influencer.influencer_smart_search_instagaram();
	}

	@Test(priority=6)
	public void Testcases_influencer_smart_search_youtube() throws InterruptedException {

		influencer.influencer_smart_search_youtube();
	}


	@Test(priority=10)
	public void Testcases_influencer_smart_search_Twitter() throws InterruptedException {

		influencer.smart_search_twitter();
	}

	@Test(priority=7)
	public void Testcases_Advance_fillter_Testing_Instagram() throws InterruptedException {

		influencer.Advance_filtter_Testing_Instagram();


	}

	@Test(priority=8)
	public void Testcases_Advance_fillter_Testing_Youtube() throws InterruptedException {

		influencer.Advance_filtter_Testing_Youtube();



	}
	@Test(priority=9)
	public void Testcases_view_summery_curate_cards() throws InterruptedException {

		influencer.view_summery_campings();



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



