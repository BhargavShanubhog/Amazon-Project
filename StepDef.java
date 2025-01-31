package stepDefinition;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import POM.LoginPage;
import Utility.ReadConfig;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import POM.HomePage;

public class StepDef extends BaseClass {
	@Given("open url")
	public void open_url() throws IOException {
		log=LogManager.getLogger("StepDef");
        po=new ReadConfig();
       
        
		
		String browser=po.getBrowser();
		if(po.GetProperty().equalsIgnoreCase("remote")) {
			DesiredCapabilities capabilities=new DesiredCapabilities ();
			//os
			if(po.GetOS().equalsIgnoreCase("windows")) {
				capabilities.setPlatform(Platform.WIN11);
			}else if(po.GetOS().equalsIgnoreCase("mac")) {
				capabilities.setPlatform(Platform.MAC);
				
			}else {
				System.out.println("No matching os");
				return;
			}
			
			//browser
			switch(browser.toLowerCase()) {
			case "chrome": capabilities.setBrowserName("chrome"); break;
			case "edge": capabilities.setBrowserName("MicrosoftEdge"); break;
			
			default:System.out.println("No matching browser"); return;
			
			}
			driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
			
		}
		else {
		switch(browser) {
		case "chrome":
			
			
			driver=new ChromeDriver();
			break;
			
		case "msedge":
			
			driver=new EdgeDriver();
			break;
			
		case "firefox":
			
			driver=new FirefoxDriver();
			break;
			
		default:
			driver=null;
			return;
			
	    
	}
		}
        log.info("Driver has setup");
		
		r=new LoginPage(driver);
		String url=po.getURL();
		r.launch(url);
	    
	}

	@Given("sign out from current account")
	public void sign_out_from_current_account() {
	    r.signout();
	}

	@When("type email id ")
	public void type_email_id() {
		String email = null;
	    r.UserName(email);
	}

	@When("press continue button")
	public void press_continue_button() {
	    r.Continue();
	}

	@Then("type password ")
	public void type_password() {
		String password=null;
	    r.Password(password);
	}

	@Then("press sign in button")
	public void press_sign_in_button() {
	    r.SignIn();
	}

	@When("type email id bhargavshanubhog")
	public void type_email_id_bhargavshanubhog() {
		String email = null;
	    r.UserName(email);
	 
	}

	@When("type email id {int}")
	public void type_email_id(Integer int1) {
		String email = null;
	    r.UserName(email);
	}

	@When("type email id bhargavshanubhog@gmail.com")
	public void type_email_id_bhargavshanubhog_gmail_com() {
		String email = null;
	    r.UserName(email);
	}

	@Then("type password jklou")
	public void type_password_jklou() {
		String password=null;
	    r.Password(password);
	}

	@Then("type password S@{int}")
	public void type_password_s(Integer int1) {
		String password=null;
	    r.Password(password);
	}


}
