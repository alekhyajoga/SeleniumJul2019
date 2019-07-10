package CS2;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import sample.Drivers;



public class Payment {
	WebDriver driver;
  
	
	@Test (priority=4)
  
  public void testPayment() {
	  
	
	  	

  	driver.findElement(By .name("ShippingAdd")).sendKeys("Chennai-530017");
  	driver.findElement(By .className("btn btn-primary btn-submit-fix")).click();
  	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  	driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label/input")).click();
  	driver.findElement( By .id("btn")).click();
  	driver.findElement(By .name("username")).sendKeys("123456");
  	driver.findElement(By .name("password")).sendKeys("Pass@456");
  	driver.findElement(By .name("LOGIN")).click();
  	driver.findElement(By .name("transpwd")).sendKeys("Trans@456");
  	driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
  	driver.findElement(By .linkText("logout.htm")).click();
  	
  	
  }
}
