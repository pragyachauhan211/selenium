package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Preferences extends baseClass {
	//AndroidDriver androidDriver = baseClass.androidDriver;
	
	public Preferences () {
	       super();
	  //     PageFactory.initElements(baseClass.androidDriver,this);
	    }

	public void firstScreen_preferences() throws Exception {
		
		androidDriver.findElement(AppiumBy.accessibilityId("Preference")).click();
	}

	public void preferences_dependencies() throws Exception {
		
		// "//tagname[@attribute='value'] (this is valid xpath)--> //tagName (and this is also valid xpath)
		androidDriver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		//androidDriver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
	}
	
	public void preferences_wifi_checkBox() throws Exception 
	{
		androidDriver.findElement(By.id("android:id/checkbox")).click();
	}
	
	public void preferences_wifi_tickCheckBox() throws Exception 
	{
		//androidDriver.findElement(By.tagName("(//android.widget.RelativeLayout)[2]")).click();
		androidDriver.findElement(By.id("android:id/checkbox")).click();
				
	}
	
	public void preferences_wifi_SettingsTap() throws Exception 
	{
		//androidDriver.findElement(By.tagName("(//android.widget.RelativeLayout)[2]")).click();
		//androidDriver.findElement(By.xpath("(//android.widget.RelativeLayout)[0]")).click();
		
		//WebElement a= androidDriver.findElement(By.className("android.widget.RelativeLayout"));
		androidDriver.findElements(By.className("android.widget.LinearLayout")).get(2).click();
				
	}
	
	public void preferences_wifi_settings_giveInputs() throws Exception
	{
		Thread.sleep(3000);
		androidDriver.findElement(By.className("android.widget.EditText")).sendKeys("Pragya");
	}
	
	public void preferences_wifi_settings_giveInputs_thenClickOK()
	{
		androidDriver.findElement(By.id("android:id/button1")).click();
	}
	

}
