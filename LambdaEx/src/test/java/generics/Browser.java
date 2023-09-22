package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {
	
	WebDriver driver;
	String driverPath;
	
	public WebDriver getBrowser(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			driverPath="../LambdaEx/Drivers/116/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverPath);
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(options);
		}
		
		return driver;
		
		
	}

}
