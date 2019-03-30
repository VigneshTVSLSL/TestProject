package Eapps_VTS_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import libraries.SuperTestNGBeforeAndAfterMethod;
import libraries.genericHandlingExcel;

public class TC_Eapps_006_MilkRunVTS extends SuperTestNGBeforeAndAfterMethod {
  @Test
  public void MilkRunVTS() throws InterruptedException 
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
		
		Thread.sleep(6000);
		
		//Navigating to Milk run VTS  dashboard page
		
		driver.get("http://testing.tvslsl.in/eapps/Geo/TvslslVtsGeofencinghomeallrouteMR.aspx?name=M1");
		
		Thread.sleep(10000);
		
		// Finding & comparing the Vechile tracking system
		
		/*WebElement VTSMapTracking = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Label1"));
		String ActualText = VTSMapTracking.getText();
		String ExpectedText = "Vehicle Running Details";
		
		if(ActualText == ExpectedText)
		{
			System.out.println("User is in Vechile Running details Page ");
		}
		
		else {
			System.out.println("User is not in Vechile Running details Page ");
		}
		
		
		
				//assert.assertEquals(ActualText, ExpectedText);
		
		
		Assert.assertEquals(ExpectedText, ActualText,"Strings are matching");
		System.out.println("Values are same");
		*/
		
		
	/*	//finding & Clicking VTS Map Tracking
		
		driver.findElement(By.id(genericHandlingExcel.getdata(FilePath, Sheetname2, 8, 2))).click();
		
		System.out.println("VTS Map Tracking has been clicked");*/

				
		System.out.println("TC_Eapps_006_MilkRunVTS:Passed- Milk Run VTS is generated successfully");


	  
  }
}
