package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AjaxFormSubmitPage {
	
	public AjaxFormSubmitPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="title")
	private WebElement name_editbox;
	
	public WebElement name_editbox() {
		return name_editbox;
	}
	
	@FindBy(id="description")
	private WebElement message_editbox;
	
	public WebElement message_editbox() {
		return message_editbox;
	}
	
	@FindBy(id="btn-submit")
	private WebElement submit_button;
	
	public WebElement submit_button() {
		return submit_button;
	}
	
	@FindBy(id="submit-control")
	private WebElement processing_icon;
	
	public WebElement processing_icon() {
		return processing_icon;
	}

}
