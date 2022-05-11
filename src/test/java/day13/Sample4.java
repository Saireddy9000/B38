package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement unTB = driver.findElement(By.id("username"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value=arguments[1];", unTB, "admin");

		WebElement pwTB = driver.findElement(By.name("pwd"));
		js.executeScript("arguments[0].value=arguments[1];", pwTB, "manager");

		WebElement loginBTN = driver.findElement(By.xpath("//div[.='Login ']"));
		js.executeScript("arguments[0].click();", loginBTN);
	}
}
