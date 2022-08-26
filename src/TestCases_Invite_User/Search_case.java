package TestCases_Invite_User;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestBase.Base_app;
import Utils.Testutils;
import modules.InviteUser;

public class Search_case  extends Base_app{
	Testutils testutils;
	InviteUser invite_user;


	public Search_case() {

		super();

	}

	@BeforeMethod
	public void setup() throws IOException, AWTException, InterruptedException {

	Base_app.initialization();
	invite_user = new InviteUser();

	}

	@Test(priority=1)
	public void Testcases_search_filtters() throws InterruptedException {

		invite_user.TestsearchFiltters();
	}

	@Test(priority=2)
public void Testcases_add_as_admin() throws InterruptedException {

		invite_user.TestCase_add_admin();

	}
	@Test(priority=3)
	public void Testcases_add_as_Editor() throws InterruptedException {

		invite_user.TestCase_add_Editor();

	}
	@Test(priority=4)
	public void Testcases_add_as_guest() throws InterruptedException {

		invite_user.TestCase_add_Guest();

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
