package scrollDownUpDemo;

import org.openqa.selenium.JavascriptExecutor;

import com.google.common.collect.ImmutableMap;

import basicWorkflowWithBasicConcepts.baseClass;
import io.appium.java_client.AppiumBy;

public class scrollingDemo extends baseClass {

	public scrollingDemo() 
	{
		super();
	}

	public void scrollUntilFindElement() throws InterruptedException 
	{
		Thread.sleep(3000);
		
		//click on view
		androidDriver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(3000);
		
		//scroll till that web element
		androidDriver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));")); //WebView is my text until where it has to be scrolled
		Thread.sleep(3000);
	}
	
	public void scrollUntilBottomScreen() throws InterruptedException 
	{
		Thread.sleep(3000);
		
		//click on view
		androidDriver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(3000);
		
		// scroll until bottom screen
		// Java
		boolean canScrollMore;
		
		do {
		canScrollMore= (Boolean) ((JavascriptExecutor) androidDriver).executeScript("mobile: scrollGesture", ImmutableMap.of(
		    "left", 100, "top", 100, "width", 200, "height", 200,
		    "direction", "down",
		    "percent", 3.0
		));
		}while(canScrollMore);
		
	}
}
