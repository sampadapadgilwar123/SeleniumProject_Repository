package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath2 {
	public static void main(String[] args) throws InterruptedException {

		// by using  text function Xpath
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// X-path by using text function
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		// handle popup
		co.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/in/en");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sneakers")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
