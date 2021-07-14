package Learning_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProvider_with_TestNG {
	
	
	WebDriver driver;
	
	String baseURL ="https://demo.opencart.com/index.php?route=account/login";
	
	
	
	
	@DataProvider(name="LoginData")
	
	public Object [][]  data() {
		
		Object [][] data = new Object [3][2];  // Row & column 
		
		
		//Set 1
        data[0][0]="mail@mail.com";
        data[0][1]="123456";
        //Set 2
        data[1][0]="mail2@mail.com";
        data[1][1]="";
        //Set 3
        data[2][0]="";
        data[2][1]="123456";

        return data;
    }
		
		
	@BeforeClass
    public void browserConfig(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32\\chromedriver.exe");
		
	}
	
	@BeforeMethod
    public void launchBrowser(){
      driver=new ChromeDriver();
    }

    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }
		
    

    @AfterClass
    public void testDone(){
        System.out.println("Test Complete...!!!");
    }
        
        @Test(dataProvider="LoginData")
        
        public void loginTest(String DP_Email, String DP_Pass) {
        	
            driver.get(baseURL);
            
            WebElement Email=driver.findElement(By.xpath("//input[@id='input-email']"));
            WebElement Password=driver.findElement(By.xpath("//input[@id='input-password']"));
            WebElement LoginBtn=driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
            
            
            Email.clear();
            Email.sendKeys(DP_Email);

            
            Password.clear();
            Password.sendKeys(DP_Pass);

            
            LoginBtn.click();

            
            
        
        
		
        
	
	
    
	
}
	
	
  
}

