package testngDemo;
//
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class A {
	WebDriver driver;
	public static ExtentReports  extentReports;
	public static ExtentTest  extentTest;
	
	@BeforeTest
	public void launch(ITestContext context)
	{	
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/users/sign_in");
	
		driver.manage().window().maximize();
		
		Capabilities capabilities = ((RemoteWebDriver)driver).getCapabilities();
		
		String device = capabilities.getBrowserName()+" "+capabilities.getBrowserVersion().substring(0,capabilities.getBrowserVersion().indexOf("."));
		String author = context.getCurrentXmlTest().getParameter("author");
		
		extentTest = extentReports.createTest(context.getName());
		extentTest.assignAuthor(author);
		extentTest.assignDevice(device);
	}
	
	@AfterTest
	public void quit() {
	driver.quit();

	}
	
	@BeforeSuite
	public void initExtentReport() 
	{	
		ExtentSparkReporter ESR = new ExtentSparkReporter("Report.html");
		extentReports = new ExtentReports();	
		extentReports.attachReporter(ESR);
		
		extentReports.setSystemInfo("OS", System.getProperty("os.name"));
		extentReports.setSystemInfo("Java version", "java.version");	
	}
		
	@AfterSuite
	public void flush() throws IOException 
	{
		extentReports.flush();
		Desktop.getDesktop().browse(new File("Report.html").toURI());
	}	
		
}
