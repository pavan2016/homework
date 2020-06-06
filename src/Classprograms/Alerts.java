package Classprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Alerts {
	
	public WebDriver driver;
	
	
  @Test
  public void f() throws Exception {
	 
	  
	  driver.findElement(By.name("btnLogin")).click();
	   
	  String str = driver.switchTo().alert().getText();
	  
	  System.out.println(str);
	  
	  Thread.sleep(1000);
	  
	  driver.switchTo().alert().accept();
	    
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","E:\\Testing Tools\\Testing Softwares\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demo.guru99.com/V1/index.php");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
