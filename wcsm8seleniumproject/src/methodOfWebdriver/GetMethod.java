package methodOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//it is use to access web application

public class GetMethod 
{
public static void main(String[] args) throws InterruptedException 
{

	//IllegatstateException
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	//ConnectionFailException
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(co);
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.get("http://omayo.blogspot.com/");
	driver.close();
	
}
}
