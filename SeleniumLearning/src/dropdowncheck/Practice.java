package dropdowncheck;


	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Practice {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium files\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement create =driver.findElement(By.xpath("//*[@id='u_0_0_iP']"));
		create.click();
		Thread.sleep(2000);
	List<WebElement>dayList=driver.findElements(By.xpath("//*[@id='day']//option"));
	for(WebElement day:dayList) {
		if(day.getText().equals("16"))
		day.click();
	}
		
		List<WebElement>monthList=driver.findElements(By.xpath("//*[@title=\\\"Month\\\"]//option"));
		for(WebElement month:monthList) {
			if(month.getText().equalsIgnoreCase("Jun"))
			month.click();
		}
			
			List<WebElement>yearList=driver.findElements(By.xpath("//*[@id='year']//option"));	
			for(WebElement year:yearList) {
				if(year.getText().equals("1989"))
					year.click();
				//driver.close();
			}
		
	
		
	}

	}

