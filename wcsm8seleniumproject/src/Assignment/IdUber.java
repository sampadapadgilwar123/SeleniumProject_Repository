package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IdUber {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get(
				"https://auth.uber.com/v2/?breeze_local_zone=phx5&next_url=https%3A%2F%2Fdrivers.uber.com%2F%3Fmarketing_vistor_id%3D1969a0dc-9193-45f6-92e0-ccfb51dade33%26uclick_id%3Dc6b33e01-8040-47e0-9528-a5bc3d33cb74&state=4flIwDA8VKwVJcCo_fr7yK87ZI7vrUZthGIx3Udq-vI%3D");
		Thread.sleep(2000);
		driver.findElement(By.id("PHONE_NUMBER_or_EMAIL_ADDRESS")).sendKeys("9370722917");

	}

}
