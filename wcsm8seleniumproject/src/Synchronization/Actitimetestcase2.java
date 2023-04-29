package Synchronization;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Actitimetestcase2 {
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://demo.actitime.com/login.do");
            String loginpagetitle=driver.getTitle();
			System.out.println(loginpagetitle);
			
			// actiTIME - Login---> title of the login page
              WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
              
			if (wait.until(ExpectedConditions.titleContains(loginpagetitle))) {
				System.out.println("login page title is matched and test case passed!!!!");
				driver.findElement(By.name("username")).sendKeys("admin");
				driver.findElement(By.name("pwd")).sendKeys("manager");
				driver.findElement(By.xpath("//div[text()='Login ']")).click();
			} else {
				System.out.println("login page title is not matched and test case failed!!!!");
			}
			Thread.sleep(2000);
			// actiTIME - Enter Time-Track--->title of home page
			String homepagetitle=driver.getTitle();
			System.out.println(homepagetitle);

			if //(wait.until(ExpectedConditions.titleContains(homepagetitle)))
				(wait.until(ExpectedConditions.titleContains("- Enter Time-Track")))
			{
				System.out.println("home page title is matched and test case passed!!!!");
			} else {
				System.out.println("home page title is not matched and test case failed!!!!");
			}

		}

	}
