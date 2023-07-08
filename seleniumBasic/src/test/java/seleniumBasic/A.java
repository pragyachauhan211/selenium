package seleniumBasic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

interface A 
{
	public static WebDriver driver = new ChromeDriver();
	public static TakesScreenshot scrShot =((TakesScreenshot)driver);
	List<WebElement> hList = new ArrayList<WebElement>();
	
	public void getText();
	public void scroll();
	public void dropDown();
	public void login();
	public void launch();
	public void switchTo();
	public void handle() throws IOException;
	public void verifyLink() throws IOException;
	public void verifyLink1() throws IOException;
	
	
}
