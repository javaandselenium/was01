package testng;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Hub1 {
	@Parameters({"browser"})
	@Test
	public void tc2(String browsername) throws MalformedURLException {
		URL remoteAddress=new URL("http://192.168.0.102:5556/wd/hub");
		DesiredCapabilities capabilities =new DesiredCapabilities();
		capabilities.setBrowserName(browsername);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new RemoteWebDriver(remoteAddress, capabilities);
		driver.get("https://skillrary.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("selenium");
	}

}
