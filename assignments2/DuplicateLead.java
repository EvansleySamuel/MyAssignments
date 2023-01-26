package week2.assignments2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("testleaf@gmail.com");
		Thread.sleep(3000);
		WebElement firstNameElement = driver
				.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
		Thread.sleep(3000);
		System.out.println(firstNameElement.getText());
		firstNameElement.click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		if (driver.getTitle().equals("Duplicate Lead | opentaps CRM")) {
			System.out.println("Lead duplicated successfully...");
		} else {
			System.out.println("Lead failed to duplicate...");
		}
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		WebElement duplicateName = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));

		if (duplicateName.equals(firstNameElement)) {
			System.out.println("Duplicated Successfully...");

		} else {
			System.out.println("Duplication Failed....");
		}

	}
}
