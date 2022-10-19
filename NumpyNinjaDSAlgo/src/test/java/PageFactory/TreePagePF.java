package PageFactory;

import javax.print.attribute.SetOfIntegerSyntax;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TreePagePF {

	WebDriver driver;
	
	@FindBy(css = "div.row.row-cols-1.row-cols-md-3.g-4 div.col:nth-child(6) div.card.h-100 div.card-body.d-flex.flex-column > a.align-self-end.btn.btn-lg.btn-block.btn-primary")
	WebElement btn_TreeGetStarted;
	
	@FindBy(xpath = "//a[contains(text(),'Overview of Trees')] ")
	WebElement lnk_OverviewofTrees;
	
	public TreePagePF(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
}
	public void clickOnTreeGetStrtBtn() {
		System.out.println("Helll TREEEEEEEEEEEEEEEEEEEEEEEEEE");
		btn_TreeGetStarted.click();
}
	public void clickOverviewsOTrees() {
		lnk_OverviewofTrees.click();
		
	}
}