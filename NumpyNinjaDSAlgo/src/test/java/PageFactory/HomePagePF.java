package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePF {

	WebDriver driver;
	
	@FindBy(xpath = "//a[contains(text(),'Sign in')] ")
	WebElement Click_signinbtn;
	
	@FindBy(xpath = "//a[contains(text(),'Sign out')]")
	WebElement Click_sigouttbtn;
	
	
	public HomePagePF(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	public void clickonsigninbtn() {
		Click_signinbtn.click();
	}
	public void signoutbtnclicked() {
		Click_sigouttbtn.click();
	}
}