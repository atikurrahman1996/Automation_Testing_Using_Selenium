package LearningSelenium_With_BITM;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Captured_Screenshoots {

	public static void main(String[] args) throws IOException {
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Soft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); 
		
		
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		// Save Image
		
		
		FileUtils.copyFile(srcFile,new File(".\\src\\main\\resources\\screenshots\\opencarts.png")); 
		
		
		
	}

}
