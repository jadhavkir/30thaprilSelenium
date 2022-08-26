package dropdowncheck;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingDropdown {

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://mbasic.facebook.com/");
driver.manage().window().maximize();
driver.findElement(By.cssSelector("#signup-button input")).click();

List<WebElement> dayList=driver.findElements(By.xpath("//*[@id='day']//option"));
for(WebElement day: dayList) {
if(day.getText().equals("21"))
day.click();

}
List<WebElement> monthList = driver.findElements(By.xpath("//*[@title=\"Month\"]//option"));
for(WebElement month:monthList) {
if(month.getText().equals("Mar"))
month.click();
	
}
List<WebElement>yearList=driver.findElements(By.xpath("//*[@id='year']//option"));
for(WebElement year:yearList) {
if(year.getText().equals("1991"))
year.click();
	
	}

}
}