package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakingSS  {
	static WebDriver driver;
	public void screenShots(WebDriver driver, String SSname)  throws IOException {
	TakesScreenshot scrnshot= (TakesScreenshot)driver;
	File source = scrnshot.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\Swapnil Bhosale\\Pictures\\Screenshots\\pic01.png");
	FileHandler.copy(source, destination);
	}
	public static void main(String args[]) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/results?search_query=palindrome+program+in+java");
		driver.manage().window().maximize();
	
		TakingSS ss = new TakingSS();
		ss.screenShots(driver,"pic01");
		Thread.sleep(1000);
		driver.quit();
	
	}
}
