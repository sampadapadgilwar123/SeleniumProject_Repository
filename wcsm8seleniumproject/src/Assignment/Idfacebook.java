package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Idfacebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();

		driver.get(
				"https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjgwMTY2MzI3LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("sampadapdapadgilwar89@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("Sam@89875");
		Thread.sleep(1000);
		driver.findElement(By.id("loginbutton")).click();

	}
}