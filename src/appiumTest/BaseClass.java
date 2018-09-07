package appiumTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		
		File f=new File("src");
		File fs=new File(f,"ApiDemos-debug.apk");
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "NarayanaEmulator1");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		
		//Connection to the server
		//AndroidDriver driver=new AndroidDriver(conection to the server link, capability object);
		//We are working on Android server so we are selection AndroidDriver
		//http://127.0.0.1: is common for both android and ios server and 4723 is appium server which you are working
		AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
		//System.out.println("Program executed sucessfully");

	}

}
