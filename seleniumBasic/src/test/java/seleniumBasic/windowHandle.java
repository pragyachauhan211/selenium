package seleniumBasic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class windowHandle implements A{
	
	public void handle()
	{
		String clicklnk = Keys.chord(Keys.CONTROL,Keys.ENTER); // to open a link in new tab
		
		driver.findElement(By.linkText("Test on iPhone")).sendKeys(clicklnk);
		driver.findElement(By.linkText("Te0st on Right Devices")).sendKeys(clicklnk);
		driver.findElement(By.linkText("About Us")).sendKeys(clicklnk);
		
		Set<String> handles = driver.getWindowHandles(); // to handle multiple window 
		List<String> hList = new ArrayList<String>(handles);
		 
		if(switchToRightWindow("Test On The Right Mobile Devices | BrowserStack",hList))
		{
		System.out.println(driver.getTitle()); 
		}
		 driver.quit();
		}
	
	public static boolean switchToRightWindow(String windowTitle, List<String> hList)
	{
	  for(String e: hList)
		{
		  String title = driver.switchTo().window(e).getTitle();
		  if(title.contains(windowTitle))
			{
			  System.out.println("Return the right window");
			  return true;
			}
		}
		 return false;	
	}

	public void getText() {
		
	}

	public void scroll() {
		
	}

	public void dropDown() {
		
	}

	public void login() {
		
	}

	public void launch() {
		
	}

	public void switchTo() {
		
	}

	public void verifyLink() throws IOException {
		
	}

	public void verifyLink1() throws IOException {
		// TODO Auto-generated method stub
		
	}


}
