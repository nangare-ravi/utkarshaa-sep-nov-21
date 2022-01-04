package selenium_java_sep21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class launch_edge {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		
		driver.navigate().to("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		//driver.close();
	}
}
