package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.GetStartedPF;
import PageFactory.HomePagePF;
import PageFactory.LoginPagePF;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class DSAlgoStepDefinition {
	
	WebDriver driver = null;
	GetStartedPF getstrtPF;
	HomePagePF homePF;
	LoginPagePF loginPF;


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
	    Thread.sleep(2000);
		 
	    homePF = new HomePagePF(driver);
	    homePF.clickonsigninbtn();
	    Thread.sleep(2000);
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("inside user enters username and password ");
		
		loginPF = new LoginPagePF(driver);
		loginPF.enterUsername();
		loginPF.enterPassword();
		
		loginPF = new LoginPagePF(driver);
		loginPF.loginBtnClicked();
		}
		
	@And("user click on sign in button")
	public void user_click_on_sign_in_button() {
		System.out.println("inside user click on sign in button");		
		
	}

	@Then("user in th home page")
	public void user_in_th_home_page() {
		System.out.println("inside user in th home page");
		
		homePF = new HomePagePF(driver);
	    homePF.signoutbtnclicked();
	}
	
	
}
