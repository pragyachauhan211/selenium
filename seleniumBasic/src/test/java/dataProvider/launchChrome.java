package dataProvider;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class launchChrome {

	WebDriver driver;
	TakesScreenshot scrShot;
	int countScreen = 2;
	@Test(dataProvider="PassTestData")
	public void launchPage(String username, String password)
	{
		driver = new ChromeDriver();
		scrShot =((TakesScreenshot)driver);
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome driver\\chromedriver.exe");
		//driver = new ChromeDriver();
		String url = "https://www.browserstack.com/users/sign_in";
		driver.get(url);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		 try {
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(SrcFile, new File(".//screenshot/1.Dashboard/Dashboard.png"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='accept-cookie-notification']")).click();
		driver.findElement(By.xpath("//input[@id='user_email_login']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(password);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 //TakesScreenshot scrShot =((TakesScreenshot)driver);
		
		 try {	
			 File SrcFile1=scrShot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(SrcFile1, new File(".//screenshot/"+countScreen+".Login/login.png"));
			countScreen++;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 Assert.assertTrue(driver.getTitle().contains("BrowserStack Login | Sign Into The Best Mobile & Browser Testing Tool"), "Invalid Credential");
		
	}
    
	@AfterMethod
    public void close()
    {
    	 driver.quit(); 
    }
	
	@DataProvider(name="PassTestData")
	public Object[][] passData()
	{
		Object[][] data = new Object[2][2];
		data[0][0] = "admin1";
		data[0][1] = "password1";
		data[1][0] = "admin2";
		data[1][1] = "password2";
		return data;
	}  
}
