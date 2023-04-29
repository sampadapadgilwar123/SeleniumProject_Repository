package Assignment;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicates2 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// by using TreeSet Remove Duplicates
		driver.get("file:///C:/Users/HP/Desktop/WebElement/MultiSelectStaticDropDown.html");
		WebElement dropDown = driver.findElement(By.name("menu"));

		// to handle dropdown obj of selct class
		Select sel = new Select(dropDown);

		Thread.sleep(2000);

		// to elimimates the dupicates and maintain the order of insertion we use
		TreeSet<String> ts = new TreeSet<String>();

		// to get all the options from dropdown
		List<WebElement> allops = sel.getOptions();

		// to read the list by eliminating dupicates.........
		for (int i = 0; i < allops.size(); i++) {
			// get the optiond and text of options
			WebElement option = allops.get(i);

			// add the text of options to treeset
			String text = option.getText();
			ts.add(text);
		}
		// to read the options from set
		for (String value : ts) {
			System.out.println(value);
		}
	}
}