package selenium;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboarddemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\libs\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");	
		driver.manage().window().maximize();
		
		//call action class
		
		Actions Action = new Actions(driver);
		WebElement FirstName= driver.findElement(By.cssSelector("input#firstName"));
		
		//action class key down and key up method
		
		Action.keyDown(FirstName, Keys.SHIFT);
		Action.sendKeys("pooja");
		Action.keyUp(Keys.SHIFT);
		Action.build().perform();
		
		
		driver.navigate().to("https://demoqa.com/text-box");
		WebElement usernane= driver.findElement(By.cssSelector("input[id='userName']"));
		WebElement email= driver.findElement(By.cssSelector("input[id='userEmail']"));
		WebElement currentaddress= driver.findElement(By.cssSelector("textarea[id='currentAddress']"));
		WebElement peraddress= driver.findElement(By.cssSelector("textarea[id='permanentAddress']"));
		WebElement submitBtn= driver.findElement(By.cssSelector("button[id='submit']"));
		
		Action.keyDown(usernane, Keys.SHIFT).sendKeys("pooja sable").keyUp(Keys.SHIFT).build().perform();
		Action.sendKeys(email, "pooka@gmail.com").perform();
		Action.sendKeys(currentaddress, "kalamb").perform();
		Action.keyDown(currentaddress, Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		
	
		Action.sendKeys(Keys.TAB).perform();
		Action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		Action.sendKeys(Keys.TAB).perform();
		Action.click(submitBtn).perform();
		
		//mouseclick
		driver.navigate().to("https://demoqa.com/buttons");
		WebElement DoubleClick = driver.findElement(By.cssSelector("button[id='doubleClickBtn']"));
		WebElement Rightclick = driver.findElement(By.cssSelector("button[id='rightClickBtn']"));
		WebElement dynamicclick = driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		Action.doubleClick(DoubleClick).perform();
		Action.contextClick(Rightclick).perform();
		Action.click(dynamicclick).perform();
		
		driver.navigate().to("https://demoqa.com/droppable");
		
		WebElement source = driver.findElement(By.cssSelector("div[id='draggable']"));
		WebElement destination = driver.findElement(By.xpath("//div[@class='simple-drop-container']//div[@id='droppable']"));
		
		Action.dragAndDrop(source, destination).build().perform();
		
		//tooltip

		
		driver.navigate().to("https://demoqa.com/tool-tips");
		
		WebElement textBx=driver.findElement(By.xpath("//input[@id='toolTipTextField']"));
		Action.moveToElement(textBx).build().perform();
		Thread.sleep(1000);
		WebElement tooltip=driver.findElement(By.xpath("//div[@id='textFieldToolTip']//div[@class='tooltip-inner']"));
		
		String tooltiptext=tooltip.getText();
		System.out.println(tooltiptext);
		
		Thread.sleep(3000);
		
		
		WebElement contrary=driver.findElement(By.xpath("//a[@href='javascript:void(0)'][1]"));
		Action.moveToElement(contrary).build().perform();
		Thread.sleep(1000);
		WebElement contraryTooltip=driver.findElement(By.xpath("//div[@id='contraryTexToolTip']//div[@class='tooltip-inner']"));
		String tl=contraryTooltip.getText();
		System.out.println(tl);	
	
	}

}
