package selenium_discussion;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropdownSorted {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.findElement(By.xpath("//*[text()='More.. ']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='last expanded active dropdown open']/ul")));

		List<WebElement> allOptions = driver.findElements(By.xpath("//*[@class='last expanded active dropdown open']/ul/li"));
		System.out.println("Before Sort :----");
		List<String> list = allOptions.stream().map(option->option.getText()).collect(Collectors.toList());
		list.forEach(l->System.out.println(l));
		
		System.out.println("After Sort :----");
		List<String> sortList = list.stream().sorted().collect(Collectors.toList());
		sortList.forEach(sl->System.out.println(sl));
	}

}
