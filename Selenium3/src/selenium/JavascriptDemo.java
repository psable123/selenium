package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\libs\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//java script
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 WebElement username =null;
		 //username = (WebElement) js.executeScript("return document.getElementById('email');",username);
		// username.sendKeys("pooja@gmail.com");
		 js.executeScript("document.getElementById('email').style.borderColor = 'Green'");
		 js.executeScript("document.getElementById('email').value='poojasable@gmail.com'");
		 
		  
		 WebElement password =null;
		 //password = (WebElement) js.executeScript("return document.getElementById('pass');",password);
		 //password.sendKeys("123456");
		 js.executeScript("document.getElementById('pass').value='pooja123'");
		// String className = (String) js.executeScript("return document.getElementById('pass').getAttribute('
		 	
		 js.executeScript("alert('welcome to facebook');");
		 Thread.sleep(2000);
		 driver.switchTo().alert().accept();
		 //logi
		 WebElement LoginBtn = driver.findElement(By.xpath("//button[contains(@name,'login')]"));
		 js.executeScript("arguments[0].click();",LoginBtn);
		 
		 //refresh the browser
		 js.executeScript("history.go(0)");
		 
	}

}
