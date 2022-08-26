package learningwaits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitPractice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().window().maximize();
		
FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
.withTimeout(Duration.ofSeconds(10))
.pollingEvery(Duration.ofSeconds(5))
.ignoring(NoSuchElementException.class);
		driver.findElement(By.id("alert")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
}
}