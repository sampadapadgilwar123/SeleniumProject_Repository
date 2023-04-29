package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class shoppersstack {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

		driver.findElement(By.xpath(
				"//div[@class='featuredProducts_cardBody__MDlEh']/descendant::img[@alt='Noise ColorFit Pulse Spo2 Smart Watch']"))
				.click();

		driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("556003");

		// first method(by locator)
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Check"))).click();

		// driver.findElement(By.xpath("//button[@id='Check']")).click();
		// second method(by webelement)

		// WebElement button = driver.findElement(By.xpath("//button[@id='Check']"));
		// wait.until(ExpectedConditions.elementToBeClickable(button)).click();

		// third method (by presenece in element)

	}
}
