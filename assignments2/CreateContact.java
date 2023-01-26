package week2.assignments2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Evansley");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Samuel");
		driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("Evans");
		driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("Sam");
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("UNIT-001");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("TestLeaf is a institute");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("evasam@gmail.com");
		WebElement state = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select stateOptions = new Select(state);
		stateOptions.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']"))
				.sendKeys("Important Note not yet updated");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String titleOfPage = driver.getTitle();
		if (titleOfPage.contains("View Contact")) {
			System.out.println("Test Case Passed...");
		} else
			System.out.println("Test Case Failed...");

	}

}
