package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSimpleAlert {

	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("https://leafground.com/alert.xhtml");

		// maximize the browser
		driver.manage().window().maximize();

		// Click on the Show button
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();

		// Click on the Click button
		//driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();

		// Transfer the driver focus
		Alert simpleAlert = driver.switchTo().alert();

		// getText
		String text = simpleAlert.getText();
		System.out.println(text);

		// accept the alert
		simpleAlert.accept();

	}

}
