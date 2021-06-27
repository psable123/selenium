package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class cssSelectorDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\libs\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);		
		driver.manage().window().maximize();
		
		//locator css selector using id 
		WebElement FirstName= driver.findElement(By.cssSelector("input#firstName"));
		WebElement LastName= driver.findElement(By.cssSelector("#lastName"));
		FirstName.sendKeys("pooja");
		LastName.sendKeys("sable");
		
		//locator css selector using attribute (tagname[attibute='value'])
		WebElement UserEmail= driver.findElement(By.cssSelector("input[id='userEmail']"));
		UserEmail.sendKeys("pooja@gmail.com");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement Female = driver.findElement(By.cssSelector("input[value='Female']"));
		js.executeScript("arguments[0].click();",Female);
		
		//locator css selector tagname.classname[attribute='value']
		WebElement userMobile = driver.findElement(By.cssSelector("input.mr-sm-2.form-control[placeholder='Mobile Number"));
		userMobile.sendKeys("9067099689");
		
		//WebElement calender = driver.findElement(By.xpath("//div[@class='react-datepicker-wrapper']"));
		//calender.click();
		//Select
		
		WebElement Subjects = driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"));
		Actions action = new Actions(driver);
		action.click(Subjects).build().perform();
		action.sendKeys(Subjects, "Engl").build().perform();
		WebElement English = driver.findElement(By.xpath("//*[contains(text(),'English')]"));
		//Thread.sleep(1000);
		js.executeScript("arguments[0].click();", English);
		
		//locator css selector using classname(.)
		WebElement currentAddress= driver.findElement(By.cssSelector("textarea.form-control"));
		currentAddress.sendKeys("kallam");
		
		WebElement SelectState = driver.findElement(By.cssSelector("div#state"));
		SelectState.click();
		//Thread.sleep(2000);
		WebElement SelectUP = driver.findElement(By.xpath("//*[contains(text(),'Uttar Pradesh')]"));
		SelectUP.click();
		
		WebElement SelectCity = driver.findElement(By.cssSelector("div#city"));
		SelectCity.click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'Agra')]")).click();
		
		driver.get("https://demoqa.com/select-menu");
		Select select = new Select(driver.findElement(By.cssSelector("#oldSelectMenu")));
		select.selectByIndex(1);
		select.selectByValue("4");
		select.selectByVisibleText("Magenta");	
		
		WebElement multiselect =  driver.findElement(By.xpath("//*[contains(text(),'Multiselect drop down')]//parent::p//following-sibling::div//child::div//div[@class='css-1g6gooi']"));
		WebElement standadselect =  driver.findElement(By.xpath("//*[contains(text(),'Standard multi select')]"));
		action.moveToElement(standadselect).build().perform();
		action.click(multiselect).build().perform();
		WebElement Red = driver.findElement(By.xpath("//div[contains(text(),'Red')]"));
		WebElement Black = driver.findElement(By.xpath("//div[contains(text(),'Black')]"));
		js.executeScript("arguments[0].click();", Red);
		js.executeScript("arguments[0].click();", Black);	
		
	}

}
