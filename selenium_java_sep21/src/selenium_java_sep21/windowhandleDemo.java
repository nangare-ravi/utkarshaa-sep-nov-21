package selenium_java_sep21;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandleDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//div[contains(text(),'Companies')]")).click();
		
		String MainWindow = driver.getWindowHandle();
		
		Set<String> childwindows = driver.getWindowHandles();
		
		Iterator<String> itr = childwindows.iterator();
		
		while(itr.hasNext()) {
		
			String childwindow = itr.next();
			
			if(!MainWindow.equals(childwindow)) {
				driver.switchTo().window(childwindow);
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(MainWindow);
		//driver.quit();
		driver.close();
	}

}
