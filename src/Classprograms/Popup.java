package Classprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Popup {
	
	public WebDriver driver;
	
	
  @Test
  public void Login() throws Exception {
	  
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
   driver.findElement(By.linkText("Feedback")).click();
	
	
	
	String winhandleBefore = driver.getWindowHandle();
	  
	  
	  for(String winhandle : driver.getWindowHandles()){
		  driver.switchTo().window(winhandle); 
		  
	  
	
		  
	}
	Thread.sleep(3000);
	
	driver.findElement(By.id("name")).sendKeys("pavan");
	 driver.findElement(By.id("email")).sendKeys("kpchand451@gmail.com");
	 new Select(driver.findElement(By.id("car"))).selectByVisibleText("Volvo");
	 driver.findElement(By.xpath("/html/body/div[2]/div/div/form/ul/li[4]/label[1]/input")).click();
	 driver.findElement(By.xpath("/html/body/div[2]/div/div/form/ul/li[5]/label/input")).click();
	 driver.findElement(By.xpath("/html/body/div[2]/div/div/form/ul/li[6]/input")).sendKeys("C:\\Users\\pavan\\Desktop\\IMG_64321.jpg");
	 driver.findElement(By.id("message")).sendKeys("atadtadtad");
	 driver.findElement(By.xpath("/html/body/div[2]/div/div/form/p/button[1]")).click();
	 driver.findElement(By.id("close")).click();
	 
	 Thread.sleep(3000);
	 
	 driver.switchTo().window(winhandleBefore);
	 
	
	 driver.findElement(By.linkText("Registration")).click();
	 
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","E:\\Testing Tools\\Testing Softwares\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://selenium4testing.com/hms/");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
	  
	  
	  
  }

}
