package utilities;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public static void selectDropdown(WebElement drpElement, String value)
	{
		Select s = new Select(drpElement);
		List<WebElement> allCountry = s.getOptions();
		
		for(WebElement country : allCountry)
		{
			String countryText = country.getText();
			if(countryText.equals(value))
			{
				country.click();
				break;
			}
		}
	}
	
	
	public static void bootstrapDropdown(List<WebElement>allOptions, String text)
	{
		for(WebElement option : allOptions)
		{
			String optionText = option.getText();
			
			if(optionText.equals(text))
			{
				option.click();
				break;
			}
		}
	}
	
	
	public static void autoSuggestDropdown(List<WebElement>allOptions, String text)
	{

		for(WebElement option : allOptions)
		{
			String optionText = option.getText();
			
			if(optionText.equals(text))
			{
				option.click();
				break;
			}
		}
	}
		
		
	

}
