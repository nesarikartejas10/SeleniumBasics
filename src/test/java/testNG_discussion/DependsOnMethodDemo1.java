package testNG_discussion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodDemo1 {
	
	@Test(priority = 1)
	public void signIn() {
		
		Assert.fail();
		System.out.println("SignIn test case execute");
	}
	
	@Test(priority = 2)
	public void homePage() {
		
		System.out.println("Homepage test case execute");
	}
	
	@Test(priority = 3,dependsOnMethods = {"signIn"})
	public void profile() {
		
		System.out.println("Profile test case execute");
	}
	
	@Test(priority = 4)
	public void signOut() {
		
		System.out.println("SignOut test case execute");
	}
	

	

}
