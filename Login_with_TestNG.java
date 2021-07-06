package Learning_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login_with_TestNG {
	
	 WebDriver driver;
	
	@BeforeClass
	
	public void beforeClass () {

		
		System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32\\chromedriver.exe");
		
        driver = new ChromeDriver(); // Open Browser 
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
	    
		driver.manage().window().maximize();
		
	}
	
		
     @Test
     
     public void TestLogin () {
  
        WebElement email = driver.findElement(By.name("email"));
		
        WebElement password = driver.findElement(By.name("password"));
     
		WebElement login= driver.findElement(By.xpath("//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]"));
		
		
     
		
		
        email.clear();
		
		email.sendKeys("atikur2016rahman@gmail.com");
		
		
		password.clear();
		
		password.sendKeys("Atik123");
		
		login.click();
		
		
		
		
	  String exptitle = "My Account";   // Test is passed 
		
	   String acttitle=driver.getTitle();
	
	if(exptitle.equals(acttitle))
	{
		System.out.println("The Test is passed ");
	}
		
	else
	{
		System.out.println("The test is failed");
		
	} 
		
	  
  }
}
