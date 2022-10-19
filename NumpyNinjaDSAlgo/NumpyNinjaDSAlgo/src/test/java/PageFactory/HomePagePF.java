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
	
	@FindBy(css = "div.row.row-cols-1.row-cols-md-3.g-4 div.col:nth-child(2) div.card.h-100 div.card-body.d-flex.flex-column > a.align-self-end.btn.btn-lg.btn-block.btn-primary ")
	WebElement btn_ArrayGetStarted;
	
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
	public void clickOnArrayGetStrtBtn() {
		btn_ArrayGetStarted.click();
	}
}