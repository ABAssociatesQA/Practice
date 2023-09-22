package generics;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentTest;

public class CommonLib {
	
	int milliseconds;
	ExtentTest test;
	
	public CommonLib(ExtentTest test, int milliseconds){
		this.test=test;
		this.milliseconds=milliseconds;
		
	}
	public void click(WebElement element, String webelementName) {
		test.info("Click on "+webelementName);
		Reporter.log("Click on "+webelementName,true);
		element.click();
		smartSleep();
		
	}
	
	public void sendKeys(WebElement element, String webelementName,String value) {
		test.info("Provide value to "+webelementName);
		Reporter.log("Provide value to "+webelementName,true);
		element.clear();
		element.sendKeys(value);
		smartSleep();
	}

	public void smartSleep() {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
