package Eapps_VTS_TestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import libraries.SuperTestNGBeforeAndAfterMethod;
import libraries.genericHandlingExcel;

public class TC_Eapps_003_NavigateToVTSmenu extends SuperTestNGBeforeAndAfterMethod {
  @Test
  public void NavigateToVTSmenu() throws InterruptedException 
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
		
		Thread.sleep(5000);
		
		// Finding & Clicking VTS home page.
		driver.findElement(By.xpath(genericHandlingExcel.getdata(FilePath, Sheetname2, 6,2))).click();
		
		System.out.println("VTS home page has been clicked");
		
		
		Thread.sleep(5000);
		
		//finding & Clicking vechile icon
		Actions act = new Actions(driver);
		
		WebElement vechileicon = driver.findElement(By.xpath(genericHandlingExcel.getdata(FilePath, Sheetname2, 7,2)));
		
		System.out.println("vechile icon found");
		
		
		
		vechileicon.click();
		Thread.sleep(5000);
		
		//act.moveToElement(vechileicon).perform();
		
		//driver.findElement(By.xpath(genericHandlingExcel.getdata(FilePath, Sheetname2, 7,2))).click();
		
		/*act.click();
		act.perform();
		*/
		System.out.println("Vechile icon has been clicked");
		
		
		

				
		System.out.println("TC_Eapps_003_NavigateToVTSmenu:Passed- User is able to 'Navigate To VTS menu' successfully");

	  
  }
}
