package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetStartedPF {
	
	@FindBy(xpath = "//button[contains(text(),'Get Started')]")
	WebElement btn_getstarted;

	WebDriver driver;
	
	public GetStartedPF(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	public void btngetstartedclicked() {
		btn_getstarted.click();
	}
}