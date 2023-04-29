package methodOfWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class findElementsMethod {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("poha");
		Thread.sleep(2000);
		List<WebElement> pohaOptions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		// by using for loop
		for (int i = 0; i < pohaOptions.size(); i++) {
			String poha = pohaOptions.get(i).getText();
			System.out.println(poha);
			Thread.sleep(2000);
		}
		// for using For Ecah loop
		/*
		 * for(WebElement poha:pohaOptions) 
		 * { 
		 * System.out.println(poha.getText());
		 * Thread.sleep(2000); 
		 * }
		 */

	}
}
