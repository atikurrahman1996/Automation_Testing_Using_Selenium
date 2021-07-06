package Learning_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Base_TestNG2 {
  
 
  @BeforeClass
  
  
  public static void beforeClass() {
	  
	  
	  System.out.println("I am from before class annotation");
	  
  }
  

    @AfterClass
  
  
  public static void afterClass() {
	  
	  
	  System.out.println("I am from after class annotation");
  
  
}
    
    @BeforeMethod
    
    public static void beforeMethod() {
 		  
 		  
 		  System.out.println("I am from before method annotation");
 		  
    }
    
    @AfterMethod
    
    
    public static void afterMethod() {
  	  
  	  
  	  System.out.println("I am from after Method annotation");
  	  
    }
    
    
    
    
    @Test
    
    
    public static void test3() {
  	  
  	  
  	  System.out.println("I am from test annotation3");
    
    
  }
    
   @Test
    
    
    public static void test4() {
  	  
  	  
  	  System.out.println("I am from test annotation4");
    
   }  
    
   
   @BeforeSuite
   public static void beforeSuit() {
	   
	   System.out.println("I'm from Before Suit");
	   

}
   
   @AfterSuite
   public static void afterSuit() {
	   
	   System.out.println("I'm from After Suit");
   }  
}