package marathon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusApplication {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='autoFill homeSearch']/li")).click();
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Banglore");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='autoFill homeSearch']/li")).click();
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		driver.findElement(By.xpath("//td[text()='28']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		Thread.sleep(3000);
		System.out.println("Total: "+driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText()+" found");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@title='SLEEPER']")).click();
		WebElement secondResultingBus = driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[2]"));
		System.out.println("Name of the second Bus: "+secondResultingBus.getText());
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='button view-seats fr'])[2]")).click();
		Thread.sleep(3000);
		System.out.println("Select your seat and confirm..");
		driver.quit();
		
		

	}
}
