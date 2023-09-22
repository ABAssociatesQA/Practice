package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxDemoPage {
	
	public CheckboxDemoPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="isAgeSelected")
	private WebElement clickOnCheckbox_checkbox;
	
	public WebElement clickOnCheckbox_checkbox() {
		return clickOnCheckbox_checkbox;
	}

	@FindBy(id="txtAge")
	private WebElement checked_visibleText;
	
	public WebElement checked_visibleText() {
		return checked_visibleText;
	}
	
}
