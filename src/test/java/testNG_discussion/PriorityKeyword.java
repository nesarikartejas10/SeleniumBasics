package testNG_discussion;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class PriorityKeyword {

	@Test(priority = -15)
	public void register() {

		System.out.println("Register test case has passed ");
	
	}

	@Test(priority = -1)
	public void logIn() {

		System.out.println("login test case has passed");
	}

	@Test(priority = 0)
	public void homePage() {

		System.out.println("Home page test case has passed");
	}

	@Test
	public void searchProduct() {

		System.out.println("search product test case has passed");
	}

	@Test(priority = 10,alwaysRun=true)
	public void addToCart() {
		
		System.out.println("Add to cart test case has passed");
		throw new SkipException("test case skipped");
	}
	
	@Test(priority = 100)
	public void checkout() {
		
		System.out.println("checkout test case has passed");
	}
	
	@Test(priority = 100)
	public void logOut() {
		
		System.out.println("log out test case has passed");
	}


}
