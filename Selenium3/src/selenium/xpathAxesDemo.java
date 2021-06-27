package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAxesDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\libs\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='userid']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement LoginBtn = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		username.sendKeys("EL0379");
		password.sendKeys("Ramesh@1991");
		LoginBtn.click();
		Thread.sleep(2000);
		WebElement pin = driver.findElement(By.xpath("//input[@id='pin']"));
		WebElement continueBtn = driver.findElement(By.xpath("//button[@class='button-orange wide']"));

		pin.sendKeys("050591");
		continueBtn.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("INFY");		
		String HDFCcurrentvalue = driver.findElement(By.xpath("//span[contains(text(),'ICICIBANK')]//following::span[@class='price'][1]//span[3]")).getText();
		System.out.println(HDFCcurrentvalue);
	}

}
