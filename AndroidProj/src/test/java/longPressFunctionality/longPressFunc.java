package longPressFunctionality;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import basicWorkflowWithBasicConcepts.baseClass;
import dev.failsafe.internal.util.Assert;
import io.appium.java_client.AppiumBy;

public class longPressFunc extends baseClass {

	public longPressFunc()
	{
		super();
	}
	
	public void views() throws Exception
	{
		Thread.sleep(3000);
		androidDriver.findElement(AppiumBy.accessibilityId("Views")).click();;
	}
	
	public void expandableLists() throws InterruptedException
	{
		Thread.sleep(3000);
		androidDriver.findElement(By.xpath("//android.widget.TextView[@content-desc='Expandable Lists']")).click();
	}
	
	public void customAdaptor() throws InterruptedException
	{
		Thread.sleep(3000);
		androidDriver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
	}
	
	public void peopleNames() throws InterruptedException
	{
		Thread.sleep(3000);
		
		WebElement element = androidDriver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		
		//androidDriver.executeScript("mobile: longClickGesture", ImmutableMap.of("00000000-0000-0098-ffff-ffff00000044",((RemoteWebElement) element).getId(),"duration",2000));
		
		
		((JavascriptExecutor)androidDriver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),"duration",2000
			));
		
		Thread.sleep(3000);
		
		
	}
	
	
}
