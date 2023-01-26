package week2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//div[@class='grid formgrid']/div/div")).click();
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		WebElement selectMultiple = driver.findElement(
				By.xpath("//div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']"));
		selectMultiple.click();
		Thread.sleep(2000);
		WebElement option1 = driver.findElement(By.xpath("(//label[text()='Miami'])[2]"));
		Thread.sleep(2000);
		option1.click();
		WebElement option2 = driver.findElement(By.xpath("(//label[text()='London'])[2]"));
		Thread.sleep(2000);
		option2.click();

	}
}
