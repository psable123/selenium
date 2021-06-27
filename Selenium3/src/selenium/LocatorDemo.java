package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\libs\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		//locator id
		WebElement FirstName= driver.findElement(By.id("firstName"));
		WebElement LastName= driver.findElement(By.id("lastName"));
		//locator Xpath
		WebElement UserEmail= driver.findElement(By.xpath("//input[@id='userEmail']"));

		WebElement male = driver.findElement(By.id("//input[@id='gender-radio-1' or @value='Male']"));
	//	WebElement female = driver.findElement(By.id("//input[@id='gender-radio-2']"));
		
		WebElement UserMobile = driver.findElement(By.xpath("//input[@id='userNumber']"));
		//WebElement Subjects =driver.findElement(By.id("//input[@id='subjectsInput']"));
		
		//WebElement selectEnglish = driver.findElement(By.xpath("//*[contains(text(),'English']"));
		
		WebElement Sports = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
		WebElement Reading =driver.findElement(By.xpath("//input[@id='hobbies-checkbox-2']"));
		
		WebElement Music = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-3']"));
		WebElement currentAddress= driver.findElement(By.xpath("//textarea[@class='form-control']"));
		WebElement submitBtn = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		
		JavascriptExecutor js= 	(JavascriptExecutor)driver;
		FirstName.sendKeys("pooja");
		LastName.sendKeys("Sable");
		UserEmail.sendKeys("poojasable2811@gmail.com");
		Thread.sleep(2000);
		//male.click();
		js.executeScript("arguments[0].click();",male);
		//female.click();
		UserMobile.sendKeys("9067099689");
		//Subjects.sendKeys("English");
		//selectEnglish.click();
		js.executeScript("arguments[0].click();", Sports);
		js.executeScript("arguments[0].click();", Reading);
		js.executeScript("arguments[0].click();",Music);
		
		currentAddress.sendKeys("kalamb");	
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
