package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class cssSelectorFacebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get(
				"https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjgwMzQxMDY3LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("sampadapadgilwar9770@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("pass")).sendKeys("123456");
		Thread.sleep(200);
		driver.findElement(By.cssSelector("button[class='_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy']")).click();
	}

}
