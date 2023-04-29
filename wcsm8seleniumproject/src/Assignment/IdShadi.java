package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IdShadi {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver= new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.jeevansathi.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("sampadapadgilwar89@gmail.com");
		Thread.sleep(2000);
		driver.close();
		
	}

}
