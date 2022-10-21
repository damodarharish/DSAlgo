package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.GetStartedPF;
import PageFactory.HomePagePF;
import PageFactory.LoginPagePF;
import PageFactory.TreePagePF;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreeStep {
	WebDriver driver = null;
	TreePagePF trepgPF;
	GetStartedPF getstrtPF;
	HomePagePF homePF;
	LoginPagePF loginPF;
	
	@Before
	public void initilizeDriver() {
		System.out.println("****************In Driver Intilize   treee************");
		String projectPath = System.getProperty("user.dir");
		System.out.println("The Project path is: "+projectPath);
		//set the chrome driver path
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");
	  
		driver = new ChromeDriver();
	  
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		  
		  //driver.manage().window().maximize();
	}
	
	@After
	public void driverClose() {
		
		System.out.println("****************In Driver Close ************");
		driver.close();
		driver.quit();
	}


	@Given("user on the login page")
	public void user_on_the_login_page() throws InterruptedException {
		
	    System.out.println("inside user on the login page");
	    driver.navigate().to("https://dsportalapp.herokuapp.com/");
	    
	    getstrtPF = new GetStartedPF(driver);
	    getstrtPF.btngetstartedclicked();
	   
	    homePF = new HomePagePF(driver);
	    homePF.clickOnSigninBtn();
	    
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("inside user enters username and password ");
		
	loginPF = new LoginPagePF(driver);
		loginPF.enterUsername();
		loginPF.enterPassword();
		
		}
		
	@And("user click on sign in button")
	public void user_click_on_sign_in_button() {
		System.out.println("inside user click on sign in button");	
		
		loginPF.loginBtnClicked();
		
	}

	@Then("user in th home page")
	public void user_in_th_home_page() {
		System.out.println("inside user in th home page");
		
	    homePF.signoutBtnDisplayed();
	}
	@Given("user on the Tree DataStructure page after logged in")
	public void user_on_the_tree_data_structure_page_after_logged_in() {
		System.out.println("user on the Tree DataStructure page after logged in");
		trepgPF = new TreePagePF(driver);
	   trepgPF.clickOnTreeGetStrtBtn();
	    System.out.println("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
	}

	@When("user clicks Overview of Trees link")
	public void user_clicks_overview_of_trees_link()  {
	    System.out.println("user clicks Overview of Trees link");
	    trepgPF.clickOverviewsOTrees();
	   
	}

	@Then("user should be redirected to Tree page")
	public void user_should_be_redirected_to_tree_page() {
	    System.out.println("user should be redirected to Tree page ");
	    
	}
	@And("user clicks Terminologies link")
	public void user_clicks_terminologies_link()  {
		System.out.println("user clicks Terminologies link ");
		driver.navigate().back();
        driver.navigate().back();
		
		trepgPF.clickTerminologies();
		
	}
	@When("user click on Try Here button")
	public void user_click_on_try_here_button()  {
	 System.out.println("user click on Try Here button "); 
	
	 trepgPF.clickOnTryHereBtn();
	
	}

	@Then("user shoud be redirected to tryEditor page with Run button")
	public void user_shoud_be_redirected_to_try_editor_page_with_run_button() {
	   System.out.println(" user shoud be redirected to tryEditor page with Run button");
	    trepgPF.clickOnRunBtn();
	    
	}

	@And("user clicks Types of Trees link")
	public void user_clicks_types_of_trees_link()  {
	   System.out.println("user clicks Types of Trees link "); 
	
	   driver.navigate().back();
       driver.navigate().back();
	   trepgPF.clickOnTypesOfTrees();
	  
	}
	

	@Then("user should be redirected to tryEditor page with run button")
	public void user_should_be_redirected_to_try_editor_page_with_run_button(){
	    System.out.println("user should be redirected to tryEditor page with run button ");
	    trepgPF.clickOnRunBtn();
	  
	}
	@And("user clicks  on Types of trees link")
	public void user_clicks_on_types_of_trees_link()  {
	   System.out.println("user clicks  on Types of trees link ");
	   trepgPF.clickOnTypesOfTrees();
	   
	}
	@Then("user clicks Tree Traversals link")
	public void user_clicks_tree_traversals_link() {
	  System.out.println("user clicks Tree Traversals link "); 
	  
	  driver.navigate().back();
      driver.navigate().back();
	  trepgPF.clickOnTreeTreversal();
	 
}
	@Then("user clicks Traversals-Illustration link")
	public void user_clicks_traversals_illustration_link() {
	    System.out.println("user clicks Traversals-Illustration link ");
	    driver.navigate().back();
	      driver.navigate().back();
	    trepgPF.clickOnTraversalIllustration();
	    
	}	
	@Then("user clicks Binary Trees")
	public void user_clicks_binary_trees() {
	   System.out.println("user clicks Binary Trees ");
	   driver.navigate().back();
	    driver.navigate().back();
	      
		    
	   trepgPF.clickOnBinaryTrees();
	   
	}
	@Then("user clicks Implementation in Python link")
	public void user_clicks_implementation_in_python_link()  {
	   System.out.println("user clicks Implementation in Python link ");
	   driver.navigate().back();
	    driver.navigate().back();
	     trepgPF.clickOnImplementationinPython();
	  
	}
	
	@Then("user clicks Binary Tree Traversals link")
	public void user_clicks_binary_tree_traversals_link() {
		System.out.println("user clicks Binary Tree Traversals link ");
		driver.navigate().back();
	    driver.navigate().back();
		trepgPF.clickOnBinaryTreeTraversals();
		 
	}
	@Then("user clicks Implementation of Binary Trees link")
	public void user_clicks_implementation_of_binary_trees_link() {
	   System.out.println("user clicks Implementation of Binary Trees link ");
	   driver.navigate().back();
	    driver.navigate().back();
	   trepgPF.clickOnImplementationOfBinaryTrees();
	}

	@Then("user clicks Appliations of Binary Trees link")
	public void user_clicks_appliations_of_binary_trees_link()  {
		System.out.println("user clicks Appliations of Binary Trees link ");
		driver.navigate().back();
	    driver.navigate().back();
		trepgPF.clickOnAppliationsOfBinaryTrees();
		 
	}
	@Then("user clicks Binary Search Trees link")
	public void user_clicks_binary_search_trees_link() {
	 System.out.println("user clicks Binary Search Trees link ");  
	 driver.navigate().back();
	    driver.navigate().back();
	 
	 trepgPF.clickOnBinarySearchTrees();
	}

	@Then("user clicks Implementation Of BST link")
	public void user_clicks_implementation_of_bst_link() {
	    System.out.println(" user clicks Implementation Of BST link");
	    driver.navigate().back();
	    driver.navigate().back();
	    trepgPF.clickOnImplementationOfBST();
	   
	}	
	
}	
	
	
	


	
	



