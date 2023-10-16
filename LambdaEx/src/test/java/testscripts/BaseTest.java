package testscripts;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import generics.Browser;
import generics.CommonLib;
import generics.Reports;
import pagefactory.AlertPage;
import pagefactory.HomePage;
import testdata.Constants;

public class BaseTest {
	
	ExtentSparkReporter esr1;
	ExtentReports extentReports;
	ExtentTest test;
	
	WebDriver driver;
	CommonLib commonLibObj;
	
	HomePage homePageObj;
	AlertPage alertPageObj;
	
	@BeforeSuite
	public void beforeSuite() {
		esr1=new ExtentSparkReporter("target/ExecutionReport.html");
		extentReports=new ExtentReports();
		extentReports.attachReporter(esr1);
	}
	
	@AfterSuite
	public void afterSuite() {
		extentReports.flush();
	}
	
	@BeforeMethod
	public void beforeMethod(Method method) {
		test=extentReports.createTest(method.getName());
		
		Reports.info("launch the browser:"+Constants.browserName, test);
		Browser browser=new Browser();
		driver=browser.getBrowser(Constants.browserName);
		Reports.info("Navigate to url:"+Constants.url, test);
		driver.get(Constants.url);
		
		commonLibObj=new CommonLib(test, Constants.milliseconds);
		homePageObj=new HomePage(driver);
		alertPageObj=new AlertPage(driver);
		
	}
	
	@AfterMethod
	public void afterMethos() {
		Reports.info("Close the browser", test);
		driver.quit();
	}

}
