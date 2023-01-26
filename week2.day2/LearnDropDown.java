package week2.day2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/select.xhtml");

		// Identify the Select tag
		WebElement select = driver.findElement(By.className("ui-selectonemenu"));

		// Create an object for select tag
		Select s = new Select(select);

		// Using Visible Text
		s.selectByVisibleText("Playwright");

		// Using Index
		s.selectByIndex(0);

		// Using Value Attribute

		// To get the options available in dropdown
		List<WebElement> options = s.getOptions();

		// Iterating through this collections
//		// Size - collections
		
		
//		for (int i = 0; i < options.size(); i++) {
//			WebElement option = options.get(i); // To get only one element at a time from list
//			String text = option.getText();
//			System.out.println(text);
//		}

		for (WebElement eachOption : options) {

			System.out.println(eachOption.getText());

		}

	}
}
