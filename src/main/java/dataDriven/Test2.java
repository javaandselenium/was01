package dataDriven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {
	@Test
	public void tc3() throws SQLException {
		//Step:1 register the database
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		
		//step:2 connect to database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wsa01","root","root");
		
		//Step:3 create sql query statement
		Statement statement = con.createStatement();
		String query="select * from logindetails";
		
		//Step:4 execute the query
		ResultSet result = statement.executeQuery(query);	
		while(result.next()) {
			System.out.println(result.getString(1));
			System.out.println(result.getString(2));
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://demoapp.skillrary.com/login.php?type=login");
		driver1.findElement(By.id("email")).sendKeys(result.getString(1));
		driver1.findElement(By.id("password")).sendKeys(result.getString(2));
				
		//Step:5 close the connection /db
		con.close();
		
	}
	}
}
