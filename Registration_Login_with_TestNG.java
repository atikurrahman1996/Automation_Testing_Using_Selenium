package Learning_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Registration_Login_with_TestNG {
	
	WebDriver driver;
	
	@BeforeClass
	
	public void setUP() {
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32\\chromedriver.exe");
	
	
	driver = new ChromeDriver();  // Open Browser 
	
    driver.get("https://demo.opencart.com/index.php?route=account/register");    // Open URL
    
	driver.manage().window().maximize();      // Maximize
	

	}
	
	@Test
	
	public void Registration() {
		
	WebElement firstname= driver.findElement(By.name("firstname"));
			
    WebElement lastname= driver.findElement(By.name("lastname"));
    
    WebElement email=driver.findElement(By.name("email"));
    
    WebElement telephone=driver.findElement(By.name("telephone"));
    
    WebElement password =driver.findElement(By.name("password"));
    
    WebElement confpassword=driver.findElement(By.name("confirm"));
    
    WebElement subscribeYes=driver.findElement(By.name("newsletter"));
    
    WebElement agree=driver.findElement(By.name("agree"));
    
    WebElement acregister=driver.findElement(By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]"));
    
   
	
    
   // Action
    
    
    firstname.sendKeys("ATIKUR");
    
    lastname.sendKeys("RAHMAN");
    
    email.sendKeys("atikur2031rahman@gmail.com");
    
    telephone.sendKeys("01608403976");
    
    password.sendKeys("Atik321");
    
    confpassword.sendKeys("Atik321");
    
    agree.sendKeys("agree");
    
    subscribeYes.click();
    
    agree.click();
    
    acregister.click(); 
    
  
    
	// for Login 
    
    WebElement myAccount = driver.findElement(By.xpath("//span[contains(text(),'My Account')]"));
    
    myAccount.click(); 
    
    WebElement logout = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a"));
    
    logout.click();
    
    WebElement loginClick =driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[1]"));
   
    loginClick.click();
    
    WebElement email1 = driver.findElement(By.name("email"));
	
    WebElement password1 = driver.findElement(By.name("password"));
 
	WebElement login= driver.findElement(By.xpath("//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]"));
		
		
 
		
		email1.sendKeys("atikur2031rahman@gmail.com");
		
		
		password1.sendKeys("Atik321");
		
		login.click();
		
    
	
	
	

	
	
  }
}
