package selenium_java_sep21;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class launch_chrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//*[@name='login']//preceding::input[4]"));
		
		WebElement Password = driver.findElement(By.xpath("//*[@name='login']//preceding::input[3]"));
		
	    WebElement LoginBtn = driver.findElement(By.xpath("//button[text()='Log In']"));
		
		WebElement CreatenewAcc = driver.findElement(By.xpath("//*[@class='_6ltg']//following-sibling::div[3]//a"));
		
		List<WebElement> image = driver.findElements(By.tagName("img"));
		
		List<WebElement> FacebookLinks = driver.findElements(By.xpath("//a[contains(text(),'Facebook')]"));
		//button[starts-with(@id,'u_0_d')]tains(@href,'/recover/initiate/')]"));
		
		WebElement ForgotPassword = driver.findElement(By.xpath("//*[@class='_6ltg']//following-sibling::div[1]"));
		
		username.sendKeys("ravinangre@gmail.com");
		
		Password.sendKeys("12345787654");
		
		//driver.navigate().to("https://kite.zerodha.com");
		
		//driver.findElement(By.xpath("//a[contains(text(),'Signup')]")).click();
		
	//	driver.navigate().to("file:///C:/Users/Sharayu/Dropbox/My%20PC%20(LAPTOP-IKS9SD1L)/Desktop/home.html");
		
	//	driver.findElement(By.xpath("//a[contains(text(),'Kite')]")).click();
		
	//	ForgotPassword.click();
		
		System.out.println("Number of Images " +image.size());
		
		System.out.println(FacebookLinks.size());
		
		CreatenewAcc.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='firstname']"))).sendKeys("Utkarshaa");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		
		
	//	js.executeScript("alert('Hi Team')");
		
		
		FluentWait wait1 = new FluentWait(driver);
		
		wait1.withTimeout(120, TimeUnit.SECONDS);
		
		wait1.pollingEvery(10, TimeUnit.SECONDS);
		
		wait1.ignoring(NoAlertPresentException.class);
		
		Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>()
		{
			public Boolean apply(WebDriver arg0) {
				
				{
					driver.switchTo().alert().accept();
					return true;
				}
			}
		};

wait1.until(function);
				
		//driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("utkarshaa");
		
	//	Thread.sleep(2000);
	//	driver.findElement(By.xpath("//input[@value='2']")).click();
	/*	try {
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("utkarshaa");
			driver.findElement(By.cssSelector("div>input[name='lastname']")).sendKeys("Nangare");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	//	CreateAPage.click();
		
	//	LoginBtn.click();
		
		//driver.close();

	}

}
