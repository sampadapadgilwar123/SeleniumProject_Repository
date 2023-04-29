package OperationalMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/HP/Desktop/WebElement/SingleSelectDropDown.html");
		WebElement dropDown = driver.findElement(By.name("menu"));
		Select sel = new Select(dropDown);
		Thread.sleep(2000);
		List<WebElement> allops = sel.getOptions();
		// to read the list of webelement use looping statments........
		
		System.out.println("\n list of single select dropdown");
		for (int i = 0; i < allops.size(); i++) {
			String option = allops.get(i).getText();
			System.out.println(option);
		}
		driver.get("file:///C:/Users/HP/Desktop/WebElement/MultiSelectStaticDropDown.html");
		WebElement dropDown1 = driver.findElement(By.name("menu"));
		Select sel1 = new Select(dropDown1);
		List<WebElement> allops1 = sel1.getOptions();
		Thread.sleep(2000);
		
		System.out.println("\n list of multi select dropdown");
		for (int j = 0; j < allops1.size(); j++) {
			String option1 = allops1.get(j).getText();
			System.out.println(option1);
		}
		// advance for loop

		/*
		 * for(WebElement op:allops) { String option=op.getText();
		 * System.out.println(option); }
		 */

	}

}
