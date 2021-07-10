package waitingstatements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test0 {
@Test
public void demo() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(12,TimeUnit.SECONDS);
	try {
	driver.get("https://jqueryui.com/slider/");
	System.out.println("Page is loaded within 4sec");
	}
	catch(Exception e) {
	System.out.println("Page is not loaded within 4sec");	
	}
}

}
