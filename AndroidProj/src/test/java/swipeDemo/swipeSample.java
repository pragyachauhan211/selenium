package swipeDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

import basicWorkflowWithBasicConcepts.baseClass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumFluentWait;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class swipeSample extends baseClass {

	public swipeSample() {
		super();
	}

	public void views() throws InterruptedException {
		Thread.sleep(3000);

		// click on view
		androidDriver.findElement(AppiumBy.accessibilityId("Views")).click();
		Thread.sleep(3000);

	}

	public void gallery() throws InterruptedException {

		// click on view
		androidDriver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		Thread.sleep(3000);

	}

	public void photos() throws InterruptedException {
		Thread.sleep(3000);

		// click on view
		androidDriver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		// androidDriver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1.
		// Photos\"]")).click();
		Thread.sleep(5000);

	}

	public void swipeToLeft() {
		// WebElement firstImagElement =
		// androidDriver.findElements(By.className("(android.widget.ImageView)")).get(0);
		// WebElement firstImagElement =
		// androidDriver.findElement(By.xpath("(//android.widget.ImageView)[1]"));
		WebElement firstImagElement = androidDriver
				.findElement(By.xpath("(//*[@class='android.widget.ImageView'])[2]"));

		String flag = firstImagElement.getAttribute("focusable");
		System.out.println(flag + " at starting");

		// using touch Action
		TouchAction touchAction = new TouchAction(androidDriver);
		PointOption swipeOption = new PointOption();
		swipeOption.withCoordinates(-10, 0);

		touchAction.press(ElementOption.element(firstImagElement)).waitAction().moveTo(swipeOption).release().perform();

		/*
		 * ((JavascriptExecutor) androidDriver).executeScript("mobile: swipeGesture",
		 * ImmutableMap.of( "elementID",((RemoteWebElement)firstImagElement).getId(),
		 * "direction", "left", "percent", 0.75 ));
		 */

		// Java
		/*
		 * ((JavascriptExecutor) androidDriver).executeScript("mobile: swipeGesture",
		 * ImmutableMap.of( "left", 336, "top", 267, "width", 744, "height", 531,
		 * "direction", "left", "percent", 0.75 ));
		 */
		// ((JavascriptExecutor) androidDriver).executeScript("mobile: swipeGesture",
		// ImmutableMap.of("elementID",((RemoteWebElement)firstImagElement).getId(),"direction",
		// "left", "percent", 0.75));
		System.out.println(flag + " at the last");
	}

}
