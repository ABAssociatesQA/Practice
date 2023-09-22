package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Ajax Form Submit']")
	private WebElement ajaxFormSubmit_link;
	
	public WebElement ajaxFormSubmit_link() {
		return ajaxFormSubmit_link;
	}
	
	@FindBy(xpath="//a[text()='Checkbox Demo']")
	private WebElement checkboxDemo_link;
	
	public WebElement checkboxDemo_link() {
		return checkboxDemo_link;
	}
	
	@FindBy(xpath="//a[text()='Javascript Alerts']")
	private WebElement javascriptAlert_link;
	
	public WebElement javascriptAlert_link() {
		return javascriptAlert_link;
	}

}
