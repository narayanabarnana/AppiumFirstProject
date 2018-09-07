package appiumTest;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class SwipeGesture extends BaseClass{

	public static void main(String[] args) throws MalformedURLException {
		
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Date Widgets']")).click();
		
		//driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
		
		//xpath will not work if the tag name has special character like $ so we need to use either below or findElementByAndroidUIAutomator
		//driver.findElement(By.xpath("\\*[@text='Date Widgets']")).click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		
		driver.findElement(By.xpath("//*[@content-desc='9']")).click();
		
		//Swipe gesture : using moveTo option we can swipe
		TouchAction t=new TouchAction<>(driver);
		t.press(ElementOption.element(driver.findElement(By.xpath("//*[@content-desc='15']")))).waitAction(new WaitOptions().withDuration(Duration.ofSeconds(5))).moveTo(ElementOption.element(driver.findElement(By.xpath("//*[@content-desc='45']")))).release().perform();
		
		System.out.println(driver.findElement(By.id("android:id/time_header")).getText());
	}

}
