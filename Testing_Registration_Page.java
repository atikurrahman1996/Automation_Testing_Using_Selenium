package LearningSelenium_With_BITM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing_Registration_Page {

	
	public static void main(String[] args) {
		
		
   System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();  // Open Browser 
		
        driver.get("https://demo.opencart.com/index.php?route=account/register");    // Open URL
	    
		driver.manage().window().maximize();      // Maximize
		
	
		
		
		//valid Test case_001
		
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
	    
	    email.sendKeys("atikur2021rahman@gmail.com");
	    
	    telephone.sendKeys("01608403976");
	    
	    password.sendKeys("Atik321");
	    
	    confpassword.sendKeys("Atik321");
	    
	    agree.sendKeys("agree");
	    
	    subscribeYes.click();
	    
	    agree.click();
	    
	    acregister.click(); 
	    
	  
	    
		
	}

}
