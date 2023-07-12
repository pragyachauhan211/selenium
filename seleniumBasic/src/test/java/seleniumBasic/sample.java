package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.w3schools.com/html/html_tables.asp";
		driver.get(url);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	

		driver.manage().window().maximize();
	
		WebElement element = driver.findElement(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']"));
		    
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		    
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String BeginningXPath = "//*[@id=\"customers\"]/tbody/tr[";
		String EndingXPath = "]/td[3]";
		
		for(int i=2; i<=7;)
		{						
			String xPathValue = BeginningXPath+i+EndingXPath;
			WebElement webTableElement = driver.findElement(By.xpath(xPathValue));
			String countryElement = webTableElement.getText();
			
			if(countryElement.equals("Austria"));
			{
				System.out.println("The country found is "+countryElement);
				break;
			}			
		}
		
		driver.quit();		

	}

}
