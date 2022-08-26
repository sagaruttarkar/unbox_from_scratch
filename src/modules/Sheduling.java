package modules;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.Base_app;

public class Sheduling extends  Base_app{


	@FindBy(xpath="//*[@id=\"main-menu-wrapper\"]/ul/li[5]/a")
	WebElement sheduling;

	@FindBy(xpath="//button[normalize-space()='list']")
	WebElement List;

	@FindBy(xpath="//*[@id=\"calendar\"]/div[3]")
	WebElement List_calender;

	@FindBy(xpath="//button[normalize-space()='week']")
	WebElement Weeks;

	@FindBy(xpath="//*[@id=\"calendar\"]/div[2]")
	WebElement Weeks_calender;

	@FindBy(xpath="//button[normalize-space()='month']")
	WebElement Months;

	@FindBy(xpath="//div[@class='fc-view fc-month-view fc-basic-view']")
	WebElement Calender;


	public  Sheduling() {

		PageFactory.initElements(driver, this);
}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, 1800);


public void Filtter_Result_week_list_month() throws InterruptedException {
	Thread.sleep(5000);
	sheduling.click();
	Thread.sleep(4000);
	List.click();
String List1 =	List_calender.getText();
System.out.println(List1);
Thread.sleep(4000);
Weeks.click();
String Weeks1 =Weeks_calender.getText();
System.out.println(Weeks1);
Months.click();
String months1 =Weeks_calender.getText();
System.out.println(months1);







}


}