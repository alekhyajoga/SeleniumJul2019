package sample;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


	public class DemoTestng2 {
		//init webdriver
		WebDriver driver;
	  @Test
	  public void browserInit() {
		   
		   driver=Drivers.getDriver("chrome");
		   driver.get("http://newtours.demoaut.com/");
			  
	  }
	  @Test
	  public void openApp() {  
		  	//title of the page
			System.out.println(driver.getTitle()); 
	  
	  }
	  
	  
	}
