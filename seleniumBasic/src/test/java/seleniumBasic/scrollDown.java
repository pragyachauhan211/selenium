package seleniumBasic;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;

public class scrollDown implements A
{
	public void scroll()
	{		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		  File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			 try {
				FileUtils.copyFile(SrcFile, new File(".//screenshot/4.Scroll/scrollDown.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
	}

	public void getText() 
	{	
		
	}

	public void dropDown() 
	{
		
	}

	public void login() 
	{
		
	}

	public void launch() 
	{
		
	}

	public void switchTo() 
	{
		
	}

	public void handle() 
	{
		
	}

	public void handle1() 
	{
		
	}

	public void verifyLink() throws IOException 
	{
		
	}

	public void verifyLink1() throws IOException {
		// TODO Auto-generated method stub
		
	}
}
