package Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
     Properties properties;
	
	String path="/Project80/src/test/resources/config.properties";
	
	public ReadConfig() {
		try {
			properties=new Properties();
			
			//to open config.properties file in input mode and load the file
			FileInputStream file=new FileInputStream(path);
			properties.load(file);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getBrowser() {
		String value=properties.getProperty("browser");
		if(value!=null) {
			return value;
		}
		else {
			throw new RuntimeException("browser not specified in config. file");
		}
	}
	
	public String getURL() {
		String value=properties.getProperty("url");
		if(value!=null) {
			return value;
		}
		else {
			throw new RuntimeException("url not specified in config. file");
		}
	}
	
	public String GetProperty() {
		String value=properties.getProperty("execution_env");
		if(value!=null) {
			return value;
		}
		else {
			throw new RuntimeException("execution_env  not specified in config. file");
		}
	}

	public String GetOS() {
		String value=properties.getProperty("os");
		if(value!=null) {
			return value;
		}
		else {
			throw new RuntimeException("os not specified in config. file");
		}
	}
	
	public String getmode1() {
		String value=properties.getProperty("item");
		if(value!=null) {
			return value;
		}
		else {
			throw new RuntimeException("item not specified in config. file");
		}
	}
		

}
