package datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatepickBootstrap {
	
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("datepicker1")).click();
		Thread.sleep(2000);
		int i = 0;
		while (i==0) {
			String text = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
			if(!(text.equals("March 1991")))
			{
			driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			}
			else
				break;
			
		}
		driver.findElement(By.xpath("//a[text()='21']")).click();
		 
		
	}

}
