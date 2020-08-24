package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\kamil.iwanowicz\\Desktop\\automation testing Kamil\\IMendGadgets-master\\IMendGadgets-master\\src\\main\\java\\Resources\\data.properties");
		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		
		if(browserName.equals("chrome"))
			
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kamil.iwanowicz\\Desktop\\automation testing Kamil\\chromedriver.exe");
			driver = new ChromeDriver(); 
			
			ChromeOptions options = new ChromeOptions();
			//options.addArguments("--headless");
			options.addArguments("--start-maximized");
		 driver=new ChromeDriver(options); 
		}	
		
		
		driver.manage().timeouts().implicitlyWait(5,  TimeUnit.SECONDS);
		return driver; 
		
		
	
		
		
		
	}
	
	public String login1() {
		
		return "iwanowicz.ki@gmail.com";
	}
	
public String password1() {
		
		return "Tester1234*";
	}

	

}
