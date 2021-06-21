package LearningSelenium_With_BITM;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle_Switch_Multiple_WindowHandles {

	public static void main(String[] args) {
		
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32\\chromedriver.exe");
				
				ChromeDriver driver = new ChromeDriver(); 
				
				driver.get("https://opensource-demo.orangehrmlive.com/");
				
				driver.manage().window().maximize();
				
				
				// getWindowHandle 
				
				String parentGUID = driver.getWindowHandle();    // Return ID of the single browser window
				
				//System.out.println(parentGUID);    // output- CDwindow-12AFD20A17A13FDA2EBDEBBD70F75968
				
				String parentTitle =driver.getTitle();
				
				System.out.println("Parent first Title: "+parentTitle);

				
				WebElement childWindow=driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/a"));
					
				childWindow.click();  // open another browser window (child window)
				
				
				//getWindowHandles
				
				Set <String> allGUID=driver.getWindowHandles();  // Return IDs of multiple windows 
				
				
				// Switch to child window
				
				for(String childGUID:allGUID) {
					
				driver.switchTo().window(childGUID);
				
				driver.navigate().to("https://www.google.com/");
				
				String childTitle = driver.getTitle();
				
				System.out.println(childTitle);
				
			    break;
				
				}
					
	
			// Switch to parent window 
	
	
	          for(String childGUID:allGUID) {
					
	          driver.switchTo().window(parentGUID);
	          
	          driver.navigate().to("https://www.amazon.com/");
	          
	          String parentSecondTitle = driver.getTitle();
	
	          System.out.println("Parent Second Title: "+parentSecondTitle);
	          
	          break;

	}

	}
}
