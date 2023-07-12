package seleniumBasic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class uploadFile{
	
	WebDriver driver;
	
public void launch() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Chrome driver\\chromedriver.exe");
	driver = new ChromeDriver();
	String url = "https://www.ilovepdf.com/pdf_to_word";	
	driver.get(url);	
}

public void fileUpload() throws InterruptedException, AWTException
{
	Actions a = new Actions(driver);
	WebElement srcFile = driver.findElement(By.id("pickfiles"));
	a.moveToElement(srcFile).click().perform();
	Thread.sleep(3000);
	//srcFile.sendKeys("C:\\Users\\arvin\\Downloads\\Pragya_Kumari_8_Yrs_Exp.pdf");
    
	String filePath = "C:\\Users\\pragy\\Downloads\\Pragya_Kumari_8_Yrs_Exp.pdf";
	upload(filePath);
	
	Thread.sleep(10000);
	String s = FilenameUtils.getExtension(filePath);
	System.out.println(s);
}

public static void setClipBoard(String file)
{
	StringSelection obj = new StringSelection(file);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(obj, null);
}

public static void upload(String filePath) throws AWTException
{
	setClipBoard(filePath);
	
	Robot rb = new Robot();
	
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_ENTER);
	
}
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		uploadFile uf = new uploadFile();
		uf.launch();
		uf.fileUpload();

	}

}
