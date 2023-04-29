package SelectMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		WebElement Button = driver.findElement(By.xpath("//button[.=' Login ']"));
		Button.submit();
		//org.openqa.selenium.support.ui.UnexpectedTagNameException: 
		//Element should have been "select" but was "span"
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		WebElement dynamicDropDown = driver.findElement(By.xpath("//span[text()='Job ']"));
		dynamicDropDown.click();
		Select sel = new Select(dynamicDropDown);
		sel.selectByVisibleText("Pay Grades");
		
	}
}
