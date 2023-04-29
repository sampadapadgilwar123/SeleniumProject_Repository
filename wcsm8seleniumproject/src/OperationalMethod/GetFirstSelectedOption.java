package OperationalMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/HP/Desktop/WebElement/MultiSelectStaticDropDown.html");
		WebElement dropDown = driver.findElement(By.name("menu"));
		Select sel = new Select(dropDown);
		Thread.sleep(2000);
		for (int i = 3; i < 5; i++) {
			sel.selectByIndex(i);

		}

		WebElement value = sel.getFirstSelectedOption();
		System.out.println(value.getText());

		//System.out.println(sel.getFirstSelectedOption()); address will be printed
	}

}
