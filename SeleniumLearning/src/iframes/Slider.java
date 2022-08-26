package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		WebElement iframe=driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(iframe);
		WebElement source=driver.findElement(By.id("slider"));
		Actions act=new Actions(driver);
		act.clickAndHold(source).moveToElement(source, 600, 0).release().build().perform();
		
	}

}
