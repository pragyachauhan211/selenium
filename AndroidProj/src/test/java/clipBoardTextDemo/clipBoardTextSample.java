package clipBoardTextDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;

import basicWorkflowWithBasicConcepts.baseClass;
import io.appium.java_client.AppiumBy;

public class clipBoardTextSample extends baseClass {

	public clipBoardTextSample() {
		super();
	}

	public void firstScreen_preferences() throws Exception {	
		// AppiumBy.accessibilityId is used with locator - Preference  
		androidDriver.findElement(AppiumBy.accessibilityId("Preference")).click();
	}

	public void preferences_dependencies() throws Exception {
		
		// "//tagname[@attribute='value'] (this is valid xpath)--> //tagName (and this is also valid xpath)
		androidDriver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		//androidDriver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
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
	
	public void preferences_wifi_Settings_getText() throws Exception 
	{
		//androidDriver.findElement(By.tagName("(//android.widget.RelativeLayout)[2]")).click();
		//androidDriver.findElement(By.xpath("(//android.widget.RelativeLayout)[0]")).click();
		
		//WebElement a= androidDriver.findElement(By.className("android.widget.RelativeLayout"));
		String getTitleString = androidDriver.findElement(By.id("android:id/alertTitle")).getText();
		System.out.println(getTitleString);
				
	}
	
	public void preferences_wifi_settings_clipBoard() throws Exception
	{
		Thread.sleep(3000);
		androidDriver.setClipboardText("Pragya");
		androidDriver.findElement(By.className("android.widget.EditText")).sendKeys(androidDriver.getClipboardText());
	    Thread.sleep(4000);
	}
	
	public void preferences_wifi_settings_giveInputs_thenClickOK()
	{
		androidDriver.findElement(By.id("android:id/button1")).click();
	}
	

	
}
