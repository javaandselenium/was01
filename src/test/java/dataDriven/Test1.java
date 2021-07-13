package dataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	@Test
	public void tc2(XmlTest xml) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get(xml.getParameter("url"));
		driver.findElement(By.id("email")).sendKeys(xml.getParameter("username"));
		driver.findElement(By.id("password")).sendKeys(xml.getParameter("password"));
				
	}

}
