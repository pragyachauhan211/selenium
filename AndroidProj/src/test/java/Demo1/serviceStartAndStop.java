package Demo1;

import java.io.File;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class serviceStartAndStop {

	public static AppiumDriverLocalService service;
	AndroidDriver androidDriver;
	public static String AppiumMainJSPath = "C:\\Users\\pragy\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js";

	public static String NodeExePath = "C:\\Program Files\\nodejs\\node.exe";

	public static String ServerAddress = "0.0.0.0";

	public void startAppiumServer() {
		service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				.usingDriverExecutable(new File(NodeExePath)).withAppiumJS(new File(AppiumMainJSPath))
				.withIPAddress(ServerAddress).withArgument(GeneralServerFlag.BASEPATH, "wd/hub").usingPort(4723)
				.withLogFile(new File("D:\\Logs\\Logs.txt")));

		System.out.println("Starting Appium server.............");

		service.start();
	}

	public void launchApp() throws Exception {
		DesiredCapabilities cab = new DesiredCapabilities();

		cab.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		
		cab.setCapability("appPackage", "io.appium.android.apis");
		
		cab.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		
		cab.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S21 FE 5G");
		
		cab.setCapability(MobileCapabilityType.NO_RESET, true);
		
		androidDriver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), cab);
		
		System.out.println("Application launched successfully.");
		
		service.stop();
		
		System.out.println("Service stopped now..........");

	}

	public static void main(String[] args) throws Exception {
		
		serviceStartAndStop serviceStartAndStop = new serviceStartAndStop();
		serviceStartAndStop.startAppiumServer();
		serviceStartAndStop.launchApp();

	}

}
