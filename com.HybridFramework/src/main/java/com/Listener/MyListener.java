package com.Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.Status;
import com.base.BaseClass;
import com.utility.DriverUtils;

public class MyListener extends BaseClass implements ITestListener
{

	public void onFinish(ITestContext result) 
	{	
		report.flush();
	}

	public void onStart(ITestContext result) 
	{
		reportInit();
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) 
	{
			test.log(Status.FAIL, "test case is fail : "+result.getName());	
			String path=DriverUtils.getScreenshot(result.getName());
			test.addScreenCaptureFromPath(path);
	}

	public void onTestSkipped(ITestResult result) 
	{
		test.log(Status.SKIP,"test case is skip :"+result.getName());
		
	}

	public void onTestStart(ITestResult result)
	{
		test=report.createTest(result.getName());
		
	}

	public void onTestSuccess(ITestResult result) 
	{
		test.log(Status.PASS,"test case pass:"+result.getName());
		
	}
		
	}

