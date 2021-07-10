package javascriptexecutor;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {
	@Test
	public void demo() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		//To refresh the page
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("history.go(0)");
		
		//To get the title of the page
		String title = js.executeScript("return document.title;").toString();
		System.out.println(title);
		
		//To get the url of the page
		String url = js.executeScript("return document.URL;").toString();
	System.out.println(url);
	
	//To navigate
	js.executeScript("window.location='https://skillrary.com/");
	
	}
	
}
