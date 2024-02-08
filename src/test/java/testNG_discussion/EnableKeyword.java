package testNG_discussion;

import org.testng.annotations.Test;

public class EnableKeyword {

	@Test(priority = 0)
	public void logIn() {

		System.out.println("login test case has passed");
	}

	@Test(priority = 1, enabled = false)
	public void homePage() {

		System.out.println("home page test case has passed");
	}
	
	@Test(priority = 2)
	public void logOut() {
		
		System.out.println("logout test case has passes");
	}
	
	

}
