package dragAndDropDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import basicWorkflowWithBasicConcepts.baseClass;
import io.appium.java_client.AppiumBy;

public class dragDropSample extends baseClass {

	public dragDropSample() {
		super();
	}

	public void views() throws InterruptedException {
		Thread.sleep(3000);

		// click on view
		androidDriver.findElement(AppiumBy.accessibilityId("Views")).click();

	}

	public void dragOption() throws InterruptedException {
		Thread.sleep(3000);
		// click on drag and drop option
		androidDriver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();

	}

	public void draggingFunc() throws InterruptedException {
		Thread.sleep(3000);

		WebElement element = androidDriver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));

		((JavascriptExecutor) androidDriver).executeScript("mobile: dragGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(), "endX", 716, "endY", 674));
		
		Thread.sleep(5000);
		
		//Display message that the element is dropped
		WebElement elementDroppedOff = androidDriver.findElement(By.id("io.appium.android.apis:id/drag_result_text"));
        System.out.println(elementDroppedOff.getText());
	}
}
