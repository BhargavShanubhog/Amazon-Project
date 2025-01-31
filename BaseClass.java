package stepDefinition;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import Utility.ReadConfig;
import POM.HomePage;
import POM.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	public ReadConfig po;
	public HomePage p;
	public LoginPage r;
	public static Logger log;

}
