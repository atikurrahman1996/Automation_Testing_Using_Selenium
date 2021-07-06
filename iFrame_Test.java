package Learning_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class iFrame_Test {
	
	
WebDriver driver;
	
	@BeforeClass
	
	public void beforeClass () {

		
		System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32\\chromedriver.exe");
		
        driver = new ChromeDriver(); // Open Browser 
        
        driver.manage().window().maximize();
	
	}
	
	
  @Test
  public void iFrame () {
	  
      driver.get("https://the-internet.herokuapp.com/iframe");
	  
	  String Title = driver.getTitle();
	 
	  System.out.println(Title);
	  
	  
	  // Switch to iFrame
	  
	  driver.switchTo().frame("mce_0_ifr");
	  
	  WebElement iFrameBody= driver.findElement(By.id("tinymce"));
	  
	  iFrameBody.clear();
	  
	  iFrameBody.sendKeys("Automation is the best");
	  
	  
	  
  }
}
	
	
	
	
	


