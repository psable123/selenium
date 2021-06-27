package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\libs\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MICROSECONDS);
		
		//Explicitwait
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9175574674");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234567");

		
		driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration-form-button')]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='lastname']"))).sendKeys("sable");
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[name='websubmit']"))).click();	
	}
}


