package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakingSS2ndWay {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/results?search_query=palindrome+program+in+java");
		driver.manage().window().maximize();
		
		TakesScreenshot screenshot =(TakesScreenshot)driver;
	File source=screenshot.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\Swapnil Bhosale\\Pictures\\Screenshots\\Screenshots.png");
	FileHandler.copy(source, destination);
	Thread.sleep(1000);
	driver.quit();
	
	}
}

