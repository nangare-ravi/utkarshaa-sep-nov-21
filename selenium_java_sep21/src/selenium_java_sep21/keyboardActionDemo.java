package selenium_java_sep21;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardActionDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		
		driver.findElement(By.xpath("//a[@id='close-fixedban']")).click();
		
		WebElement UserName = driver.findElement(By.xpath("//input[@id='userName']"));
		WebElement SubmitBtn = driver.findElement(By.xpath("//button[@id='submit']"));
	
		actions.sendKeys(UserName, "Ravi Nangare").perform();
		actions.sendKeys(Keys.TAB);
		actions.build().perform();
		actions.sendKeys("ravinangre@gmail.com").perform();
		actions.sendKeys(Keys.TAB);
		actions.build().perform();
		actions.sendKeys("At Post Lokhandi Sawargaon Tal Ambajogai").perform();
		
		// current address select using Ctrl + a
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("a");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		
		// current address Copy
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("c");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		
		// Tab key
		actions.sendKeys(Keys.TAB);
		actions.build().perform();
		
		// paste address in Permenant address
		
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("v");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		
		// Tab key
		actions.sendKeys(Keys.TAB).click(SubmitBtn).build().perform();	
	}

}
