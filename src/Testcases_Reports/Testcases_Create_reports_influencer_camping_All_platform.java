package Testcases_Reports;
import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestBase.Base_app;
import Utils.Testutils;
import modules.Reports;

public class Testcases_Create_reports_influencer_camping_All_platform extends Base_app{

	modules.Reports reps;
	Testutils testutils;

	public Testcases_Create_reports_influencer_camping_All_platform() {

		super();

	}

	@BeforeMethod
	public void setup() throws IOException, AWTException, InterruptedException {

	Base_app.initialization();
	reps = new Reports();

	}


/////////////////////////////influencer_camping/////////

@Test(priority=1)
public void Testcase_create_influencer_camping_reports_instagram_single_hashtag() throws InterruptedException {


	reps.Reports_create_influencer_camping_instagram();
}

@Test(priority=2)

public void Testcase_create_influencer_camping_reports_youtube() throws InterruptedException {


	reps.Reports_create_influencer_camping_youtube();
}

@Test(priority=3)
public void Testcase_create_influencer_camping_reports_Twitter() throws InterruptedException {


	reps.Reports_create_influencer_camping_twitter();
}
@Test(priority=4)
public void Testcase_create_influencer_camping_reports_ig_yt_tw() throws InterruptedException {


	reps.Reports_create_influencer_camping_instagram_and_youtube_and_twitter();
}


@Test(priority=5)

public void Testcase_create_influencer_camping_reports_instagram_and_youtube() throws InterruptedException {


	reps.Reports_create_influencer_camping_instagram_and_youtube();

}

 @Test(priority=6)
	public void Testcases_Reports_StoryForm_instagram() throws InterruptedException, HeadlessException, UnsupportedFlavorException, IOException {

		reps.Report_instagram_StoryForm_check();
	}
//


	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div")).isEnabled();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/a")).click();
		driver.close();

	}


}
