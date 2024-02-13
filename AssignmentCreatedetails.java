package week7.day2;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class AssignmentCreatedetails extends BaseclassAssignment {
	
	@BeforeTest// this Testng annotation will run only once, 
	public void setvalue()
	{
		Excelname1="Assignment";
	}
	@Test(dataProvider = "fetchData")
	//@BeforeMethod(alwaysRun=true)
	public void Createdetails(String cardname,String cardnumber, String expmonth, String CVV, String expyear, String name, String mailid, String address, String city, String zip,String state)
	{
		driver.findElement(By.xpath("//input[@name='cardname']")).sendKeys(cardname);
		driver.findElement(By.xpath("//input[@name='cardnumber']")).sendKeys(cardnumber);
		driver.findElement(By.xpath("//input[@name='expmonth']")).sendKeys(expmonth);
		driver.findElement(By.xpath("//input[@name='cvv']")).sendKeys(CVV);
		driver.findElement(By.xpath("//input[@name='expyear']")).sendKeys(expyear);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(mailid);
		driver.findElement(By.xpath("//input[@name='address']")).sendKeys(address);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);
		driver.findElement(By.xpath("//input[@name='zip']")).sendKeys(zip);
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys(state);
		
	}

}
