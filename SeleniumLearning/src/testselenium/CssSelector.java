package testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");
driver.manage().window().maximize();

driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin123");
driver.findElement(By.cssSelector("#btnLogin")).click();
driver.findElement(By.id("welcome")).click();
Thread.sleep(1000);
driver.findElement(By.linkText("Logout")).click();


	
	}
}
