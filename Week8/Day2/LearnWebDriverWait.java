package week8.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWebDriverWait {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
				ChromeDriver driver = new ChromeDriver();

				// Load the url
				driver.get("https://leafground.com/waits.xhtml");

				// maximize the browser
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("//span[text()='Click']")).click();
				
				//Thread.sleep(10000);
				//boolean displayed = driver.findElement(By.xpath("//span[text()='I am here']")).isDisplayed();
				
				
				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1));
				
				WebElement iAmHereButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
				
				boolean displayed2 = iAmHereButton.isDisplayed();
				
				
                System.out.println(displayed2);
	}

}

//500 ms  - 20 times pooling time for WebDriverWait



