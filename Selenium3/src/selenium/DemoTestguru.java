package selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoTestguru {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\libs\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/selenium-xpath.html");
		driver.manage().window().maximize();
		
	//absolute path
		WebElement SoftwareTesting = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul[1]/li[1]/a"));
		SoftwareTesting.click();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		
		//Relative path
		//syntax = //tagname[@attribute='value']
		WebElement Selenium = driver.findElement(By.xpath("//a[@href='/selenium-tutorial.html']"));
		Selenium.click();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		
		//Contains Xpath method
		//syntax == //*[contains(@attribute,'value')]
		WebElement cucumber = driver.findElement(By.xpath("//a[contains(@href,'/cucumber-tutorials')]"));
		cucumber.click();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		
		WebElement ABAP = driver.findElement(By.xpath("//a[contains(@href,'/abap-tutorial')]"));
		ABAP.click();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		
		//using and & or
		//When we use and operator then both condition should be true
		WebElement QTP = driver.findElement(By.xpath("//a[@target='_top' and @title='QTP (Quick Test Professional)']"));
		QTP.click();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		
		//When we use OR operator then any one  condition should be true
		WebElement SAPABAP = driver.findElement(By.xpath("//a[@href='/abap-tutorial' or @title='SAP ABAP']"));
		SAPABAP.click();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();	
		
		//startswith method
		WebElement SAPBeginner = driver.findElement(By.xpath("//a[starts-with(@title,'SAP Be')]"));
		SAPBeginner.click();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();	
		
		//Text method
		WebElement Testing = driver.findElement(By.xpath("//b[text()='Testing']"));
		System.out.println(Testing.getText());
		
		
		
	
	}

}
 