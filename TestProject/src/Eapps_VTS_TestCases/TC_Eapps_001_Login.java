package Eapps_VTS_TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import libraries.SuperTestNGBeforeAndAfterMethod;
import libraries.genericHandlingExcel;

public class TC_Eapps_001_Login extends SuperTestNGBeforeAndAfterMethod {
  @Test
  public void Login() 
  
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
		
		System.out.println("TC_Eapps_001_Login:Passed- User is able to login to the application successfully");

	  
  }
}
