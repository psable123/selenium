package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceform {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\libs\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		
		////locator id
		WebElement FirstName= driver.findElement(By.id("firstName"));
		WebElement LastName= driver.findElement(By.id("lastName"));
		
		FirstName.sendKeys("pooja");
		LastName.sendKeys("sable");
		 //locator xpath
		WebElement UserEmail= driver.findElement(By.xpath("//input[@id='userEmail']"));
		UserEmail.sendKeys("pooja@gmail.com");
		Thread.sleep(2000);

		
		//WebElement female = driver.findElement(By.id("//input[@id='gender-radio-2']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;

		///js.executeScript("arguments[0].click();",female);
		Thread.sleep(5000);
		//WebElement male = driver.findElement(By.id("//input[@id='gender-radio-1' or @value='Male']"));
		//male.click();
		
		WebElement UserMobile = driver.findElement(By.xpath("//input[@id='userNumber']"));
		UserMobile.sendKeys("9067099689");
		
		WebElement Sports = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
		WebElement Reading =driver.findElement(By.xpath("//input[@id='hobbies-checkbox-2']"));
		WebElement Music = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-3']"));
		js.executeScript("arguments[0].click();", Sports);
		js.executeScript("arguments[0].click();", Reading);
		js.executeScript("arguments[0].click();",Music);
		
		WebElement currentAddress= driver.findElement(By.xpath("//textarea[@class='form-control']"));
		currentAddress.sendKeys("kallamm");
		WebElement submitBtn = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		submitBtn.click();
		Thread.sleep(2000);
		
		//link text and partial link text
	    driver.navigate().to("https://kite.zerodha.com/");
	    
	  //locators tagname
	  		List<WebElement> links=driver.findElements(By.tagName("a"));
	  		System.out.println(links.size());
	  		List<WebElement> image=driver.findElements(By.tagName("img"));
	  		System.out.println(image.size());
	  		
	  		WebElement forgotpasswordlink = driver.findElement(By.linkText("Forgot password?"));
			forgotpasswordlink.click();
			WebElement partiallink = driver.findElement(By.partialLinkText("Signup now!"));
			partiallink.click();			

	}

}
