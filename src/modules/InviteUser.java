package modules;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.Base_app;

public class InviteUser extends Base_app {

	@FindBy(xpath="//img[@src='https://app.unboxsocial.com/public/images/sidebar-icons/inviteuser.svg ']")
	WebElement invite_user;

	@FindBy(xpath="(//i[contains(@class,'add_acc_plus')])[1]")
	WebElement plus_icon;

	@FindBy(xpath="//img[@class='list-search-icon search-anywhere-in-page']")
	WebElement search_icon;

	@FindBy(xpath="//input[@name='serach-post']")
	WebElement Search_input;


	@FindBy(xpath="//input[@id='user_name']")
	WebElement name;

	@FindBy(xpath="//input[@id='user_email']")
	WebElement Email;

	@FindBy(id="admin")
	WebElement admin;

	@FindBy(id="editor")
	WebElement editor;

	@FindBy(id="guest")
	WebElement guest;

	@FindBy(xpath="//button[@id='saveinviteUser']")
	WebElement invite_btn;

	@FindBy(xpath="//div[@class='col-md-12 inviteuser_main']//button[@class='btn btn-wire-white done-user'][normalize-space()='Dismiss']")
    WebElement dismiss;

	@FindBy(xpath="//img[@class='trash-icon del-user']")
     WebElement Delete_user;

	@FindBy(xpath="//button[normalize-space()='Delete']")
    WebElement common_delete;

	public InviteUser() {

		PageFactory.initElements(driver, this);

	}

	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebDriverWait wait = new WebDriverWait(driver, 1000);

	public void TestsearchFiltters() throws InterruptedException {
		invite_user.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-md-12 empty_state grid-fit-screen-pages']")));
		search_icon.click();
		Search_input.sendKeys("sagar");
		Thread.sleep(5000);
   String Result = driver.findElement(By.className("all-users")).getText();
   System.out.println(Result);
			}

public void TestCase_add_admin() throws InterruptedException {
	invite_user.click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("all-users")));
	plus_icon.click();
	name.sendKeys("sagartest");
	Random random = new Random();
	String list_name = "Test" + random.nextInt() + "@gmail.com";
	Email.sendKeys(list_name);
	admin.click();
	Thread.sleep(2000);
	invite_btn.click();
	Thread.sleep(5000);
	dismiss.click();
	search_icon.click();
	Search_input.sendKeys("sagartest");
	Thread.sleep(5000);
	Delete_user.click();
	Thread.sleep(2000);
	common_delete.click();
	Thread.sleep(2000);
	driver.navigate().refresh();


}

public void TestCase_add_Editor() throws InterruptedException {
	invite_user.click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("all-users")));
	plus_icon.click();
	name.sendKeys("sagartest");
	Random random = new Random();
	String list_name = "Test" + random.nextInt() + "@gmail.com";
	Email.sendKeys(list_name);
	editor.click();
	Thread.sleep(2000);
	invite_btn.click();
	Thread.sleep(5000);
	dismiss.click();
	search_icon.click();
	Search_input.sendKeys("sagartest");
	Thread.sleep(5000);
	Delete_user.click();
	Thread.sleep(2000);
	common_delete.click();
	Thread.sleep(2000);
	driver.navigate().refresh();

}
public void TestCase_add_Guest() throws InterruptedException {
	invite_user.click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("all-users")));
	plus_icon.click();
	name.sendKeys("sagartest");
	Random random = new Random();
	String list_name = "Test" + random.nextInt() + "@gmail.com";
	Email.sendKeys(list_name);
	guest.click();
	Thread.sleep(2000);
	invite_btn.click();
	Thread.sleep(5000);
	dismiss.click();
	search_icon.click();
	Search_input.sendKeys("sagartest");
	Thread.sleep(5000);
	Delete_user.click();
	Thread.sleep(2000);
	common_delete.click();
	Thread.sleep(2000);
	driver.navigate().refresh();


}
}