package week4.day1.assignments;

import java.nio.file.spi.FileSystemProvider;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class mergecontact {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("(//input[@id='partyIdFrom']/following::img)[1]")).click();
		Set<String> windows = driver.getWindowHandles();
		List<String> window = new ArrayList<String>(windows);
		driver.switchTo().window(window.get(1));
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		driver.switchTo().window(window.get(0));
		driver.findElement(By.xpath("(//input[@id='partyIdFrom']/following::img)[2]")).click();
		Thread.sleep(3000);
		driver.switchTo().window(window.get(1));
		driver.findElement(By.xpath("(//a[@class='linktext'])[3]")).click();
		driver.switchTo().window(window.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		String pageTitle = driver.findElement(By.xpath("//title[text()='View Contact | opentaps CRM']")).getText();
		if (pageTitle.contains("Contact")) {
			System.out.println("Test case passed");
		} else {
			System.out.println("Test case failed");
		}

	}
}
