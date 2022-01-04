package selenium_java_sep21;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@id='close-fixedban']")).click();
		WebElement SelectValue = driver.findElement(By.xpath("//div[@id='withOptGroup']"));
		SelectValue.click();
		WebElement selectElement = driver.findElement(By.xpath("//div[contains(text(),'A root option')]"));
		selectElement.click();

		WebElement staticDropdown = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		
		Select selectcolor = new Select(staticDropdown);
		//selectcolor.selectByIndex(3);
		//selectcolor.selectByValue("5");
		selectcolor.selectByVisibleText("Aqua");
		
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		
		driver.findElement(By.xpath("//a[@id='close-fixedban']")).click();
		
		driver.findElement(By.xpath("//*[contains(@id,'dateOfBirthInput')]")).click();
		
		WebElement Year = driver.findElement(By.xpath("//*[contains(@class,'react-datepicker__year-select')]"));
		
		
		
		Select selectYear = new Select(Year);
		selectYear.selectByValue("1917");
		
		WebElement Month = driver.findElement(By.xpath("//*[contains(@class,'react-datepicker__month-select')]"));
		
		Select selectMonth = new Select(Month);
		selectMonth.selectByVisibleText("September");
		
		driver.findElement(By.xpath("//*[contains(@class,'react-datepicker__day react-datepicker__day--022')]")).click();
		
	}

}
