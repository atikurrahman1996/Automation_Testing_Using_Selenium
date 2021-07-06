package Learning_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Basic_Authentication {
	
	
WebDriver driver;
	
	@BeforeClass
	
	public void beforeClass () {

		
		System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32\\chromedriver.exe");
		
        driver = new ChromeDriver(); // Open Browser 
	    
		driver.manage().window().maximize();
	}
	
	
  @Test
  public void basicAuthentication() {
	  
	  // Formula:protocol://username:password@url
	  
	  driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	  
	  String Title = driver.getTitle();
	 
	  System.out.println(Title);
  }
}
