package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample8 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String a = driver.findElement(By.id("username")).getDomAttribute("name");
		System.out.println(a);

		String b = driver.findElement(By.id("username")).getDomProperty("outerHTML");
		System.out.println(b);

		String name = driver.findElement(By.id("username")).getAccessibleName();
		String role = driver.findElement(By.id("username")).getAriaRole();
		System.out.println(name + " " + role);
		driver.quit();

	}
}
