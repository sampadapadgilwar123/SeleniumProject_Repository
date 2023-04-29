package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WithoutUsingSelectMethod {
//without using select method we can select the option in lists
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/HP/Desktop/WebElement/MultiSelectStaticDropDown.html");

		WebElement dropDown = driver.findElement(By.name("menu"));
		Select sel = new Select(dropDown);
		Thread.sleep(2000);
		List<WebElement> allops = sel.getOptions();

		System.out.println("\nlist of multi select dropdown");
		for (int i = 0; i < allops.size(); i++) {
			String option = allops.get(i).getText();
			System.out.println(option);
		}
		for (WebElement op : allops) {
			if (op.getText().equals("poha")) {
				op.click();
			}
			if (op.getText().equals("wada")) {
				op.click();
			}
			if (op.getText().equals("samosa")) {
				op.click();
			}

		}

	}
}
