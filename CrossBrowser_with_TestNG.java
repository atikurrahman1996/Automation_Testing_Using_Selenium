package Learning_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser_with_TestNG {
	
	
	WebDriver driver;
	
    String FirefoxDriverPath="./src/main/resources/geckodriver.exe";
    String ChromeDriverPath="./src/main/resources/chromedriver.exe";
    String BaseURL="https://demo.opencart.com/index.php?route=account/login";

    @BeforeClass
    @Parameters("Browser")
    public void Setup(String browser) throws Exception {
        if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver",FirefoxDriverPath);
            driver=new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver",ChromeDriverPath);
            driver=new ChromeDriver();
        }
        else {
            throw new Exception("Browser Not FOUND!!!!");
        }
    }
    @DataProvider(name="Valid_LoginData")
    public Object [][] data(){
        Object [][] data=new Object[3][2]; //Rc, Row, Column
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
    @Test(dataProvider ="Valid_LoginData")
    public void loginTest(String DP_Email, String DP_Pass){
        driver.get(BaseURL);
        WebElement Email=driver.findElement(By.xpath("//input[@id='input-email']"));
        WebElement Password=driver.findElement(By.xpath("//input[@id='input-password']"));
        WebElement LoginBtn=driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        
        
    
        Email.clear();
        Email.sendKeys(DP_Email);

        
        Password.clear();
        Password.sendKeys(DP_Pass);

        
        LoginBtn.click();

       
        String Exp_Title="Account Login";
        String Act_Title=driver.getTitle();

       
        if(Exp_Title.equals(Act_Title)){
            System.out.println("Test PASSED!! for InValid test Data");
        }
        else {
            System.out.println("Test Failed!! for InValid test Data");
        }
    }
	
}	
	