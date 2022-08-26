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

public class Testcases_influencer_suite_campings extends Base_app {


	modules.Influncer_suite influencer;
	Testutils testutils;



	public Testcases_influencer_suite_campings () {

		super();

	}

	@BeforeMethod
	public void setup() throws IOException, AWTException, InterruptedException {

	Base_app.initialization();
	influencer = new Influncer_suite();

	}
	@Test(priority=1)
	public void Testcases_craete_campings_youtube() throws InterruptedException {


		influencer.create_campings_youtube();

	}

	@Test(priority=2)
	public void Testcases_craete_campings_instagram() throws InterruptedException {


		influencer.create_campings_instagram();

	}

	@Test(priority=3)
	public void Testcases_craete_campings_verify_martics() throws InterruptedException {


		influencer.campings_verify_matrics();
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
