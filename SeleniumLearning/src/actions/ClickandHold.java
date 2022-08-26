package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickandHold {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		WebElement source = driver.findElements(By.xpath("//*[@id='fourth']//a")).get(0);
		WebElement target = driver.findElement(By.xpath("//*[@id='amt7']"));
		Thread.sleep(1000);
		Actions act = new Actions (driver);
		act.clickAndHold(source).moveToElement(target).release().build().perform();
	}
}