package waitingstatements;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	@Test
	public void demo() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		
		FluentWait wait=new FluentWait(driver);
		wait.withTimeout(3,TimeUnit.SECONDS);
		wait.pollingEvery(250,TimeUnit.MILLISECONDS);
		wait.ignoring(NoSuchElementException.class);
		
		WebElement ele = driver.findElement(By.name("q"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		
		ele.sendKeys("selenium");
	}

}
