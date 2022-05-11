package day13;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo4 {

	// static {
	// System.setProperty("webdriver.chrome.driver",
	// "./driver/chromedriver.exe");
	// System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	// }

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		WebElement b1 = driver.findElement(By.xpath("//h1[.='Block 1']"));

		WebElement b3 = driver.findElement(By.xpath("//h1[.='Block 3']"));
		Thread.sleep(1000);
		Actions actions = new Actions(driver);
		actions.dragAndDrop(b1, b3).perform();
	}
}
