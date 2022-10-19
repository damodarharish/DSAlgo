package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import PageFactory.ArraysDsPF;
import PageFactory.GetStartedPF;
import PageFactory.HomePagePF;
import PageFactory.LoginPagePF;
import PageFactory.TreePagePF;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class DSAlgoStepDefinition {
	
	WebDriver driver = null;
	GetStartedPF getstrtPF;
	HomePagePF homePF;
	LoginPagePF loginPF;
	ArraysDsPF arraysPF;
	TreePagePF getstartPF;
	
	
	@Before
	public void initilizeDriver() {
		System.out.println("****************In Driver Intilize ************");
		String projectPath = System.getProperty("user.dir");
		System.out.println("The Project path is: "+projectPath);
		// set the chrome driver path
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
	
	
	@Given("user on the Array DataStructure page after logged in")
	public void user_on_the_array_data_structure_page_after_logged_in()   {
		System.out.println("user on the Array DataStructure page after logged in");
		homePF = new HomePagePF(driver);
		homePF.clickOnArrayGetStrtBtn();	
		
	}

	@When("user clicks Arrays in Python link")
	public void user_clicks_arrays_in_python_link()  {
		
		arraysPF = new ArraysDsPF(driver);
		arraysPF.clickArraysInPython();
		
	}

	@Then("user should be redirected to Arrays in Python page")
	public void user_should_be_redirected_to_arrays_in_python_page() {
		System.out.println("user should be redirected to Arrays in Python page");
	}

	@When("user click on Try Here button")
	public void user_click_on_try_here_button() throws InterruptedException {
		System.out.println("user on Arrays in Python page after logged in");
		arraysPF = new ArraysDsPF(driver);
		arraysPF.clickOnTryHereBtn();			
		
	}
	
	@Then("user shoud be redirected to tryEditor page with Run button")
	public void user_shoud_be_redirected_to_try_editor_page_with_run_button() throws InterruptedException  {
		System.out.println("user shoud be redirected to tryEditor page with Run button");
		
		
		arraysPF.clickOnRunBtn();
		 driver.navigate().back();
		 driver.navigate().back();
			
	}
	
	@When("user clicks Array using list link")
	public void user_clicks_array_using_list_link() throws InterruptedException {
		System.out.println("%%%%%%%%%%%%%%%% user clicks Array using list link $$$$$$$$$$$");
		
		arraysPF = new ArraysDsPF(driver);
		arraysPF.clickArraysUsingList();
		
	}

	@Then("user should be redirected to Arrays using list link")
	public void user_should_be_redirected_to_arrays_using_list_link() {
		System.out.println("%%%%%%%%%%%%%%%% user should be redirected to Arrays using list link $$$$$$$$$$$");
	}
	
	@When("user click on Try Here button on Array list link page")
	public void user_click_on_try_here_button_on_array_list_link_page() {
		System.out.println("%%%%%%%%%%%%%%%% user click on Try Here button on Array list link page $$$$$$$$$$$");
		arraysPF.clickOnTryHereBtn();		
	}
	
	@Then("user should be redirected to tryEditor page with Run button")
	public void user_should_be_redirected_to_try_editor_page_with_run_button() throws InterruptedException {
		System.out.println("inside user should be redirected to tryEditor page with Run button ");
		
		arraysPF.clickOnRunBtn();
		driver.navigate().back();
		 driver.navigate().back();
		
		

	}
	@When("user clicks Basic operation inlists page")
	public void user_clicks_basic_operation_inlists_page()  {
	    System.out.println("####inside user clicks Basic operation inlists page ####");
	    arraysPF = new ArraysDsPF(driver);
	    arraysPF.clickBasicOperationLi();
	    
	}

	@Then("user should be redirected to  Basic operation in lists page")
	public void user_should_be_redirected_to_basic_operation_in_lists_page() {
		System.out.println("$$$$inside user should be redirected to  Basic operation in lists page$$$$ ");
	    
	}

	@When("user click on Try Here button on Basic operation in lists page")
	public void user_click_on_try_here_button_on_basic_operation_in_lists_page() {
		System.out.println("%%%%inside user click on Try Here button on Basic operation in lists page%%%%");
		arraysPF.clickOnTryHereBtn();		
		
		
	}
	@When("user clicks Applictaions of Array page link")
	public void user_clicks_applictaions_of_array_page_link() {
	    System.out.println("%%%%%%inside user clicks Applictaions of Array page link%%%%%% ");
	    arraysPF = new ArraysDsPF(driver);
	    arraysPF.clickApplicationOnArray();
	}

	@Then("user should be redirected to  Applictaions of Array page")
	public void user_should_be_redirected_to_applictaions_of_array_page()  {
	   System.out.println("#####inside user should be redirected to  Applictaions of Array page####");


	 
	   }
	@When("user click on Try Here>>>")
	public void user_click__on_try_here()  {
		System.out.println(("%%%%%inside user click on Try Here>>>%%%%%%"));
		arraysPF.clickOnTryHereBtn();		
		
	}
	@Given("user on the Array page after logged in")
	public void user_on_the_array_page_after_logged_in() {
	    System.out.println("inside user on the Array page after logged in");
	    
	   
	}    
}
	