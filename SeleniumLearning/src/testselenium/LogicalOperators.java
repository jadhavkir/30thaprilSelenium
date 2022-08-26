package testselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogicalOperators {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://web.whatsapp.com/");
		//Thread.sleep(2000);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		String Url = driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(Url);
		WebElement txttoverify = driver.findElement(By.xpath("//*[text()='LOGIN Panel']"));
		String txt = txttoverify.getText();
		WebElement element = driver.findElement(By.xpath("//div[contains(text(),'LOGIN')]"));
		String value = element.getText();
		System.out.println(value);
		
		System.out.println(txt);
		WebElement username = driver.findElement(By.xpath("//*[@id='txtUsername' and @name='txtUsername']"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.xpath("//*[@id='txtPassword' or @name='textInputContainer']"));
		password.sendKeys("admin123");
		WebElement btnLogin = driver.findElement(By.xpath("//*[@id='btnLogin' and @name='Submit']"));
	    btnLogin.click();
		
	//	driver.close();
	}


	}


