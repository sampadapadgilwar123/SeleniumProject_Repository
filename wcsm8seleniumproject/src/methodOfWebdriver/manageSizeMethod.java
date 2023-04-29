package methodOfWebdriver;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class manageSizeMethod {
	public static void main(String[] args) throws InterruptedException {
		//IllegatstateException
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//ConnectionFailException
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
	
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		Dimension size = new Dimension(350,450);
		driver.manage().window().setSize(size);
		Thread.sleep(2000);
		driver.close();
	}

}
