package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\libs\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		//locators id
		//tagname[@attribute='value'
		//input[@id='password'
		WebElement username = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		
		//Locators class name
		WebElement LoginBtn = driver.findElement(By.className("button-orange"));
		username.sendKeys("XA1234");
		password.sendKeys("123456");
		LoginBtn.click();
		
		//locators name
		
		driver.get("https://www.facebook.com/");
		WebElement userName = driver.findElement(By.name("email"));
		WebElement passWord = driver.findElement(By.name("pass"));
		
		WebElement LoginBTn = driver.findElement(By.name("login"));
		
		userName.sendKeys("57454574385748");
		passWord.sendKeys("yy57764576");
		LoginBTn.click();
		Thread.sleep(2000);
		driver.navigate().back();
	
	}
		
}

