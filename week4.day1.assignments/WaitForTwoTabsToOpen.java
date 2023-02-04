package week4.day1.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WaitForTwoTabsToOpen {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications"); // To disable notifications
		options.addArguments("--incognito"); // Incognito Mode
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		System.out.println("Waiting for two new tabs to open...");
		Thread.sleep(3000);
		Set<String> window = driver.getWindowHandles();
		List<String> w = new ArrayList<String>(window);
		driver.switchTo().window(w.get(1));
		driver.close();
		driver.switchTo().window(w.get(2));
		driver.close();

	}
}
