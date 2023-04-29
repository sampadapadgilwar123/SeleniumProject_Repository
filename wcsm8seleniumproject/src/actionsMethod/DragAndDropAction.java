package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Actions act = new Actions(driver);
		//drag the bank
		WebElement first = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		//drop into account
		WebElement second = driver.findElement(By.xpath("//div[@id='shoppingCart1']/descendant::li"));
		act.dragAndDrop(first, second).perform();
		
		Thread.sleep(2000);
		//drag amount 5000
		WebElement first1 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		//drop into amount
		WebElement second1 = driver.findElement(By.xpath("//div[@id='shoppingCart4']/descendant::li"));
		act.dragAndDrop(first1, second1).build().perform();
	}
}