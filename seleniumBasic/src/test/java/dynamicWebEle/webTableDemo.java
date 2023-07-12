package dynamicWebEle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTableDemo {
	static WebDriver driver = new ChromeDriver();
	
	public void launchHomePage() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome driver\\chromedriver.exe");
		//driver = new ChromeDriver();
		String url = "https://www.w3schools.com/html/html_tables.asp";
		driver.get(url);
		Thread.sleep(5000);
		
		driver.manage().window().maximize();    
		Thread.sleep(5000);
	
	}
	
	public void fetchTableData()
	{
		String BeginningXPath = "//*[@id='customers']/tbody/tr[";
		String EndingXPath = "]/td[1]";
		
		for(int i=2; i<=7;i++)
		{
						
			String xPathValue = BeginningXPath+i+EndingXPath;
			WebElement webTableElement = driver.findElement(By.xpath(xPathValue));
			String countryElement = webTableElement.getText();
			//System.out.println(countryElement);
			
			if(countryElement.equalsIgnoreCase("Island Trading"))
		{
				System.out.println("The country found is "+webTableElement.getText()+" found at position "+(i-1));
				break;
			}	
		
		}
					
	}

	public static void main(String[] args) throws Exception {
		webTableDemo wt = new webTableDemo();
		wt.launchHomePage();
		wt.fetchTableData();
		driver.quit();
		
	}

}
