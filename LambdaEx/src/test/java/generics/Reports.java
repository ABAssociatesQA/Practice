package generics;

import org.testng.Reporter;

import com.aventstack.extentreports.ExtentTest;

public class Reports {
	
	public static void info(String message) {
		Reporter.log(message,true);
	}
	
	public static void info(String message,ExtentTest test) {
		Reporter.log(message,true);
		test.info(message);
	}

}
