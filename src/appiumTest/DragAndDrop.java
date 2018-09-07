package appiumTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.ElementOption;

public class DragAndDrop extends BaseClass{

	public static void main(String[] args) throws MalformedURLException {
		
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
		
		TouchAction t=new TouchAction<>(driver);
		//t.longPress(ElementOption.element(driver.findElement(By.className("")))).moveTo(ElementOption.element(driver.findElement(By.id("com.example.android.apis:id/drag_dot_3")))).release().perform();
		//t.longPress(ElementOption.element(driver.findElementByAndroidUIAutomator("resource-id(\"com.example.android.apis:id/drag_dot_1\")"))).moveTo(ElementOption.element(driver.findElementByAndroidUIAutomator("resource-id(\"com.example.android.apis:id/drag_dot_1\")"))).release().perform();
		
		t.longPress(ElementOption.element(driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.example.android.apis:id/drag_dot_1']")))).moveTo(ElementOption.element(driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.example.android.apis:id/drag_dot_1']")))).release().perform();
		
		
		
	}

}
