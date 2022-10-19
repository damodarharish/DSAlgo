package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.GetStartedPF;
import PageFactory.TreePagePF;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreeStep {
	WebDriver driver = null;
	
	
//	@Before
//	public void initilizeDriver() {
//		System.out.println("****************In Driver Intilize   treee************");
//		String projectPath = System.getProperty("user.dir");
//		System.out.println("The Project path is: "+projectPath);
//		// set the chrome driver path
//		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
//	  
//		driver = new ChromeDriver();
//	  
//		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//		  
//		  //driver.manage().window().maximize();
//	}
//	
//	@After
//	public void driverClose() {
//		
//		System.out.println("****************In Driver Close ************");
//		driver.close();
//		driver.quit();
//	}
//	@Given("user on the Tree DataStructure page after logged in")
//	public void user_on_the_tree_data_structure_page_after_logged_in() {
//		System.out.println("user on the Tree DataStructure page after logged in");
//		getstartPF = new TreePagePF(driver);
//	    getstartPF.clickOnTreeGetStrtBtn();
//	    System.out.println("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
//	}

//	@When("user clicks Overview of Trees link")
//	public void user_clicks_overview_of_trees_link() throws InterruptedException {
//	    System.out.println("user clicks Overview of Trees link");
//	    getstartPF.clickOverviewsOTrees();
//	    Thread.sleep(2000);
//	}
//
//	@Then("user should be redirected to Tree page")
//	public void user_should_be_redirected_to_tree_page() {
//	    System.out.println("user should be redirected to Tree page ");
//	    
//	}

}
