package seleniumBasic;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

@SuppressWarnings("unused")
public class launchChrome implements A{
	
	public void launch()
	{	
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome driver\\chromedriver.exe");
		//driver = new ChromeDriver();
		String url = "https://www.browserstack.com/users/sign_in";
		driver.get(url);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		
		 File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		 try {
			FileUtils.copyFile(SrcFile, new File(".//screenshot/1.Dashboard/Dashboard.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void switchTo()
	{
	  String handle = driver.getWindowHandle();
	  driver.switchTo().window(handle);
	}

	public void getText() {
		// TODO Auto-generated method stub
		
	}

	public void scroll() {
		// TODO Auto-generated method stub
		
	}

	public void dropDown() {
		// TODO Auto-generated method stub
		
	}

	public void login() {
		// TODO Auto-generated method stub
		
	}


	public void handle() {
		// TODO Auto-generated method stub
		
	}

	public void verifyLink() throws IOException {
		// TODO Auto-generated method stub
		
	}

	public void verifyLink1() throws IOException {
		// TODO Auto-generated method stub
		
	}
}
