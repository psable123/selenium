package selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\libs\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		WebElement kiteLogo = driver.findElement(By. xpath("//*[@id=\"container\"]/header/a/img"));
		String  kiteHeading = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[1]/h2")).getText();
		WebElement username = driver.findElement(By.xpath("//*[@id=\"userid\"]"));
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		WebElement LoginBtn = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[4]/button"));
		WebElement forgotpasslink = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/p/a"));
		Boolean logo = kiteLogo.isDisplayed();
		System.out.println(logo);
		System.out.println(kiteHeading);
		username.sendKeys("XA0123");
		password.sendKeys("123456");
		LoginBtn.click();
		forgotpasslink.click();
		System.out.println(driver.getCurrentUrl());
		driver.close();

		
		
		

	}

}
