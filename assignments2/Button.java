package week2.assignments2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();

		// Click and Confirm title
		driver.findElement(By.xpath("//div[@class='card']/button")).click();
		String title = driver.getTitle();
		if (title.contains("Dashboard")) {
			System.out.println("Title is confirmed...");
		}

		// Confirm if the button is disabled
		System.out.println("is button disabled? "
				+ driver.findElement(By.xpath("//div[@class='card']/button[@id='j_idt88:j_idt92']")).isEnabled());

		// Find the position of the Submit button
		System.out.println("Location of submit button is: "
				+ driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-icon ui-c pi pi-bookmark']"))
						.getLocation());

	}

}
