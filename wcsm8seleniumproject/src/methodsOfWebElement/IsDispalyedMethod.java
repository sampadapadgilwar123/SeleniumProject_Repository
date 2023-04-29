package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDispalyedMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.netflix.com/in/login");

		WebElement user = driver.findElement(By.name("userLoginId"));
		WebElement pass = driver.findElement(By.name("password"));
		WebElement button = driver.findElement(By.xpath("//button[text()='Sign In']"));
		if (user.isDisplayed()) {
			user.sendKeys("sampadapadgilwar89@gmail.com");
		}

		else {
			System.out.println("Will get Exception!!");
		}

		if (pass.isDisplayed()) {
			pass.sendKeys("Sam@8975");
		}

		else {
			System.out.println("Will get Exception!!");
		}

		if (button.isDisplayed()) {
			button.click();
		}

		else {
			System.out.println("Will get Exception!!");
		}
	}

}
