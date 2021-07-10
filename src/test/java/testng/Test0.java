package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test0 {
	
	@BeforeMethod(alwaysRun = true)
	public void login() {
		Reporter.log("login",true);
	}
	
	@AfterMethod(alwaysRun = true)
	public void logout() {
		Reporter.log("logout",true);
	}
	
	@Test(groups="createCustomer")
	public void createCustomer() {
		Reporter.log("createcustomer",true);
	}

	@Test(groups="createproject")
	public void createProject() {
		Reporter.log("createproject",true);
	}
	
	@Test
	public void deletecustomer() {
		Reporter.log("deletecustomer",true);
	}
	
	@Test
	public void deleteproject() {
		Reporter.log("deleteproject",true);
	}
}
