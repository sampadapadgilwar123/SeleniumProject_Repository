package Assignment;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicates3 
{
	public static void main(String[] args) throws InterruptedException 
	{
     	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// by using LinkedHashSet Remove Duplicates
		driver.get("file:///C:/Users/HP/Desktop/WebElement/MultiSelectStaticDropDown.html");
		WebElement dropDown = driver.findElement(By.name("menu"));
		Select sel = new Select(dropDown);
		Thread.sleep(2000);

		Set<String> output = new LinkedHashSet<String>();
		List<WebElement> allops = sel.getOptions();
		for (int i = 0; i < allops.size(); i++) 
		{
			WebElement option = allops.get(i);
			String text = option.getText();
			output.add(text);
		}
		for (String value : output)
		{
			System.out.println(value);
		}
	}

}
