package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class readDatafromproperty {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "G:\\libs\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		FileInputStream file = new FileInputStream("C:\\Users\\Studio\\eclipse-workspace\\Selenium3\\src\\selenium\\data.properties");
		Properties prop = new Properties();
		prop.load(file);
		
		String URL =prop.getProperty("url");
		driver.get(URL);
		
		String s = prop.getProperty("impliciwait");
		//converting string into int using Integer parseInt
		
		int i = Integer.parseInt(s);
		
		String p=prop.getProperty("pageloadtimeout");
		int i1=Integer.parseInt(p);
				
			

	}

}
