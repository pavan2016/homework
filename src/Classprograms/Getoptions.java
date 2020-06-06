package Classprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Getoptions<webelement> {
	
	
	public WebDriver driver;
	private int i;
	
	
  @Test
  public void f() {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
	  driver.findElement(By.linkText("Registration")).click();
	  
	  //selecting particular  option
	  

	  
	  List<WebElement> List = new Select(driver.findElement(By.name("PATIENT_CAT"))).getOptions();
	  System.out.println(List.get(3).getText());
	  
	  for(int i=0; i< List.size(); i++);

	System.out.println(List.get(i).getText());
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","E:\\Testing Tools\\Testing Softwares\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://selenium4testing.com/hms/index.php?msg=Successfully%20Logged%20out");
	  driver.manage().window().maximize();
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
