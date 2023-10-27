package testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;

public class AlertTest extends BaseTest{
	
	@Test
	public void verifyAlert() {
		
		Assert.assertTrue(homePageObj.javascriptAlert_link().isDisplayed(),"javascriptAlert_link is not displayed");
		commonLibObj.click(homePageObj.javascriptAlert_link(), "javascriptAlert_link");
		
		softAssertObj.assertTrue(alertPageObj.confirmBox_clickMe_button().isDisplayed(), "confirmBox_clickMe_button is not displayed");
		commonLibObj.click(alertPageObj.confirmBox_clickMe_button(), "confirmBox_clickMe_button");
		
		Alert alert=driver.switchTo().alert();
		
		String message=alert.getText();
		if(message.equals("Press a button!")) {
			test.pass("Expected text is available");
			softAssertObj.assertEquals(message, "Press a button!");
		///	test.pass(MediaEntityBuilder.createScreenCaptureFromBase64String(((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64)).build());
		}else {

			test.fail("Expected text is not available");
			test.fail(MediaEntityBuilder.createScreenCaptureFromBase64String(((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64)).build());
		
		}
		
		alert.accept();
	}

}
