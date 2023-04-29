package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class RTP {
static WebDriver driver;

public static void main(String[] args) throws InterruptedException 
{
       try (Scanner Sc = new Scanner(System.in)) {
		System.out.println("select the browser which you want to open: \n 1.chrome \n 2.firefox \n 3.msedge");
		 System.out.println("choose any one browser at a time ");
		 String browservalue=Sc.next();
		 if(browservalue.equalsIgnoreCase("chrome"))
		 {
			 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			 ChromeOptions co=new ChromeOptions();
			 co.addArguments("--remote-allow-origins=*");
			 driver=new ChromeDriver(co); 
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
			 driver.close();
		 }
		 else if(browservalue.equalsIgnoreCase("firefox"))
		 {
			 System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		     driver=new FirefoxDriver();
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
		 	 driver.close();
		  }
		 else if(browservalue.equalsIgnoreCase("msedge"))
		 {
			 System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
			 driver =new EdgeDriver();
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
		 	 driver.close();
		 }
		 else
		 {
			 System.out.println("select the valid browser");
		 }
	}
}
  }

