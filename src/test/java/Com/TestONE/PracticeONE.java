package Com.TestONE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeONE 
{
   WebDriver driver;
   
   @BeforeTest
   public void beforetest()
   {
	 System.setProperty("webdriver.chrome.driver", "Nikki/chromedriver.exe");
	 ChromeOptions options = new ChromeOptions();
	 options.addArguments("--start-maximized");
	 driver = new ChromeDriver(options);
	 driver.get("https://www.facebook.com/login/");
	 
	    
   }
   
   @Test
   public void Logintest()
   { 
	    // driver.findElement(By.id("email")).sendKeys("nikhil.tirthakar@gmail.com"); //id
	    //driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nikhil.tirthakar@gmail.com");//xpath_type
	    // driver.findElement(By.xpath("//input[@name='email']")).sendKeys("nikhil.tirthakar@gmail.com");//xpath_name
	    driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("nikhil.tirthakar@gmail.com");//	   
	  
	   // driver.findElement(By.id("pass")).sendKeys("");
	    //driver.findElement(By.xpath("//input[@tabindex='1'][@placeholder='Password']")).sendKeys("nikki");
	    driver.findElement(By.cssSelector("input[]"));
	    driver.findElement(By.id("loginbutton")).click();
	     	     
   }
 
   
   @AfterTest
   public void afterclass()
   {
	 driver.quit();  
	   
   }
	
}
