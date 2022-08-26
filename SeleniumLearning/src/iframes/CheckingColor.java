package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingColor {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();
		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		WebElement colorAddress = driver.findElement(By.xpath("//*[@class='ui-slider-range ui-corner-all ui-widget-header ui-slider-range-min']"));
		String colorvalueRgb = colorAddress.getCssValue("background-color");
		System.out.println(colorvalueRgb );

}
}