package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("denyBtn")).click();

		WebElement target = driver.findElement(By.xpath("//a[text()='Coins ']"));
		Actions act = new Actions(driver);
		act.moveToElement(target).build().perform();

		 WebElement coin = driver.findElement(By.xpath("//span[text()='1 gram' and (contains(@data-p,'gold-coins-weight-1gms,m'))][1]"));
		 coin.click();
		 //verify 1 gm coin is displayed or not
		WebElement gm = driver.findElement(By.xpath("//div[@class='mousetrap']/preceding-sibling::a"));
	   
		if(gm.isDisplayed())
		{
			System.out.println("coin is displayed");
		}
		else
		{
			System.out.println("coin is not displayed");
			System.out.println("will get exception");
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
