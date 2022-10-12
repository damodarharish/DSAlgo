package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePF {

	WebDriver driver;
	
	@FindBy(xpath = "//a[contains(text(),'Sign in')] ")
	WebElement btn_signin;
	
	@FindBy(xpath = "//a[contains(text(),'Sign out')]")
	WebElement btn_sigoutt;
	
	
	public HomePagePF(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnSigninBtn() {
		btn_signin.click();
	}
	public void signoutBtnDisplayed() {
		btn_sigoutt.isDisplayed();
	}
}