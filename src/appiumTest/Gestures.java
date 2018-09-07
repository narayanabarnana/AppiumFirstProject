package appiumTest;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;

//import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class Gestures extends BaseClass{

	public static void main(String[] args) throws MalformedURLException {
	
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//Tapping on element
		TouchAction t=new TouchAction<>(driver);//.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")")))).perform();
		t.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")")))).perform();

		
		//Clicking on Custom Adapter
		driver.findElement(By.xpath("//android.widget.TextView[@text='1. Custom Adapter']")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		
		
		//How to press the element for 5 second
		t.press(ElementOption.element(driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']")))).waitAction(new WaitOptions().withDuration(Duration.ofSeconds(5))).release().perform();
		
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Sample action']")).click();
		
	}

}
