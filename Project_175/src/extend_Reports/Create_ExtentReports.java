package extend_Reports;

import com.relevantcodes.extentreports.ExtentReports;

public class Create_ExtentReports {

	public static void main(String[] args) 
	{
		
		
		String Filepath="Reports\\Report1.html";
		ExtentReports logger=new ExtentReports(Filepath, true);
		System.out.println("Reporter file created");

		
		logger.flush();
	}

}
