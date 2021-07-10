package com.Ecommerce.AddingToCart;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload {
	@Test
	public void demo() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("wdgt-file-upload")).click();
		//integrating autoit with selenium
		Runtime.getRuntime().exec("‪‪C:\\Users\\QSP\\Desktop\\Autoit\\upload.exe");
		
		
	}

}
