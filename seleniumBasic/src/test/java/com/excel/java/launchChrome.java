package com.excel.java;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class launchChrome {
	
	WebDriver driver;
	TakesScreenshot scrShot;
	
	
	//@Test(dataProvider="PassTestData")
	@Test
	public void launchPage()
	{		
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome driver\\chromedriver.exe");
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://www.browserstack.com/users/sign_in";
		driver.get(url);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		Xls_read read = new Xls_read("C:\\Users\\arvin\\eclipse-workspace\\seleniumBasic\\src\\test\\resources\\TestData.xlsx");
		
		int rowCount= read.getRowCount("Sheet1");
		
		
		for(int i =2; i<=rowCount; i++)
		{
			
			String firstName = read.getCellData("Sheet1", "Username", i);
			String pwd = read.getCellData("Sheet1", "Password", i);	
		
		
		//driver.findElement(By.xpath("//button[@id='accept-cookie-notification']")).click();
		
		driver.findElement(By.xpath("//input[@id='user_email_login']")).clear();
		driver.findElement(By.xpath("//input[@id='user_email_login']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@id='user_password']")).clear();
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(pwd);
		
		/*
		 * try { Thread.sleep(5000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
	}
	}

	  @AfterMethod public void close() 
	  {
	   driver.quit(); 
	  }	
	 
}

