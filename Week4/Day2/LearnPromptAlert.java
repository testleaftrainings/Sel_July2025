package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPromptAlert {

	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("https://leafground.com/alert.xhtml");

		// maximize the browser
		driver.manage().window().maximize();
		
		//Click on the Click button
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
		//transfer the focus
		Alert promptAlert = driver.switchTo().alert();
		
		//Pass the value
		promptAlert.sendKeys("Vineeth");
		
		//getText
		String text = promptAlert.getText();
		System.out.println(text);
		
		//dismiss
		promptAlert.accept();
		
		

	}

}
