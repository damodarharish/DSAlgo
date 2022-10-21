package PageFactory;

import javax.print.attribute.SetOfIntegerSyntax;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TreePagePF {

	WebDriver driver;
	Actions acct;
	
	@FindBy(css = "div.row.row-cols-1.row-cols-md-3.g-4 div.col:nth-child(6) div.card.h-100 div.card-body.d-flex.flex-column > a.align-self-end.btn.btn-lg.btn-block.btn-primary")
	WebElement btn_TreeGetStarted;
	
	@FindBy(xpath = "//a[contains(text(),'Overview of Trees')] ")
	WebElement lnk_OverviewofTrees;
	
	@FindBy(css = "body:nth-child(2) div:nth-child(2) ul:nth-child(12) > a.list-group-item")
	WebElement lnk_Terminologies;
	
	@FindBy(xpath = "//a[contains(text(),'Try here>>>')] ")
	WebElement btn_Tryhere;
	
	@FindBy(xpath = "//button[contains(text(),'Run')] ")
	WebElement btn_Run;
	
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea ")
	WebElement txt_editor;
	
	
	@FindBy(xpath = "//a[contains(text(),'Types of Trees')] ")
	WebElement lnk_TypesOfTrees;
	
	@FindBy(xpath = "//body/div[2]/ul[4]/a[1] ")
	WebElement lnk_TreeTreversal;
	
	@FindBy(xpath = "//body/div[2]/ul[6]/a[1] ")
	WebElement lnk_BinaryTrees;
	
	@FindBy(xpath = "//a[contains(text(),'Traversals-Illustration')] ")
	WebElement lnk_TraversalsIllustration;
	
	@FindBy(xpath = "//a[contains(text(),'Implementation in Python')] ")
	WebElement lnk_ImplementationinPython;
	
	@FindBy(xpath = "//a[contains(text(),'Binary Tree Traversals')] ")
	WebElement lnk_BinaryTreeTraversals;
	
	
	
	@FindBy(xpath = "//a[contains(text(),'Implementation of Binary Trees')] ")
	WebElement lnk_ImplementationOfBinaryTrees;
	
	
	@FindBy(xpath = "//a[contains(text(),'Applications of Binary trees')] ")
	WebElement lnk_AppliationsOfBinaryTrees;
	
	@FindBy(xpath = "//a[contains(text(),'Binary Search Trees')]")
	WebElement lnk_BinarySearchTrees;
	
	@FindBy(xpath = "//a[contains(text(),'Implementation Of BST')] ")
	WebElement lnk_ImplementationOfBST;
	
	
	public TreePagePF(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
}
	
	public void clickOnTraversalIllustration() {
		lnk_TraversalsIllustration.click();
	}
	public void clickOnImplementationOfBST() {
		lnk_ImplementationOfBST.click();
	}
	
	public void clickOnBinarySearchTrees() {
		lnk_BinarySearchTrees.click();
	}
	public void clickOnAppliationsOfBinaryTrees() {
		lnk_AppliationsOfBinaryTrees.click();
	}
	
	public void clickOnImplementationOfBinaryTrees(){
	lnk_ImplementationOfBinaryTrees.click();
	
	}
	public void clickOnImplementationinPython() {
		lnk_ImplementationinPython.click();
	}
	public void clickOnBinaryTreeTraversals() {
		lnk_BinaryTreeTraversals.click();
	}
	
	
	public void clickOnTreeTreversal() {
		lnk_TreeTreversal.click();
	
}	
	public void clickOnBinaryTrees() {
		lnk_BinaryTrees.click();
	}
	
	
	public void clickOnTreeGetStrtBtn() {
		System.out.println("Helll TREEEEEEEEEEEEEEEEEEEEEEEEEE");
		btn_TreeGetStarted.click();
}
	public void clickOverviewsOTrees() {
		lnk_OverviewofTrees.click();
		
	}
	public void clickTerminologies() {
		lnk_Terminologies.click();
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
	public void clickOnTypesOfTrees() {
		lnk_TypesOfTrees.click();
	}
}