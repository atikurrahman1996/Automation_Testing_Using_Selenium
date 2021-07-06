package Learning_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HeadLess_Test {
	
	
WebDriver driver;
	
	@BeforeClass
	
	public void beforeClass () {

		
		System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32\\chromedriver.exe");
		
        ChromeOptions obj = new ChromeOptions();
        obj.setHeadless(true);
        driver= new ChromeDriver(obj);
	    
		
	}
	
	
  @Test
  public void HeadLess() {
	  
	  // Formula:protocol://username:password@url
	  
	  driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	  
	  String Title = driver.getTitle();
	 
	  System.out.println("HeadLess test done: "+Title);
  }


  }

