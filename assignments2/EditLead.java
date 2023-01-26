package week2.assignments2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		driver.findElement(
				By.xpath("//label[text()='Lead ID:']/parent::div/following-sibling::div//input[@name='firstName']"))
				.sendKeys("Evansley");
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		Thread.sleep(3000);
		WebElement firstLeadElement = driver.findElement(
				By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']/div/a"));
		System.out.println(firstLeadElement.getText());
		firstLeadElement.click();

		if (driver.getTitle().equals("View Lead | opentaps CRM")) {
			System.out.println("Verified..");
		} else {
			System.out.println("Verification Failed...");
		}
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		WebElement companyName = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
		companyName.clear();
		companyName.sendKeys("TestLeaf Technologies");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		Thread.sleep(3000);
		String updatecompanyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();

		if (updatecompanyName.contains("TestLeaf")) {
			System.out.println("Lead edited successfully");
		} else {
			System.out.println("Lead failed to update");
		}
		driver.close();

	}
}
