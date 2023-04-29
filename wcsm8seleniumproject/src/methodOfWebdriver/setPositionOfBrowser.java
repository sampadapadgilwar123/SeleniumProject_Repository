package methodOfWebdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class setPositionOfBrowser {
	public static void main(String[] args) throws InterruptedException {
		
	
	//IllegatstateException
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		//ConnectionFailException
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		Point targetposition=new Point(350,450);
		Thread.sleep(2000);
		driver.manage().window().setPosition(targetposition);
		
	}	

}
