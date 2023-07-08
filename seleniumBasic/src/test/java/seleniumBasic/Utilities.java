package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Utilities {
	
	private static By abc = By.xpath("//div[@class='abc']"); // This is By element
	
	@FindBy(xpath = "//div[@class='abc']") // This is web element
	public WebElement abcElement;

}
