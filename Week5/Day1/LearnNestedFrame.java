package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {

	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("https://leafground.com/frame.xhtml");

		// maximize the browser
		driver.manage().window().maximize();

		// Transfer the driver focus -outer frame
		driver.switchTo().frame(2);

		// Transfer the focus to inner frame

		// By id/name
		// driver.switchTo().frame("frame2");

		// By index
		// driver.switchTo().frame(0);

		// By WebElement
		WebElement frameEle = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(frameEle);

		// Click on the element
		driver.findElement(By.id("Click")).click();

		// switch immediate parent frame
		driver.switchTo().parentFrame();

		// switch to main web age
		driver.switchTo().defaultContent();

	}

}
