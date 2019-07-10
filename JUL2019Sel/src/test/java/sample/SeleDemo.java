/package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SeleDemo {
	WebDriver driver;
  @Test
  public void seltest() {
	  driver=Drivers.getDriver("chrome");
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   driver.get("http://newtours.demoaut.com/");
	   boolean b=driver.findElement(By .linkText("REGISTER")).isDisplayed();
	   System.out.println(b);
	  driver.findElement(By .linkText("REGISTER")).click();
	 Select sel=new Select(driver.findElement(By .name("country")));
	 sel.selectByValue("1");
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 sel.selectByVisibleText("INDIA");
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			 sel.selectByIndex(220);
			 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  }
}
