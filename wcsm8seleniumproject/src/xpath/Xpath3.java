package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath3 {
	public static void main(String[] args) throws InterruptedException {

		// X-path by using contains
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shine.com/registration/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'id_name')]")).sendKeys("Sampada Padgilwar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'id_email')]")).sendKeys("sampadapadgilwar4567@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'id_cell_phone')]")).sendKeys("9370722917");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'id_password')]")).sendKeys("Sam@8975");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@id,'registerButton')]")).click();

	}

}