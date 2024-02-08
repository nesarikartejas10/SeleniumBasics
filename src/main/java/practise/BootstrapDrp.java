package practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDrp {
	
	public void bootstrapDrp(List<WebElement> drpElements, String actElement) {
		
		for(WebElement drpElement : drpElements) {
			
			String text = drpElement.getText();
			if(actElement.equals(text)) {
				
				drpElement.click();
				break;
			}
		}
		
	}
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/recharge");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//div[@class='i02k']")).click();
		
		List<WebElement> drpElements = driver.findElements(By.xpath("//div[@class='_3xI1']/descendant::li"));
		
		BootstrapDrp bd = new BootstrapDrp();
		bd.bootstrapDrp(drpElements, "BSNL");
	}

}
