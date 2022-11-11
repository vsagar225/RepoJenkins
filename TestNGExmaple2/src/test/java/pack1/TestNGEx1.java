package pack1;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGEx1 {
  @Test
  @Parameters("empname")
  public void tc1(@Optional String emp) {
	  System.out.println("Emp value = " + emp);
  }
}
