package day31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo5 {

	@Test
	public void testA() {
		String path = "./doc/orange.xlsx";
		String sheet = "login";
		String un = Demo4.getXLData(path, sheet, 1, 0);
		String pw = Demo4.getXLData(path, sheet, 1, 1);

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(un);
		driver.findElement(By.id("txtPassword")).sendKeys(pw);
		driver.findElement(By.id("btnLogin")).click();
	}
}
