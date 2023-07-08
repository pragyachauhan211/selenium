package seleniumBasic;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

public class loginUser implements A{
	
	public void login()
	{
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='accept-cookie-notification']")).click();
		
		WebElement user = driver.findElement(By.xpath("//input[@id='user_email_login']"));
		user.sendKeys("Pragya");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='user_password']"));
		password.sendKeys("Pragya");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
		String userID = user.getAttribute("value");
		System.out.println("User ID is"+userID);
		
		String pwd = password.getAttribute("value");
		System.out.println("Password is"+pwd);
		
		 //TakesScreenshot scrShot =((TakesScreenshot)driver);
		 File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		 try {
			FileUtils.copyFile(SrcFile, new File(".//screenshot/2.Login/login.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void getText() {
		
	}

	public void scroll() {
		
	}

	public void dropDown() {
		
	}

	public void launch() {
		
	}

	public void switchTo() {
		
	}

	public void handle() {
		
	}

	public void handle1() {
		
	}

	public void verifyLink() throws IOException {
		
	}

	public void verifyLink1() throws IOException {
		
	}

	


	
}
