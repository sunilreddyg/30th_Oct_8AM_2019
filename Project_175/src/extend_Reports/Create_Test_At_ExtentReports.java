package extend_Reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Create_Test_At_ExtentReports {

	public static void main(String[] args) 
	{
		String Filepath="Reports\\Report1.html";
		ExtentReports logger=new ExtentReports(Filepath, true);
		System.out.println("Reporter file created");
			
			ExtentTest test1=logger.startTest("Tc001_loginvalid");
			
			logger.endTest(test1);
			
			
			ExtentTest test2=logger.startTest("Tc002_login-Invalid");
			
			logger.endTest(test2);
			
			
			//Using this to create subtest result under main test result..
			ExtentTest login=logger.startTest("Login_test");
			login.appendChild(test1).appendChild(test2);
			logger.endTest(login);
			
			
		logger.flush();

	}

}
