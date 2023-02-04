package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//1. Launch https://www.irctc.co.in/nget/train-search
//2. Click on Flights
//3. Switch to new tab
//4. Get the title and print it.
//5. Close the parent tab alone.

public class IRCTC {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();

		
		Set<String> childWindow = driver.getWindowHandles();
		List<String> w = new ArrayList<String>(childWindow);

		driver.switchTo().window(w.get(1));
		System.out.println(driver.getTitle());

		driver.switchTo().window(w.get(0));
		driver.close();

	}

}
