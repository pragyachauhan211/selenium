package dynamicWebEle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// https://youtu.be/6RaDZhfXHI8

public class dynamicElementFromSearch {
	
static WebDriver driver = new ChromeDriver();
	
	public void launchHomePage() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome driver\\chromedriver.exe");
		//driver = new ChromeDriver();
		String url = "https://www.google.com/";
		driver.get(url);
		
		driver.manage().window().maximize();    	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
