package seleniumBasic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice{
	WebDriver driver1 = new ChromeDriver();
	//
	//driver = new ChromeDriver();
	String url = "https://www.browserstack.com/users/sign_in";
	
	public void abc() throws AWTException
	{
	
	driver1.getTitle();
	String s = Keys.chord(Keys.ENTER, "n");
	
	WebElement e = driver1.findElement(By.id("fgf"));
	e.sendKeys(s);
	
	Actions a = new Actions(driver1);
	a.moveToElement(e).perform();
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	
	Keys.chord(Keys.CONTROL, Keys.ENTER);
	
	List<WebElement> list = driver1.findElements(By.id("name"));
	
	list.size();
	
	for(int i=0; i<list.size(); i++)
	{
	  	list.get(i).getAttribute("value");
	}
	
	driver1.findElement(By.xpath("(//h4[@class='eJ7tvc'])[1]"));
	
	}
	
	public static void main(String[] args) throws IOException 
	{
	
	}
	
	

}
