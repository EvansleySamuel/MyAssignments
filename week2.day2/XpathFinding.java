package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathFinding {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();

		driver.findElement(By.xpath("//a[@style='color: black;']")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		String attribute = driver.findElement(By.linkText("Leads")).getAttribute("href");
		System.out.println(attribute);

		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Evansley");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Samuel");
		WebElement options = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
		Select s = new Select(options);
		s.selectByValue("LEAD_CONFERENCE");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("LocalName");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Technical Department");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']"))
				.sendKeys("TestLeaf is a institute");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("testleaf@gmail.com");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		if (title.equals("View Lead | opentaps CRM")) {
			System.out.println("Title is correct...");
		}
		driver.findElement(By.linkText("Duplicate Lead")).click();
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys("HCL");
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.clear();
		firstName.sendKeys("Rahul");
		driver.findElement(By.className("smallSubmit")).click();
		String title1 = driver.getTitle();
		System.out.println("Title: " + title1);
		if (title1.equals("View Lead | opentaps CRM")) {
			System.out.println("Title1 is correct...");
		}
	}
}
