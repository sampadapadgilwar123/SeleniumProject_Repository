package SelectMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EvenOddSelection {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/HP/Desktop/WebElement/MultiSelectStaticDropDown.html");
		WebElement dropDown = driver.findElement(By.name("menu"));
		Select sel = new Select(dropDown);
		Thread.sleep(4000);
		sel.selectByIndex(9);

		for (int i = 0; i < 10; i++) 
		{
			if(i%2==0) {
			Thread.sleep(2000);
			sel.selectByIndex(i);
			System.out.println(i);
			Thread.sleep(2000);
			}
			else
			{
				System.out.println("odd number");
			}
		}
	}

}
