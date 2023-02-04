package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearAlertandFrame {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));

		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Evansley");
		alert.accept();

		String jScript = driver.findElement(By.xpath("//p[@id='demo']")).getText();

		if (jScript.contains("Evansley")) {
			System.out.println("Test case completed successfully...");
		} else {
			System.out.println("Test case failed");
		}

	}
}
