package seleniumBasic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

public class returnText implements A{
	
	public void getText()
	{
		
		try
		  {
			  Thread.sleep(4000);
		  }
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  }
		
        WebElement logo = driver.findElement(By.xpath("(//p[@class='footer-habitat__heading'])[1]"));
		
		System.out.println(logo.getText());
		
		  try
		  {
			  Thread.sleep(4000);
		  }
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  }
		
		  File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			 try {
				FileUtils.copyFile(SrcFile, new File(".//screenshot/5.Scroll and return text/returnText.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		

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

	public void launch() {
		// TODO Auto-generated method stub
		
	}

	public void switchTo() {
		// TODO Auto-generated method stub
		
	}

	public void handle() {
		// TODO Auto-generated method stub
		
	}

	public void handle1() {
		// TODO Auto-generated method stub
		
	}

	public void verifyLink() throws IOException {
		// TODO Auto-generated method stub
		
	}

	public void verifyLink1() throws IOException {
		// TODO Auto-generated method stub
		
	}
	
	
}
