package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement textbox = driver.findElement(By.xpath("//input[@name='q']"));
		// e=document.getElementByName('q');e.value='bhanu';
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("e=arguments[0];e.value='bhanu';",textbox);
		js.executeScript("arguments[0].value='bhanu';", textbox);

	}
}
