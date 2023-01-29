package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import freemarker.template.utility.Execute;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@123");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//div[@role='navigation']/button")).click();
		driver.findElement(By.xpath("//lightning-button[@class='slds-button slds-p-horizontal--small']/button"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='slds-app-launcher__tile-body slds-truncate'])[7]")).click();
		Thread.sleep(3000);
		WebElement Opportunities = driver
				.findElement(By.xpath("(//a[@class='slds-context-bar__label-action dndItem'])[2]"));
		driver.executeScript("arguments[0].click()", Opportunities);
		Thread.sleep(3000);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='New']")).click();
		driver.findElement(By.xpath("(//input[@class='slds-input'])[4]"))
				.sendKeys("Salesforce Automation by Evansley Samuel");
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//span[text()='28']")).click();
		driver.findElement(
				By.xpath("//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value']")).click();
		driver.findElement(By.xpath("(//span[text()='Needs Analysis'])[26]")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();

	}

}
