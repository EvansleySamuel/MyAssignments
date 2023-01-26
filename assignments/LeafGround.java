package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LeafGround {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/input.xhtml");
		
		//Type your name
		driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all']")).sendKeys("Evansley");
		
		//Append Country to this City
		driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all city ui-state-filled']")).sendKeys("INDIA");
		
		//Verify if text box is disabled
		WebElement textBox = driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-disabled']"));
		boolean enabled = textBox.isEnabled();
		System.out.println("is text box selected? "+enabled);
		
		//Clear the typed text
		WebElement typedText = driver.findElement(By.xpath("//input[@value='Can you clear me, please?']"));
		typedText.clear();
		
        //Retrieve the typed text
		typedText.getAttribute("value");
		
		// Type email and Tab. Confirm control moved to next element
		WebElement emailAndTab = driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all']"));
		emailAndTab.sendKeys("testleaf@gmail.com");
		emailAndTab.sendKeys(Keys.TAB);
		WebElement textArea = driver.findElement(By.xpath("//textarea[@class='ui-inputfield ui-inputtextarea ui-widget ui-state-default ui-corner-all ui-inputtextarea-resizable']"));
		
		//Type about yourself
		textArea.sendKeys("I am Automation test Engineer");
		boolean selected = textArea.isSelected();
		System.out.println(selected);
		
		// Text Editor
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("This is text editor");
		
		//Just Press Enter and confirm error message
		driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement errorMessage = driver.findElement(By.xpath("//span[@class='ui-message-error-detail']"));
		Thread.sleep(3000);
		System.out.println("Error Message: "+errorMessage.getText().trim());
		
		//Click and Confirm Label Position Changes
		WebElement clickAndConfirm = driver.findElement(By.xpath("//span[@class='ui-float-label']/input"));
		driver.executeScript("arguments[0].click()", clickAndConfirm);
		
		//Type your name and choose the third option
		driver.findElement(By.xpath("//div[@id='j_idt106:auto-complete']/ul//input")).sendKeys("Evansley");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@role='tooltip']//following::span//li[3]")).click();
		
		// Click and Confirm Keyboard appears
		driver.findElement(By.xpath("//input[@name='j_idt106:j_idt122']")).click();
		Thread.sleep(2000);
		WebElement keyboard = driver.findElement(By.xpath("//div[@class='ui-widget ui-widget-content ui-corner-all ui-shadow keypad-popup ui-input-overlay']"));
		boolean displayed = keyboard.isDisplayed();
		System.out.println("Virtual keyboard is displaying: "+displayed);
		driver.findElement(By.xpath("//div[@id='j_idt106:j_idt124_editor']//p")).sendKeys("Custom toolbar is displaying...");
		driver.close();
		
		
	}
}
