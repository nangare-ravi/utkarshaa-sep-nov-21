package selenium_java_sep21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromProperties {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream("D:\\selenium_java_sep21\\data.properties");
		Properties prop = new Properties();
		prop.load(file);
		
		System.setProperty("webdriver.chrome.driver", prop.getProperty("driverpath"));
		WebDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	}

}
