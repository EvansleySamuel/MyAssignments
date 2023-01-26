package week2.assignments2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Steffy");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("linda");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9994052019");
		driver.findElement(By.xpath(" //input[@id='password_step_input']")).sendKeys("TestLeaf@123");
		WebElement date = driver.findElement(By.xpath(" //select[@id='day']"));
		Select dateOptions = new Select(date);
		dateOptions.selectByVisibleText("2");
		WebElement month = driver.findElement(By.xpath(" //select[@id='month']"));
		Select monthOptions = new Select(month);
		monthOptions.selectByVisibleText("Oct");
		WebElement year = driver.findElement(By.xpath(" //select[@id='year']"));
		Select yearOptions = new Select(year);
		yearOptions.selectByVisibleText("2011");
		driver.findElement(By.xpath(" //label[text()='Female']")).click();

	}
}
