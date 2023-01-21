package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxInteractions {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/input.xhtml");

		driver.manage().window().maximize();

		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("Madurai");

		WebElement ele = driver.findElement(By.id("j_idt88:j_idt95"));
		ele.clear();
		ele.sendKeys("Some Text");
		String value = ele.getAttribute("value");

		if (value.equalsIgnoreCase("Some Text")) {
			System.out.println("Value is same..");
		} else {
			System.out.println("Value is not same..");
		}
		boolean Enabled = ele.isEnabled();
		System.out.println(Enabled);

		boolean displayed = ele.isDisplayed();
		System.out.println(displayed);

		boolean selected = ele.isSelected();
		System.out.println(selected);

	}
}
