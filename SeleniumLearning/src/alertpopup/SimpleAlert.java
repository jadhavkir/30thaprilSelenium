package alertpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@name='alert']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//*[@name='confirmation']")).click();
		Thread.sleep(1000);
		//driver.switchTo().alert().dismiss();
		//driver.findElement(By.xpath("//*[@name='prompt']']")).click();// this prompt alert,this do not work in selenium 4
		//Thread.sleep(1000);
		//driver.switchTo().alert().sendKeys("kiran");
		//driver.switchTo().alert();
		
	}	
		
}
