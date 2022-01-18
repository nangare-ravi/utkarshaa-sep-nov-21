package com.mycompany.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowserTest {
public WebDriver driver;
	@Parameters("browser")
	
	@BeforeClass
	public void BeforeTest(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edge.driver", "D://msedgedriver.exe");
		driver = new EdgeDriver();
		
	}
		driver.get("https://kite.zerodha.com");
}
	@Test
	public void LoginTest()
	{
		driver.findElement(By.id("userid")).sendKeys("XA0634");
		driver.findElement(By.id("password")).sendKeys("12345676543");
		driver.findElement(By.tagName("button")).click();
	}
	@AfterClass
	public void AfterTest()
	{
		driver.close();
	}
}