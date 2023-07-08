package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dimension {
	
	public void dim()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.browserstack.com/users/sign_in";
		driver.get(url);
		
		Dimension currentDimension = driver.manage().window().getSize();
		int height = currentDimension.getHeight();
		int width = currentDimension.getWidth();
		System.out.println("Current height of window: "+ height); // get height of window
		System.out.println("Current width of window: "+width); // get width of window
		
		WebElement button = driver.findElement(By.xpath("//button[@id='accept-cookie-notification']"));
		button.click();
		
		WebElement userid = driver.findElement(By.xpath("//input[@id='user_email_login']"));
		userid.sendKeys("Pragya");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Dimension d = userid.getSize();
		System.out.println(d.height);  // get height of text field
		System.out.println(d.width);  // get width of text field
		
		// Set new size
		Dimension newDimension = new Dimension(1050, 708);
		driver.manage().window().setSize(newDimension);	
		driver.quit();	
		
	}

	public static void main(String[] args) {
		dimension d = new dimension();
		d.dim();

	}

}
