package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class cssSelectorBewkoof {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://app.mycaptain.in/login");
		driver.findElement(By.id("emailInput")).sendKeys("sampadapadgilwar29@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id='sendOTPBtn']")).click();
	}

}
