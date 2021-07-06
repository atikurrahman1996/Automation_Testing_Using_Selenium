package Learning_TestNG;

import org.testng.annotations.Test;

public class TestNG_Priority {
	
	
	
	// It was execute test 01_02_03 but when I use priority it is 01_03_02
	
  @Test(priority=0)
  public static void Test_01() {
	  
	  System.out.println("Print Test_01");
  }
  
  @Test(priority=2)
  public static void Test_02() {
	  
	  System.out.println("Print Test_02");
  }
  
  @Test(priority=1)
  public static void Test_03() {
	  
	  System.out.println("Print Test_03");
  }
  
  // Disable Test method - using enabled false 
  
  @Test(priority=4, enabled=false)
  public static void Test_04() {
	  
	  System.out.println("Print Test_04");
  }
  
  
}
