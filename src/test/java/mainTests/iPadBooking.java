package mainTests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
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
import pageObjects.iPads;
import pageObjects.iPhones;


public class iPadBooking extends base{
	
	
	
	
	@Test
	public void checkiPadBookingPage() throws IOException, InterruptedException {
		
		//initialise driver
		driver = initializeDriver(); 
		//driver.get(prop.getProperty("url"));
		
		//initialise Page Objects
		ProductPage pp = new ProductPage(driver);
		iPads ipd = new iPads(driver); 
		
		ReusableMethods m = new ReusableMethods(driver);
		
		
		
				
				/*
				
				//iPad - check if service page opens up
				System.out.println("////////////////IPAD TEST COMMENCING./////////////////");
				driver.get(prop.getProperty("ipad"));
				List<WebElement> ip1Buttons = driver.findElements(By.cssSelector("#ipad-selection-boxes>span"));
				int iPadButtons = ip1Buttons.size();
				System.out.println("Number of iPads: " + iPadButtons);
				
				for (int x=1; x<=iPadButtons; x++) {
					driver.get(prop.getProperty("ipad"));
					driver.findElement(By.xpath("//span[@class='wpcf7-form-control wpcf7-radio ipad-selection-boxes']/span[" + x + "]")).click();
								
					String ipadName = 	driver.findElement(By.xpath("//span[@class='wpcf7-form-control wpcf7-radio ipad-selection-boxes']/span[" + x + "]/label/span")).getText();
					String ipadNameNoSpace = ipadName.replaceAll("\\s", "");
					//test
					//System.out.println(ipadNameNoSpace); 
					
					//save number of repairs to a variable
					int repairsSize = pp.getAllIpadRepairs().size();
					
				
					//random number of repairs to be generated
					int randomNumber = ThreadLocalRandom.current().nextInt(0, repairsSize);
					//System.out.println("The random number of repairs to be selected:" + randomNumber);
					
						
					//select a random number of random repairs
						for (int r = 1; r <=randomNumber; r++) {
						int randomRepair = ThreadLocalRandom.current().nextInt(1, repairsSize);
						//System.out.println("Clicking on repair number: " + randomRepair);
						
						if (x == 1) {
							
							pp.getAllIpadRepairs().get(randomRepair).click();
						}
						
						else {
						
						driver.findElements(By.cssSelector("." + ipadNameNoSpace + " .wpcf7-list-item")).get(randomRepair).click();
								
					
						//pp.getAllIpadRepairs().get(randomRepair).click();
						}}
					
						
						
						//click Book Repair Now
						WebElement bookRepairDynamic = driver.findElement(By.cssSelector("div[data-id='" + ipadNameNoSpace + "'] .btn"));
								
						JavascriptExecutor executor = (JavascriptExecutor)driver;
						executor.executeScript("arguments[0].click();", bookRepairDynamic);
						
						//driver.findElement(By.cssSelector("div[data-id='" + ipadNameNoSpace + "'] .btn")).click();
						//pp.getIpadBookRepair().click();
						
						//click on Post Your Device
						ipd.getPostYourDevice().click();
						
						//click Proceed With Booking
						ipd.getProceedWithBooking().click();
						
						Boolean isPresent = driver.findElements(By.cssSelector("input[name='your-name']")).size() > 0;
								
						
						if (isPresent) {
							
							System.out.println(ipadName + " OK");	
							
						}
						
						else {
							
							System.out.println(ipadName + " service page error!!!!!");
							
						}}
				*/
				
				//iPadMini - check if service page opens up
				System.out.println("////////////////IPAD MINI TEST COMMENCING./////////////////");
				driver.get(prop.getProperty("ipadmini"));
				
				List<WebElement> ipmButtons = driver.findElements(By.cssSelector("#ipad-mini-selection-boxes>span"));
				int iPadMiniButtons = ipmButtons.size();
				System.out.println("Number of iPads Mini: " + iPadMiniButtons);
				
				
				
				for (int z=1; z<=iPadMiniButtons; z++) {
					driver.get(prop.getProperty("ipadmini"));
					driver.findElement(By.xpath("//span[@class='wpcf7-form-control wpcf7-radio ipad-mini-selection-boxes']/span[" + z + "]")).click();
								
					String ipadMiniName = 	driver.findElement(By.xpath("//span[@class='wpcf7-form-control wpcf7-radio ipad-mini-selection-boxes']/span[" + z + "]/label/span")).getText();
					String ipadMiniNameNoSpace = ipadMiniName.replaceAll("\\s", "");
					//test
					System.out.println(ipadMiniNameNoSpace); 
					
					
					/*
					//save number of repairs to a variable
					
					List<WebElement> iPadMiniAllRepairs = driver.findElements(By.cssSelector("#" + ipadMiniNameNoSpace + "-selection-boxes .wpcf7-list-item"));
					int repairsSize = iPadMiniAllRepairs.size();
					
					System.out.println(repairsSize);
					
				
					//random number of repairs to be generated
					int randomNumberMini = ThreadLocalRandom.current().nextInt(0, repairsSize);
					//System.out.println("The random number of repairs to be selected:" + randomNumber);
					
						
					//select a random number of random repairs
						for (int y = 1; y <=randomNumberMini; y++) {
						int randomRepairMini = ThreadLocalRandom.current().nextInt(1, repairsSize);
						//System.out.println("Clicking on repair number: " + randomRepair);
						
						if (z == 1) {
							
							pp.getAllIpadRepairs().get(randomRepairMini).click();
						}
						
						else {
						
						driver.findElements(By.cssSelector("." + ipadMiniNameNoSpace + " .wpcf7-list-item")).get(randomRepairMini).click();
								
					
						//pp.getAllIpadRepairs().get(randomRepair).click();
						}}
					
						
						
						//click Book Repair Now
						WebElement bookRepairDynamic = driver.findElement(By.cssSelector("div[data-id='" + ipadMiniNameNoSpace + "'] .btn"));
								
						JavascriptExecutor executor = (JavascriptExecutor)driver;
						executor.executeScript("arguments[0].click();", bookRepairDynamic);
						
						//driver.findElement(By.cssSelector("div[data-id='" + ipadNameNoSpace + "'] .btn")).click();
						//pp.getIpadBookRepair().click();
						
						//click on Post Your Device
						ipd.getPostYourDevice().click();
						
						//click Proceed With Booking
						ipd.getProceedWithBooking().click();
						
						Boolean isPresent = driver.findElements(By.cssSelector("input[name='your-name']")).size() > 0;
								
						
						if (isPresent) {
							
							System.out.println(ipadMiniName + " OK");	
							
						}
						
						else {
							
							System.out.println(ipadMiniName + " service page error!!!!!");
							
						}}
				
				driver.quit();
			
	}}
*/
					
				}}}
		
		
		
		
		
		
		
	
	
	


	

