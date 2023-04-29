package DeselectMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByIndexMulti {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/HP/Desktop/WebElement/MultiSelectStaticDropDown.html");

		WebElement dropDown = driver.findElement(By.id("i1"));
		Select sel = new Select(dropDown);
		// select multiple options

		for (int i = 0; i < 6; i++) {
			if (i % 2 == 0) {
				Thread.sleep(2000);
				sel.selectByIndex(i);

			} else {
				System.out.println("its odd value");
			}
		}

		Thread.sleep(2000);

		// deselect multiple options
		for (int i = 0; i < 6; i++) {
			if (i % 2 == 0) {
				Thread.sleep(2000);
				sel.deselectByIndex(i);

			} else {
				System.out.println("its not DeSelected");
			}
		}
	}
}
