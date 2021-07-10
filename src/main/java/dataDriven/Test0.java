package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test0 {
	@Test
	public void tc1() throws FileNotFoundException, IOException{
	
	Properties p=new Properties();
	p.load(new FileInputStream("./data.properties"));
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get(p.getProperty("url"));
	driver.findElement(By.id("email")).sendKeys(p.getProperty("username"));
	driver.findElement(By.id("password")).sendKeys(p.getProperty("password"));
	
	
	
		
		
	}

}
