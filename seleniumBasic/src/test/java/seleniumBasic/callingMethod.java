package seleniumBasic;

import java.io.IOException;

public class callingMethod {

	 public static void main(String[] args)
	{
		//ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments(null)
		A e = new launchChrome();
		e.launch();
		A d = new loginUser();
		d.login();
		A c = new hiddenDropdown();
		c.dropDown();
		A b = new scrollDown();
		b.scroll();
		A a = new returnText();
		a.getText();	
		//A w = new windowHandle();
		//w.handle();
		A w = new brokenLink();
		try {
			w.handle();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			
	}
 }
