package week8.day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenshot {

	public static void main(String[] args) throws IOException {
		         // Launch the browser
				ChromeDriver driver = new ChromeDriver();

				// Load the url - get
				driver.get("http://leaftaps.com/opentaps/control/main");

				// Maximize the browser
				driver.manage().window().maximize();
				
				//3 Steps
				
				WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
				
				//Step1:
				File source = loginButton.getScreenshotAs(OutputType.FILE);
				
				//Step2:
				File destination=new File("./Snaps/loginpage.png");
				
			    //Step3:
				FileUtils.copyFile(source, destination);
				
	}

}
