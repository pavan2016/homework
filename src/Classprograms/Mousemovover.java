package Classprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Mousemovover {
	
	public WebDriver driver;
	public Actions action;
	
  @Test
  public void f() throws Exception {
	  
	  action = new Actions(driver);
	  
	  WebElement ele1 =driver.findElement(By.id("ctl00_HyperLinkLogin"));
	  action.moveToElement(ele1).build().perform();
	  Thread.sleep(3000);
	  
	  
	 WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"smoothmenu1\"]/ul/li[15]/ul/li[2]/a"));
	  action.moveToElement(ele2).build().perform();
	  Thread.sleep(3000);
	  
	  
	  driver.findElement(By.linkText("Member Login")).click();
	  Thread.sleep(3000);
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","E:\\Testing Tools\\Testing Softwares\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.spicejet.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
