package practise;


import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int brokenLink = 0;
		int validLink = 0;
		for(WebElement element : links)
		{
			String url = element.getAttribute("href");
			if(url==null|| url.isEmpty())
			{
				System.out.println("Url is empty");
				continue;
			}
			
			URL link = new URL(url);
			
			try {
				HttpURLConnection httpcon = (HttpURLConnection) link.openConnection();
				
				httpcon.connect();
				
				if(httpcon.getResponseCode()>=400)
				{
					
					brokenLink++;
				}
				else {
					validLink++;
				}
			} catch (Exception e) {
				
			}
			
		}
		
		System.out.println("No. of broken links :"+brokenLink);
		System.out.println("No. of valid links :"+validLink);
	}

}
