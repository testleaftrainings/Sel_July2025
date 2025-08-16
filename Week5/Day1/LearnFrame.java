package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		// Launch the browser
				ChromeDriver driver = new ChromeDriver();

				// Load the url
				driver.get("https://leafground.com/frame.xhtml");

				// maximize the browser
				driver.manage().window().maximize();
				
				//add implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
				//Transfer the focus
				driver.switchTo().frame(0);
				
				
				//Click on the button
				driver.findElement(By.id("Click")).click();

	}

}
