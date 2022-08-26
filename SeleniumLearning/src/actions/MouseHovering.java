package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("#btnLogin")).click();
	
		
		WebElement Hoveringpoint = driver.findElement(By.id("menu_admin_viewAdminModule"));
		Actions act = new Actions(driver);
		act.moveToElement(Hoveringpoint).perform();
		
		WebElement Hoveringpoint1 = driver.findElement(By.id("menu_admin_UserManagement"));
		//Actions act1 = new Actions(driver);
		act.moveToElement(Hoveringpoint1).perform();
		
		

}
}