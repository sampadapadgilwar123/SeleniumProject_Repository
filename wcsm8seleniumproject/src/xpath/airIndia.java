package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class airIndia {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// URl of AIR INDIA
		driver.get("https://www.airindia.in/index.htm");

		// for from textfield
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Pune, Lohegaon Airport, PNQ, India, IN");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).click();

		// for to textfield
		driver.findElement(By.xpath("//input[@id='to']"))
				.sendKeys("Kochi, Cochin International Airport, COK, India, IN");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='to']")).click();

		// for departing

		driver.findElement(By.xpath("//input[contains(@class,'form-control datepicker1 hasDatepicker')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-highlight')]")).click();

		// for returning
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[3]/td[5]/a")).click();

		// for adult dropdown
		driver.findElement(By.xpath("//select[@name='ddladult1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='ddladult1']")).sendKeys("2");
		driver.findElement(By.xpath("//select[@name='ddladult1']")).click();

		// for children dropdown
		driver.findElement(By.xpath("//select[@name='ddlchildren1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='ddlchildren1']")).sendKeys("2");
		driver.findElement(By.xpath("//select[@name='ddlchildren1']")).click();

		// for infant dropdowns
		driver.findElement(By.xpath("//select[@name='ddlinfants1']")).click();
		driver.findElement(By.xpath("//select[@name='ddlinfants1']")).sendKeys("0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='ddlinfants1']")).click();

		// for concessionary type dropdown
		driver.findElement(By.xpath("//select[@name='concessionaryType1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='concessionaryType1']")).sendKeys("Student");
		driver.findElement(By.xpath("//select[@name='concessionaryType1']")).click();

		// for economy dropdown
		driver.findElement(By.xpath("//select[@name='_classType1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@name='_classType1']")).sendKeys("Premium Economy");
		driver.findElement(By.xpath("//select[@name='_classType1']")).click();

		// for search button
		driver.findElement(By.xpath("//input[@id='btnbooking']")).click();

	}
}
