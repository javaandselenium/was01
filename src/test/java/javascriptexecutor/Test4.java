package javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4 {
	@Test
	public void demo() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Documents/June%20Batches/Advance%20selenium_3clk/disabledelemene.html");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//eneter the value 
		js.executeScript("document.getElementById('abc').value='qspiders'");
		Thread.sleep(3000);
		//clear the value
		js.executeScript("document.getElementById('abc').value=''");
		
	}

}
