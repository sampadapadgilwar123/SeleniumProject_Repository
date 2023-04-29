package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Actitimetestcase1{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://demo.actitime.com/login.do");

		System.out.println(driver.getTitle());
		// actiTIME - Login---> title of the login page

		if (driver.getTitle().equals("actiTIME - Login")) {
			System.out.println("login page title is matched and test case passed!!!!");
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
		} else {
			System.out.println("login page title is not matched and test case failed!!!!");
		}
		// actiTIME - Enter Time-Track--->title of home page
		Thread.sleep(2000);
		System.out.println(driver.getTitle());

		if (driver.getTitle().equals("actiTIME - Enter Time-Track")) {
			System.out.println("home page title is matched and test case passed!!!!");
		} else {
			System.out.println("home page title is not matched and test case failed!!!!");
		}

	}

}
