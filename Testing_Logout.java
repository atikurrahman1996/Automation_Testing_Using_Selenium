package LearningSelenium_With_BITM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing_Logout extends Testing_login_Page {

	public static void main(String[] args) {
		
		

		
		 System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32\\chromedriver.exe");
			
			
			
	        WebDriver driver = new ChromeDriver(); // Open Browser 
			
			driver.get("https://demo.opencart.com/index.php?route=account/login");
		    
			driver.manage().window().maximize();
			
			
			// For Login
			
			WebElement email = driver.findElement(By.name("email"));
			
	        WebElement password = driver.findElement(By.name("password"));
	        
			WebElement login= driver.findElement(By.xpath("//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]"));
			
			
			
			
			
	        email.clear();
			
			email.sendKeys("atikur2016rahman@gmail.com");
			
			
			password.clear();
			
			password.sendKeys("Atik123");
			
			login.click();
			
		
			
			
			// For Logout
			
	        WebElement myAccount = driver.findElement(By.linkText("My Account"));
			
			WebElement logout = driver.findElement(By.linkText("Logout"));
			
			
	        myAccount.click();
			
			logout.click();
		
			
		
		
		
		
		
		
	}

}
