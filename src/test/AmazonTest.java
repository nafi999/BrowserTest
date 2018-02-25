package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonTest {
	
	public static void main (String args[]) {
		System.setProperty("webdriver.gecko.driver", "C://geckodriver-v0.19.1-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.amazon.com");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone");
		driver.findElement(By.className("nav-input")).submit();

	}
}

