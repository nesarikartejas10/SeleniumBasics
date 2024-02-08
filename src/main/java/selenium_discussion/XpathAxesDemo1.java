package selenium_discussion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class XpathAxesDemo1 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.cssSelector("a[data-group='men']"))).perform();
		
		//self(select the current node)
		String text1 = driver.findElement(By.xpath("//*[text()='Sweaters']/self::a")).getText();
		System.out.println(text1);
		
		//parent(select parent of the current node)
		String text2 = driver.findElement(By.xpath("//*[text()='Sweaters']/parent::li")).getText();
		System.out.println(text2);
		
		//child(select all children of current node)
		List<WebElement> childs = driver.findElements(By.xpath("//*[text()='Sweaters']/ancestor::ul/child::li"));
		System.out.println("no. of child elements : "+childs.size());
		
		//ancestor(select all the ancestor -parents and grandparents)
		String text3 = driver.findElement(By.xpath("//*[text()='Sweaters']/ancestor::ul")).getText();
		System.out.println(text3);
		
		//descendant(select all descendant -child and grand child)
		List<WebElement> descendants = driver.findElements(By.xpath("//*[text()='Sweaters']/ancestor::ul/descendant::*"));
		System.out.println("Number of descendants : "+descendants.size());
		
		//following(select everything in the document after the closing tag of current node)
		List<WebElement> followingNodes = driver.findElements(By.xpath("//*[text()='Sweaters']/ancestor::ul/following::li"));
		System.out.println("Number of following nodes : "+followingNodes.size());
		
		//following-sibling(select all the sibling after current node)
		List<WebElement> followingsiblings = driver.findElements(By.xpath("//*[text()='Sweaters']/parent::li/following-sibling::li"));
		System.out.println("Number of following siblings : "+followingsiblings.size());
		
		//preceding(select everything in the document before the current tag)
		List<WebElement> precedings = driver.findElements(By.xpath("//*[text()='Sweaters']/parent::li/preceding::li"));
		System.out.println("Number of precedings : "+precedings.size());
		
		//preceding-sibling(select all the sibling before the current node)
		List<WebElement> precedingsiblings = driver.findElements(By.xpath("//*[text()='Sweaters']/parent::li/preceding-sibling::li"));
		System.out.println("Number of preceding siblings : "+precedingsiblings.size());
		
		
		driver.quit();
	}

}
