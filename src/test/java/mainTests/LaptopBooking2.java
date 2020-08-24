package mainTests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Resources.base;
import pageObjects.BookingStep3;
import pageObjects.CalendarPage;
import pageObjects.ContactDetailsPage;
import pageObjects.DeliveryPage;
import pageObjects.LandingPage;
import pageObjects.Laptops;
import pageObjects.PhoneRepairs;
import pageObjects.PopUp;
import pageObjects.ProductPage;
import pageObjects.ReusableMethods;
import pageObjects.ServicePage;
import pageObjects.iPhones;


public class LaptopBooking2 extends base{
	
	
	
	
	@Test
	public void checkLaptopBookingProcess() throws IOException, InterruptedException {
		
		//initialise driver
		driver = initializeDriver(); 
		//driver.get(prop.getProperty("url"));
		
		
		
		//initialise Page Objects
		LandingPage l = new LandingPage(driver);
		PopUp p = new PopUp(driver);
		ServicePage sp = new ServicePage(driver);
		PhoneRepairs pr = new PhoneRepairs(driver);
		iPhones ip = new iPhones(driver);
		ProductPage pp = new ProductPage(driver);
		CalendarPage c = new CalendarPage(driver);
		Laptops lt = new Laptops(driver);
		DeliveryPage dp = new DeliveryPage(driver);
		ContactDetailsPage cdp = new ContactDetailsPage(driver);
		BookingStep3 bs3 = new BookingStep3(driver);
		
		ReusableMethods m = new ReusableMethods(driver);
		

				
				

		System.out.println("////////////////LAPTOPS TEST COMMENCING./////////////////");
		
		//Apple laptop test
		driver.get(prop.getProperty("laptops"));
		
		lt.getApple().click();
		lt.getAppleType().sendKeys("test");
		lt.getBookRepair().click();
		
		
		Boolean isApplePresent = driver.findElements(By.cssSelector("#booking-date")).size() > 0;
		
		if (isApplePresent) {
			
			lt.getProceedWithBooking().click();
			
		
		
			Boolean isSubmitPresent = driver.findElements(By.xpath("//input[@value='Submit Booking']")).size() > 0;
			
			if (isSubmitPresent) {
				
				System.out.println("Apple laptop - booking process OK.");
			}
			
			else {
			
				System.out.println("Apple laptop -  step 3 ERROR!!!!!");
			
		}}
			
		else {
				
			System.out.println("Apple laptop -  step 2 ERROR!!!!!");
				
			}
	
		
		
		//Dell laptop test
				
		driver.get(prop.getProperty("url"));
		
		//close popup
		p.getExitPopup().click();
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", lt.getLaptops());
		
		//lt.getLaptops().click();
		
		//wait for element to appear
		WebDriverWait waitD = new WebDriverWait(driver, 10);
		waitD.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Dell']//parent::label")));
		
		Actions actions = new Actions(driver);
		//actions.moveToElement(lt.getDell()).click().build().perform();
		
		executor.executeScript("arguments[0].click();", lt.getDell());
		
				
		//lt.getDell().click();
		lt.getDellType().sendKeys("test");
		
		actions.moveToElement(lt.getBookRepair()).click().build().perform();
		
		
		
		//lt.getBookRepair().click();
		
		
		Boolean isDellPresent = driver.findElements(By.cssSelector("#booking-date")).size() > 0;
		
		if (isDellPresent) {
			
			lt.getProceedWithBooking().click();
			
		
		
			Boolean isSubmitPresent = driver.findElements(By.xpath("//input[@value='Submit Booking']")).size() > 0;
			
			if (isSubmitPresent) {
				
				System.out.println("Dell laptop - booking process OK.");
			}
			
			else {
			
				System.out.println("Dell laptop -  step 3 ERROR!!!!!");
			
		}}
			
		else {
				
			System.out.println("Dell laptop -  step 2 ERROR!!!!!");
				
			}
		
		//Lenovo laptop test
		driver.get(prop.getProperty("url"));
		
		//close popup
		p.getExitPopup().click();
		
		lt.getLaptops().click();
		
		//wait for element to appear
		WebDriverWait waitL = new WebDriverWait(driver, 10);
		waitD.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Dell']//parent::label")));
		
		executor.executeScript("arguments[0].click();", lt.getLenovo());
		
		
		//actions.moveToElement(lt.getDell()).click().build().perform();
		
		//lt.getLenovo().click();
		
		//actions.moveToElement(lt.getLenovoType()).sendKeys("test").build().perform();
		executor.executeScript("arguments[0].click();", lt.getLenovoType());
		//lt.getLenovoType().sendKeys("test");
		
	
		actions.moveToElement(lt.getBookRepair()).click().build().perform();
		
		//lt.getBookRepair().click();
		
		
		Boolean isLenovoPresent = driver.findElements(By.cssSelector("#booking-date")).size() > 0;
		
		if (isLenovoPresent) {
			
			lt.getProceedWithBooking().click();
			
		
		
			Boolean isSubmitPresent = driver.findElements(By.xpath("//input[@value='Submit Booking']")).size() > 0;
			
			if (isSubmitPresent) {
				
				System.out.println("Lenovo laptop - booking process OK.");
			}
			
			else {
			
				System.out.println("Lenovo laptop -  step 3 ERROR!!!!!");
			
		}}
			
		else {
				
			System.out.println("Lenovo laptop -  step 2 ERROR!!!!!");
				
			}
		
		
		//ASUS laptop test
		driver.get(prop.getProperty("laptops"));
		
		//wait for element to appear
		WebDriverWait waitA = new WebDriverWait(driver, 10);
		waitD.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Dell']//parent::label")));
				
		lt.getAsus().click();
		lt.getAsusType().sendKeys("test");
		
		actions.moveToElement(lt.getBookRepair()).click().build().perform();
		
		//lt.getBookRepair().click();
		
		
		Boolean isASUSPresent = driver.findElements(By.cssSelector("#booking-date")).size() > 0;
		
		if (isASUSPresent) {
			
			lt.getProceedWithBooking().click();
			
		
		
			Boolean isSubmitPresent = driver.findElements(By.xpath("//input[@value='Submit Booking']")).size() > 0;
			
			if (isSubmitPresent) {
				
				System.out.println("ASUS laptop - booking process OK.");
			}
			
			else {
			
				System.out.println("ASUS laptop -  step 3 ERROR!!!!!");
			
		}}
			
		else {
				
			System.out.println("ASUS laptop -  step 2 ERROR!!!!!");
				
			}
		
		//HP laptop test
		driver.get(prop.getProperty("laptops"));
		
		//wait for element to appear
		WebDriverWait waitH = new WebDriverWait(driver, 10);
		waitD.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Dell']//parent::label")));
				
		lt.getHP().click();
		lt.getHP().click();
		lt.getHPType().sendKeys("test");
		
		actions.moveToElement(lt.getBookRepair()).click().build().perform();
		
		//lt.getBookRepair().click();
		
		
		Boolean isHPPresent = driver.findElements(By.cssSelector("#booking-date")).size() > 0;
		
		if (isHPPresent) {
			
			lt.getProceedWithBooking().click();
			
		
		
			Boolean isSubmitPresent = driver.findElements(By.xpath("//input[@value='Submit Booking']")).size() > 0;
			
			if (isSubmitPresent) {
				
				System.out.println("HP laptop - booking process OK.");
			}
			
			else {
			
				System.out.println("HP laptop -  step 3 ERROR!!!!!");
			
		}}
			
		else {
				
			System.out.println("HP laptop -  step 2 ERROR!!!!!");
				
			}
		
		//Other laptop test
		driver.get(prop.getProperty("laptops"));
		
		//wait for element to appear
		WebDriverWait waitO = new WebDriverWait(driver, 10);
		waitD.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Dell']//parent::label")));
				
		executor.executeScript("arguments[0].click();", lt.getOther());
		
		//lt.getOther().click();
		lt.getOtherType().sendKeys("test");
		
		actions.moveToElement(lt.getBookRepair()).click().build().perform();
		
		//lt.getBookRepair().click();
				
		
		Boolean isOtherPresent = driver.findElements(By.cssSelector("#booking-date")).size() > 0;
		
		if (isOtherPresent) {
			
			lt.getProceedWithBooking().click();
			
		
		
			Boolean isSubmitPresent = driver.findElements(By.xpath("//input[@value='Submit Booking']")).size() > 0;
			
			if (isSubmitPresent) {
				
				System.out.println("Other laptop - booking process OK.");
			}
			
			else {
			
				System.out.println("Other laptop -  step 3 ERROR!!!!!");
			
		}}
			
		else {
				
			System.out.println("Other laptop -  step 2 ERROR!!!!!");
				
			}
			
	}
}
		
				
				
				
	
				
	

	
				
				
	

		
		
		
		
		
		
		
	
	
	


	

