package testNG_discussion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterClass {

	@Test(priority = 1)
	public void logIn() {

		System.out.println("Log in test case get passed");
		Reporter.log("Report generate for login test case", false);
	}

	@Test(priority = 2)
	public void homePage() {

		System.out.println("Homepage test case get passed");
		Reporter.log("Report generate for home page test case", true);
	}

}
