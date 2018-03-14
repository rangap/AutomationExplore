package BasicConcepts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationConcepts {
	
	WebDriver driver;
	String driverPath = "C:\\ChromeDriver\\chromedriver.exe";
	
	 @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("Doing Before Suite");
		  System.setProperty("webdriver.chrome.driver", driverPath);
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
	  }
	 
	 
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("Doing Before Test");
		  driver.get("https://www.irctc.co.in/");
	  }
	 
	 @BeforeClass
	  public void beforeClass() {
		  System.out.println("Doing Before Class");
		  
	  }
	 
	 @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		  System.out.println("Doing Before Method");
		  driver.navigate().refresh();
		  Thread.sleep(2000);
	  }
	
  @Test
  public void f1() throws InterruptedException {
	  System.out.println("Doing test1");
	  
	  String expectedTitle="IRCTC Next Generation eTicketing System";
   	  String actualTitle=driver.getTitle();
   	  Assert.assertEquals(actualTitle,expectedTitle);
   	  Thread.sleep(2000);
  }
  
  @Test
  public void f2() throws InterruptedException {
	  System.out.println("Doing test2");
	  
	  driver.findElement(By.linkText("Sign up")).click();
	  Thread.sleep(2000);
	  driver.navigate().back();
	  Thread.sleep(2000);
  }
  
  @Test
  public void f3() throws InterruptedException {
	  System.out.println("Doing test3");
	  
	  driver.navigate().to("http://www.irctctourism.com/cgi-bin/dev1.dll/irctc/booking/bestSellerTrains.jsp");
	  Thread.sleep(2000);
	  driver.navigate().back();
	  Thread.sleep(2000);
	  driver.navigate().forward();
	  Thread.sleep(2000);
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("Doing After Method");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Doing After Class");
  } 
  
  @AfterTest
  public void afterTest() {
	  System.out.println("Doing After test");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Doing After Suite");
	  driver.quit();
  }

}
