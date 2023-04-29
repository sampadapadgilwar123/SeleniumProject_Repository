package Assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
		
		//get method is used to launch web appliacation which you want
		driver.get("https://www.selenium.dev/");
		
		// maximize the browser
	    driver.manage().window().maximize();
		Thread.sleep(400);
		
		// setSize of Browser
		Thread.sleep(900);
		Dimension Size = new Dimension(350,450);
		driver.manage().window().setSize(Size);
		
		// setPosition of Browser
		Thread.sleep(400);
		Point Position = new Point(450,350);
		driver.manage().window().setPosition(Position);
		Thread.sleep(2000);
		driver.close();
	}
}
