
package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample7 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://books-pwakit.appspot.com/");

		SearchContext shadowRoot = driver.findElement(By.tagName("book-app")).getShadowRoot();

		shadowRoot.findElement(By.id("input")).sendKeys("java");

	}
}
