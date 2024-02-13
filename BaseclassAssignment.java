package week7.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class BaseclassAssignment {
	public RemoteWebDriver driver;
	public String Excelname1;
	
	@BeforeMethod(alwaysRun=true)
	public void precondition()
	{
		driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_checkout_form");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.switchTo().frame("iframeResult");		
		System.out.println("Completed");
	}
	
	@AfterMethod(alwaysRun=true)

	 public void postcondition()
	 {
		 driver.quit();
	 }
	
	
	 //@DataProvider(name="fetchData", indices=0)//indices denotes to pickup the particular row data
	 @DataProvider(name="fetchData")//indices denotes to pickup the particular row data
		public String[][] sendData() throws IOException
		{
			return ReadExcel.readexcel(Excelname1);
			
		}


}
