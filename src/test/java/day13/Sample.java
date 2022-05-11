package day13;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Sample {
	//scroll to bottom of the page
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.actimind.com/");
			JavascriptExecutor j=(JavascriptExecutor) driver;
			j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//			driver.close();
		}

	}


