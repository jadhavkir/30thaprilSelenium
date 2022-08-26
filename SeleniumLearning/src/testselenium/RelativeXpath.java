package testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium files\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		//driver.get("https://web.whatsapp.com/");
		//Thread.sleep(2000);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//*[@id='txtUsername' and @name='txtUsername']"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.xpath("//*[@id='txtPassword' or @name='textInputContainer']"));
		password.sendKeys("admin123");
		WebElement btnLogin = driver.findElement(By.xpath("//*[@id='btnLogin' and @name='Submit']"));
	    btnLogin.click();
	    driver.findElement(By.xpath("//b[text()='PIM']")).click();
	    
	    driver.findElement(By.xpath("//a[text()='Kallyani']//parent::td//preceding-sibling::td//input[@type='checkbox']"))
	    .click();Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()='Charlie']//parent::td//preceding-sibling::td//input[@type='checkbox']"))
	    .click();Thread.sleep(2000);
	    
	}

}
