package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");

		WebElement logged = driver.findElement(By.xpath("//label[@id='keepLoggedInLabel']"));
		System.out.println(logged.getText());

		WebElement login = driver.findElement(By.xpath("//div[text()='Login ']"));
		System.out.println(login.getText());
	}
}
