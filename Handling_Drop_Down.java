package LearningSelenium_With_BITM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_Drop_Down {

	public static void main(String[] args) {
		
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		driver.manage().window().maximize();
		
		
		// selectByVisibleText() //selectByValue //selectByIndex
		
		WebElement dropDown= driver.findElement(By.id("dropdown"));
		
		Select dp=new Select(dropDown);
		
		dp.selectByIndex(2);
		
	    dp.selectByValue("1");  
		
        dp.selectByVisibleText("Option 2");
		
	    
	}

}
