package seleniumBasic;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class brokenLink implements A{

	public void handle() throws IOException
	{
	
	String clicklnk = Keys.chord(Keys.CONTROL,Keys.ENTER); // to open a link in new tab
	
	WebElement l1 = driver.findElement(By.linkText("Test on iPhone"));
	l1.sendKeys(clicklnk);
	
	WebElement l2 = driver.findElement(By.linkText("Test on Right Devices"));
	l2.sendKeys(clicklnk);
 		 
	WebElement l3 = driver.findElement(By.linkText("About Us"));
	l3.sendKeys(clicklnk);
	
	hList.add(l1);
	hList.add(l2);
	hList.add(l3);
	
	for(int i=0; i<hList.size(); i++)
	{
		String url = hList.get(i).getAttribute("href");
		
		//URL link = new URL(url);
		
		HttpURLConnection http = (HttpURLConnection)(new URL(url).openConnection());
		http.setRequestMethod("HEAD");
		http.connect();
		int respCode = http.getResponseCode();
		
		if(respCode>=400)
		{
			System.out.println(url+" is invalid");
		}
		else
		{
			System.out.println(url+" is valid");
		}
    }
	
	driver.quit();
	  
	}
	
	public void verifyLink() throws IOException
	{
		
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

	public void verifyLink1() throws IOException {
		// TODO Auto-generated method stub
		
	}

}
