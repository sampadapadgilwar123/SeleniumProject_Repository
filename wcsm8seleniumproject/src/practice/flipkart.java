package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		
		//click on travles
		driver.findElement(By.xpath("//div[text()='Travel']")).click();
	    driver.switchTo().alert().accept();
	    
	    driver.findElement(By.xpath("//input[@class='_1w3ZZo _1YBGQV _2EjOJB lZd1T6 _2vegSu _2mFmU7']")).click();
	    
	    driver.findElement(By.xpath("//input[@class='_1w3ZZo _1YBGQV _2EjOJB lZd1T6 _2dqBfU _2mFmU7']")).click();
	    
	    

	}
}
