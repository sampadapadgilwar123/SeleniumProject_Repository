package methodOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetTitleMethod {
public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	String instapTitle=driver.getTitle();
	System.out.println(instapTitle);
	//Thread.sleep(1000);
	//driver.close();
	driver.get("https://www.bluestone.com/gold+coins/1-gram-24-kt-gold-coin~5920.html");
	String page=driver.getTitle();
	System.out.println(page);
}
}
