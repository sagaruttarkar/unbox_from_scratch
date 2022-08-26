package fluttr;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class flttrScenario1 {
	
	public static WebDriver driver;
	@Test(priority=0,dataProvider="iplist")
	public void load_runner(String ip) throws InterruptedException {
		Proxy proxy = new Proxy();
		proxy.setHttpProxy(ip);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome(); 
		capabilities.setCapability("proxy", proxy);
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("start-maximized"); 

		capabilities.setCapability(ChromeOptions.CAPABILITY, options); 
System.setProperty("webdriver.chrome.driver", "D:\\my workspace\\unbox_scratch_sagar\\Drivers\\chromedriver_v94.exe");
	 driver = new ChromeDriver(capabilities);

		driver.get("https://fluttr.shop/products/rare-beauty-positive-light-tinted-moisturizer");
	System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.quit();
	
		
		
	}
	
    @DataProvider(name="iplist")
    public Object[][] passdata(){
    	//here is first is row nd then col

    	Object[][] data= new Object[58][1];

    	data[0][0]="117.198.97.220:80";
    	data[1][0]="103.174.81.66:8080";
    	data[2][0]="143.244.133.78:80";
    	data[3][0]="182.72.150.242:8080";
    	data[4][0]="27.116.41.156:9898";
    	data[5][0]="103.125.162.134:84";
    	data[6][0]="139.59.6.237:3128";
    	data[7][0]="103.47.66.154:8080";
    	data[8][0]="103.241.182.97:80";
    	data[9][0]="14.140.131.82:3128";
    	data[10][0]="162.144.116.103:80";
    	data[11][0]="140.227.211.47:8080";
    	data[12][0]="173.82.149.243:8080";
    	data[13][0]="47.89.185.178:8888";
    	data[14][0]="23.226.117.66:8080";
    	data[15][0]="173.82.188.82:9090";
    	data[15][0]="117.198.97.220:80";
    	data[16][0]="103.174.81.66:8080";
    	data[17][0]="143.244.133.78:80";
    	data[18][0]="182.72.150.242:8080";
    	data[19][0]="27.116.41.156:9898";
    	data[21][0]="103.125.162.134:84";
    	data[20][0]="139.59.6.237:3128";
    	data[23][0]="103.47.66.154:8080";
    	data[24][0]="103.241.182.97:80";
    	data[21][0]="14.140.131.82:3128";
    	data[22][0]="162.144.116.103:80";
    	data[23][0]="140.227.211.47:8080";
    	data[28][0]="173.82.149.243:8080";
    	data[24][0]="47.89.185.178:8888";
    	data[25][0]="23.226.117.66:8080";
    	data[26][0]="173.82.188.82:9090";
    	data[32][0]="117.198.97.220:80";
    	data[27][0]="103.174.81.66:8080";
    	data[28][0]="143.244.133.78:80";
    	data[29][0]="182.72.150.242:8080";
    	data[30][0]="27.116.41.156:9898";
    	data[31][0]="103.125.162.134:84";
    	data[32][0]="139.59.6.237:3128";
    	data[33][0]="103.47.66.154:8080";
    	data[34][0]="103.241.182.97:80";
    	data[35][0]="14.140.131.82:3128";
    	data[36][0]="162.144.116.103:80";
    	data[37][0]="140.227.211.47:8080";
    	data[38][0]="173.82.149.243:8080";
    	data[39][0]="47.89.185.178:8888";
    	data[40][0]="23.226.117.66:8080";
    	data[41][0]="173.82.188.82:9090";
    	data[42][0]="117.198.97.220:80";
    	data[43][0]="103.174.81.66:8080";
    	data[44][0]="143.244.133.78:80";
    	data[45][0]="182.72.150.242:8080";
    	data[46][0]="27.116.41.156:9898";
    	data[47][0]="103.125.162.134:84";
    	data[48][0]="139.59.6.237:3128";
    	data[49][0]="103.47.66.154:8080";
    	data[50][0]="103.241.182.97:80";
    	data[51][0]="14.140.131.82:3128";
    	data[52][0]="162.144.116.103:80";
    	data[53][0]="140.227.211.47:8080";
    	data[54][0]="173.82.149.243:8080";
    	data[55][0]="47.89.185.178:8888";
    	data[56][0]="23.226.117.66:8080";
    	data[57][0]="173.82.188.82:9090";
    	
    	return data;

}
    
}