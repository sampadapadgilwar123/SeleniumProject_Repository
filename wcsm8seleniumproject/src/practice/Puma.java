package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Puma {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(co);
		// maximize the browser
		driver.manage().window().maximize();
			// get method is used to launch web appliacation which you want
		driver.get("https://in.puma.com/in/en");
		// click on menu button by using Axes
		driver.findElement(By.xpath(
				"//span[text()='PUMA.com']/ancestor::a[@class='tw-hqslau tw-xbcb1y']/following-sibling::button[@class='flex items-center space-x-2 mt-1 ml-5']/descendant::span[text()='Menu']"))
				.click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//button[@class='text-puma-black w-full py-2 flex items-center justify-between']/descendant::span[text()='Women']"))
				.click();

	}
}