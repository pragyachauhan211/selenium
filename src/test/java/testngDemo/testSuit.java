package testngDemo;
//
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class testSuit extends A{	
	
	@Test(description = "login credential verification")
	public void drop() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@id='accept-cookie-notification']")).click();
		extentTest.info("Navigate to URL");
		WebElement user = driver.findElement(By.xpath("//input[@id='user_email_login']"));
		user.sendKeys("Pragya");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='user_password']"));
		password.sendKeys("Pragya");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String userID = user.getAttribute("value");
		System.out.println("User ID is"+userID);
		
		String pwd = password.getAttribute("value");
		System.out.println("Password is"+pwd);
		
	}
	
	@Test(description = "drop down")
	  public void dropDown() throws InterruptedException { 

		driver.findElement(By.xpath("//button[@id='accept-cookie-notification']")).click();
		
		WebElement user = driver.findElement(By.xpath("//input[@id='user_email_login']"));
		user.sendKeys("Pragya");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='user_password']"));
		password.sendKeys("Pragya");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String userID = user.getAttribute("value");
		System.out.println("User ID is"+userID);
		
		String pwd = password.getAttribute("value");
		System.out.println("Password is"+pwd);
		
		  WebElement dropDown = driver.findElement(By.xpath("//button[@id='product-menu-toggle']")); 
		  Actions actions = new Actions(driver); 
		  actions.moveToElement(dropDown).perform(); 
		  try
		  { 
			  Thread.sleep(4000); 
		  } 
		  catch (InterruptedException e) 
		  { // TODO
		  e.printStackTrace(); 
		  }
		  
		  String drop = Keys.chord(Keys.ENTER, "n");
		  driver.findElement(By.xpath("(//a[@class='header-dropdown-item'])[5]")).sendKeys(drop);
		  		  
	}
		  

	
	
}
