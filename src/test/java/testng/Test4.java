package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4 {
	@DataProvider
	public Object demo() {
	Object[][] obj=new Object[3][2];
	obj[0][0]="admin";
	obj[0][1]="manager";
	obj[1][0]="1234434";
	obj[1][1]="55655555";
	obj[2][0]="6666&*&**fff";
	obj[2][1]="ghgh5767#$%";
	return obj;
	}
	
	@Test(dataProvider ="demo" )
	public void tc1(String username ,String password) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	}
	
	
	

}
