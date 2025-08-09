package week4.day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindlingLinksInApplication {

	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url - get
		driver.get("https://www.facebook.com/");

		// Maximize the browser
		driver.manage().window().maximize();
		
		//for finding multiple elements
		List<WebElement> allEle = driver.findElements(By.tagName("a"));
        //  0    1   2                           42
		//[WE1, WE2,WE3,,,,,,,,,,,,,,,,,,,,,,,,,WE43]
		int numberOfLinks = allEle.size();
		System.out.println("The number of Links: "+numberOfLinks);
		
		//Declare a List
		List<String> allLinks=new ArrayList<String>();
		
		//To print the values
		//  0   1   2 .......................42
		for (int i = 0; i < numberOfLinks; i++) {
			String text = allEle.get(i).getText();
			//String text1 = allEle.get(0).getText();
			//String text2 = allEle.get(1).getText();
			////String text43 = allEle.get(42).getText();
			allLinks.add(text);   //[text1,text2,,,,,,,,,,,,,,,,,,43]
		}
		
		System.out.println("The Links are: "+allLinks);
		
	}

}
