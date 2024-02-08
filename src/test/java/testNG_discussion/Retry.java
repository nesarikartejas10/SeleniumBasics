package testNG_discussion;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{

	int count = 0;
	int maxRetry = 3;
	@Override
	public boolean retry(ITestResult result) {
		
	
			if(count<maxRetry)
			{
				System.out.println("Retrying " + result.getName() + " again and the count is " + (count+1));
				count++;
				return true;
			}
		
		return false;
	}
	

}
