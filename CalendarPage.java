package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalendarPage {
	
	
	public WebDriver driver;
	
	By inStore= By.xpath("//input[@value='Repair In Store']");
	By calendar = By.cssSelector("#booking-date");
	By year = By.cssSelector(".xdsoft_year");
	By allYears = By.cssSelector(".xdsoft_yearselect");
	By allMonths = By.cssSelector(".xdsoft_monthselect");
	By allDays = By.xpath("//td/data-date/");

	
	
	
	
public CalendarPage(WebDriver driver) {
	this.driver = driver; 
	
}
	
	
	public WebElement getInStore() {
		
		return driver.findElement(inStore); 
	}
	
public WebElement getCalendar() {
		
		return driver.findElement(calendar); 
	}

public WebElement getYear() {
	
	return driver.findElement(year); 
}

public WebElement getAllYears() {
	
	return (WebElement) driver.findElements(allYears); 
}

public WebElement getAllMonths() {
	
	return (WebElement) driver.findElements(allMonths); 
}

public WebElement getAllDays() {
	
	return (WebElement) driver.findElements(allDays); 
}
	


public int targetYear = 2020;
public String targetMonth1 = "September";
public int targetDay = 25; 
public String targetTime = "16:30"; 
	

	
	

}

/*
package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	
	public WebDriver driver;
	
	By signin = By.xpath("//ul[contains(@class,'ib-link')]//a[text() = 'Sign In']");
	By welcome = By.cssSelector(".ib-welcome");
	By women = By.xpath("//a[contains(@class,'mm-link') and contains(text(),'Women')]");
	By sneakers = By.xpath("//a[contains(@class, 'sub-category-link') and contains(text(), 'Sneakers')]");
	
	
	
			
	*/