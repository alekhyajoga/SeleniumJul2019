package sample;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Cruises {
  @Test
  public void printcruises() {
	  WebDriver driver;
	
			  driver=Drivers.getDriver("chrome");
		  
		  driver.get("http://newtours.demoaut.com/mercurycruise.php");
		  WebElement ele=driver.findElement(By .xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/th/table/tbody/tr[5]"));
		 List <WebElement> coll=driver.findElements(By .tagName("tr"));
				 System.out.println(coll.size());
		   for(int i=0;i<=coll.size()-1;i++)
		    {
		    String lnk_name=coll.get(i).getText();
		    System.out.println(lnk_name);
		    
		   }
		 
  }}
 