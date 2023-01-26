package week2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Which is your favorite UI Automation tool?
		WebElement toolsOptions = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select s = new Select(toolsOptions);
		s.selectByVisibleText("Selenium");
		
		//Choose your preferred country.
		WebElement preferredcountry = driver.findElement(By.xpath("//label[@id='j_idt87:country_label']"));
		preferredcountry.click();
		WebElement countryOptions = driver.findElement(By.xpath("//li[text()='Germany']"));
		countryOptions.click();
		Thread.sleep(2000);
		
		//Confirm Cities belongs to Country is loaded
		driver.findElement(By.xpath("//label[text()='Select City']")).click();
		Thread.sleep(2000);
		WebElement citiesOptions = driver.findElement(By.xpath("//li[@id='j_idt87:city_1']"));
		citiesOptions.click();
		
		//Choose the Course
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		
		
		//Choose language randomly
		driver.findElement(By.xpath("(//div[@class='ui-selectonemenu-trigger ui-state-default ui-corner-right'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='English']")).click();
		
		//select "Two" language
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='ui-selectonemenu-trigger ui-state-default ui-corner-right'])[3]")).click();
		driver.findElement(By.xpath("//li[text()='Two']")).click();
		
		
		
		
		
	}
}
