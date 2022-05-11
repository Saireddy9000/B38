package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {
	// scroll to specific element
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.actimind.com/");

		WebElement cs = driver.findElement(By.xpath("//h3[.='Contact Us']"));
		int y = cs.getLocation().getY();
		System.out.println(y);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		System.out.println("window.scrollTo(0,y)");
		System.out.println("window.scrollTo(0," + y + ")");
		j.executeScript("window.scrollTo(0," + y + ")");
		// driver.close();
	}

}
