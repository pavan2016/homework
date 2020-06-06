package Classprograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Informationcommands {
	
	public static WebDriver driver;
	

	  @Test
	  public void Agmail1() {
		  
		  String str1 = driver.findElement(By.linkText("Gmail")).getText();
		  System.out.println(str1);
	  }
	  
	  @Test
	  public void Bserachbutton2(){
		  
		  String str2 = driver.findElement(By.name("btnK")).getAttribute("value");
		  System.out.println(str2);
		   }
	  @Test
	public void Cimages3(){
		  
		  String str3 = driver.findElement(By.id("hplogo")).getAttribute("title");
		  System.out.println(str3);
		   }
	  
	  @BeforeTest
	  public static void beforeTest() {
		  System.setProperty("webdriver.chrome.driver","E:\\Testing Tools\\Testing Softwares\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.google.com/");
		  driver.manage().window().maximize();
		
	  }

	  @AfterTest
	  public void afterTest() {
	  }

}
