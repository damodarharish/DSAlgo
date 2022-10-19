package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class ArraysDsPF {
		
	WebDriver driver;
	Actions acct;
	
	@FindBy(xpath = "//a[contains(text(),'Arrays in Python')]")
	WebElement lnk_ArraysInPython;
	
	@FindBy(xpath = "//a[contains(text(),'Arrays Using List')] ")
	WebElement lnk_ArraysUsingList;
	
	@FindBy(xpath = "//a[contains(text(),'Basic Operations in Lists')] ")
	WebElement lnk_BasicOperationsInList;
	
	@FindBy(xpath = "//a[contains(text(),'Applications of Array')] ")
	WebElement lnk_ApplicationsOnArray;
	
	@FindBy(xpath = "//a[contains(text(),'Try here>>>')]")
	WebElement btn_Tryhere;
	
	@FindBy(xpath = "//button[contains(text(),'Run')] ")
	WebElement btn_Run;
	
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea ")
	WebElement txt_editor;
	

	
	public ArraysDsPF(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	
}
	public void clickArraysInPython() {
		lnk_ArraysInPython.click();
	}
	public void clickArraysUsingList() {
		lnk_ArraysUsingList.click();
	}
	public void clickBasicOperationLi() {
		lnk_BasicOperationsInList.click();
	}
	public void clickApplicationOnArray() {
		lnk_ApplicationsOnArray.click();
	}
	public void clickOnTryHereBtn() {
		btn_Tryhere.click();
	}
	
	public void clickOnRunBtn() {
		acct = new Actions(driver);
		acct.click(txt_editor).sendKeys("print('hello')").perform();
		
		btn_Run.click();
	}
	
	public void enterPythonCode() {
		System.out.println("Inside python code=============");
		txt_editor.sendKeys("print 'Hello'");
	}
}