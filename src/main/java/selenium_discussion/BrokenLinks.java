package selenium_discussion;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	
	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");
		
		//retrieve all the links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int brokenLinks = 0;
		
		for(WebElement element : links)
		{
			//get the url of this link
			String url = element.getAttribute("href");
			
			//check url is blank or not
			
			if(url==null || url.isEmpty())
			{
				System.out.println("URL is empty");
				continue;
			}
			
			//convert url string format to the actual url
			URL link = new URL(url);
			
			//using above link establish the connection
			
			try {
			
			HttpURLConnection httpcon = (HttpURLConnection) link.openConnection();
			
			//connect url to the server
			
			httpcon.connect();
			
			//after connecting to the server return some response, check the response
			
			if(httpcon.getResponseCode()>=400)
			{
				System.out.println(httpcon.getResponseCode()+url+" is broken link");
				brokenLinks++;
			}
			
			else
			{
				System.out.println(httpcon.getResponseCode()+url+" is valid link");
			}
			
			}catch(Exception e) {
				
			}
		}
		
		//count the broken link
		System.out.println("Number of broken links : "+brokenLinks);
		
	}

}
