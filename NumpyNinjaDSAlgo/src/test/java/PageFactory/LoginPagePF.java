package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePF {

WebDriver driver;
	
	@FindBy(xpath = "//input[@id='id_username']")
	WebElement txt_username;
	
	@FindBy(xpath = "//input[@id='id_password']")
	WebElement txt_password;
	
	@FindBy(xpath = "//body/div[2]/div[1]/div[2]/form[1]/input[4]")
	WebElement btn_login;
	
	
	public LoginPagePF(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	public void enterUsername() {
		 txt_username.sendKeys("Roopashree");
} 
	public void enterPassword() {
		txt_password.sendKeys("DSAlgo#212");
	}
	public void loginBtnClicked() {
		btn_login.click();
	}
}


