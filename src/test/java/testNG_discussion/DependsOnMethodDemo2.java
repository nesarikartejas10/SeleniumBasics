package testNG_discussion;

import org.testng.annotations.Test;

public class DependsOnMethodDemo2 {

	@Test(priority = 1)
	public void loginToApp()
	{
		System.out.println("Login to application testcase");

	}

	@Test(priority = 3, dependsOnMethods = {"loginToApp"} )
	public void homePage()
	{
		System.out.println("Homepage test case");

		throw new ArithmeticException();
	}

	@Test(priority = 5, dependsOnMethods = {"homePage", "loginToApp"})
	public void logout()
	{
		System.out.println("logout test case");
	}

}
