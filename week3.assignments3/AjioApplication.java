package week3.assignments3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioApplication {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@name='searchVal']"));
		search.sendKeys("bags", Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']"))
				.click();
		Thread.sleep(3000);
		WebElement itemsFound = driver.findElement(By.xpath("//div[@class='length']"));
		System.out.println("No of items found: " + itemsFound.getText());
		List<WebElement> listOfItems = driver.findElements(By.xpath("//div[@class='brand']"));
		List<String> listOfBags = new ArrayList<String>();

		for (int i = 0; i < listOfItems.size(); i++) {
			String list = listOfItems.get(i).getText();
			listOfBags.add(list);
		}
		System.out.println("Brand of the Bags: " + listOfBags);

		List<WebElement> nameOfTheBags = driver.findElements(By.xpath("//div[@class='nameCls']"));
		List<String> nameOfItems = new ArrayList<String>();

		for (int i = 0; i < nameOfTheBags.size(); i++) {
			String name = nameOfTheBags.get(i).getText();
			nameOfItems.add(name);
		}
		System.out.println("Name of the Bags: " + nameOfItems);

	}
}
