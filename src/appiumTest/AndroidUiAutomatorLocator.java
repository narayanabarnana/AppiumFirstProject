package appiumTest;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AndroidUiAutomatorLocator extends BaseClass{

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		
		//driver.findElementByAndroidUIAutomator("attribute("value")");
		
				//Java doesnt accept quotes inside the quotes. so we have to use \
				driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
				
				//validate all clickable options in Views tab
				System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());

	}

}
