package methodOfWebdriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class switchToMethodNAvigateMethod
{
public static void main(String[] args) throws InterruptedException 
{
	//IllegalState Exception
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	
	//upcasting
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.google.com");
	Thread.sleep(1000);
	
	driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
	Thread.sleep(1000);
    driver.navigate().back();

	
	 driver.switchTo().activeElement().sendKeys("Automation Testing",Keys.ENTER);
     Thread.sleep(2000);
      
   //back to the immediate open page
     driver.navigate().back();
     Thread.sleep(2000);
     
   //forward to the next page
     driver.navigate().forward();
     Thread.sleep(2000);
     
   //refresh the current page
     driver.navigate().refresh();
     Thread.sleep(2000);
     driver.quit();
}
}
