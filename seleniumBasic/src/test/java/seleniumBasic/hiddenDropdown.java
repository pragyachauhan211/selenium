package seleniumBasic;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class hiddenDropdown implements A{
	
	  public void dropDown() { 
	
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
	  
	  
	  File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		 try {
			FileUtils.copyFile(SrcFile, new File(".//screenshot/3.Drop Down/dropDown.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	  }

	public void getText() {
		// TODO Auto-generated method stub
		
	}

	public void scroll() {
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

	public void verifyLink() throws IOException {
		// TODO Auto-generated method stub
		
	}

	public void verifyLink1() throws IOException {
		// TODO Auto-generated method stub
		
	}


	

}
