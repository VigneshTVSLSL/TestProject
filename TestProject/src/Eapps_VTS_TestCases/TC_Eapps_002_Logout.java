package Eapps_VTS_TestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import libraries.SuperTestNGBeforeAndAfterMethod;
import libraries.genericHandlingExcel;

public class TC_Eapps_002_Logout extends SuperTestNGBeforeAndAfterMethod {
  @Test
  public void Logout() throws InterruptedException 
  {
	  
	  String FilePath = ".\\TestData\\EappsTest Data.xlsx";
	  String Sheetname1 = "EappsCredentials";
	  String Sheetname2 = "EappsWebelements";
	  
	//finding username field and entering username value
	  
	  driver.findElement(By.id(genericHandlingExcel.getdata(FilePath, Sheetname2, 1, 2))).clear();
	  driver.findElement(By.id(genericHandlingExcel.getdata(FilePath, Sheetname2, 1, 2))).sendKeys(genericHandlingExcel.getdata(FilePath, Sheetname1, 1,1));
	  
	//finding Password field and entering Password value
	  driver.findElement(By.id(genericHandlingExcel.getdata(FilePath, Sheetname2, 2,2))).clear();
		driver.findElement(By.id(genericHandlingExcel.getdata(FilePath, Sheetname2, 2,2))).sendKeys(genericHandlingExcel.getdata(FilePath, Sheetname1, 1, 2));
	  
	  //finding Login Button & clicking Submit Button.
		driver.findElement(By.id(genericHandlingExcel.getdata(FilePath, Sheetname2, 3,2))).click();
		System.out.println("Login Button is clicked successfully");
		
		// Finding User icon & Clicking it
		driver.findElement(By.id(genericHandlingExcel.getdata(FilePath, Sheetname2, 4, 2))).click();
		System.out.println("User icon clicked successfully");
		
		Thread.sleep(5000);
		
		// Finding & clicking Logout button
		driver.findElement(By.xpath(genericHandlingExcel.getdata(FilePath, Sheetname2, 5, 2))).click();
		System.out.println("Sigout button clicked successfully");
		
		Thread.sleep(5000);
		
		//Switching the driver alert to pop up window.
		 Alert alert = driver.switchTo().alert();
		 alert.accept();
		
		System.out.println("TC_Eapps_002_Logout:Passed- User is able to logout from the application successfully");


  }
}
