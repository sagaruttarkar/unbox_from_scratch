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

public class Testcase_Analytics_Clickable_graphs  extends Base_app{

	modules.Analytics analytics;
	Testutils testutils;



	public Testcase_Analytics_Clickable_graphs() {

		super();

	}

	@BeforeMethod
	public void setup() throws IOException, AWTException, InterruptedException {

	Base_app.initialization();
	analytics = new Analytics();

	}



	@Test(priority=1)
	public void Testcases_clickable_graphs_best_time_to_post_ig() throws InterruptedException {


        analytics.Clickable_Graphs_best_time_to_post_ig();
		System.out.println("yes");
	}

	@Test(priority=2)
	public void Testcases_clickable_graphs_recommanded_post_to_promote_ig() throws InterruptedException {


        analytics.Clickable_Graphs_Recommanded_post_to_promote_ig();
		System.out.println("yes");
	}

	@Test(priority=3)
	public void Testcases_clickable_graphs_TopHashTag_ig() throws InterruptedException {


        analytics.Clickable_Graphs_Top_Hash_Tag_ig();
		System.out.println("yes");
	}
	@Test(priority=4)
	public void Testcases_clickable_graphs_recommanded_post_to_promote_fb() throws InterruptedException {


        analytics.Clickable_Graphs_Recommanded_post_to_promote_fb();
		System.out.println("yes");
	}

	@Test(priority=5)
	public void Testcases_clickable_graphs_Most_Engaging_tweets_TW() throws InterruptedException {


        analytics.Clickable_Graphs_Most_Engaging_Tweets_TW();
		System.out.println("yes");
	}

	@Test(priority=6)
	public void Testcases_clickable_graphs_Most_Engaging_posts_YT() throws InterruptedException {
     analytics.Clickable_Graphs_Most_Engaging_post_YT();
		System.out.println("yes");
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