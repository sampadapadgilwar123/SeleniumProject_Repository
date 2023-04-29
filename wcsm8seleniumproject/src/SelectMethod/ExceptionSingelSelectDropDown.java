package SelectMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExceptionSingelSelectDropDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//java.lang.UnsupportedOperationException: You may only deselect options of a multi-select
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("file:///C:/Users/HP/Desktop/WebElement/SingleSelectDropDown.html");
		
		WebElement dropDown = driver.findElement(By.name("menu"));
		
		Select sel = new Select(dropDown);   
		Thread.sleep(4000);
		sel.deselectByIndex(3);

}
}
