package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHover {

	public static void main(String[] args) throws InterruptedException {
		        // Launch the browser
				ChromeDriver driver = new ChromeDriver();

				// Load the url
				driver.get("https://www.pvrcinemas.com/");

				// maximize the browser
				driver.manage().window().maximize();

				// add implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
				Thread.sleep(5000);
				
				//Step1: Finding the element
				WebElement mouseHoverEle = driver.findElement(By.xpath("//span[text()='More']"));
				
				//Step2: Create the Object for Actions Class
				Actions act=new Actions(driver);
				
				//Step3: Use the method to do the action
				act.moveToElement(mouseHoverEle).perform();
				
				
				
				
				
				
				
				
				
				
				
				
				

	}

}
