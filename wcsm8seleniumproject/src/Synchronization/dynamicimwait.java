package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicimwait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
             
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.get("https://www.instagram.com/");

		driver.findElement(By.name("use")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("1234234");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
	}
}
