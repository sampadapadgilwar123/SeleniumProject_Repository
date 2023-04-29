package Assignment;

import java.time.Duration;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicates {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/HP/Desktop/WebElement/MultiSelectStaticDropDown.html");
		WebElement dropDown = driver.findElement(By.name("menu"));
		Select sel = new Select(dropDown);
		Thread.sleep(2000);
		
		// By using HashSet====================>
		
		HashSet<String> output1 = new HashSet<String>();
		List<WebElement> allops = sel.getOptions();
		System.out.println("**list by using HashSet**");
		for (int i = 0; i < allops.size(); i++) {
			WebElement option = allops.get(i);
			//String text=allops.get(i).getText(); method chaining
			String text = option.getText();
			output1.add(text);
		}
		for (String value : output1) {
			System.out.println(value);
		}
		
		// By using TreeSet====================>
		
		TreeSet<String> output2 = new TreeSet<String>();
		System.out.println("\n**list by using TreeSet**");
		for (int i = 0; i < allops.size(); i++) {
			WebElement option = allops.get(i);
			String text = option.getText();
			output2.add(text);
		}
		for (String value : output2) {
			System.out.println(value);
		}
		
		// By usind LinkedHashSet====================>
		
		Set<String> output3 = new LinkedHashSet<String>();
		System.out.println("\n**list by using LinkedHashSet**");
		for (int i = 0; i < allops.size(); i++) {
			WebElement option = allops.get(i);
			String text = option.getText();
			output3.add(text);
		}
		for (String value : output3) {
			System.out.println(value);
		}
	}

}
