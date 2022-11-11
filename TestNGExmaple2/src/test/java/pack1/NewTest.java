package pack1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void testCase1() {
	  System.out.println("In Method 1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method");
  }
  
  @Test
  public void testCase2() {
	  System.out.println("In Method 2");
	  Assert.assertTrue(false);
  }

}
