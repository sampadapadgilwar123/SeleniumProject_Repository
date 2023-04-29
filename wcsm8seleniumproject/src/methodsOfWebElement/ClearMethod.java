package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demo.actitime.com/login.do");
		
	    WebElement username = driver.findElement(By.name("username"));
	    username.sendKeys("admin");
	    WebElement password = driver.findElement(By.name("pwd"));
	    password.sendKeys("manager");
	    
	    Thread.sleep(2000);
	    username.clear();
	    Thread.sleep(2000);
	    password.clear();
	}

}
