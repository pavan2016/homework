package Homework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Dropdown {
	 public WebDriver driver;
	
  @Test
  public void f() {
	  
	 WebElement ele = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).getFirstSelectedOption();
	 System.out.println(ele.getText());
	  if(ele.getText().equalsIgnoreCase("INR"))
	  {
		  System.out.println("Dropdown validation = INR");
	  }
	  
	  else
	  {
		  System.out.println("dropdown failed");
		  
	  }
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  System.setProperty("webdriver.chrome.driver","E:\\Testing Tools\\Testing Softwares\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.spicejet.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  
	  
  }

}
