package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebtables {

	public static void main(String[] args) {
		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("https://leafground.com/table.xhtml");

		// maximize the browser
		driver.manage().window().maximize();

		// add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// Locate the table
		WebElement table = driver
				.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody"));

		// To count the number of rows
		List<WebElement> row = table.findElements(By.tagName("tr"));
		
		int rowCount = row.size();
		System.out.println(rowCount);

		// To count the Column
		List<WebElement> column = driver
				.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[1]/td"));

		int columnCount = column.size();
		System.out.println(columnCount);

		// To retrieve single data
		WebElement row2Column3Data = driver.findElement(
				By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[2]/td[3]"));

		String text = row2Column3Data.getText();
		System.out.println(text);

		// To print entire row
		List<WebElement> row2Data = driver
				.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[2]/td"));

		for (int i = 0; i < row2Data.size(); i++) {
			String text2 = row2Data.get(i).getText();

			System.out.println("Row 2 Data: " + text2);
		}

		// To retrieve the entire data
		List<WebElement> allData = driver
				.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr/td"));

		for (int i = 0; i < allData.size(); i++) {
			String text3 = allData.get(i).getText();
			System.out.println("The all data is: " + text3);
		}

	}

}