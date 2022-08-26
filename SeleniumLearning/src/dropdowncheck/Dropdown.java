package dropdowncheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {


		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://demo.automationtesting.in/Datepicker.html");
			driver.manage().window().maximize();
			
			driver.findElement(By.id("datepicker2")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//select[@title='Change the year']//option[contains(text(),  '▲')]")).click();
			driver.findElement(By.xpath("//select[@title='Change the year']//option[contains(text(),  '▲')]")).click();
			
			WebElement year = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/select[2]"));
			Select sel = new Select(year);
			sel.selectByVisibleText("1991");
			Thread.sleep(1000);
			
			WebElement month = driver.findElement(By.xpath("//select[@title='Change the month']"));
			Select mnth = new Select(month);
			mnth.selectByIndex(2);
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//a[text()='21']")).click();
				
			
		}

}
