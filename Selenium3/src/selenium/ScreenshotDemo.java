package selenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\libs\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.yahoo.com");
		driver.manage().window().maximize();
		
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File ("C:\\Users\\Studio\\eclipse-workspace\\Selenium3\\src\\"+timestamp()+".jpeg"));
	}
	public static String timestamp()
	{
		String timestamp = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new java.util.Date());
		return timestamp;
	}

}
