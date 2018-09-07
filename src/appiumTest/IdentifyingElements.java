package appiumTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class IdentifyingElements extends BaseClass{
	
	public static void main(String[] args) throws MalformedURLException {
		
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//xpath id, class name and androidUiAutomator
		driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
		
		driver.findElement(By.id("android:id/checkbox")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='WiFi settings']")).click();
		
		//driver.findElement(By.id("android:id/edit")).sendKeys("Hello");
		
		driver.findElement(By.className("android.widget.EditText")).sendKeys("Hello");
		
		driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
		
		
	}
	

}
