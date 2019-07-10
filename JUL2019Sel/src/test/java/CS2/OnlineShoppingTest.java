package CS2;

import org.testng.annotations.Test;
WebDriver driver;

@Test
public class OnlineShoppingTest 
{
	
	 driver=Drivers.getDriver("chrome");
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	     driver.manage().window().maximize();
	     driver.findElement(By .name("userName")).sendKeys("lalitha");
	   driver.findElement(By .name("password")).sendKeys("password123");
	   driver.findElement(By .name("Login")).click();
	   
	}
}
