package appiumTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.KeyEventFlag;

public class MiscellaneousConcepts extends BaseClass{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//To know the activity of app i.e each page has an activity
		//output : .ApiDemos
		System.out.println(driver.currentActivity());
		
		//To check the context whether it is native app or hybrid app or Web app
		//output : NATIVE_APP
		System.out.println(driver.getContext());
		
		//To check the orientation i.e. landscape or portrait
		System.out.println(driver.getOrientation());
		
		//To check mobile is locked or not
		System.out.println(driver.isDeviceLocked());
		
		//To hide keyboard
		//System.out.println(driver.hideKeyboard());
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//To Navigate to back page
		//driver.pressKeyCode(AndroidKeyCode.BACK);
		//driver.pressKey(new KeyEvent(AndroidKey.BACK));
//		driver.pressKey(new KeyEvent(AndroidKey.BACK).
//
//				withFlag(KeyEventFlag.SOFT_KEYBOARD).
//
//				withFlag(KeyEventFlag.EDITOR_ACTION));


		
		

}

}
