package androidDriver;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class WebAutomation_Selenium4Links {
	AndroidDriver<WebElement> driver;
  @Test
  public void f() throws InterruptedException {
	  driver.get("http://selenium4testing.com");
	  try {
		driver.findElement(By.xpath("//android.widget.Image[@text='dbclose']")).click();
	} catch (Exception e) {
		System.out.println("Not available");
	}
	  driver.findElement(By.xpath("//android.view.View[@text='MENU']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//android.view.View[@text='SELENIUM FAQS']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//android.view.View[@text='MENU']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//android.view.View[@text='MANUAL FAQS']")).click();
	  
  }
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	  DesiredCapabilities dc =new DesiredCapabilities();
	  dc.setCapability("deviceName", "cfe4689f");
	  dc.setCapability("platformVersion", "9");
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("appPackage", "com.android.chrome");
	  dc.setCapability("appActivity", "com.google.android.apps.chrome.Main");
	  dc.setCapability("fullReset", false);
	  dc.setCapability("noReset", true);
	  driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), dc);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

  }

  @AfterTest
  public void afterTest() {
  }

}
