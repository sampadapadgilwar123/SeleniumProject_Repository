package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement value = driver.findElement(By.xpath("//button[text()=' Login ']"));

		Rectangle rect = value.getRect();
		int Xaxis = rect.getX();
		int Yaxis = rect.getY();
		System.out.println("Xaxis: " + Xaxis + ", Yaxis: " + Yaxis);

		int h = rect.getHeight();
		int w = rect.getWidth();
		System.out.println("height: " + h + ",width: " + w);

	}

}
