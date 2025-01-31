package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']") WebElement g;
	@FindBy(xpath="//input[@id='ap_email_login']") WebElement k;
	@FindBy(xpath="//input[@type='submit']") WebElement y;
	@FindBy(xpath="//input[@id='ap_password']") WebElement r;
	@FindBy(xpath="//input[@id='signInSubmit']") WebElement p;
	
	public void launch(String url) {
		if(url!=null) {
			driver.get(url);
			driver.manage().window().maximize();
		}
		
	}
	
	public void signout() {
		wait.until(ExpectedConditions.presenceOfElementLocated((By) g)).click();
		
	}
	
	public void UserName(String username) {
		
		wait.until(ExpectedConditions.presenceOfElementLocated((By) k)).sendKeys(username);
		
	}
	
	public void Continue() {
		driver.findElement((By) y).click();
		
	}
	
	public void Password(String password) {
		wait.until(ExpectedConditions.presenceOfElementLocated((By) r)).sendKeys(password);
		
	}
	
	public void SignIn() {
		driver.findElement((By) p).click();
		
	}

}
