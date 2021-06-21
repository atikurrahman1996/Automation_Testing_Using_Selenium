package LearningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Browser_URL_CaptureTitile_CurrentTitle_GetText_PageSource {

	public static void main(String[] args) {
		
		//Method 1
		
    System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32\\chromedriver.exe");
    
        WebDriver driver;
		
		driver = new ChromeDriver();    // Open Browser 
		
		//ChromeDriver driver = new ChromeDriver();  // Open Browser
		
		driver.get("https://edutechs.org/");     // Open URL 
		
		System.out.println("The title of the web page is: "+driver.getTitle());     // Capture web page title
		
		System.out.println("Current URL  of the web page is: "+driver.getCurrentUrl());  // Capture Current URL 
		
		System.out.println(driver.getPageSource());   // Capture Web page source code 
		
		
		String text=driver.findElement(By.xpath("/html/body/div[2]/nav[2]/div/a/span")).getText();  // Capture Specific Text 
		
		System.out.println(text);   // Output Edutech 

		
		
		
		
		
		
	}

}
