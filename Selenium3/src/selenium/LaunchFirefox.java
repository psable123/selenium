package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "G:\\libs\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement male = driver.findElement(By.id("//*[@id=\"gender-radio-1\"]"));
		male.click();

	}

}
