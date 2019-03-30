package Eapps_VTS_TestCases;

import org.testng.annotations.Test;

import libraries.SendMail;

public class TC_Eapps_999_Test_Execution_Report {
  @Test
  public void TestExecutionReport() 
  
  {
	 SendMail.Execution_Report();
  }
}
