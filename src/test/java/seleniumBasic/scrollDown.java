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

	public void getText() {
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
}
