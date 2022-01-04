package selenium_java_sep21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launch_firefox {

	public static void main(String[] args) {


		System.setProperty("webdriver.gecko.driver", "D://geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.navigate().to("https://www.google.com");
		
		String ZerodhaURL = "https://kite.zerodha.com";
		
		driver.navigate().to(ZerodhaURL);
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();

		driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("XA0634");
	}

}
