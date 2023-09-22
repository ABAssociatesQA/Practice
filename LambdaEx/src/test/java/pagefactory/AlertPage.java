package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPage {

	public AlertPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[text()='Confirm box:']/button")
	private WebElement confirmBox_clickMe_button;
	
	public WebElement confirmBox_clickMe_button() {
		return confirmBox_clickMe_button;
	}
	
	
}
