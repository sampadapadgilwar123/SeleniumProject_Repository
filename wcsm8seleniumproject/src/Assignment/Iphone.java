package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Iphone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//ChromeOptions co = new ChromeOptions();
		//co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("iphone");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		//Thread.sleep(2000);
		List<WebElement> moblies = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> priceOfMobiles = driver.findElements(By.xpath(
				"//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
        
		for (int i = 0; i < moblies.size(); i++) {
			String iphone= moblies.get(i).getText();

			for (int j = i; j <= i; j++) {
				String phone = priceOfMobiles.get(j).getText();
				System.out.print(iphone + " ::" + phone);
				//Thread.sleep(2000);

			}

			System.out.println();
		}
	}
}