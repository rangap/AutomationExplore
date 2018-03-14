package BasicConcepts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationConcepts {
	
  @Test
  public void f1() {
	  System.out.println("Doing test1");
  }
  
  @Test
  public void f2() {
	  System.out.println("Doing test2");
  }
  
  @Test
  public void f3() {
	  System.out.println("Doing test3");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Doing Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Doing After test");
  }
  
  


  @BeforeClass
  public void beforeClass() {
	  System.out.println("Doing Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Doing After Class");
  } 

 @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Doing Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Doing After Method");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Doing Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Doing After Suite");
  }

}
