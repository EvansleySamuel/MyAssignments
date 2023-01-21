package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {

//		Older Browser Invoke Methods
//		WebDriverManager.chromedriver().setup(); --> Old Selenium Versions (This will search our Chrome driver version & download the driver from internet)
//		System.setProperty("webdriver.chrome.driver", "path");  --> Very Older Method to invoke the browser

		// Open Chrome browser
		ChromeDriver driver = new ChromeDriver(); // --> New Selenium version --> Automatically download drivers &
													// Invoke it

		// Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Maximize the browser
		driver.manage().window().maximize();

		// Enter the UserName
		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("DemoSalesManager");

		// Enter the Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click the login button
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click Functionality
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Evansley");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Samuel");
		driver.findElement(By.className("smallSubmit")).click();

		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();

		System.out.println("FirstName: " + firstName);
		if (firstName.equals("Evansley")) {
			System.out.println("First name is correct");
		} else {
			System.out.println("First name is incorrect");
		}
	}
}
