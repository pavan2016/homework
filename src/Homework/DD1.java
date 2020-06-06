package Homework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class DD1 {
	
	public WebDriver driver;
	
  @Test
  public void f() {
	  
	  List<WebElement> values = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).getOptions();
	  System.out.println(values.get(3).getText());
	  
	  
	  
  }
  
 
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pavan\\Downloads\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.spicejet.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
	  
	  
  }

}
