package POM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	private WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']") WebElement g;
	@FindBy(xpath="//span[normalize-space()='Create a Wish List']") WebElement u;
	@FindBy(xpath="//a[normalize-space()='Amazon Pay']") WebElement ha;
	@FindBy(xpath="//a[normalize-space()='New Releases']") WebElement r;
	@FindBy(xpath="//input[@id='twotabsearchtextbox']") WebElement p ;
	@FindBy(xpath="//input[@id='nav-search-submit-button']") WebElement search ;
	@FindBy(xpath="//i[@class='a-icon a-icon-star a-star-4 cm-cr-review-stars-spacing-big']") WebElement rate;
	@FindBy(xpath="//div[@class='a-section a-spacing-none aok-align-center aok-relative']") WebElement price;
	@FindBy(xpath="//div[@id='contextualIngressPtLabel_deliveryShortLine']") WebElement i;
	@FindBy(xpath="//span[@class='a-button-text']") WebElement pp;
	@FindBy(xpath="//h1[normalize-space()='Technical Details']") WebElement kk;
	
	
	public void launch(String url) {
		if(url!=null) {
			driver.get(url);
			driver.manage().window().maximize();
		}
		
	}
	
	
	public void Title() {
		
		String h=driver.getTitle();	
		
		
		if(h.contains("Amazon.in")) {
			boolean a=true;
			System.out.println(a);
		}
		
	}
	
	public void userlist() {
		wait.until(ExpectedConditions.presenceOfElementLocated((By) g));
		Actions a=new Actions(driver);
		a.moveToElement(g).perform();
		
		wait.until(ExpectedConditions.presenceOfElementLocated((By) u)).click();
		
		
		
	}
	
	public void AmazonPay() {
		driver.findElement((By) ha).click();
		
		
	}
	
	public void NewRelease() {
		driver.findElement((By) r).click();
		
		
	}
	
	public void ItemSearch(String name) {
		driver.findElement((By) p).sendKeys(name);
		driver.findElement((By) search).click();
		List<WebElement>l=driver.findElements(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']"));
		if(!l.isEmpty()) {
			l.get(0).click();
		}
		
	}
	
	public void price() {
		
		wait.until(ExpectedConditions.presenceOfElementLocated((By) rate));
		if(rate.isDisplayed()) {
			
		}
		
		
		
	}
	
	public void ratings() {
		
		driver.findElement((By) price);
		if(price.isDisplayed()) {
			
		}
		
		
		
	}
	
	public void location() {
		wait.until(ExpectedConditions.visibilityOfElementLocated((By) i)).click();
		
	}
	
	public void AddToCart() {
		wait.until(ExpectedConditions.elementToBeClickable(pp));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", pp);
		
	}
	
	public void TechnicalDetails() {
		wait.until(ExpectedConditions.presenceOfElementLocated((By) kk));
		JavascriptExecutor jl=(JavascriptExecutor)driver;
		jl.executeScript("arguments[0].scrollIntoView(true);", kk);
		
		
	}

}
